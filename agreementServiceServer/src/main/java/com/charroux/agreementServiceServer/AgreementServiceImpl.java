package com.charroux.agreementServiceServer;

import com.charroux.lib.Agreement;
import com.charroux.lib.AgreementServiceGrpc;
import com.charroux.lib.CreditApplication;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class AgreementServiceImpl extends AgreementServiceGrpc.AgreementServiceImplBase {

    Logger logger = LoggerFactory.getLogger(AgreementServiceImpl.class);

    @Override
    public StreamObserver<CreditApplication> rentCars(StreamObserver<Agreement> responseObserver) {

        return new StreamObserver<CreditApplication>() {
            @Override
            public void onNext(CreditApplication creditApplication) {
                try{
                    logger.info("Credit application for " + creditApplication.getFirstName() + " " + creditApplication.getLastName() + " for " + creditApplication.getPrice() + " Euros.");
                    if(creditApplication.getPrice() > 1000){
                        throw new CreditException();
                    }
                    String customerLastName = creditApplication.getLastName();
                    if(customerLastName == null){
                        throw new CustomerNotFoundException();
                    }
                    responseObserver.onNext(Agreement.newBuilder().setCreditReservedEvent("CREDIT_RESERVED").build());
                } catch (CreditException e) {
                    logger.info("Application rejected for the reason: not enough credit.");
                    responseObserver.onNext(Agreement.newBuilder().setCreditReservedEvent("CREDIT_REJECTED").build());
                } catch (CustomerNotFoundException e) {
                    logger.info("Application rejected for the reason: user unknown.");
                    responseObserver.onNext(Agreement.newBuilder().setCreditReservedEvent("CREDIT_REJECTED").build());
                }
            }

            @Override
            public void onError(Throwable t) {
                logger.info("Credit application failed for the reason: " + t);
            }

            @Override
            public void onCompleted() {
                logger.info("Credit application complete successfully.");
                responseObserver.onCompleted();
            }
        };
    }
}

package com.charroux.carRental.service;

import com.charroux.carRental.data.Car;
import com.charroux.carRental.data.CarRepository;
import com.charroux.carRental.data.RentalAgreement;
import com.charroux.carRental.data.RentalAgreementRepository;
import com.charroux.lib.Agreement;
import com.charroux.lib.AgreementServiceGrpc;
import com.charroux.lib.CreditApplication;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CountDownLatch;

@Service
public class AgreementServiceImpl implements AgreementService{

    Logger logger = LoggerFactory.getLogger(AgreementServiceImpl.class);

    @GrpcClient("agreementService")
    private AgreementServiceGrpc.AgreementServiceStub  agreementServiceStub;

    CarRepository carRepository;
    RentalAgreementRepository rentalAgreementRepository;

    @Autowired
    public AgreementServiceImpl(CarRepository carRepository, RentalAgreementRepository rentalAgreementRepository) {
        super();
        this.carRepository = carRepository;
        this.rentalAgreementRepository = rentalAgreementRepository;
    }

    class AgreementObserver extends Thread implements StreamObserver<Agreement> {

        Logger logger = LoggerFactory.getLogger(AgreementObserver.class);

        CountDownLatch countDownLatch;
        RentalAgreement rentalAgreement;

        public AgreementObserver(CountDownLatch countDownLatch, RentalAgreement rentalAgreement){
            this.countDownLatch = countDownLatch;
            this.rentalAgreement = rentalAgreement;
        }

        @Override
        public void onNext(Agreement agreement) {

            logger.info("Received agreemennt: " + agreement);

            String creditReservedEvent = agreement.getCreditReservedEvent();

            switch (creditReservedEvent) {
                case "CREDIT_RESERVED" :
                    logger.info("Agreemennt approuved.");
                    rentalAgreement.setState(RentalAgreement.State.CREDIT_RESERVED);
                    break;
                default:
                    logger.info("Agreemennt rejected.");
                    rentalAgreement.setState(RentalAgreement.State.CREDIT_REJECTED);
            }
        }

        @Override
        public void onError(Throwable t) {
            logger.info("Agreement failed for the reason: " + t);
        }

        @Override
        public void onCompleted() {
            logger.info("Agreement completed successfully.");
            countDownLatch.countDown();
        }

        @Override
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("fin run");
        }
    }

    @Override
    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public Car findByPlateNumber(String plateNumber) throws CarNotFoundException {
        List<Car> cars = carRepository.findByPlateNumber(plateNumber);
        if(cars.size() == 0) {
            throw new CarNotFoundException(plateNumber);
        }
        return cars.get(0);
    }

    public void rent(String plateNumber, String firstName, String lastName, String email, String beginDate, String endDate) throws CarNotFoundException {

        logger.info("Rent :" + plateNumber + " " + firstName + " " + lastName + " " + email + " " + beginDate + " " + endDate);

        CountDownLatch countDownLatch = new CountDownLatch(1);

        RentalAgreement rentalAgreement = new RentalAgreement(firstName, lastName, email, beginDate, endDate);
        rentalAgreement.setState(RentalAgreement.State.PENDING);

        logger.info("Rental agreement at pending state.");

        Car car = this.findByPlateNumber(plateNumber);
        car.addRentalAgreement(rentalAgreement);

        logger.info("Car found");
        
        rentalAgreementRepository.save(rentalAgreement);

        AgreementObserver agreementObserver = new AgreementObserver(countDownLatch, rentalAgreement);

        agreementObserver.start();

        StreamObserver<CreditApplication> carsObserver = agreementServiceStub.rentCars(agreementObserver);

        CreditApplication creditApplication = CreditApplication.newBuilder().setFirstName(firstName).setLastName(lastName).setEmail(email).setPrice(car.getPrice()).build();
        carsObserver.onNext(creditApplication);

        logger.info("Credit application sent.");

        carsObserver.onCompleted();

        logger.info("Credit application complete successfully.");

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

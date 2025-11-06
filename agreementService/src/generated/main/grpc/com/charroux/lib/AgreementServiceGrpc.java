package com.charroux.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: agreementService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgreementServiceGrpc {

  private AgreementServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.charroux.AgreementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.charroux.lib.CreditApplication,
      com.charroux.lib.Agreement> getRentCarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RentCars",
      requestType = com.charroux.lib.CreditApplication.class,
      responseType = com.charroux.lib.Agreement.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.charroux.lib.CreditApplication,
      com.charroux.lib.Agreement> getRentCarsMethod() {
    io.grpc.MethodDescriptor<com.charroux.lib.CreditApplication, com.charroux.lib.Agreement> getRentCarsMethod;
    if ((getRentCarsMethod = AgreementServiceGrpc.getRentCarsMethod) == null) {
      synchronized (AgreementServiceGrpc.class) {
        if ((getRentCarsMethod = AgreementServiceGrpc.getRentCarsMethod) == null) {
          AgreementServiceGrpc.getRentCarsMethod = getRentCarsMethod =
              io.grpc.MethodDescriptor.<com.charroux.lib.CreditApplication, com.charroux.lib.Agreement>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RentCars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.charroux.lib.CreditApplication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.charroux.lib.Agreement.getDefaultInstance()))
              .setSchemaDescriptor(new AgreementServiceMethodDescriptorSupplier("RentCars"))
              .build();
        }
      }
    }
    return getRentCarsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.charroux.lib.Bidding,
      com.charroux.lib.BidResponse> getCarAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CarAuction",
      requestType = com.charroux.lib.Bidding.class,
      responseType = com.charroux.lib.BidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.charroux.lib.Bidding,
      com.charroux.lib.BidResponse> getCarAuctionMethod() {
    io.grpc.MethodDescriptor<com.charroux.lib.Bidding, com.charroux.lib.BidResponse> getCarAuctionMethod;
    if ((getCarAuctionMethod = AgreementServiceGrpc.getCarAuctionMethod) == null) {
      synchronized (AgreementServiceGrpc.class) {
        if ((getCarAuctionMethod = AgreementServiceGrpc.getCarAuctionMethod) == null) {
          AgreementServiceGrpc.getCarAuctionMethod = getCarAuctionMethod =
              io.grpc.MethodDescriptor.<com.charroux.lib.Bidding, com.charroux.lib.BidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CarAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.charroux.lib.Bidding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.charroux.lib.BidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgreementServiceMethodDescriptorSupplier("CarAuction"))
              .build();
        }
      }
    }
    return getCarAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.charroux.lib.CarToBeRented> getCarsToBeRentedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CarsToBeRented",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.charroux.lib.CarToBeRented.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.charroux.lib.CarToBeRented> getCarsToBeRentedMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.charroux.lib.CarToBeRented> getCarsToBeRentedMethod;
    if ((getCarsToBeRentedMethod = AgreementServiceGrpc.getCarsToBeRentedMethod) == null) {
      synchronized (AgreementServiceGrpc.class) {
        if ((getCarsToBeRentedMethod = AgreementServiceGrpc.getCarsToBeRentedMethod) == null) {
          AgreementServiceGrpc.getCarsToBeRentedMethod = getCarsToBeRentedMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.charroux.lib.CarToBeRented>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CarsToBeRented"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.charroux.lib.CarToBeRented.getDefaultInstance()))
              .setSchemaDescriptor(new AgreementServiceMethodDescriptorSupplier("CarsToBeRented"))
              .build();
        }
      }
    }
    return getCarsToBeRentedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgreementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgreementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgreementServiceStub>() {
        @java.lang.Override
        public AgreementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgreementServiceStub(channel, callOptions);
        }
      };
    return AgreementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgreementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgreementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgreementServiceBlockingStub>() {
        @java.lang.Override
        public AgreementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgreementServiceBlockingStub(channel, callOptions);
        }
      };
    return AgreementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgreementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgreementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgreementServiceFutureStub>() {
        @java.lang.Override
        public AgreementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgreementServiceFutureStub(channel, callOptions);
        }
      };
    return AgreementServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.charroux.lib.CreditApplication> rentCars(
        io.grpc.stub.StreamObserver<com.charroux.lib.Agreement> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRentCarsMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.charroux.lib.Bidding> carAuction(
        io.grpc.stub.StreamObserver<com.charroux.lib.BidResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCarAuctionMethod(), responseObserver);
    }

    /**
     */
    default void carsToBeRented(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.charroux.lib.CarToBeRented> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCarsToBeRentedMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AgreementService.
   */
  public static abstract class AgreementServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgreementServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AgreementService.
   */
  public static final class AgreementServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AgreementServiceStub> {
    private AgreementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgreementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgreementServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.charroux.lib.CreditApplication> rentCars(
        io.grpc.stub.StreamObserver<com.charroux.lib.Agreement> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getRentCarsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.charroux.lib.Bidding> carAuction(
        io.grpc.stub.StreamObserver<com.charroux.lib.BidResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCarAuctionMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void carsToBeRented(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.charroux.lib.CarToBeRented> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCarsToBeRentedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AgreementService.
   */
  public static final class AgreementServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgreementServiceBlockingStub> {
    private AgreementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgreementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgreementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.charroux.lib.CarToBeRented carsToBeRented(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCarsToBeRentedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AgreementService.
   */
  public static final class AgreementServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgreementServiceFutureStub> {
    private AgreementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgreementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgreementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.charroux.lib.CarToBeRented> carsToBeRented(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCarsToBeRentedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CARS_TO_BE_RENTED = 0;
  private static final int METHODID_RENT_CARS = 1;
  private static final int METHODID_CAR_AUCTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CARS_TO_BE_RENTED:
          serviceImpl.carsToBeRented((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.charroux.lib.CarToBeRented>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RENT_CARS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.rentCars(
              (io.grpc.stub.StreamObserver<com.charroux.lib.Agreement>) responseObserver);
        case METHODID_CAR_AUCTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.carAuction(
              (io.grpc.stub.StreamObserver<com.charroux.lib.BidResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRentCarsMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.charroux.lib.CreditApplication,
              com.charroux.lib.Agreement>(
                service, METHODID_RENT_CARS)))
        .addMethod(
          getCarAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.charroux.lib.Bidding,
              com.charroux.lib.BidResponse>(
                service, METHODID_CAR_AUCTION)))
        .addMethod(
          getCarsToBeRentedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.charroux.lib.CarToBeRented>(
                service, METHODID_CARS_TO_BE_RENTED)))
        .build();
  }

  private static abstract class AgreementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgreementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.charroux.lib.AgreementServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgreementService");
    }
  }

  private static final class AgreementServiceFileDescriptorSupplier
      extends AgreementServiceBaseDescriptorSupplier {
    AgreementServiceFileDescriptorSupplier() {}
  }

  private static final class AgreementServiceMethodDescriptorSupplier
      extends AgreementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AgreementServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AgreementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgreementServiceFileDescriptorSupplier())
              .addMethod(getRentCarsMethod())
              .addMethod(getCarAuctionMethod())
              .addMethod(getCarsToBeRentedMethod())
              .build();
        }
      }
    }
    return result;
  }
}

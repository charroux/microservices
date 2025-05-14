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
  }

  private static final int METHODID_RENT_CARS = 0;

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
              .build();
        }
      }
    }
    return result;
  }
}

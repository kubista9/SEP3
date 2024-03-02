package com.example.slaughterhousepart3.generated.animal;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: animal.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AnimalServiceGrpc {

  private AnimalServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "AnimalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.animal.AnimalObj,
      com.example.slaughterhousepart3.generated.animal.AnimalObj> getAddAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addAnimal",
      requestType = com.example.slaughterhousepart3.generated.animal.AnimalObj.class,
      responseType = com.example.slaughterhousepart3.generated.animal.AnimalObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.animal.AnimalObj,
      com.example.slaughterhousepart3.generated.animal.AnimalObj> getAddAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.animal.AnimalObj, com.example.slaughterhousepart3.generated.animal.AnimalObj> getAddAnimalMethod;
    if ((getAddAnimalMethod = AnimalServiceGrpc.getAddAnimalMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getAddAnimalMethod = AnimalServiceGrpc.getAddAnimalMethod) == null) {
          AnimalServiceGrpc.getAddAnimalMethod = getAddAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.slaughterhousepart3.generated.animal.AnimalObj, com.example.slaughterhousepart3.generated.animal.AnimalObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.slaughterhousepart3.generated.animal.AnimalObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.slaughterhousepart3.generated.animal.AnimalObj.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("addAnimal"))
              .build();
        }
      }
    }
    return getAddAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.animal.RequestText,
      com.example.slaughterhousepart3.generated.animal.AnimalObj> getGetAnimalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalById",
      requestType = com.example.slaughterhousepart3.generated.animal.RequestText.class,
      responseType = com.example.slaughterhousepart3.generated.animal.AnimalObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.animal.RequestText,
      com.example.slaughterhousepart3.generated.animal.AnimalObj> getGetAnimalByIdMethod() {
    io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.animal.RequestText, com.example.slaughterhousepart3.generated.animal.AnimalObj> getGetAnimalByIdMethod;
    if ((getGetAnimalByIdMethod = AnimalServiceGrpc.getGetAnimalByIdMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAnimalByIdMethod = AnimalServiceGrpc.getGetAnimalByIdMethod) == null) {
          AnimalServiceGrpc.getGetAnimalByIdMethod = getGetAnimalByIdMethod =
              io.grpc.MethodDescriptor.<com.example.slaughterhousepart3.generated.animal.RequestText, com.example.slaughterhousepart3.generated.animal.AnimalObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.slaughterhousepart3.generated.animal.RequestText.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.slaughterhousepart3.generated.animal.AnimalObj.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("getAnimalById"))
              .build();
        }
      }
    }
    return getGetAnimalByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub>() {
        @java.lang.Override
        public AnimalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceStub(channel, callOptions);
        }
      };
    return AnimalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub>() {
        @java.lang.Override
        public AnimalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub>() {
        @java.lang.Override
        public AnimalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addAnimal(com.example.slaughterhousepart3.generated.animal.AnimalObj request,
        io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.animal.AnimalObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAnimalMethod(), responseObserver);
    }

    /**
     */
    default void getAnimalById(com.example.slaughterhousepart3.generated.animal.RequestText request,
        io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.animal.AnimalObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AnimalService.
   */
  public static abstract class AnimalServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AnimalServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AnimalService.
   */
  public static final class AnimalServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AnimalServiceStub> {
    private AnimalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceStub(channel, callOptions);
    }

    /**
     */
    public void addAnimal(com.example.slaughterhousepart3.generated.animal.AnimalObj request,
        io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.animal.AnimalObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalById(com.example.slaughterhousepart3.generated.animal.RequestText request,
        io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.animal.AnimalObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AnimalService.
   */
  public static final class AnimalServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AnimalServiceBlockingStub> {
    private AnimalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.slaughterhousepart3.generated.animal.AnimalObj addAnimal(com.example.slaughterhousepart3.generated.animal.AnimalObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.slaughterhousepart3.generated.animal.AnimalObj getAnimalById(com.example.slaughterhousepart3.generated.animal.RequestText request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AnimalService.
   */
  public static final class AnimalServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AnimalServiceFutureStub> {
    private AnimalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.slaughterhousepart3.generated.animal.AnimalObj> addAnimal(
        com.example.slaughterhousepart3.generated.animal.AnimalObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.slaughterhousepart3.generated.animal.AnimalObj> getAnimalById(
        com.example.slaughterhousepart3.generated.animal.RequestText request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ANIMAL = 0;
  private static final int METHODID_GET_ANIMAL_BY_ID = 1;

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
        case METHODID_ADD_ANIMAL:
          serviceImpl.addAnimal((com.example.slaughterhousepart3.generated.animal.AnimalObj) request,
              (io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.animal.AnimalObj>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_BY_ID:
          serviceImpl.getAnimalById((com.example.slaughterhousepart3.generated.animal.RequestText) request,
              (io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.animal.AnimalObj>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.slaughterhousepart3.generated.animal.AnimalObj,
              com.example.slaughterhousepart3.generated.animal.AnimalObj>(
                service, METHODID_ADD_ANIMAL)))
        .addMethod(
          getGetAnimalByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.slaughterhousepart3.generated.animal.RequestText,
              com.example.slaughterhousepart3.generated.animal.AnimalObj>(
                service, METHODID_GET_ANIMAL_BY_ID)))
        .build();
  }

  private static abstract class AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.slaughterhousepart3.generated.animal.Animal.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalService");
    }
  }

  private static final class AnimalServiceFileDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier {
    AnimalServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalServiceMethodDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AnimalServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AnimalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalServiceFileDescriptorSupplier())
              .addMethod(getAddAnimalMethod())
              .addMethod(getGetAnimalByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}

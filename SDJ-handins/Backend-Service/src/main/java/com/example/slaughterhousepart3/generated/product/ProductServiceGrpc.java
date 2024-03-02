package com.example.slaughterhousepart3.generated.product;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: product.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.product.RequestId,
      com.example.slaughterhousepart3.generated.product.ResponseText> getGetPackagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPackages",
      requestType = com.example.slaughterhousepart3.generated.product.RequestId.class,
      responseType = com.example.slaughterhousepart3.generated.product.ResponseText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.product.RequestId,
      com.example.slaughterhousepart3.generated.product.ResponseText> getGetPackagesMethod() {
    io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.product.RequestId, com.example.slaughterhousepart3.generated.product.ResponseText> getGetPackagesMethod;
    if ((getGetPackagesMethod = ProductServiceGrpc.getGetPackagesMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetPackagesMethod = ProductServiceGrpc.getGetPackagesMethod) == null) {
          ProductServiceGrpc.getGetPackagesMethod = getGetPackagesMethod =
              io.grpc.MethodDescriptor.<com.example.slaughterhousepart3.generated.product.RequestId, com.example.slaughterhousepart3.generated.product.ResponseText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPackages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.slaughterhousepart3.generated.product.RequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.slaughterhousepart3.generated.product.ResponseText.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("getPackages"))
              .build();
        }
      }
    }
    return getGetPackagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.product.RequestId,
      com.example.slaughterhousepart3.generated.product.ResponseText> getGetAnimalPartsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalParts",
      requestType = com.example.slaughterhousepart3.generated.product.RequestId.class,
      responseType = com.example.slaughterhousepart3.generated.product.ResponseText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.product.RequestId,
      com.example.slaughterhousepart3.generated.product.ResponseText> getGetAnimalPartsMethod() {
    io.grpc.MethodDescriptor<com.example.slaughterhousepart3.generated.product.RequestId, com.example.slaughterhousepart3.generated.product.ResponseText> getGetAnimalPartsMethod;
    if ((getGetAnimalPartsMethod = ProductServiceGrpc.getGetAnimalPartsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetAnimalPartsMethod = ProductServiceGrpc.getGetAnimalPartsMethod) == null) {
          ProductServiceGrpc.getGetAnimalPartsMethod = getGetAnimalPartsMethod =
              io.grpc.MethodDescriptor.<com.example.slaughterhousepart3.generated.product.RequestId, com.example.slaughterhousepart3.generated.product.ResponseText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalParts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.slaughterhousepart3.generated.product.RequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.slaughterhousepart3.generated.product.ResponseText.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("getAnimalParts"))
              .build();
        }
      }
    }
    return getGetAnimalPartsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPackages(com.example.slaughterhousepart3.generated.product.RequestId request,
        io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.product.ResponseText> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPackagesMethod(), responseObserver);
    }

    /**
     */
    default void getAnimalParts(com.example.slaughterhousepart3.generated.product.RequestId request,
        io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.product.ResponseText> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalPartsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductService.
   */
  public static abstract class ProductServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPackages(com.example.slaughterhousepart3.generated.product.RequestId request,
        io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.product.ResponseText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPackagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalParts(com.example.slaughterhousepart3.generated.product.RequestId request,
        io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.product.ResponseText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalPartsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.slaughterhousepart3.generated.product.ResponseText getPackages(com.example.slaughterhousepart3.generated.product.RequestId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPackagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.slaughterhousepart3.generated.product.ResponseText getAnimalParts(com.example.slaughterhousepart3.generated.product.RequestId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalPartsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductService.
   */
  public static final class ProductServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.slaughterhousepart3.generated.product.ResponseText> getPackages(
        com.example.slaughterhousepart3.generated.product.RequestId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPackagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.slaughterhousepart3.generated.product.ResponseText> getAnimalParts(
        com.example.slaughterhousepart3.generated.product.RequestId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalPartsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PACKAGES = 0;
  private static final int METHODID_GET_ANIMAL_PARTS = 1;

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
        case METHODID_GET_PACKAGES:
          serviceImpl.getPackages((com.example.slaughterhousepart3.generated.product.RequestId) request,
              (io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.product.ResponseText>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_PARTS:
          serviceImpl.getAnimalParts((com.example.slaughterhousepart3.generated.product.RequestId) request,
              (io.grpc.stub.StreamObserver<com.example.slaughterhousepart3.generated.product.ResponseText>) responseObserver);
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
          getGetPackagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.slaughterhousepart3.generated.product.RequestId,
              com.example.slaughterhousepart3.generated.product.ResponseText>(
                service, METHODID_GET_PACKAGES)))
        .addMethod(
          getGetAnimalPartsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.slaughterhousepart3.generated.product.RequestId,
              com.example.slaughterhousepart3.generated.product.ResponseText>(
                service, METHODID_GET_ANIMAL_PARTS)))
        .build();
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.slaughterhousepart3.generated.product.Product.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getGetPackagesMethod())
              .addMethod(getGetAnimalPartsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

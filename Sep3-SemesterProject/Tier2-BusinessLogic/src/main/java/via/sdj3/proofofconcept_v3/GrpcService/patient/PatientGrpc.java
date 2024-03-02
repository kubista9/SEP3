package via.sdj3.proofofconcept_v3.GrpcService.patient;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: patient.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PatientGrpc {

  private PatientGrpc() {}

  public static final java.lang.String SERVICE_NAME = "patient.Patient";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj,
      via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> getCreateAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAsync",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj,
      via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> getCreateAsyncMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj, via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> getCreateAsyncMethod;
    if ((getCreateAsyncMethod = PatientGrpc.getCreateAsyncMethod) == null) {
      synchronized (PatientGrpc.class) {
        if ((getCreateAsyncMethod = PatientGrpc.getCreateAsyncMethod) == null) {
          PatientGrpc.getCreateAsyncMethod = getCreateAsyncMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj, via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj.getDefaultInstance()))
              .setSchemaDescriptor(new PatientMethodDescriptorSupplier("CreateAsync"))
              .build();
        }
      }
    }
    return getCreateAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.patient.Name,
      via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.patient.Name.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.patient.Name,
      via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> getGetUserMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.patient.Name, via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> getGetUserMethod;
    if ((getGetUserMethod = PatientGrpc.getGetUserMethod) == null) {
      synchronized (PatientGrpc.class) {
        if ((getGetUserMethod = PatientGrpc.getGetUserMethod) == null) {
          PatientGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.patient.Name, via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.patient.Name.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj.getDefaultInstance()))
              .setSchemaDescriptor(new PatientMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin,
      via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> getLoginAsPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginAsPatient",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin,
      via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> getLoginAsPatientMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin, via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> getLoginAsPatientMethod;
    if ((getLoginAsPatientMethod = PatientGrpc.getLoginAsPatientMethod) == null) {
      synchronized (PatientGrpc.class) {
        if ((getLoginAsPatientMethod = PatientGrpc.getLoginAsPatientMethod) == null) {
          PatientGrpc.getLoginAsPatientMethod = getLoginAsPatientMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin, via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginAsPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj.getDefaultInstance()))
              .setSchemaDescriptor(new PatientMethodDescriptorSupplier("LoginAsPatient"))
              .build();
        }
      }
    }
    return getLoginAsPatientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientStub>() {
        @java.lang.Override
        public PatientStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientStub(channel, callOptions);
        }
      };
    return PatientStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientBlockingStub>() {
        @java.lang.Override
        public PatientBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientBlockingStub(channel, callOptions);
        }
      };
    return PatientBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientFutureStub>() {
        @java.lang.Override
        public PatientFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientFutureStub(channel, callOptions);
        }
      };
    return PatientFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createAsync(via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAsyncMethod(), responseObserver);
    }

    /**
     */
    default void getUser(via.sdj3.proofofconcept_v3.GrpcService.patient.Name request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    default void loginAsPatient(via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginAsPatientMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Patient.
   */
  public static abstract class PatientImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PatientGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Patient.
   */
  public static final class PatientStub
      extends io.grpc.stub.AbstractAsyncStub<PatientStub> {
    private PatientStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientStub(channel, callOptions);
    }

    /**
     */
    public void createAsync(via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(via.sdj3.proofofconcept_v3.GrpcService.patient.Name request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginAsPatient(via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginAsPatientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Patient.
   */
  public static final class PatientBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PatientBlockingStub> {
    private PatientBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj createAsync(via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj getUser(via.sdj3.proofofconcept_v3.GrpcService.patient.Name request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj loginAsPatient(via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginAsPatientMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Patient.
   */
  public static final class PatientFutureStub
      extends io.grpc.stub.AbstractFutureStub<PatientFutureStub> {
    private PatientFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> createAsync(
        via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> getUser(
        via.sdj3.proofofconcept_v3.GrpcService.patient.Name request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj> loginAsPatient(
        via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginAsPatientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ASYNC = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_LOGIN_AS_PATIENT = 2;

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
        case METHODID_CREATE_ASYNC:
          serviceImpl.createAsync((via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((via.sdj3.proofofconcept_v3.GrpcService.patient.Name) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj>) responseObserver);
          break;
        case METHODID_LOGIN_AS_PATIENT:
          serviceImpl.loginAsPatient((via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj>) responseObserver);
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
          getCreateAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj,
              via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj>(
                service, METHODID_CREATE_ASYNC)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.patient.Name,
              via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj>(
                service, METHODID_GET_USER)))
        .addMethod(
          getLoginAsPatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin,
              via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj>(
                service, METHODID_LOGIN_AS_PATIENT)))
        .build();
  }

  private static abstract class PatientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.proofofconcept_v3.GrpcService.patient.PatientOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Patient");
    }
  }

  private static final class PatientFileDescriptorSupplier
      extends PatientBaseDescriptorSupplier {
    PatientFileDescriptorSupplier() {}
  }

  private static final class PatientMethodDescriptorSupplier
      extends PatientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PatientMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PatientGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientFileDescriptorSupplier())
              .addMethod(getCreateAsyncMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getLoginAsPatientMethod())
              .build();
        }
      }
    }
    return result;
  }
}

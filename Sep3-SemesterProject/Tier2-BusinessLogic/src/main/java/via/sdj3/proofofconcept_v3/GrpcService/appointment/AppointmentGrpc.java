package via.sdj3.proofofconcept_v3.GrpcService.appointment;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: appointment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AppointmentGrpc {

  private AppointmentGrpc() {}

  public static final java.lang.String SERVICE_NAME = "appointment.Appointment";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getCreateAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAsync",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getCreateAsyncMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getCreateAsyncMethod;
    if ((getCreateAsyncMethod = AppointmentGrpc.getCreateAsyncMethod) == null) {
      synchronized (AppointmentGrpc.class) {
        if ((getCreateAsyncMethod = AppointmentGrpc.getCreateAsyncMethod) == null) {
          AppointmentGrpc.getCreateAsyncMethod = getCreateAsyncMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentMethodDescriptorSupplier("CreateAsync"))
              .build();
        }
      }
    }
    return getCreateAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getGetByIdAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByIdAsync",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getGetByIdAsyncMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getGetByIdAsyncMethod;
    if ((getGetByIdAsyncMethod = AppointmentGrpc.getGetByIdAsyncMethod) == null) {
      synchronized (AppointmentGrpc.class) {
        if ((getGetByIdAsyncMethod = AppointmentGrpc.getGetByIdAsyncMethod) == null) {
          AppointmentGrpc.getGetByIdAsyncMethod = getGetByIdAsyncMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByIdAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentMethodDescriptorSupplier("GetByIdAsync"))
              .build();
        }
      }
    }
    return getGetByIdAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getGetByDtoAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByDtoAsync",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getGetByDtoAsyncMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getGetByDtoAsyncMethod;
    if ((getGetByDtoAsyncMethod = AppointmentGrpc.getGetByDtoAsyncMethod) == null) {
      synchronized (AppointmentGrpc.class) {
        if ((getGetByDtoAsyncMethod = AppointmentGrpc.getGetByDtoAsyncMethod) == null) {
          AppointmentGrpc.getGetByDtoAsyncMethod = getGetByDtoAsyncMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByDtoAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentMethodDescriptorSupplier("GetByDtoAsync"))
              .build();
        }
      }
    }
    return getGetByDtoAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> getUpdateAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsync",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> getUpdateAsyncMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> getUpdateAsyncMethod;
    if ((getUpdateAsyncMethod = AppointmentGrpc.getUpdateAsyncMethod) == null) {
      synchronized (AppointmentGrpc.class) {
        if ((getUpdateAsyncMethod = AppointmentGrpc.getUpdateAsyncMethod) == null) {
          AppointmentGrpc.getUpdateAsyncMethod = getUpdateAsyncMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentMethodDescriptorSupplier("UpdateAsync"))
              .build();
        }
      }
    }
    return getUpdateAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> getDeleteAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAsync",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> getDeleteAsyncMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> getDeleteAsyncMethod;
    if ((getDeleteAsyncMethod = AppointmentGrpc.getDeleteAsyncMethod) == null) {
      synchronized (AppointmentGrpc.class) {
        if ((getDeleteAsyncMethod = AppointmentGrpc.getDeleteAsyncMethod) == null) {
          AppointmentGrpc.getDeleteAsyncMethod = getDeleteAsyncMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentMethodDescriptorSupplier("DeleteAsync"))
              .build();
        }
      }
    }
    return getDeleteAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> getFindAppointmentsForDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAppointmentsForDoctor",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> getFindAppointmentsForDoctorMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> getFindAppointmentsForDoctorMethod;
    if ((getFindAppointmentsForDoctorMethod = AppointmentGrpc.getFindAppointmentsForDoctorMethod) == null) {
      synchronized (AppointmentGrpc.class) {
        if ((getFindAppointmentsForDoctorMethod = AppointmentGrpc.getFindAppointmentsForDoctorMethod) == null) {
          AppointmentGrpc.getFindAppointmentsForDoctorMethod = getFindAppointmentsForDoctorMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAppointmentsForDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentMethodDescriptorSupplier("findAppointmentsForDoctor"))
              .build();
        }
      }
    }
    return getFindAppointmentsForDoctorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> getFindAppointmentsForPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAppointmentsForPatient",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> getFindAppointmentsForPatientMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> getFindAppointmentsForPatientMethod;
    if ((getFindAppointmentsForPatientMethod = AppointmentGrpc.getFindAppointmentsForPatientMethod) == null) {
      synchronized (AppointmentGrpc.class) {
        if ((getFindAppointmentsForPatientMethod = AppointmentGrpc.getFindAppointmentsForPatientMethod) == null) {
          AppointmentGrpc.getFindAppointmentsForPatientMethod = getFindAppointmentsForPatientMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAppointmentsForPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentMethodDescriptorSupplier("findAppointmentsForPatient"))
              .build();
        }
      }
    }
    return getFindAppointmentsForPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getUpdateStatusDiagnosisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStatusDiagnosis",
      requestType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD.class,
      responseType = via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD,
      via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getUpdateStatusDiagnosisMethod() {
    io.grpc.MethodDescriptor<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getUpdateStatusDiagnosisMethod;
    if ((getUpdateStatusDiagnosisMethod = AppointmentGrpc.getUpdateStatusDiagnosisMethod) == null) {
      synchronized (AppointmentGrpc.class) {
        if ((getUpdateStatusDiagnosisMethod = AppointmentGrpc.getUpdateStatusDiagnosisMethod) == null) {
          AppointmentGrpc.getUpdateStatusDiagnosisMethod = getUpdateStatusDiagnosisMethod =
              io.grpc.MethodDescriptor.<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD, via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStatusDiagnosis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentMethodDescriptorSupplier("UpdateStatusDiagnosis"))
              .build();
        }
      }
    }
    return getUpdateStatusDiagnosisMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppointmentStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentStub>() {
        @java.lang.Override
        public AppointmentStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentStub(channel, callOptions);
        }
      };
    return AppointmentStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppointmentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentBlockingStub>() {
        @java.lang.Override
        public AppointmentBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentBlockingStub(channel, callOptions);
        }
      };
    return AppointmentBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppointmentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentFutureStub>() {
        @java.lang.Override
        public AppointmentFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentFutureStub(channel, callOptions);
        }
      };
    return AppointmentFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAsyncMethod(), responseObserver);
    }

    /**
     */
    default void getByIdAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdAsyncMethod(), responseObserver);
    }

    /**
     */
    default void getByDtoAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByDtoAsyncMethod(), responseObserver);
    }

    /**
     */
    default void updateAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAsyncMethod(), responseObserver);
    }

    /**
     */
    default void deleteAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAsyncMethod(), responseObserver);
    }

    /**
     */
    default void findAppointmentsForDoctor(via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAppointmentsForDoctorMethod(), responseObserver);
    }

    /**
     */
    default void findAppointmentsForPatient(via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAppointmentsForPatientMethod(), responseObserver);
    }

    /**
     */
    default void updateStatusDiagnosis(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStatusDiagnosisMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Appointment.
   */
  public static abstract class AppointmentImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AppointmentGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Appointment.
   */
  public static final class AppointmentStub
      extends io.grpc.stub.AbstractAsyncStub<AppointmentStub> {
    private AppointmentStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentStub(channel, callOptions);
    }

    /**
     */
    public void createAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByIdAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByDtoAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByDtoAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAppointmentsForDoctor(via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAppointmentsForDoctorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAppointmentsForPatient(via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAppointmentsForPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStatusDiagnosis(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD request,
        io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStatusDiagnosisMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Appointment.
   */
  public static final class AppointmentBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AppointmentBlockingStub> {
    private AppointmentBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj createAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj getByIdAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj getByDtoAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByDtoAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse updateAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse deleteAsync(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList findAppointmentsForDoctor(via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAppointmentsForDoctorMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList findAppointmentsForPatient(via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAppointmentsForPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj updateStatusDiagnosis(via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStatusDiagnosisMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Appointment.
   */
  public static final class AppointmentFutureStub
      extends io.grpc.stub.AbstractFutureStub<AppointmentFutureStub> {
    private AppointmentFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> createAsync(
        via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getByIdAsync(
        via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> getByDtoAsync(
        via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByDtoAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> updateAsync(
        via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse> deleteAsync(
        via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> findAppointmentsForDoctor(
        via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAppointmentsForDoctorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList> findAppointmentsForPatient(
        via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAppointmentsForPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj> updateStatusDiagnosis(
        via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStatusDiagnosisMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ASYNC = 0;
  private static final int METHODID_GET_BY_ID_ASYNC = 1;
  private static final int METHODID_GET_BY_DTO_ASYNC = 2;
  private static final int METHODID_UPDATE_ASYNC = 3;
  private static final int METHODID_DELETE_ASYNC = 4;
  private static final int METHODID_FIND_APPOINTMENTS_FOR_DOCTOR = 5;
  private static final int METHODID_FIND_APPOINTMENTS_FOR_PATIENT = 6;
  private static final int METHODID_UPDATE_STATUS_DIAGNOSIS = 7;

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
          serviceImpl.createAsync((via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>) responseObserver);
          break;
        case METHODID_GET_BY_ID_ASYNC:
          serviceImpl.getByIdAsync((via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>) responseObserver);
          break;
        case METHODID_GET_BY_DTO_ASYNC:
          serviceImpl.getByDtoAsync((via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>) responseObserver);
          break;
        case METHODID_UPDATE_ASYNC:
          serviceImpl.updateAsync((via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse>) responseObserver);
          break;
        case METHODID_DELETE_ASYNC:
          serviceImpl.deleteAsync((via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse>) responseObserver);
          break;
        case METHODID_FIND_APPOINTMENTS_FOR_DOCTOR:
          serviceImpl.findAppointmentsForDoctor((via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList>) responseObserver);
          break;
        case METHODID_FIND_APPOINTMENTS_FOR_PATIENT:
          serviceImpl.findAppointmentsForPatient((via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList>) responseObserver);
          break;
        case METHODID_UPDATE_STATUS_DIAGNOSIS:
          serviceImpl.updateStatusDiagnosis((via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD) request,
              (io.grpc.stub.StreamObserver<via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>) responseObserver);
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
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj,
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>(
                service, METHODID_CREATE_ASYNC)))
        .addMethod(
          getGetByIdAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId,
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>(
                service, METHODID_GET_BY_ID_ASYNC)))
        .addMethod(
          getGetByDtoAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentDto,
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>(
                service, METHODID_GET_BY_DTO_ASYNC)))
        .addMethod(
          getUpdateAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj,
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse>(
                service, METHODID_UPDATE_ASYNC)))
        .addMethod(
          getDeleteAsyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentId,
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentResponse>(
                service, METHODID_DELETE_ASYNC)))
        .addMethod(
          getFindAppointmentsForDoctorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj,
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList>(
                service, METHODID_FIND_APPOINTMENTS_FOR_DOCTOR)))
        .addMethod(
          getFindAppointmentsForPatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForPatientObj,
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList>(
                service, METHODID_FIND_APPOINTMENTS_FOR_PATIENT)))
        .addMethod(
          getUpdateStatusDiagnosisMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentISD,
              via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj>(
                service, METHODID_UPDATE_STATUS_DIAGNOSIS)))
        .build();
  }

  private static abstract class AppointmentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppointmentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Appointment");
    }
  }

  private static final class AppointmentFileDescriptorSupplier
      extends AppointmentBaseDescriptorSupplier {
    AppointmentFileDescriptorSupplier() {}
  }

  private static final class AppointmentMethodDescriptorSupplier
      extends AppointmentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AppointmentMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AppointmentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppointmentFileDescriptorSupplier())
              .addMethod(getCreateAsyncMethod())
              .addMethod(getGetByIdAsyncMethod())
              .addMethod(getGetByDtoAsyncMethod())
              .addMethod(getUpdateAsyncMethod())
              .addMethod(getDeleteAsyncMethod())
              .addMethod(getFindAppointmentsForDoctorMethod())
              .addMethod(getFindAppointmentsForPatientMethod())
              .addMethod(getUpdateStatusDiagnosisMethod())
              .build();
        }
      }
    }
    return result;
  }
}


package via.sdj3.proofofconcept_v3.grpcClient.appointment;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.Dto.AppointmentResolveDto;
import via.sdj3.proofofconcept_v3.GrpcService.appointment.*;
import via.sdj3.proofofconcept_v3.entity.Appointment;
import via.sdj3.proofofconcept_v3.entity.Doctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GRPCAppointmentClientImpl implements AppointmentClient {

	private AppointmentGrpc.AppointmentBlockingStub appointmentBlockingStub;

	public AppointmentGrpc.AppointmentBlockingStub getAppointmentBlockingStub() {
		if (appointmentBlockingStub == null) {
			ManagedChannel managedChannel = ManagedChannelBuilder
				.forAddress("localhost", 5021)
				.usePlaintext()
				.build();
			appointmentBlockingStub = AppointmentGrpc.newBlockingStub(managedChannel);
		}
		return appointmentBlockingStub;
	}

	@Override
	public Appointment addAppointment(Appointment appointment) {
		AppointmentObj appointmentObj = AppointmentObj.newBuilder()
			.setId(appointment.getAppointmentId())
			.setDoctorId(appointment.getDoctorId())
			.setPatientId(appointment.getPatientId())
			.setDate(appointment.getDate())
			.setTime(appointment.getTime())
			.setDiagnosis(appointment.getDiagnosis())
			.setStatus(appointment.getStatus())
			.build();

		AppointmentObj appointmentObjFromServer;
		try{
			appointmentObjFromServer = getAppointmentBlockingStub().createAsync(appointmentObj);
		}
		catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
		finally {
			appointmentBlockingStub = null;
		}

		System.out.println(appointmentObjFromServer.getId());  //here getId() instead of getName()
		Appointment realObj = getAppointment(appointmentObjFromServer);
		System.out.println(realObj.getAppointmentId());
		return realObj;
	}

	@Override
	public Optional<List<Appointment>> getAppointmentsByDatePatient(String date, int id) {
		RequestFindAppointmentsForPatientObj requestObj = RequestFindAppointmentsForPatientObj.newBuilder()
				.setDate(date)
				.setId(id)
				.build();
		AppointmentList returnedAppointments;
		try{
			returnedAppointments = getAppointmentBlockingStub().findAppointmentsForPatient(requestObj);
		}
		catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
		finally {
			appointmentBlockingStub = null;
		}
		List<Appointment> realObj = new ArrayList<Appointment>();

		List<AppointmentObj> objList = returnedAppointments.getAppointmentsList();
		for (AppointmentObj obj: objList) {
			realObj.add(this.getAppointment(obj));
		}
		return Optional.of(realObj);
	}

	@Override
	public Optional<List<Appointment>> getAppointmentsByDateDoctor(String date, int id) {
		RequestFindAppointmentsForDoctorObj requestObj = RequestFindAppointmentsForDoctorObj.newBuilder()
				.setDate(date)
				.setId(id)
				.build();
		AppointmentList returnedAppointments;
		try{
			returnedAppointments = getAppointmentBlockingStub().findAppointmentsForDoctor(requestObj);
		}
		catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
		finally {
			appointmentBlockingStub = null;
		}
		List<Appointment> realObj = new ArrayList<Appointment>();

		List<AppointmentObj> objList = returnedAppointments.getAppointmentsList();
		for (AppointmentObj obj: objList) {
			realObj.add(this.getAppointment(obj));
		}

		return Optional.of(realObj);

	}

	@Override
	public boolean deleteAppointment(int id) {
		AppointmentId grpcId = AppointmentId.newBuilder()
			.setId(id)
			.build();
		try {
			AppointmentResponse response = getAppointmentBlockingStub().deleteAsync(grpcId);
			boolean status = response.getSuccessful();
			return status;
		} catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
	}

	public Appointment getAppointmentById(int id)
	{
		AppointmentId request = AppointmentId.newBuilder().setId(id).build();
		AppointmentObj appointmentObjFromServer;
		try{
			appointmentObjFromServer = getAppointmentBlockingStub().getByIdAsync(request);
		}
		catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
		finally {
			appointmentBlockingStub = null;
		}

		System.out.println(appointmentObjFromServer.getId());
		Appointment realObj = getAppointment(appointmentObjFromServer);
		System.out.println(realObj.getAppointmentId());
		return realObj;
	}

	@Override
	public Appointment resolveAppointment(AppointmentResolveDto dto)
	{
		AppointmentISD isd = AppointmentISD.newBuilder()
				.setId(dto.getId())
				.setDiagnosis(dto.getDiagnosis())
				.setStatus(dto.getStatus())
				.build();

		AppointmentObj appointmentObjFromServer;
		try{
			appointmentObjFromServer = getAppointmentBlockingStub().updateStatusDiagnosis(isd);
		}
		catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
		finally {
			appointmentBlockingStub = null;
		}

		System.out.println(appointmentObjFromServer.getId());  //here getId() instead of getName()
		Appointment realObj = getAppointment(appointmentObjFromServer);
		System.out.println(realObj.getAppointmentId());
		return realObj;
	}

	private Appointment getAppointment(AppointmentObj appointmentObjFromServer) {
		Appointment returnedAppointment = new Appointment();
		returnedAppointment.setAppointmentId(appointmentObjFromServer.getId());
		returnedAppointment.setPatientId(appointmentObjFromServer.getPatientId());
		returnedAppointment.setDoctorId(appointmentObjFromServer.getDoctorId());
		returnedAppointment.setDate(appointmentObjFromServer.getDate());
		returnedAppointment.setTime(appointmentObjFromServer.getTime());
		returnedAppointment.setDiagnosis(appointmentObjFromServer.getDiagnosis());
		returnedAppointment.setStatus(appointmentObjFromServer.getStatus());
		return returnedAppointment;
	}
}


package via.sdj3.proofofconcept_v3.grpcClient.doctor;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.GrpcService.doctor.*;
import via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorGrpc;
import via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorLogin;
import via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj;
import via.sdj3.proofofconcept_v3.GrpcService.patient.PatientGrpc;
import via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.grpcClient.ConvertGrpc;

import java.util.List;

@Service
public class GRPCDoctorClientImpl implements DoctorClient{
	private DoctorGrpc.DoctorBlockingStub doctorBlockingStub;

	public DoctorGrpc.DoctorBlockingStub getDoctorBlockingStub() {
		if (doctorBlockingStub == null) {
			ManagedChannel managedChannel = ManagedChannelBuilder
				.forAddress("localhost", 5021)
				.usePlaintext()
				.build();
			doctorBlockingStub = DoctorGrpc.newBlockingStub(managedChannel);
		}
		return doctorBlockingStub;
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		DoctorObj doctorObj = DoctorObj.newBuilder()
			.setFullname(doctor.getFullName())
			.setUsername(doctor.getUserName())
			.setPassword(doctor.getPassword())
			.setSpecialization(doctor.getSpecialization())
			.setId(doctor.getId())
			.setValidated(doctor.isValidated())
			.build();

		DoctorObj doctorObjFromServer;
		try{
			doctorObjFromServer = getDoctorBlockingStub().createAsync(doctorObj);
		}
		catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
		finally {
			doctorBlockingStub = null;
		}

		System.out.println(doctorObjFromServer.getFullname());
		Doctor realObj = getDoctor(doctorObjFromServer);
		System.out.println(realObj.getFullName());
		return realObj;
	}

	@Override
	public List<Doctor> getValidatedAsync() {
		DoctorVoid doctorVoid1 = DoctorVoid.newBuilder().build();
		DoctorList list = getDoctorBlockingStub().getValidatedAsync(doctorVoid1);
		List<Doctor> doctorList = null;
		try {
			doctorList = ConvertGrpc.getListOfDoctorFromListOfGrpcDoctorObjects(list.getDoctorsList());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return doctorList;
	}

	public Doctor authenticateDoctor(String username, String pswd) {
		DoctorLogin doctorObj = DoctorLogin.newBuilder()
				.setUsername(username)
				.setPassword(pswd)
				.build();

		DoctorObj doctorObjFromServer;
		try{
			doctorObjFromServer = getDoctorBlockingStub().loginAsDoctor(doctorObj);
		}
		catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
		finally {
			doctorBlockingStub = null;
		}

		System.out.println(doctorObjFromServer.getFullname());
		Doctor realObj = getDoctor(doctorObjFromServer);
		System.out.println(realObj.getFullName());
		return realObj;

	}

	@Override
	public Doctor GetByUsername(String username) {
		DoctorUsername doctorUsername = DoctorUsername.newBuilder()
				.setUsername(username)
				.build();

		DoctorObj doctorObjFromServer;
		try{
			doctorObjFromServer = getDoctorBlockingStub().getByUsername(doctorUsername);
		}
		catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
		finally {
			doctorBlockingStub = null;
		}

		System.out.println(doctorObjFromServer.getFullname());
		Doctor realObj = getDoctor(doctorObjFromServer);
		System.out.println(realObj.getFullName());
		return realObj;
	}


	private Doctor getDoctor(DoctorObj doctorFromServer) {
		Doctor returnedDoctor = new Doctor();
		returnedDoctor.setId(doctorFromServer.getId());
        returnedDoctor.setUserName(doctorFromServer.getUsername());
        returnedDoctor.setPassword(doctorFromServer.getPassword());
		returnedDoctor.setFullName(doctorFromServer.getFullname());
        returnedDoctor.setSpecialization(doctorFromServer.getSpecialization());
        returnedDoctor.setValidated(doctorFromServer.getValidated());
		return returnedDoctor;
	}


}


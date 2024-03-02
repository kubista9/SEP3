package via.sdj3.proofofconcept_v3.grpcClient.patient;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.GrpcService.patient.PatientGrpc;
import via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin;
import via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj;
import via.sdj3.proofofconcept_v3.entity.Patient;

@Service
public class GRPCPatientClientImpl implements PatientClient {
    private PatientGrpc.PatientBlockingStub patientBlockingStub;

    public PatientGrpc.PatientBlockingStub getPatientBlockingStub() {
		if (patientBlockingStub == null) {
			ManagedChannel managedChannel = ManagedChannelBuilder
				.forAddress("localhost", 5021)
				.usePlaintext()
				.build();
			patientBlockingStub = PatientGrpc.newBlockingStub(managedChannel);
		}
		return patientBlockingStub;
	}

    @Override
    public Patient addPatient(Patient patient) {
        PatientObj patientObj = PatientObj.newBuilder()
                .setId(0)
                .setName(patient.getFullName())
                .setUsername(patient.getUsername())
                .setPassword(patient.getPassword())
                .build();

        PatientObj patientObjFromServer;
        try{
            patientObjFromServer = getPatientBlockingStub().createAsync(patientObj);
        }
        catch (StatusRuntimeException e) {
            System.out.println(e.getStatus().getDescription());
            throw new RuntimeException(e.getStatus().getDescription());
        }
        finally {
            patientBlockingStub = null;
        }

        System.out.println(patientObjFromServer.getName());

        Patient realObj = getPatient(patientObjFromServer);
        System.out.println(realObj.getFullName());
        return realObj;
    }

    @Override
    public Patient authenticatePatient(String username, String pswd) {

        PatientLogin patientObj = PatientLogin.newBuilder()
                .setUsername(username)
                .setPassword(pswd)
                .build();

        PatientObj patientObjFromServer;
        try{
            patientObjFromServer = getPatientBlockingStub().loginAsPatient(patientObj);
        }
        catch (StatusRuntimeException e) {
            System.out.println(e.getStatus().getDescription());
            throw new RuntimeException(e.getStatus().getDescription());
        }
        finally {
            patientBlockingStub = null;
        }

        System.out.println(patientObjFromServer.getUsername());
        Patient realObj = getPatient(patientObjFromServer);
        System.out.println(realObj.getFullName());
        return realObj;
    }


    private Patient getPatient(PatientObj patientObjFromServer) {
        Patient returnedPatient = new Patient();
        returnedPatient.setPatientId(patientObjFromServer.getId());
        returnedPatient.setFullName(patientObjFromServer.getName());
        returnedPatient.setUsername(patientObjFromServer.getUsername());
        returnedPatient.setPassword(patientObjFromServer.getPassword());
        return returnedPatient;
    }
}

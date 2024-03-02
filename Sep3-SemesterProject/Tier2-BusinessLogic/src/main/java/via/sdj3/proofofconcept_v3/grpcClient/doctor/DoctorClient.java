package via.sdj3.proofofconcept_v3.grpcClient.doctor;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.Dto.LoginDto;
//import via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorVoid;
import via.sdj3.proofofconcept_v3.entity.Doctor;

import java.util.List;

@Service
public interface DoctorClient {
	Doctor addDoctor(Doctor doctor);
	List<Doctor> getValidatedAsync();
	Doctor authenticateDoctor(String username, String pswd);
	Doctor GetByUsername(String username);
}

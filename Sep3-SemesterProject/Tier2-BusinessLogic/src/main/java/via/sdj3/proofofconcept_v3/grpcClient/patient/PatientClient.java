package via.sdj3.proofofconcept_v3.grpcClient.patient;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.entity.Patient;

@Service
public interface PatientClient {
    Patient addPatient(Patient patient);
    Patient authenticatePatient(String username, String pswd);
}

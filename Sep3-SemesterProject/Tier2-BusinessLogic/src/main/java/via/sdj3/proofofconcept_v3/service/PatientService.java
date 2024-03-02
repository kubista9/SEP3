package via.sdj3.proofofconcept_v3.service;

import jdk.jshell.spi.ExecutionControl;
import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.entity.Patient;
import via.sdj3.proofofconcept_v3.grpcClient.patient.PatientClient;
import via.sdj3.proofofconcept_v3.jwtUtil.JwtUtil;
import via.sdj3.proofofconcept_v3.repository.PatientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService implements PatientServiceInterface{
    private PatientRepository patientRepository;

    private final PatientClient patientClient;

    private JwtUtil jwtUtil;

    public PatientService(PatientClient patientClient,JwtUtil jwtUtil) {
        this.patientClient = patientClient;
        this.jwtUtil = jwtUtil;
    }

    // METHODS //

    public Patient addPatient(Patient patient){
        //other checks and validation can be done here
        return patientClient.addPatient(patient);
    }

    public List<Patient> getAllPatients(){
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll().forEach(patient -> patients.add(patient));
        return patients;
    }

    public Optional<Patient> getPatientById(int id){
        return patientRepository.findById(id);
    }

    public String authenticatePatient(String username, String password) {
        try
        {
            Patient patient = patientClient.authenticatePatient(username, password);

            if (patient != null) {
                String token = jwtUtil.generatePatientToken(patient);
                return token;
            } else {
                return null;
            }

        }
        catch (Exception e)
        {
            throw e;
        }

    }

    @Override
    public Patient registerPatient(String fullName, String username, String password) {
       // check username/password constraints

        // construct patient object
        Patient patient = new Patient(fullName,username,password);
        try
        {
            patientClient.addPatient(patient);
            return patient;
        }
        catch (Exception e)
        {
            throw e;
        }
    }

}

package via.sdj3.proofofconcept_v3.grpcClient;

import via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj;
import via.sdj3.proofofconcept_v3.entity.Doctor;

import java.util.ArrayList;
import java.util.List;

public class ConvertGrpc {

    public static Doctor getDoctorFromGrpcDoctor(DoctorObj doctorObj) {
        Doctor doctor = new Doctor();
        doctor.setId(doctorObj.getId());
        doctor.setUserName(doctorObj.getUsername());
        doctor.setPassword("");
        doctor.setFullName(doctorObj.getFullname());
        doctor.setSpecialization(doctorObj.getSpecialization());
        doctor.setValidated(doctorObj.getValidated());

        return doctor;
    }

    public static List<Doctor> getListOfDoctorFromListOfGrpcDoctorObjects(List<DoctorObj> list) {
        List<Doctor> doctors = new ArrayList<>();
        for (DoctorObj i : list) {
            doctors.add(getDoctorFromGrpcDoctor(i));
        }

        return doctors;
    }
}

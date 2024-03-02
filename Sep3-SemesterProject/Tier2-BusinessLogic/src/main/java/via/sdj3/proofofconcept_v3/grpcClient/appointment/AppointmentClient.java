package via.sdj3.proofofconcept_v3.grpcClient.appointment;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.Dto.AppointmentResolveDto;
import via.sdj3.proofofconcept_v3.entity.Appointment;

import java.util.List;
import java.util.Optional;

@Service
public interface AppointmentClient {
	Appointment addAppointment(Appointment appointment);
	Optional<List<Appointment>> getAppointmentsByDatePatient(String date, int id);
	Optional<List<Appointment>> getAppointmentsByDateDoctor(String date, int id);
	Appointment getAppointmentById(int id);
	Appointment resolveAppointment(AppointmentResolveDto dto);

	boolean deleteAppointment(int id);

}

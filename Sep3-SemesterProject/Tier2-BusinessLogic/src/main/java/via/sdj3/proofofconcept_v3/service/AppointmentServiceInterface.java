package via.sdj3.proofofconcept_v3.service;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.Dto.AppointmentResolveDto;
import via.sdj3.proofofconcept_v3.entity.Appointment;
import via.sdj3.proofofconcept_v3.entity.Doctor;

import java.util.List;
import java.util.Optional;

@Service
public interface AppointmentServiceInterface {
	Appointment addAppointment(Appointment appointment);

	List<Appointment> getAllAppointments();

	Appointment getAppointmentById(int id);

	public Optional<List<Appointment>> getAppointmentsByDateDoctor(String date, int id);

	public Optional<List<Appointment>> getAppointmentsByDatePatient(String date, int id);

	boolean deleteAppointmentById(int id);
	Appointment resolveAppointment(AppointmentResolveDto dto);
}

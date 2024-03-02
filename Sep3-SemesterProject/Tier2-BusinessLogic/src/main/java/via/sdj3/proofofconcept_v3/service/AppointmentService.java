package via.sdj3.proofofconcept_v3.service;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.Dto.AppointmentResolveDto;
import via.sdj3.proofofconcept_v3.entity.Appointment;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.grpcClient.appointment.AppointmentClient;
import via.sdj3.proofofconcept_v3.repository.AppointmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService implements AppointmentServiceInterface{
	private AppointmentRepository appointmentRepository;

	private final AppointmentClient appointmentClient;


	public AppointmentService(AppointmentClient appointmentClient) {
		this.appointmentClient = appointmentClient;
	}

	@Override
	public Appointment addAppointment(Appointment appointment) {
		return appointmentClient.addAppointment(appointment);
	}

	@Override
	public List<Appointment> getAllAppointments(){
		List<Appointment> appointments = new ArrayList<>();
		appointmentRepository.findAll().forEach(appointment -> appointments.add(appointment));
		return appointments;
	}

	@Override
	public Appointment getAppointmentById(int id){
		return appointmentClient.getAppointmentById(id);
	}

	@Override
	public Optional<List<Appointment>> getAppointmentsByDateDoctor(String date, int id) {
		Optional<List<Appointment>> appointments = Optional.of(new ArrayList<>());
		appointments = appointmentClient.getAppointmentsByDateDoctor(date,id);
		return appointments;
	}

	@Override
	public Optional<List<Appointment>> getAppointmentsByDatePatient(String date, int id) {
		Optional<List<Appointment>> appointments = Optional.of(new ArrayList<>());
		appointments = appointmentClient.getAppointmentsByDatePatient(date,id);
		return appointments;
	}

	@Override
	public boolean deleteAppointmentById(int id) {
		return appointmentClient.deleteAppointment(id);
		// Note: This assumes that your Appointment class has a method getId() to retrieve the appointment ID.
		// Adjust the condition accordingly based on your Appointment class structure.
	}

	public Appointment resolveAppointment(AppointmentResolveDto dto)
	{
		return appointmentClient.resolveAppointment(dto);
	}
}

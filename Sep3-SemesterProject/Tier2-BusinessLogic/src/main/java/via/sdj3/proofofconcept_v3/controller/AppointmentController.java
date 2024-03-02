package via.sdj3.proofofconcept_v3.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.proofofconcept_v3.Dto.AppointmentCreationDto;
import via.sdj3.proofofconcept_v3.Dto.AppointmentResolveDto;
import via.sdj3.proofofconcept_v3.Dto.DoctorViewAppointmentsDto;
import via.sdj3.proofofconcept_v3.Dto.LoginDto;
import via.sdj3.proofofconcept_v3.Dto.PatientViewAppointmentsDto;
import via.sdj3.proofofconcept_v3.entity.Appointment;
import via.sdj3.proofofconcept_v3.jwtUtil.JwtUtil;
import via.sdj3.proofofconcept_v3.service.AppointmentService;
import via.sdj3.proofofconcept_v3.service.AppointmentServiceInterface;

import java.util.List;
import java.util.Optional;

@RestController
public class AppointmentController {

	private AppointmentServiceInterface appointmentService;
	private JwtUtil jwtUtil;

	public AppointmentController(AppointmentService appointmentService, JwtUtil jwtUtil) {
		this.appointmentService = appointmentService;
		this.jwtUtil = jwtUtil;
	}

	@PostMapping(value="/appointments")
	public ResponseEntity<Object> addAppointment(@RequestBody AppointmentCreationDto dto, HttpServletRequest request){
		String jwt = request.getHeader("Authorization");
		try {
			if (jwt != null && jwt.startsWith("Bearer ")) {
				jwt = jwt.substring(7);
			}
			else {
				// Handle the case where the Authorization header is missing or does not contain a JWT
				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
			}

			if (!jwtUtil.validateKey(jwt) || (!jwtUtil.extractRole(jwt).equals("Patient"))) {
				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
			}


			dto.setPatientId(jwtUtil.extractId(jwt));

			Appointment appointment = new Appointment(dto.getAppointmentId(),dto.getDoctorId(),dto.getPatientId(),dto.getDate(),dto.getTime());

			appointmentService.addAppointment(appointment);
			System.out.println("Appointment successfully added");
			return ResponseEntity.ok().body(appointment);
		}
		catch (Exception e){
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/appointments")
	public ResponseEntity<List<Appointment>> getAllAppointments(){
		List<Appointment> appointments = appointmentService.getAllAppointments();
		return new ResponseEntity<>(appointments, HttpStatus.OK);
	}

	@GetMapping("/appointments/{id}")
	public ResponseEntity<Object> getAppointmentById(@PathVariable ("id") int id){
		Appointment appointment = appointmentService.getAppointmentById(id);

		return new ResponseEntity<>(appointment, HttpStatus.OK);
	}


	@PostMapping(value = "/Doctor/Appointments")
	public ResponseEntity<Object> getAppointmentsByDate(@RequestBody DoctorViewAppointmentsDto dto, HttpServletRequest request) {
		String jwt = request.getHeader("Authorization");
		if (jwt != null && jwt.startsWith("Bearer ")) {
			jwt = jwt.substring(7); // Remove "Bearer " prefix
		}
		else {
			// Handle the case where the Authorization header is missing or does not contain a JWT
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}

		if (!jwtUtil.validateKey(jwt) || (!jwtUtil.extractRole(jwt).equals("Doctor"))) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}

		int doctorId = jwtUtil.extractId(jwt);

		Optional<List<Appointment>> dtoAnswer;
		try {
			dtoAnswer = appointmentService.getAppointmentsByDateDoctor(dto.getDate(),doctorId);

			if (dtoAnswer.isPresent()) {
				// If appointments are present, return the list
				List<Appointment> appointments = dtoAnswer.get();
				return new ResponseEntity<>(appointments,HttpStatus.OK);
			} else {
				// If no appointments are found, return an appropriate response
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(value = "/Patient/Appointments")
	public ResponseEntity<Object> getAppointmentsByDate(@RequestBody PatientViewAppointmentsDto dto, HttpServletRequest request) {
		String jwt = request.getHeader("Authorization");
		if (jwt != null && jwt.startsWith("Bearer ")) {
			jwt = jwt.substring(7); // Remove "Bearer " prefix
		}
		else {
			// Handle the case where the Authorization header is missing or does not contain a JWT
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}

		if (!jwtUtil.validateKey(jwt) || (!jwtUtil.extractRole(jwt).equals("Patient"))) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}

		int patientId = jwtUtil.extractId(jwt);

		Optional<List<Appointment>> dtoAnswer;
		try {
			dtoAnswer = appointmentService.getAppointmentsByDatePatient(dto.getDate(),patientId);

			if (dtoAnswer.isPresent()) {
				// If appointments are present, return the list
				List<Appointment> appointments = dtoAnswer.get();
				return new ResponseEntity<>(appointments,HttpStatus.OK);
			} else {
				// If no appointments are found, return an appropriate response
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/appointments/{id}")
	public ResponseEntity<Object> deleteAppointmentById(@PathVariable("id") int id, HttpServletRequest request) {
	try {
//			String jwt = request.getHeader("Authorization");
//			if (jwt != null && jwt.startsWith("Bearer ")) {
//				jwt = jwt.substring(7); // Remove "Bearer " prefix
//			} else {
//				// Handle the case where the Authorization header is missing or does not contain a JWT
//				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//			}
//
//			if (!jwtUtil.validateKey(jwt)) {
//				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//			}
//
//			// Check if the appointment with the specified ID exists
//			Optional<Appointment> existingAppointment = appointmentService.getAppointmentById(id);
//			if (existingAppointment.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//			}
			// Perform the deletion
			if(appointmentService.deleteAppointmentById(id)){
			return new ResponseEntity<>("Appointment successfully deleted", HttpStatus.OK);}
			else{return new ResponseEntity<>("Appointment wasn't deleted", HttpStatus.NOT_FOUND);}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
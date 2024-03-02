package via.sdj3.proofofconcept_v3.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.proofofconcept_v3.Dto.LoginDto;
import via.sdj3.proofofconcept_v3.Dto.RegisterDoctorDto;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.jwtUtil.JwtUtil;
import via.sdj3.proofofconcept_v3.service.DoctorService;
import via.sdj3.proofofconcept_v3.service.DoctorServiceInterface;

import java.util.List;
import java.util.Optional;

@RestController
public class DoctorController {

    private DoctorServiceInterface doctorInterface;
    private JwtUtil jwtUtil;

    public DoctorController(@Qualifier("doctorService") DoctorService doctorInterface, JwtUtil jwtUtil) {
        this.doctorInterface = doctorInterface;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping(value = "/Doctor/Login")
    public ResponseEntity<Object> loginDoctor(@RequestBody LoginDto dto) {

		String jwt;
        try
		{
			jwt = doctorInterface.authenticateDoctor(dto.getUserName(), dto.getPassword());

		} catch (Exception e) {
			return ResponseEntity.status(401).body(e.getMessage());
        }

		if (jwt != null)
		{
			return ResponseEntity.ok(jwt);
		}
		else {
			return ResponseEntity.status(401).body("Invalid login credentials");
		}


    }

    @PostMapping(value = "/Doctor/Register")
    public ResponseEntity<Object> registerDoctor(@RequestBody RegisterDoctorDto dto) {

		try {
			// Forward to patientService for logic
			doctorInterface.registerDoctor(dto.getFullName(), dto.getName(), dto.getSpecialization(), dto.getPassword());
			return ResponseEntity.ok("Doctor account registered");
		} catch (Exception e) {
			return ResponseEntity.status(401).body(e.getMessage());
		}

	}

		@PostMapping(value = "/doctors")
		public ResponseEntity<Object> addDoctor (@RequestBody Doctor doctor){
			try {
				doctorInterface.addDoctor(doctor);
				System.out.println("Doctor successfully added");
				return ResponseEntity.ok().body(doctor);
			} catch (Exception e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}

		@GetMapping("/doctors")
		public ResponseEntity<List<Doctor>> getAllDoctors () {
			List<Doctor> doctors = doctorInterface.getAllDoctors();
			return new ResponseEntity<>(doctors, HttpStatus.OK);
		}

		@GetMapping("/doctors/test")
		public ResponseEntity<List<Doctor>> getValidatedDoctors () {
		List<Doctor> doctors = doctorInterface.getListOfValidatedDoctors();
		return new ResponseEntity<>(doctors, HttpStatus.OK);
		}

		@GetMapping("/doctors/{id}")
		public ResponseEntity<Object> getDoctorById ( @PathVariable("id") int id){
			Optional<Doctor> doctor = doctorInterface.getDoctorById(id);
			if (!doctor.isPresent()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<>(doctor.get(), HttpStatus.OK);
		}


	}

package via.sdj3.proofofconcept_v3.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Appointment {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("AppointmentId")
	private int appointmentId;

	@Column
	@JsonProperty("DoctorId")
	private int doctorId;

	@Column
	@JsonProperty("PatientId")
	private int patientId;

	@Column
	@JsonProperty("Date")
	private String date;

	@Column
	@JsonProperty("Time")
	private String time;

	@Column
	@JsonProperty("Diagnosis")
	private String diagnosis;

	@Column
	@JsonProperty("Status")
	private boolean status;

	public Appointment(int id, int doctorId, int patientId, String date, String time) {
		this.appointmentId = id;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.date = date;
		this.time = time;
		this.diagnosis = "";
	}
	public Appointment(int id, int doctorId, int patientId, String date, String time,String diagnosis) {
		this.appointmentId = id;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.date = date;
		this.time = time;
		this.diagnosis = diagnosis;
	}

	public Appointment() {
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getStatus(){return status;}
}

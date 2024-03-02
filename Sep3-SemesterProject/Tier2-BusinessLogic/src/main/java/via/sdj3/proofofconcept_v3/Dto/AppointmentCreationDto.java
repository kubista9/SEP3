package via.sdj3.proofofconcept_v3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppointmentCreationDto {
    @JsonProperty("AppointmentId")
    private int appointmentId;

    @JsonProperty("PatientId")
    private int patientId;

    @JsonProperty("DoctorId")
    private int doctorId;

    @JsonProperty("Diagnosis")
    private String diagnosis;

    @JsonProperty("Status")
    private boolean status;

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Time")
    private String time;

    // Constructors, getters, and setters can be added here

    // Example constructor
    public AppointmentCreationDto(int appointmentId, int patientId, int doctorId, String diagnosis, boolean status, String date, String time) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.diagnosis = diagnosis;
        this.status = status;
        this.date = date;
        this.time = time;
    }

    // Example getters and setters
    // Ensure to generate getters and setters for all fields

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
}

package via.sdj3.proofofconcept_v3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

public class AppointmentDto {

        @JsonProperty("AppointmentId")
        private int appointmentId;


        @JsonProperty("DoctorId")
        private int doctorId;


        @JsonProperty("PatientId")
        private int patientId;


        @JsonProperty("Date")
        private String date;


        @JsonProperty("Time")
        private String time;


        @JsonProperty("Diagnosis")
        private String diagnosis;


        @JsonProperty("Status")
        private boolean status;

        public AppointmentDto(int id, int doctorId, int patientId, String date, String time) {
            this.appointmentId = id;
            this.doctorId = doctorId;
            this.patientId = patientId;
            this.date = date;
            this.time = time;
            this.diagnosis = "";
        }
        public AppointmentDto(int id, int doctorId, int patientId, String date, String time,String diagnosis) {
            this.appointmentId = id;
            this.doctorId = doctorId;
            this.patientId = patientId;
            this.date = date;
            this.time = time;
            this.diagnosis = diagnosis;
        }

        public AppointmentDto() {
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



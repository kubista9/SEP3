package via.sdj3.proofofconcept_v3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import via.sdj3.proofofconcept_v3.entity.Appointment;

import java.util.List;

public class PatientViewAppointmentsDto {
    @JsonProperty("Appointments")
    private List<Appointment> Appointments;
    @JsonProperty("Date")
    private String Date;

    // Getter and Setter methods for appointments
    public List<Appointment> getAppointments() {
        return Appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.Appointments = appointments;
    }

    // Getter and Setter methods for date
    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }
}

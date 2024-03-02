package via.sdj3.proofofconcept_v3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import via.sdj3.proofofconcept_v3.entity.Appointment;

import java.util.List;

public class DoctorViewAppointmentsDto {
    @JsonProperty("Appointments")
    private List<AppointmentDto> Appointments;
    @JsonProperty("Date")
    private String Date;

    // Getter and Setter methods for appointments
    public List<AppointmentDto> getAppointments() {
        return Appointments;
    }

    public void setAppointments(List<AppointmentDto> appointments) {
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

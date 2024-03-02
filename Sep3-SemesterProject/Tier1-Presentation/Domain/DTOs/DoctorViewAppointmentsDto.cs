using Domain.Models;

namespace Domain.DTOs;

public class DoctorViewAppointmentsDto
{
    public List<AppointmentDto> Appointments { get; set; }
    public string Date { get; set; }
}
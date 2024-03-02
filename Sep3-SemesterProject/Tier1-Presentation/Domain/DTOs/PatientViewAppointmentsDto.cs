using Domain.Models;

namespace Domain.DTOs;

public class PatientViewAppointmentsDto
{
    public List<Appointment> Appointments { get; set; }
    public string Date { get; set; }
}
namespace Domain.DTOs;

public class AppointmentAvailableDto
{
    public int DoctorId { get; set; }
    public string Time { get; set; }

    public AppointmentAvailableDto(int doctorId, string time)
    {
        DoctorId = doctorId;
        Time = time;
    }
}
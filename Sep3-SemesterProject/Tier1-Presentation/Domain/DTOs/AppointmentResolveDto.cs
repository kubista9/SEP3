namespace Domain.DTOs;

public class AppointmentResolveDto
{
    public int Id { get; }
    public string? Diagnosis { get; set; }
    public bool? Status { get; set; }

    public AppointmentResolveDto(int id)
    {
        Id = id;
    }
}
namespace Domain.DTOs;

public class PatientSearchDto
{
    public string? NameContains { get; }

    public PatientSearchDto(string? nameContains)
    {
        NameContains = nameContains;
    }
}
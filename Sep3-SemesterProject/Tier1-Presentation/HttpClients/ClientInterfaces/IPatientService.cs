using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IPatientService
{
    Task<Patient> ProofOfConcept(RegisterPatientDto dto);
    Task<IEnumerable<Patient>> GetPatientsAsync(string? usernameContains = null);
}
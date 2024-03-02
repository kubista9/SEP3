using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IDoctorService
{
    Task<IEnumerable<Doctor>> GetValidatedDoctorsAsync();
}
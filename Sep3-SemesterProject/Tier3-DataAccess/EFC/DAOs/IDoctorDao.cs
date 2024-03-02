using Domain.Models;

namespace EFC.DAOs;

public interface IDoctorDao
{
    Task<Doctor?> CreateAsync(Doctor doctor);
    Task<IEnumerable<Doctor>> GetAsync();
    Task<Doctor?> GetAsync(int id);
    Task UpdateAsync(Doctor doctor);
    Task DeleteAsync(int id);
    Task<Doctor?> LoginAsDoctor(string username, string paswd);
    Task<Doctor?> GetDoctorByUsername(string username);
}
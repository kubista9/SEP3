using Domain.Models;

namespace EFC.DAOs;

public interface IAppointmentDao
{
    Task<Appointment?> CreateAsync(Appointment appointment);
    Task<IEnumerable<Appointment>> GetAsync();
    Task<Appointment?> GetAsync(int id);
    Task<Appointment?> GetAsync(string date, string time);
    Task UpdateAsync(Appointment appointment);
    Task DeleteAsync(int id);
    Task<List<Appointment>> GetDoctorAppointmentsByDateAndId(int id, string date);
    Task<List<Appointment>> GetPatientAppointmentsByDateAndId(int id, string date);
    Task<Appointment> UpdateStatusDiagnosis(int id, bool status, string diagnosis);
}
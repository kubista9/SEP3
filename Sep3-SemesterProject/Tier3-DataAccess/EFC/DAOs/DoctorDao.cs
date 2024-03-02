using Domain.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.ChangeTracking;

namespace EFC.DAOs;

public class DoctorDao : IDoctorDao
{
    private readonly Context context;

    public DoctorDao(Context context)
    {
        this.context = context;
    }
    
    public async Task<Doctor> CreateAsync(Doctor doctor)
    {
        Console.Write(doctor.FullName);
        EntityEntry<Doctor> newDoctor = await context.Doctors.AddAsync(doctor);
        await context.SaveChangesAsync();
        return newDoctor.Entity;
    }

    public async Task<IEnumerable<Doctor>> GetAsync()
    {
        IQueryable<Doctor> doctorsQuery = context.Doctors.AsQueryable();
        List<Doctor> doctors = await doctorsQuery.ToListAsync();
        return doctors;
    }

    public async Task<Doctor?> GetAsync(int id)
    {
        Doctor? doctor = await context.Doctors.FindAsync(id);
        if (doctor == null)
        {
            throw new Exception($"No Doctor with id: {id}");
        }
        return doctor;
    }

    public async Task UpdateAsync(Doctor doctor)
    {
        Doctor? existing = await GetAsync(doctor.Id);
        if (existing == null)
        {
            throw new Exception($"No Doctor with id: {doctor.Id}");
        }
        context.Doctors.Update(doctor);
        await context.SaveChangesAsync();
    }

    public async Task DeleteAsync(int id)
    {
        Doctor? existing = await GetAsync(id);
        if (existing == null)
        {
            throw new Exception($"No Doctor with id: {id}");
        }
        context.Doctors.Remove(existing);
        await context.SaveChangesAsync();
    }

    public async Task<Doctor?> LoginAsDoctor(string username, string paswd)
    {
        Doctor? doctor = await context.Doctors.FirstOrDefaultAsync(doctor =>
            doctor.Username.Equals(username) && doctor.Password.Equals(paswd));

        if (doctor == null)
        {
            throw new Exception("Username or password incorrect");
        }
        
        if (!doctor.Validated)
        {
            throw new Exception("Doctor account is not validated yet, please contact the administration.");
        }
        
        return doctor;
    }

    public async Task<Doctor?> GetDoctorByUsername(string username)
    {
        Doctor? doctor = await context.Doctors.FirstOrDefaultAsync(doctor =>
            doctor.Username.Equals(username));

        if (doctor == null)
        {
            throw new Exception($"No Doctor with username: {username}");
        }
        return doctor;
    }
}
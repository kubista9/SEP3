using System.Collections;
using Domain.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.ChangeTracking;

namespace EFC.DAOs;

public class AppointmentDao : IAppointmentDao
{
    private readonly Context context;

    public AppointmentDao(Context context)
    {
        this.context = context;
    }

    public async Task<Appointment?> CreateAsync(Appointment appointment)
    {
        IQueryable<Appointment> appointmentsQuery = context.Appointments.Where(a =>
            a.DoctorId == appointment.DoctorId && a.PatientId == appointment.PatientId && a.Date.Equals(appointment.Date) &&
            a.Time.Equals(appointment.Time));
        IEnumerable<Appointment> appointments = await appointmentsQuery.ToListAsync();
        if (appointments.Any())
        {
            throw new Exception("Appointment with those details already exists");
        }

        EntityEntry<Appointment> newAppointment = await context.Appointments.AddAsync(appointment);
        await context.SaveChangesAsync();
        return newAppointment.Entity;
    }

    public async Task<IEnumerable<Appointment>> GetAsync()
    {
        IQueryable<Appointment> appointmentsQuery = context.Appointments.AsQueryable();
        List<Appointment> appointments = await appointmentsQuery.ToListAsync();
        return appointments;
    }

    public async Task<Appointment?> GetAsync(int id)
    {
        Appointment? appointment = await context.Appointments.FindAsync(id);
        if (appointment == null)
        {
            throw new Exception($"No appointment with id {id}");
        }
        return appointment;
    }

    public async Task<Appointment?> GetAsync(string date, string time)
    {
        IQueryable<Appointment?> appointmentsQuery =
            context.Appointments.AsQueryable().Where(b => b.Date.Equals(date) && b.Time.Equals(time));
        IEnumerable<Appointment?> appointments = await appointmentsQuery.ToListAsync();
        Appointment? appointment = appointments.FirstOrDefault();
        return appointment;
    }

    public async Task UpdateAsync(Appointment appointment)
    {
        Appointment? existing = await GetAsync(appointment.Id);
        if (existing == null)
        {
            throw new Exception($"No Appointment with id: {appointment.Id}");
        }
        context.Appointments.Update(appointment);
        await context.SaveChangesAsync();
    }

    public async Task DeleteAsync(int id)
    {
        Appointment? existing = await GetAsync(id);
        if (existing == null)
        {
            throw new Exception($"No Appointment with id: {id}");
        }

        context.Appointments.Remove(existing);
        await context.SaveChangesAsync();
    }

    public async Task<List<Appointment>> GetDoctorAppointmentsByDateAndId(int doctorId, string date)
    {
        IEnumerable<Appointment> existing = context.Appointments
            .Where(b => b.Date.Equals(date) && b.DoctorId.Equals(doctorId));

        if (existing == null || !existing.Any())
        {
            throw new Exception($"No Appointments for doctorId: {doctorId} on date: {date}");
        }

        return existing.ToList();
    }
    

    public async Task<List<Appointment>> GetPatientAppointmentsByDateAndId(int patientId, string date)
    {
        Appointment? existing = await GetAsync(patientId);
        if (existing == null)
        {
            throw new Exception($"No Appointment with id: {patientId}");
        }
        IQueryable<Appointment> appointmentsQuery =
            context.Appointments.Where(b => b.Date.Equals(date) && b.PatientId.Equals(patientId));

        List<Appointment> appointments = await appointmentsQuery.ToListAsync();

        return appointments;
        
    }

    public async Task<Appointment> UpdateStatusDiagnosis(int id, bool status, string diagnosis)
    {
        Appointment? existing = await GetAsync(id);
        if (existing == null)
        {
            throw new Exception($"No Appointment with id: {id}");
        }

        existing.Status = status;
        existing.Diagnosis = diagnosis;
        context.Appointments.Update(existing);
        await context.SaveChangesAsync();
        return existing;
    }
}
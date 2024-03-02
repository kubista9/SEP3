using Domain.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC;

public class Context : DbContext
{
    public DbSet<Patient> Patients { get; set; }
    public DbSet<Doctor> Doctors { get; set; }
    public DbSet<Appointment> Appointments { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder builder)
    {
        builder.UseSqlite("Data Source = ../EFC/Hospital.db");
        builder.UseQueryTrackingBehavior(QueryTrackingBehavior.NoTracking);
    }
    
    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Patient>().HasKey(patient => patient.Id);
        modelBuilder.Entity<Doctor>().HasKey(doctor => doctor.Id);
        modelBuilder.Entity<Appointment>().HasKey(appointment => appointment.Id);
    }
}

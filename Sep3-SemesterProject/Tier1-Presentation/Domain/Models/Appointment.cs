namespace Domain.Models;

public class Appointment
{
    public int AppointmentId { get; set; }
    public int PatientId { get; set; }
    public int DoctorId { get; set; }
    public string Diagnosis { get; set; }
    public bool Status { get; set; }
    public string Date { get; set; }
    public string Time { get; set; }

    public Appointment(int appointmentId, int patientId, int doctorId, string diagnosis, bool status, string date, string time)
    {
        AppointmentId = appointmentId;
        PatientId = patientId;
        DoctorId = doctorId;
        Diagnosis = diagnosis;
        Status = status;
        Date = date;
        Time = time;
    }
}
namespace Domain.Models;

public class Appointment
{
    public int Id { get; set; }
    public int PatientId {get; set;}
    public int DoctorId {get; set;}
    public string Date {get; set;}
    public string Time {get; set;}
    public bool Status { get; set; }
    
    public string? Diagnosis { get; set; }
    
    public Appointment (int id, int patientId, int doctorId, string date, string time, bool status, string? diagnosis)
    {
        if (!(time.EndsWith("00") || time.EndsWith("30")))
        {
            throw new Exception("Appointment time must be at a full or half-hour");
        }

        Id = id;
        PatientId = patientId;
        DoctorId = doctorId;
        Date = date;
        Time = time;
        Diagnosis = diagnosis;
        Status = status;
    }

    public Appointment()
    {
        
    }
}

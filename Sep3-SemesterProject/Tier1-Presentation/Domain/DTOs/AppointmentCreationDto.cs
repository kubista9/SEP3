namespace Domain.DTOs;

public class AppointmentCreationDto
{
    public int AppointmentId { get; set; }
    public int PatientId { get; set; }
    public int DoctorId { get; set; }
    public string Diagnosis { get; set; }
    public bool Status { get; set; }
    public string Date { get; set; }
    public string Time { get; set; }

    public AppointmentCreationDto( int doctorId, int patientId, string date, string time)
    {
        AppointmentId = 0;
        DoctorId = doctorId;
        PatientId = patientId;
        Date = date;
        Time = time;
        Diagnosis = "";
        Status = false;
    }
}
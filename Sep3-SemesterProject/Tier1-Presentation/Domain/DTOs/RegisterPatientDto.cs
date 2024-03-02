using Domain.Models;

namespace Domain.DTOs;

public class RegisterPatientDto
{
    public string UserName { get;set; }
    public string Password { get; set; }
    public string FullName { get; set; }
    public List<Appointment> Appointments { get; }

    public RegisterPatientDto(string name, string username, string password)
    {
        FullName = name;
        UserName = username;
        Password = password;
        Appointments = new List<Appointment>();
    }
}

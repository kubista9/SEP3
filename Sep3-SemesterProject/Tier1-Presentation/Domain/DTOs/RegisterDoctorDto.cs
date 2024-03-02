namespace Domain.DTOs;

public class RegisterDoctorDto
{
    public string UserName { get;set; }
    public string Password { get; set; }
    public string FullName { get; set; }
    public string Specialization { get; set; }

    public RegisterDoctorDto(string username, string password, string fullName, string specialization)
    {
        UserName = username;
        Password = password;
        FullName = fullName;
        Specialization = specialization;
    }
}
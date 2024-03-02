namespace Domain.DTOs;

public class PatientCreationDto
{
    public int Id { get; }
    public string Name { get; }
    public string Username { get; }
    public string Password { get; }

    public PatientCreationDto(int id, string name, string username, string password)
    {
        Id = id;
        Name = name;
        Username = username;
        Password = password;
    }

}
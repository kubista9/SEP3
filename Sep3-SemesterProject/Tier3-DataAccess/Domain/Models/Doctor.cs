namespace Domain.Models;

public class Doctor
{
    public int Id { get; set; }
    public string Username { get; set; }
    public string Password { get; set; }
    public string FullName { get; set; }
    public string? Specialization { get; set; }
    public bool Validated { get; set; }

    public Doctor(int id, string username, string password, string fullName, string? specialization, bool validated)
    {
        Id = id;
        Username = username;
        Password = password;
        FullName = fullName;
        Specialization = Specialization;
        Validated = validated;
    }

    public Doctor()
    {
        
    }
}
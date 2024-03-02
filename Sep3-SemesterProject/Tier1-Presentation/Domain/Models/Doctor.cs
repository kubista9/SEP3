namespace Domain.Models;

public class Doctor
{
    public int Id { get; }
    public string Username { get; }
    public string Password { get; }
    public string FullName { get; }
    public string Specialization { get; }
    public bool Validated { get; }

    public Doctor(string fullName, string username, string password, string specialization, int id, bool validated)
    {
        this.Id = id;
        this.Username = username;
        this.Password = password;
        this.FullName = fullName;
        this.Specialization = specialization;
        this.Validated = validated;
    }
}
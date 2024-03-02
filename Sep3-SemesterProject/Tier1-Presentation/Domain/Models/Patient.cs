namespace Domain.Models;

public class Patient
{
    public int Id { get; }
    public string Name { get; }
    public string Username { get; }
    public string Password { get; }


    public Patient(int id, string name, string username, string password)
    {
        Id = id;
        Name = name;
        Username = username;
        Password = password;

    }
}

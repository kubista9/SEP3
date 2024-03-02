namespace Domain.Models;

public class Patient
{
    public int Id { get; set; } 
    public string Name { get; set; }
    public string Username { get; set; }
    public string Password { get; set; }
    
    
    public Patient(int id, string name, string username, string password)
    {
        Id = id;
        Name = name;
        Username = username;
        Password = password;
    }

    public Patient()
    {
    }
}
namespace Domain.DTOs;

public class LoginDto
{
    public string userName { get; set; }
    public string password { get; set; }

    public LoginDto(string username, string password)
    {
        this.userName = username;
        this.password = password;
    }
}
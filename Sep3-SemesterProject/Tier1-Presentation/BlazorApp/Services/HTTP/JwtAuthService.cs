using System.Reflection.Metadata.Ecma335;
using System.Security.Claims;
using System.Text;
using System.Text.Json;
using Domain.DTOs;



namespace BlazorApp.Services.Http;

public class JwtAuthService : IAuthService
{
    private readonly HttpClient client = new ();

    private string url = "http://localhost:8989";

    // this private variable for simple caching
    public static string? Jwt { get; private set; } = "";
    
    public static Dictionary<string, object>? ClaimsMap { get; private set; }


    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; } = null!;
    public string getJwt()
    {
        return Jwt;
    }

    public async Task LoginDoctorAsync(LoginDto userLoginDto)
    {
        
        string userAsJson = JsonSerializer.Serialize(userLoginDto);
        StringContent content = new(userAsJson, Encoding.UTF8, "application/json");

        HttpResponseMessage response = await client.PostAsync(url +"/Doctor/Login", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }

        string token = responseContent;
        Jwt = token;
        System.Console.WriteLine(Jwt);
        ClaimsMap = ParseClaimsFromJwtAsDictionary(token);
        
        ClaimsPrincipal principal = CreateClaimsPrincipal();

        OnAuthStateChanged.Invoke(principal);
    }
    
    
    public async Task LoginPatientAsync(LoginDto userLoginDto)
    {

        string userAsJson = JsonSerializer.Serialize(userLoginDto);
        StringContent content = new(userAsJson, Encoding.UTF8, "application/json");

        HttpResponseMessage response = await client.PostAsync(url +"/Patient/Login", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }

        string token = responseContent;
        Jwt = token;
        System.Console.WriteLine(Jwt);
        ClaimsMap = ParseClaimsFromJwtAsDictionary(token);
        
        ClaimsPrincipal principal = CreateClaimsPrincipal();

        OnAuthStateChanged.Invoke(principal);
    }

    private static ClaimsPrincipal CreateClaimsPrincipal()
    {
        if (ClaimsMap == null || ClaimsMap.Count == 0)
        {
            return new ClaimsPrincipal();
        }

        ClaimsIdentity identity = new ClaimsIdentity(ClaimsMap.Select(kvp => new Claim(kvp.Key, kvp.Value.ToString())), "jwt");

        ClaimsPrincipal principal = new ClaimsPrincipal(identity);
        return principal;
    }

    public Task LogoutAsync()
    {
        Jwt = null;
        ClaimsMap = null;
        ClaimsPrincipal principal = new();
        OnAuthStateChanged.Invoke(principal);
        return Task.CompletedTask;
    }

    
    public async Task RegisterPatientAsync(RegisterPatientDto patient)
    {
        string userAsJson = JsonSerializer.Serialize(patient);
        StringContent content = new(userAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync(url + "/Patient/Register", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }
    
    public async Task RegisterDoctorAsync(RegisterDoctorDto doctor)
    {
        string userAsJson = JsonSerializer.Serialize(doctor);
        StringContent content = new(userAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PostAsync(url + "/Doctor/Register", content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
    }

    public Task<ClaimsPrincipal> GetAuthAsync()
    {
        ClaimsPrincipal principal = CreateClaimsPrincipal();
        return Task.FromResult(principal);
    }


    // Below methods stolen from https://github.com/SteveSandersonMS/presentation-2019-06-NDCOslo/blob/master/demos/MissionControl/MissionControl.Client/Util/ServiceExtensions.cs
    private static IEnumerable<Claim> ParseClaimsFromJwt(string jwt)
    {
        string payload = jwt.Split('.')[1];
        byte[] jsonBytes = ParseBase64WithoutPadding(payload);
        Dictionary<string, object>? keyValuePairs = JsonSerializer.Deserialize<Dictionary<string, object>>(jsonBytes);
        return keyValuePairs!.Select(kvp => new Claim(kvp.Key, kvp.Value.ToString()!));
    }
    
    private static Dictionary<string, object> ParseClaimsFromJwtAsDictionary(string jwt)
    {
        string payload = jwt.Split('.')[1];
        byte[] jsonBytes = ParseBase64WithoutPadding(payload);
        Dictionary<string, object>? keyValuePairs = JsonSerializer.Deserialize<Dictionary<string, object>>(jsonBytes);
        return keyValuePairs ?? new Dictionary<string, object>();
    }
    private static IEnumerable<Claim> ParseClaimsFromMap(Dictionary<string, string> claimsMap)
    {
        return claimsMap.Select(kvp => new Claim(kvp.Key, kvp.Value));
    }

    private static byte[] ParseBase64WithoutPadding(string base64)
    {
        switch (base64.Length % 4)
        {
            case 2:
                base64 += "==";
                break;
            case 3:
                base64 += "=";
                break;
        }

        return Convert.FromBase64String(base64);
    }
}
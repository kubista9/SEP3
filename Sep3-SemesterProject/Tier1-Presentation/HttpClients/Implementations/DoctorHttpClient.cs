using System.Text.Json;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class DoctorHttpClient : IDoctorService
{
    private readonly HttpClient client;
     
    public DoctorHttpClient(HttpClient client)
    {
        this.client = client;
    }
    public async Task<IEnumerable<Doctor>> GetValidatedDoctorsAsync()
    {
        HttpResponseMessage response = await client.GetAsync("http://localhost:8989/doctors/test");
        
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        IEnumerable<Doctor> doctors = JsonSerializer.Deserialize<IEnumerable<Doctor>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return doctors;
    }
}
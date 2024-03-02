using System.Data;
using System.Net;
using System.Net.Http.Headers;
using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class AppointmentHttpClient : IAppointmentService
{
    private readonly HttpClient client;

    private String url ="http://localhost:8989/";

    public AppointmentHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<Appointment> CreateAsync(AppointmentCreationDto dto, string jwt)
    {
	    try
	    {
		    using (HttpClient client = new HttpClient())
		    {
			    // Set the base URL of your Java backend
			    client.BaseAddress = new Uri(url);

			    // Set the authorization header with the JWT token
			    client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", jwt);

			    HttpResponseMessage response = await client.PostAsJsonAsync(url + "appointments", dto);
			    string result = await response.Content.ReadAsStringAsync();
			    if (!response.IsSuccessStatusCode)
			    {
				    throw new Exception(response.StatusCode.ToString());
			    }

			    Appointment appointment = JsonSerializer.Deserialize<Appointment>(result);
			    return appointment;
		    }
	    }
	    catch (Exception e)
	    {
		    Console.WriteLine(e);
		    throw e;
	    }
	    
    }

    public Task<Appointment> CreateAsync(AppointmentCreationDto dto)
    {
	    throw new NotImplementedException();
    }

    public async Task UpdateAsync(AppointmentResolveDto dto)
    {
	    string dtoAsJson = JsonSerializer.Serialize(dto);
	    StringContent body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");
	    HttpResponseMessage response = await client.PatchAsync(url + "appointments/resolve", body);
	    if (!response.IsSuccessStatusCode)
	    {
		    string content = await response.Content.ReadAsStringAsync();
		    throw new Exception(content);
	    }
    }
    
    public async Task<Appointment> GetByIdAsync(int id)
    {
	    HttpResponseMessage response = await client.GetAsync(url + $"appointments/{id}");
	    string content = await response.Content.ReadAsStringAsync();
	    if (!response.IsSuccessStatusCode)
	    {
		    throw new Exception(content);
	    }

	    Appointment appointment = JsonSerializer.Deserialize<Appointment>(content, new JsonSerializerOptions
	    {
		    PropertyNameCaseInsensitive = true
	    })!;
	    return appointment;
    }

    public async Task<List<Appointment>> getAppointmentsByDateDoctor(DoctorViewAppointmentsDto dto, string jwt)
    {
	    using (HttpClient client = new HttpClient())
	    {
		    // Set the base URL of your Java backend
		    client.BaseAddress = new Uri(url);

		    // Set the authorization header with the JWT token
		    client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", jwt);

		    // Serialize the DoctorViewAppointmentsDto to JSON and send it in the request body
		    string jsonDto = JsonSerializer.Serialize(dto);
		    StringContent content = new StringContent(jsonDto, Encoding.UTF8, "application/json");
		    Console.WriteLine($"JWT value: '{jwt}'");
		    client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", jwt.Trim());
		    // Make a POST request to the /Doctor/Appointments endpoint
		    HttpResponseMessage response = await client.PostAsync("/Doctor/Appointments", content);

		    if (response.IsSuccessStatusCode)
		    {
			    // If the request is successful, parse the JSON response to get the list of appointments
			    string jsonResponse = await response.Content.ReadAsStringAsync();
			    List<Appointment> appointments = JsonSerializer.Deserialize<List<Appointment>>(jsonResponse);
			    return appointments;
		    }
		    else if (response.StatusCode == HttpStatusCode.NoContent)
		    {
			    // If no appointments are found, return an empty list
			    return new List<Appointment>();
		    }
		    else
		    {
			    // If an error occurs, handle it accordingly (e.g., log the error, throw an exception)
			    throw new Exception($"Error: {response.StatusCode}");
		    }
	    }
    }

    public async Task<List<Appointment>> getAppointmentsByDatePatient(PatientViewAppointmentsDto dto, string jwt)
    {
	    using (HttpClient client = new HttpClient())
	    {
		    // Set the base URL of your Java backend
		    client.BaseAddress = new Uri(url);

		    // Set the authorization header with the JWT token
		    client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", jwt);

		    // Serialize the DoctorViewAppointmentsDto to JSON and send it in the request body
		    string jsonDto = JsonSerializer.Serialize(dto);
		    StringContent content = new StringContent(jsonDto, Encoding.UTF8, "application/json");
		    Console.WriteLine($"JWT value: '{jwt}'");
		    client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", jwt.Trim());
		    // Make a POST request to the /Doctor/Appointments endpoint
		    HttpResponseMessage response = await client.PostAsync("/Patient/Appointments", content);

		    if (response.IsSuccessStatusCode)
		    {
			    // If the request is successful, parse the JSON response to get the list of appointments
			    string jsonResponse = await response.Content.ReadAsStringAsync();
			    List<Appointment> appointments = JsonSerializer.Deserialize<List<Appointment>>(jsonResponse);
			    return appointments;
		    }
		    else if (response.StatusCode == HttpStatusCode.NoContent)
		    {
			    // If no appointments are found, return an empty list
			    return new List<Appointment>();
		    }
		    else
		    {
			    // If an error occurs, handle it accordingly (e.g., log the error, throw an exception)
			    throw new Exception($"Error: {response.StatusCode}");
		    }
	    }
    }

    public async Task<ICollection<Appointment>> GetAsync(int patientId)
    {
	    HttpResponseMessage response = await client.GetAsync("/appointments/"+patientId);
	    string content = await response.Content.ReadAsStringAsync();
	    if (!response.IsSuccessStatusCode)
	    {
		    throw new Exception(content);
	    }

	    ICollection<Appointment> appointments = JsonSerializer.Deserialize<ICollection<Appointment>>(content, new JsonSerializerOptions
	    {
		    PropertyNameCaseInsensitive = true
	    })!;
	    return appointments;
    }

    public async Task DeleteAsync(int appointmentId, string jwt)
    {
	    using (HttpClient client = new HttpClient())
	    {
		    // Set the base URL of your Java backend
		    client.BaseAddress = new Uri(url);

		    // Set the authorization header with the JWT token
		    client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", jwt);

		    // Make a DELETE request to the /appointments/{id} endpoint
		    HttpResponseMessage response = await client.DeleteAsync($"/appointments/{appointmentId}");

		    if (!response.IsSuccessStatusCode)
		    {
			    // If an error occurs, handle it accordingly (e.g., log the error, throw an exception)
			    string content = await response.Content.ReadAsStringAsync();
			    throw new Exception($"Error: {response.StatusCode}. {content}");
		    }
	    }
    }
    // private static string ConstructQuery(int appointmentId, int patientId, int doctorId, string diagnostic, bool status, string date, string time)
    // {
	   //  string query = "";
	   //  if (appointmentId != null)
	   //  {
		  //   query += $"?appointmentId={appointmentId}";
	   //  }
	   //  if (patientId != null)
	   //  {
		  //   query += $"?patientId={patientId}";
	   //  }
	   //  if (doctorId != null)
	   //  {
		  //   query += $"?doctorId={doctorId}";
	   //  }
	   //  if (string.IsNullOrEmpty(diagnostic))
	   //  {
		  //   query += $"?diagnostic={diagnostic}";
	   //  }
	   //  if (status != null)
	   //  {
		  //   query += $"?=status{status}";
	   //  }
	   //  if (string.IsNullOrEmpty(date))
	   //  {
		  //   query += $"?date={date}";
	   //  }
	   //  if (string.IsNullOrEmpty(time))
	   //  {
		  //   query += $"?time={time}";
	   //  }
	   //  return query;
    // }
}

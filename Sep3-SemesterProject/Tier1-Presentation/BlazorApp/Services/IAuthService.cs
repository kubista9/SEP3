using System.Security.Claims;
using Domain.DTOs;
using Domain.Models;


namespace BlazorApp.Services;

public interface IAuthService
{
    public Task LoginDoctorAsync(LoginDto loginDto);
    public Task LoginPatientAsync(LoginDto loginDto);
    public Task LogoutAsync();
    public Task RegisterPatientAsync(RegisterPatientDto user);
    public Task RegisterDoctorAsync(RegisterDoctorDto user);
    public Task<ClaimsPrincipal> GetAuthAsync();

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
    public String getJwt();
}
using Domain.Models;
using EFC.DAOs;
using Grpc.Core;
using GrpcService;
using Patient = Domain.Models.Patient;

namespace GrpcService.Services;

public class PatientService : Patient.PatientBase
    
{
    private IPatientDao service;

    public PatientService(IPatientDao service)
    {
        this.service = service;
    }

    public override async Task<PatientObj> CreateAsync(PatientObj request, ServerCallContext context)
    {
        Console.WriteLine(request.Name);
        try
        {
            Domain.Models.Patient addingPatient = new Domain.Models.Patient()
            {
                Id = request.Id,
                Name = request.Name,
                Username = request.Username,
                Password = request.Password
            };
            Domain.Models.Patient addedPatient = await service.CreateAsync(addingPatient);
    
            PatientObj patientObj = new PatientObj()
            {
                Id = addedPatient.Id,
                Name = addedPatient.Name,
                Username = addedPatient.Username,
                Password = addedPatient.Password
            };
    
            return patientObj;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<PatientList> GetAsync(PatientVoid request, ServerCallContext context)
    {
        try
        {
            IEnumerable<Domain.Models.Patient> patients = await service.GetAsync();
            PatientList patientList = new PatientList();
            foreach (Domain.Models.Patient p in patients)
            {
                PatientObj patientObj = new PatientObj()
                {
                    Id = p.Id,
                    Name = p.Name,
                    Username = p.Username,
                    Password = p.Password
                };
                patientList.Patients.Add(patientObj);
            }

            return patientList;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }
    
   
    public override async Task<PatientObj> LoginAsPatient(PatientLogin obj, ServerCallContext context)
    {
        
        
        string username, pswd;
        username = obj.Username;
        pswd = obj.Password;
    
        try
        {
            Domain.Models.Patient? patient = await service.LoginAsPatient(username,pswd);

            PatientObj patientObj = new PatientObj()
            {
                Username = patient.Username,
                Password = patient.Password,
                Name = patient.Name,
                Id = patient.Id,
            };

            return await Task.FromResult(patientObj);
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.NotFound, e.Message));
        }
        
    }
}
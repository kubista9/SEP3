using EFC.DAOs;
using Grpc.Core;
using Domain.Models;

namespace GrpcService.Services;

public class DoctorService : Doctor.DoctorBase
{
    private IDoctorDao service;

    public DoctorService(IDoctorDao service)
    {
        this.service = service;
    }

    public override async Task<DoctorResponse> CreateAsync(DoctorObj request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Doctor addingDoctor = new Domain.Models.Doctor()
            {
                Id = request.Id,
                Username = request.Username,
                Password = request.Password,
                FullName = request.Fullname,
                Specialization = request.Specialization,
                Validated = request.Validated
            };
            await service.CreateAsync(addingDoctor);
            DoctorResponse response = new DoctorResponse()
            {
                Successful = true
            };
            return response;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<DoctorList> GetAsync(DoctorVoid request, ServerCallContext context)
    {
        try
        {
            IEnumerable<Domain.Models.Doctor> doctors = await service.GetAsync();
            DoctorList doctorList = new DoctorList();
            foreach (Domain.Models.Doctor d in doctors)
            {
                DoctorObj doctorObj = new DoctorObj()
                {
                    Id = d.Id,
                    Username = d.Username,
                    Password = d.Password,
                    Fullname = d.FullName,
                    Specialization = d.Specialization,
                    Validated = d.Validated
                };
                doctorList.Doctors.Add(doctorObj);
            }

            return doctorList;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }
    
    public override async Task<DoctorList> GetValidatedAsync(DoctorVoid request, ServerCallContext context)
    {
        try
        {
            IEnumerable<Domain.Models.Doctor> doctors = await service.GetAsync();
            DoctorList doctorList = new DoctorList();
            foreach (Domain.Models.Doctor d in doctors)
            {
                if (d.Validated)
                {
                    DoctorObj doctorObj = new DoctorObj()
                    {
                        Id = d.Id,
                        Username = d.Username,
                        Password = d.Password,
                        Fullname = d.FullName,
                        Specialization = d.Specialization,
                        Validated = d.Validated
                    };
                    doctorList.Doctors.Add(doctorObj);
                }
            }

            return doctorList;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<DoctorObj> GetByIdAsync(DoctorId request, ServerCallContext context)
    {
        try
        {
            int doctorId = request.Id;
            Domain.Models.Doctor fetchedDoctor = await service.GetAsync(doctorId);
            DoctorObj doctorObj = new DoctorObj()
            {
                Id = fetchedDoctor.Id,
                Username = fetchedDoctor.Username,
                Password = fetchedDoctor.Password,
                Fullname = fetchedDoctor.FullName,
                Specialization = fetchedDoctor.Specialization,
                Validated = fetchedDoctor.Validated
            };
            return doctorObj;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<DoctorResponse> UpdateAsync(DoctorObj request, ServerCallContext context)
    {
        try
        {
            Domain.Models.Doctor updatingDoctor = new Domain.Models.Doctor(request.Id, request.Username, request.Password, request.Fullname,
                request.Specialization, request.Validated);
            await service.UpdateAsync(updatingDoctor);
            DoctorResponse response = new DoctorResponse()
            {
                Successful = true
            };
            return response;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<DoctorResponse> DeleteAsync(DoctorId request, ServerCallContext context)
    {
        try
        {
            int doctorId = request.Id;
            await service.DeleteAsync(doctorId);
            DoctorResponse response = new DoctorResponse()
            {
                Successful = true
            };
            return response;
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.PermissionDenied, e.Message));
        }
    }

    public override async Task<DoctorObj> LoginAsDoctor(DoctorLogin obj, ServerCallContext context)
    {
        string username, pswd;
        username = obj.Username;
        pswd = obj.Password;
    
        try
        {
            Domain.Models.Doctor? doctor = await service.LoginAsDoctor(username,pswd);

            DoctorObj doctorObj = new DoctorObj()
            {
                Username = doctor.Username,
                Password = "",
                Fullname = doctor.FullName,
                Specialization = doctor.Specialization,
                Id = doctor.Id,
                Validated = doctor.Validated
            };

            return await Task.FromResult(doctorObj);
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.NotFound, e.Message));
        }
        
    }

    public override async Task<DoctorObj> GetByUsername(DoctorUsername obj, ServerCallContext context)
    {
        string username;
        username = obj.Username;
    
        try
        {
            Domain.Models.Doctor? doctor = await service.GetDoctorByUsername(username);

            DoctorObj doctorObj = new DoctorObj()
            {
                Username = doctor.Username,
                Password = "",
                Fullname = doctor.FullName,
                Specialization = doctor.Specialization,
                Id = doctor.Id,
                Validated = doctor.Validated
            };

            return await Task.FromResult(doctorObj);
        }
        catch (Exception e)
        {
            throw new RpcException(new Status(StatusCode.NotFound, e.Message));
        }

    }
    
}
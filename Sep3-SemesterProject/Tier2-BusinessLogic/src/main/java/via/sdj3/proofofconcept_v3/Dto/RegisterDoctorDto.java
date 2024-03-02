package via.sdj3.proofofconcept_v3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterDoctorDto {
    @JsonProperty("UserName")
    private String UserName;

    @JsonProperty("Password")
    private String Password;

    @JsonProperty("FullName")
    private String FullName;

    @JsonProperty("Specialization")
    private String Specialization;


    public RegisterDoctorDto(String name, String username, String specialization, String password) {
        this.FullName = name;
        this.UserName = username;
        this.Specialization = specialization;
        this.Password = password;
    }

    public RegisterDoctorDto() {
    }

    public String getName() {
        return UserName;
    }

    public void setName(String name) {
        this.UserName = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }
}

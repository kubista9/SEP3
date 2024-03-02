package via.sdj3.proofofconcept_v3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterPatientDto {
    @JsonProperty("UserName")
    private String UserName;

    @JsonProperty("Password")
    private String Password;

    @JsonProperty("FullName")
    private String FullName;

    public RegisterPatientDto(String fullName, String userName, String password) {
        this.FullName = fullName;
        this.UserName = userName;
        this.Password = password;
    }

    public RegisterPatientDto() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}

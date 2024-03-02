package via.sdj3.proofofconcept_v3.Dto;

public class AppointmentResolveDto {
    private final int id;
    private String diagnosis;
    private Boolean status;

    public AppointmentResolveDto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
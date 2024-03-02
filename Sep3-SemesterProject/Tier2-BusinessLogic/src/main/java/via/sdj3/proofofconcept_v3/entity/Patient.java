package via.sdj3.proofofconcept_v3.entity;

import jakarta.persistence.*;

@Entity
public class Patient {
	@Column
	private String fullName;

	@Column
	private String username;

	@Column
	private String password;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer patientId;

	public Patient(String fullName, String username, String password) {
		this.fullName = fullName;
		this.username = username;
		this.password = password;
	}

	public Patient() {
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
}

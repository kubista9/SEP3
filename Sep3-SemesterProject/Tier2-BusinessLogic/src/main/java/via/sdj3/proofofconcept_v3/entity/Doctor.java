package via.sdj3.proofofconcept_v3.entity;

import jakarta.persistence.*;

@Entity
public class Doctor {
	@Column
	private String fullName;

	@Column
	private String userName;

	@Column
	private String password;

	@Column
	private String specialization;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private boolean validated;

	public Doctor(String fullName, String userName, String password, String specialization, boolean validated) {
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
		this.specialization = specialization;
		this.validated = validated;
	}

	public Doctor() {
	}
	public Doctor(int id, boolean validated) {
		this.validated = validated;
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}
}

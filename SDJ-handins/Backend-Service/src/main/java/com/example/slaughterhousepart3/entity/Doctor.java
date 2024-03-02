package com.example.slaughterhousepart3.entity;

public class Doctor {
	private String fullName;
	private String userName;
	private String specialization;
	private boolean validated;
	private int id;
	private String password;

	public Doctor(String fullName, String userName, String specialization, String password) {
		this.fullName = fullName;
		this.userName = userName;
		this.specialization = specialization;
		this.validated = validated;
		this.id = id;
		this.password = password;
	}

	public Doctor() {
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

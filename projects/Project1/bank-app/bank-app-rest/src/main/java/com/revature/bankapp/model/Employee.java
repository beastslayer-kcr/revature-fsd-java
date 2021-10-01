package com.revature.bankapp.model;

public class Employee {
	private String email;
	private String password;

	public Employee(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Employee() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

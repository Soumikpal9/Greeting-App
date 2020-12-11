package com.example.user;

public class User {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	@Override
	public String toString() {
		return "User [FirstName=" + firstName + ", LastName=" + lastName + "]";
	}
}

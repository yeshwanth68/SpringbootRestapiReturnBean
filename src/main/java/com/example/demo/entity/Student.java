package com.example.demo.entity;

public class Student {
	
	private String firstname;
	private String lastname;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Student(String firstName, String lastName) {
		super();
		this.firstname = firstName;
		this.lastname = lastName;
	}
	

}

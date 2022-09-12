package com.springboot.first.app;

public class Student {
	private String firstname;
	private String lastname;
	private long id;
	
	public Student(String firstname, String lastname, long id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}

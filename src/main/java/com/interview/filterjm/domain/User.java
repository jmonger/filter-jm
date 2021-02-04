package com.interview.filterjm.domain;

public class User {
	private Integer id;
	private String firstName;
	private String surName;
	private String role;
	private Integer age;
	
	
	public User(Integer id, String firstName, String surName, String role, Integer age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.role = role;
		this.age = age;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}

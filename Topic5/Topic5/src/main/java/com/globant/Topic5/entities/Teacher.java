package com.globant.Topic5.entities;

import java.util.Date;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("Teacher")
public class Teacher {
	
	@Id
	private int id;
	
	@Property("First_Name")
	private String firstName;
	
	@Property("Last_Name")
	private String lastName;
	
	@Property("Birthday")
	private Date birthday;
	
	public Teacher(){
	}
	
	public Teacher(int id, String firstName, String lastName, Date birthday) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}

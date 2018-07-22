package com.globant.Topic3.model;

import java.util.Date;

public class User {
	
	private String login;
	private String password;
	private String name;
	private String lastName;
	private Date birthday;
	
	public User(String login, String password, String name, String lastName, Date birthday) {
		this.login = login;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}

package com.globant.Topic3.service;

import java.util.Date;

import com.globant.Topic3.model.User;

public interface UserService {
	
	//Create
	void createUser(String login, String password, String name, String lastName, Date birthday);
	
	//Read
	User getUser(String login);
	
	//Update fields, minus birthday and login(unique id)
	void updateUserName(String login, String name);
	void updateUserLastName(String login, String lastName);
	void updateUserPassword(String login, String password);
	
	//Delete
	void deleteUser(User user);

}

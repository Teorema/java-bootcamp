package com.globant.Topic3.service;

import java.util.ArrayList;
import java.util.Date;

import com.globant.Topic3.model.User;

/**
 * Represents a implementation of the CRUD operations
 * for a User Table/Database
 */
public class UserServiceImp implements UserService{
	
	/**
	 * A "collection" of users in the system
	 */
	private ArrayList<User> userTable = new ArrayList<User>();
	
	/**
	 * An empty constructor
	 */
	protected UserServiceImp(){
	}

	/**
	 * Creates a user, and add it to the userTable
	 * @param All of the required elements to generate a new User
	 */
	public void createUser(String login, String password, String name, String lastName, Date birthday) {
		User user = new User(login, password, name, lastName, birthday);
		userTable.add(user);
	}

	/**
	 * Assuming that the login field in User is unique, it can be used
	 * to search the userTable and find the corresponding User
	 * @param The login of the User needed
	 * @return The corresponding User to the login, or null it not found
	 */
	public User getUser(String login) {
		for (User element : userTable){
			if (element.getLogin().equals(login))
				return element;
		}
		return null;
	}

	/**
	 * Changes the first name of the User
	 * @param login indicates the User that needs the update
	 * @param name the new name
	 */
	public void updateUserName(String login, String name) {
		for (User element : userTable){
			if (element.getLogin().equals(login))
				element.setName(name);
		}
	}
	
	/**
	 * Changes the last name of the User
	 * @param login indicates the User that needs the update
	 * @param lastName the new name
	 */
	public void updateUserLastName(String login, String lastName) {
		for (User element : userTable){
			if (element.getLogin().equals(login))
				element.setLastName(lastName);
		}
	}

	/**
	 * Changes the password of the User
	 * @param login indicates the User that needs the update
	 * @param password the new password
	 */
	public void updateUserPassword(String login, String password) {
		for (User element : userTable){
			if (element.getLogin().equals(login))
				element.setPassword(password);
		}
	}

	/**
	 * Removes a User form the userTable
	 * @param user the user to delete from the table
	 */
	public void deleteUser(User user) {
		userTable.remove(user);
	}

}

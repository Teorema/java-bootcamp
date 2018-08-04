package com.globant.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.globant.model.User;

public class UserRepository {
	
	private Collection<User> users;
	
	public UserRepository(){
		users = new ArrayList<User>();
	}
	
	public Collection<User> getUsers(){
		return users;
	}
	
	public void addUser(User user){
		users.add(user);
	}
	
	public void removeUser(User user){
		users.remove(user);
	}
	
	public void updateUserNickname(String username, String nickname){
		for (User element : users)
			if (element.getUsername().equals(username)){
				element.setNickname(nickname);
				return;
			}
	}

}

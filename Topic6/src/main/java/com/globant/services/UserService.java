package com.globant.services;

import java.util.Collection;

import com.globant.model.User;

public interface UserService {
	
	public Collection<User> getUsers();

	public void createUser(User user);
	
	public void deleteUser(User user);
	
	public void updateUserNickname(String username, String nickname);
	
	public Collection<User> findByRealName(String name);
	public Collection<User> findByNickname(String nickname);
	
	public boolean validateUser(String username);
	
}

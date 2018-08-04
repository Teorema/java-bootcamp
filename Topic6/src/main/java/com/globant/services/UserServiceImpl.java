package com.globant.services;

import java.util.ArrayList;
import java.util.Collection;

import com.globant.model.User;
import com.globant.repository.UserRepository;

public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	public UserServiceImpl(){
		userRepository = new UserRepository();
	}
	
	@Override
	public Collection<User> getUsers() {
		return userRepository.getUsers();
	}
	
	@Override
	public void createUser(User user) {
		userRepository.addUser(user);
	}

	@Override
	public void deleteUser(User user) {
		userRepository.removeUser(user);
	}

	@Override
	public void updateUserNickname(String username, String nickname) {
		userRepository.updateUserNickname(username, nickname);
	}

	@Override
	public Collection<User> findByRealName(String name) {
		Collection<User> usersfound = new ArrayList<User>();
		for (User element : userRepository.getUsers())
			if (element.getRealname().equals(name))
				usersfound.add(element);
		return usersfound;
	}

	@Override
	public Collection<User> findByNickname(String nickname) {
		Collection<User> usersfound = new ArrayList<User>();
		for (User element : userRepository.getUsers())
			if (element.getNickname().equals(nickname))
				usersfound.add(element);
		return usersfound;
	}

	@Override
	public boolean validateUser(String username) {
		for (User element : userRepository.getUsers()){
			if (element.getUsername().equals(username))
				return true;
		}
		return false;
	}

}

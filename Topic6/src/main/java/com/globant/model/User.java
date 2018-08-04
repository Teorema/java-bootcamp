package com.globant.model;

public class User {

	private String username;
	private String password;
	private String nickname;
	private String realname;
	
	public User(String username, String password, String nickname, String realname) {
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.realname = realname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}
	
}

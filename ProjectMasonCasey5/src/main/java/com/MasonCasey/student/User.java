package com.MasonCasey.student;

import java.util.ArrayList;

import com.MasonCasey.Database.StudentDB;

public class User {
	private String username;
	private String password;
	private String email;
	
	public  User() {
		setUsername("");
		setPassword("");
		setEmail("");
	}
	
	public User(String u, String p, String e) {
		setUsername(u);
		setPassword(p);
		setEmail(e);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}

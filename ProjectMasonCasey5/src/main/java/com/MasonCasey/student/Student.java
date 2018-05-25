package com.MasonCasey.student;

import com.MasonCasey.Database.StudentDB;

public class Student {


	
	

	private  String first; 
	private  String last; 
	private  String Username;
	private  String password; 
	private  String email;

	
	
	
	public Student(){
		setFirst("");
		setLast("");
		setEmail("");
		setUsername("");
		setPassword("");
	}



	public String getFirst() {
		return first;
	}



	public void setFirst(String first) {
		this.first = first;
	}



	public String getLast() {
		return last;
	}



	public void setLast(String last) {
		this.last = last;
	}



	public String getUsername() {
		return Username;
	}



	public void setUsername(String username) {
		Username = username;
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

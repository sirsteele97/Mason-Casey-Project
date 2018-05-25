package com.MasonCasey.student;

import com.MasonCasey.Database.StudentDB;

public class Student {

	
	private String first; 
	private String last; 
	private String email;
	private Object User; 
	
	
	public Student(String first, String last, String email){
		
		setFirst(first);
		setLast(last);
		setEmail(email);
		
	} 
	
	public Student(){
		setFirst("");
		setLast("");
		setEmail("");
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "(" + this.getFirst() + ", " + this.getLast() + ", " + this.getEmail() + ")";
	}
	
	public void set() throws Exception {
		StudentDB.postStudent(this.first, this.last, this.email);

	}
	
}

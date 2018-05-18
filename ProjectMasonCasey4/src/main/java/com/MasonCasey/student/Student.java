package com.MasonCasey.student;

public class Student {

	private String first; 
	private String last; 
	private String email; 
	
	public Student(String first, String last, String email){
		
		setFirst(first);
		setLast(last);
		setEmail(email);
		
	} 
	
	public Student(){
		setFirst("first");
		setLast("last");
		setEmail("email");
		
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
}

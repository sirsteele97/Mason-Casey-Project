package com.MasonCasey.student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	
	private static StudentList instance;
	private List<Student> studentList;
	
	public StudentList(){
		studentList = new ArrayList();
	}
	
	public static StudentList getInstance() {
		if (instance == null) {
			instance = new StudentList();
		}
		return instance;
	}
	
	public void addStudent(Student s) {
		this.studentList.add(s);
	}
	
	public String toString() {
		
		return this.studentList.toString();

	}
	
	public List<Student> getStudentList() {
		
		return this.studentList;
		
	}
	
	public Student getFront() {
		
		return this.studentList.get(0); 
		
	}
	
	public Student getBack() {
		
		return this.studentList.get(this.studentList.size()-1); 
		
	}	

}

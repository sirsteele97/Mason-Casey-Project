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
	
	public void testAccounts() {
		Student student1 = new Student("Mason", "Mordue", "Mordue.1@osu.edu");
		Student student2 = new Student("John", "Smith", "Smith.1@osu.edu");
		Student student3 = new Student("Casey", "Bacon", "Bacon.1@osu.edu");
		Student student4 = new Student("Jane", "Maria", "Maria.1@osu.edu");
		Student student5 = new Student("Ken", "Doll", "Doll.1@osu.edu");
		this.studentList.add(student1);
		this.studentList.add(student2);
		this.studentList.add(student3);
		this.studentList.add(student4);
		this.studentList.add(student5);
	}

}

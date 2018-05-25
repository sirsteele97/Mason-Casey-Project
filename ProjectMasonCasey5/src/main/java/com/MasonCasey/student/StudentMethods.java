package com.MasonCasey.student;

import java.util.ArrayList;

import com.MasonCasey.Database.StudentDB;

public class StudentMethods {

	
	public boolean userNameExists(String user) {
		
		ArrayList<String> userList = new ArrayList<>();
		try {
			
			userList = StudentDB.getType("username");
			
		}  catch(Exception e) {System.out.println(e);}
		System.out.println("Returned List...");
		 
		return userList.contains(user);
		
	}
}

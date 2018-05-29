package com.MasonCasey.student;

import java.util.ArrayList;

import com.MasonCasey.Database.StudentDB;

public class AccountChecks {

	
	public static boolean userNameExists(String user) {
		
		ArrayList<String> userList = new ArrayList<>();
		try {
			
			userList = StudentDB.getType("UserName");
			
		}  catch(Exception e) {System.out.println(e);}
		System.out.println("Returned List...");
		 
		return !userList.contains(user);
		
	}
	
	public static boolean checkUsernameSize(String user) {
		boolean isTrue = false;
		if(user.length() > 5 && user.length() < 20) {
			isTrue = true;
		}else {
			isTrue = false;
		}
		
		return isTrue;
	}
	
	public static boolean checkPasswordSize(String pass) {
		boolean isTrue = false;
		if(pass.length() > 6 && pass.length() < 20) {
			isTrue = true;
		}else {
			isTrue = false;
		}
		
		return isTrue;
	}
	
	
	//checks to ensure college email
	public static boolean checkEmailCollege(String email) {			
		return email.endsWith(".edu");
	}
	
	public static boolean checkEmailExists(String email) {
		
		ArrayList<String> emailList = new ArrayList<>();
		try {
			
			emailList = StudentDB.getType("email");
			
		}  catch(Exception e) {System.out.println(e);}
		System.out.println("Returned List...");
		 
		return !emailList.contains(email);
		
	}
	
}

package com.MasonCasey.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.hibernate.annotations.Parameter;

import com.MasonCasey.student.Student;
import com.MasonCasey.student.User;

public class StudentDB {
	
	
	//creates a student table if none
	public static void createStudentTable() throws Exception{
		try {
			Connection con = Init.getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS students(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255),email varchar(255),college varchar(255), PRIMARY KEY(id))"
);
			create.executeUpdate();
		} catch(Exception e) {System.out.println(e);}
		finally {System.out.println("fUNCTION COMPLETE.");}
	}
	
	//updates first name to database in id location x
	public static void updateFirst(String name, String loc) throws Exception{
		final String var1 = name;
		final String var2 = loc;
		try {
			
			Connection con = Init.getConnection();
			PreparedStatement posted = con.prepareStatement("UPDATE students SET first = '"+var1+"' WHERE id = '"+var2+"';");
			posted.executeUpdate();		
		} catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("UPDATE COMPLETED!");
		}
	}
	
	//updates first last to database in id location x
	public static void updateLast(String name, String loc) throws Exception{
		final String var1 = name;
		final String var2 = loc;
		try {
			
			Connection con = Init.getConnection();
			PreparedStatement posted = con.prepareStatement("UPDATE students SET last = '"+var1+"' WHERE id = '"+var2+"';");
			posted.executeUpdate();		
		} catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("UPDATE COMPLETED!");
		}
	}
	
	//updates first email to database in id location x
	public static void updateEmail(String name, String loc) throws Exception{
		final String var1 = name;
		final String var2 = loc;
		try {
			
			Connection con = Init.getConnection();
			PreparedStatement posted = con.prepareStatement("UPDATE students SET email = '"+var1+"' WHERE id = '"+var2+"';");
			posted.executeUpdate();		
		} catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("UPDATE COMPLETED!");
		}
	}
	
	//updates first college to database in id location x
	public static void updateCollege(String name, String loc) throws Exception{
		final String var1 = name;
		final String var2 = loc;
		try {
			
			Connection con = Init.getConnection();
			PreparedStatement posted = con.prepareStatement("UPDATE students SET college = '"+var1+"' WHERE id = '"+var2+"';");
			posted.executeUpdate();		
		} catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("UPDATE COMPLETED!");
		}
	}
	
	public static void postStudent(Student std) throws Exception{
		final String var1 = std.getFirst();
		final String var2 = std.getLast();
		final String var3 = std.getEmail();
		final String var4 = std.getUsername();
		final String var5 = std.getPassword();
		try {
			
			Connection con = Init.getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO students(first,last,email,Username, Password)"
					+ " VALUES ('"+var1+"','"+var2+"','"+var3+"','"+var4+"','"+var5+"')");
			posted.executeUpdate();		
		} catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("INSERT COMPLETED!");
		}
	}
	
	//Retrieves all of type something
	public static ArrayList<String> getType(String type) throws Exception{
		try{
			
			String var1 = type;
			Connection con = Init.getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT "+var1+" FROM students");
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<String> array = new ArrayList<String>();
			while(result.next()) {
				
				System.out.print(result.getString(var1));
				System.out.print(" ");
				
				array.add(result.getString(var1));
			}
			System.out.println("All records have been selected");
			return array;
		} catch (Exception e) {System.out.println(e);}
		return null;
	}
	
	//returns the id number *TEST*
	public static int getId(String username) throws Exception{
		int num = 0;
		try {
			String var1 = username;
			Connection con = Init.getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT id FROM students WHERE username = '"+var1+"'");
			ResultSet result = statement.executeQuery();
			num = result.getInt(1);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return num;
	}


}

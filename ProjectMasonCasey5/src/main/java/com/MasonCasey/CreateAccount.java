package com.MasonCasey;

import com.MasonCasey.Database.StudentDB;
import com.MasonCasey.student.AccountChecks;
import com.MasonCasey.student.Student;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;


@SpringUI(path="/login")
public class CreateAccount extends UI {
	
	
	protected void init(VaadinRequest vaadinRequest) {
		
	
		
	//Create a vertical layout 
	VerticalLayout vertical = new VerticalLayout();
    
    
		
		
    TextField user  = new TextField("Username"); 
    TextField tf = new TextField("First Name");
    TextField tf2 = new TextField("Last Name");
    TextField tf3 = new TextField("College Email");
    PasswordField password = new PasswordField("Password");
    Button submitButton = new Button("Submit!");
    
    user.setMaxLength(15);
    
    
    vertical.addComponent(user);
	vertical.addComponent(tf); // First name of user 
	vertical.addComponent(tf2); //Last Name of user 
	vertical.addComponent(tf3); // College Email of user 
	vertical.addComponent(password); //encrypted password for user 
	vertical.addComponent(submitButton); //sends users to the select college & major's page 
    vertical.setComponentAlignment(user, Alignment.TOP_CENTER);
    vertical.setComponentAlignment(tf, Alignment.MIDDLE_CENTER);
    vertical.setComponentAlignment(tf2, Alignment.MIDDLE_CENTER);
    vertical.setComponentAlignment(tf3, Alignment.MIDDLE_CENTER);
    vertical.setComponentAlignment(password, Alignment.MIDDLE_CENTER);
    vertical.setComponentAlignment(submitButton, Alignment.BOTTOM_RIGHT);
	
    setContent(vertical);
    
	
	
	Student student1 = new Student();	
	
	
	
    tf.addValueChangeListener(event -> { //Enter First Name 
    	String firstName = event.getValue();
    	student1.setFirst(firstName);
    });
    
    tf2.addValueChangeListener(event -> { //Enter Last name 
    	String lastName = event.getValue();
    	student1.setLast(lastName);
    });
    
    tf3.addValueChangeListener(event -> { //Enter email address
    	String email = event.getValue();
    	student1.setEmail(email);
    });
    
    user.addValueChangeListener(event -> { //Enter email address
    	String user1 = event.getValue();
    	student1.setUsername(user1);
    });
    
    password.addValueChangeListener(event -> { //Enter email address
    	String pass = event.getValue();
    	student1.setPassword(pass);
    });
    

    
    submitButton.addClickListener(clickEvent -> { //Adds new users 
    	boolean checked = true;
    	if(!AccountChecks.userNameExists(student1.getUsername())) {
    		Notification.show("Username Taken");
    		checked = false;
    	}
    	
    	if(!AccountChecks.checkUsernameSize(student1.getUsername())) {
			Notification.show("UserName wrong Size");
			checked = false;
		}
    	
    	if(!AccountChecks.checkEmailExists(student1.getEmail()) &&
				!AccountChecks.checkEmailCollege(student1.getEmail())){
    		Notification.show("Use another Email Address");
	    	checked = false;
		}
    	
    	if(!AccountChecks.checkPasswordSize(student1.getPassword())) {
    		Notification.show("Password wrong size");
    		checked = false;
    	}

    	if(checked) {
    		try {
	    		StudentDB.postStudent(student1);
			} catch (Exception e) {
				
				System.out.println(e);
			}
	    	Notification.show("SET");
    	}
		});
	}
}
		
	



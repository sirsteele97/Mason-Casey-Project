package com.MasonCasey;

import com.MasonCasey.Database.StudentDB;
import com.MasonCasey.student.AccountChecks;
import com.MasonCasey.student.Student;
import com.vaadin.data.Binder;
import com.vaadin.data.Binder.Binding;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.server.SerializablePredicate;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@SpringUI(path="/login")
public class CreateAccount extends UI  {
	
	
	protected void init(VaadinRequest vaadinRequest) {
	
	

	
	
	Student student1 = new Student();	
	
	
	
//Create a vertical layout 
VerticalLayout vertical = new VerticalLayout();

Binder<Student> binder = new Binder<>();

	
	
TextField user  = new TextField("Username"); 
TextField tf = new TextField("First Name");
TextField tf2 = new TextField("Last Name");
TextField tf3 = new TextField("College Email");
PasswordField password = new PasswordField("Password");
Button submitButton = new Button("Submit!");

user.setMaxLength(15);


vertical.addComponent(user); //User name
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
    
    SerializablePredicate<String> EmailPredicate = value -> 
             !tf3.getValue().trim().isEmpty();
    
    submitButton.addClickListener(clickEvent -> { //Adds new users 
    	boolean checked = true;
    	if(!AccountChecks.userNameExists(student1.getUsername())) {
    		Notification.show("Username Taken");
    		checked = false;
    	}
    	
    	//Email and User name have specific validators 
    	Binding<Student, String> userBinding = binder.forField(user)
    			.withValidator(EmailPredicate, "Must select a username!")
    			.bind(Student::getUsername, Student::setUsername);
    	 
    	Binding<Student, String> tf3Binding = binder.forField(tf3)
    			.withValidator(EmailPredicate, "Must use a college email!")
    			.bind(Student::getEmail, Student::setEmail);
    	
    	//Trigger cross-field validatoion when the other field is changed
    	user.addValueChangeListener(event -> userBinding.validate());
    	tf3.addValueChangeListener(event -> tf3Binding.validate());
    	
    	//First name and last name are required fields 
    	tf.setRequiredIndicatorVisible(true);
    	tf2.setRequiredIndicatorVisible(true);
    	
    	binder.forField(tf)
    	.withValidator(new StringLengthValidator(
    			"Please add the first name",1,null))
		.bind(Student::getFirst, Student::setFirst);
    	
		binder.forField(tf2)
		.withValidator(new StringLengthValidator(
    			"Please add the last name",1,null))
		.bind(Student::getLast, Student::setLast);
    
		
		
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
    	
    	submitButton.addAttachListener(event -> getNavigator().navigateTo(""));
		});
    
    
     
    /* 
     * 
     * if(password.contains(pass) && user.contains(user1)) {
     * password.setText(null);
     * user.setText(null);
     * 
     *  Selection info = Selection(); //we will have to import Selection package (com.CaseyMason.Selecion(Selection)) into this CreateAccount class  
     *  Selection.main(null);
     *  info.main(null);
     * }
     * 
     * else 
     * {
     *  Notication.show(null, "Incorrect Login", "Login Error", CreateAccount.Error_MESSAGE);
     *  password.setText(null); 
     * user.setText(null);
     * }
     
      */
    
	}
}
		
	



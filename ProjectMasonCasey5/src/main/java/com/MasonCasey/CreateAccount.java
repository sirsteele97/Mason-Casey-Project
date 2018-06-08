package com.MasonCasey;

import javax.annotation.PostConstruct;

import com.MasonCasey.Database.StudentDB;
import com.MasonCasey.student.AccountChecks;
import com.MasonCasey.student.Student;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.data.Binder;
import com.vaadin.data.Binder.Binding;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.server.SerializablePredicate;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@SpringView(name = StartView.VIEW_NAME)
public class CreateAccount extends VerticalLayout implements View{

    public static final String VIEW_NAME = "";
	
    @PostConstruct
	void init() {
	
	
	Student student1 = new Student();	
	
	

Binder<Student> binder = new Binder<>();

	
	
TextField user  = new TextField("Username"); 
TextField tf = new TextField("First Name");
TextField tf2 = new TextField("Last Name");
TextField tf3 = new TextField("College Email");
PasswordField password = new PasswordField("Password");
Button submitButton = new Button("Submit!");

user.setMaxLength(15);


addComponent(user); //User name
addComponent(tf); // First name of user 
addComponent(tf2); //Last Name of user 
addComponent(tf3); // College Email of user 
addComponent(password); //encrypted password for user 
addComponent(submitButton); //sends users to the select college & major's page 
setComponentAlignment(user, Alignment.TOP_CENTER);
setComponentAlignment(tf, Alignment.MIDDLE_CENTER);
setComponentAlignment(tf2, Alignment.MIDDLE_CENTER);
setComponentAlignment(tf3, Alignment.MIDDLE_CENTER);
setComponentAlignment(password, Alignment.MIDDLE_CENTER);
setComponentAlignment(submitButton, Alignment.BOTTOM_RIGHT);



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
    	
    	//if(!AccountChecks.userNameExists(student1.getUsername())) {
    	//	Notification.show("Username Taken");
    	//	checked = false;
    	//}
    	
    	
    	//First, Last, User, and Email fields are required
    	
    	tf.setRequiredIndicatorVisible(true);
    	tf2.setRequiredIndicatorVisible(true);
    	tf3.setRequiredIndicatorVisible(true);
    	user.setRequiredIndicatorVisible(true);
    	
    	
    	binder.forField(tf)
    	.withValidator(new StringLengthValidator(
    			"Please enter your First name",1,null))
		.bind(Student::getFirst, Student::setFirst);
    	
		binder.forField(tf2)
		.withValidator(new StringLengthValidator(
    			"Please enter your Last name",1,null))
		.bind(Student::getLast, Student::setLast);
    
		binder.forField(tf3)
    	.withValidator(new StringLengthValidator(
    			"Must enter a valid college email",1,null))
		.bind(Student::getEmail, Student::setEmail);
    	
		binder.forField(user)
		.withValidator(new StringLengthValidator(
    			"Must enter in a username",1,null))
		.bind(Student::getUsername, Student::setUsername);
			
    	if(!AccountChecks.checkUsernameSize(student1.getUsername())) {
			Notification.show("UserName wrong Size");
			checked = false;
		}
    	
    	if(!AccountChecks.checkEmailExists(student1.getEmail()) ||
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
	
    @Override
    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }

	}

		
	



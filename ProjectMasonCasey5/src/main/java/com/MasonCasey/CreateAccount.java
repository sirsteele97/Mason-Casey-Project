package com.MasonCasey;

import com.MasonCasey.student.Student;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@SpringUI(path="/login")
public class CreateAccount extends UI {
	
	protected void init(VaadinRequest vaadinRequest) {

	//Create a vertical layout 
	VerticalLayout vertical = new VerticalLayout();
	

	
	TextField tf = new TextField("First Name");
	tf.setValue("");
	
	TextField tf2 = new TextField("Last Name");
	tf2.setValue("");
	
	TextField tf3 = new TextField("College Email");
	tf3.setValue("");
	
	Button submit = new Button("Submit!");
	
	vertical.addComponent(tf);
	vertical.addComponent(tf2);
	vertical.addComponent(tf3);
	vertical.addComponent(submit);

	
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
    
    submit.addClickListener(clickEvent -> { //Adds new users 
    	try {

		} catch (Exception e) {
			
			System.out.println(e);
		}
    	Notification.show("SET");
    });
	
	
	
	}
		
}
		
	
	


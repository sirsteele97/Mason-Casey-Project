package com.MasonCasey;

import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path="/login2")
public class CreateAccount2 extends UI implements View{


		protected void init(VaadinRequest vaadinRequest) {
			
		
			
		//Create a vertical layout 
		VerticalLayout vertical = new VerticalLayout();
	    
	    
			
			
	    TextField user  = new TextField("Hi"); 
	    TextField tf = new TextField("Mason");
	    TextField tf2 = new TextField("Mordue");
	    TextField tf3 = new TextField("is");
	    PasswordField password = new PasswordField("Awesome");
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
	    
		
		}
}
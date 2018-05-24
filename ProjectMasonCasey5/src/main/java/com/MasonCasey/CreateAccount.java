package com.MasonCasey;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@SpringUI
public class CreateAccount extends UI {
	
	protected void init(VaadinRequest vaadinRequest) {

	//Create a vertical layout 
	VerticalLayout vertical = new VerticalLayout();
	
	vertical.addComponent(new TextField("First Name"));
	vertical.addComponent(new TextField("Last Name"));
	vertical.addComponent(new TextField("College Email"));
	vertical.addComponent(new Button("Submit!"));
	
	setContent(vertical);
	
	
	
	
	
	
	
	}
		
}
		
	
	


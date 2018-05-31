package com.MasonCasey;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

@SpringUI(path="/SelectInfo")
public class SelectInfo extends UI{

	 protected void init(VaadinRequest vaadinRequest) {
	    	//Create a 3x3 grid layout
	    	GridLayout grid = new GridLayout(3,4);
	    	
	    	//List of students
	    	

	    	
	    	//TextFields of User names
	    	TextField tf = new TextField("Enter First Name: ");
	    	tf.setValue("");
	    	
	    	TextField tf2 = new TextField("Enter Last Name: ");
	    	tf2.setValue("");
	    	
	    	TextField tf3 = new TextField("Enter Email Address: ");
	    	
	    	//Buttons for adding users
	    	Button button1 = new Button("Add New User");
	    	Button button2 = new Button("confirm");
	    	Button button3 = new Button("Show Students");
	    	
	    	//Create a grid bound to the list 
	    	
	    		
	    	grid.addComponent(button1, 0, 0);
	    	grid.addComponent(tf,0,1);
	    	grid.addComponent(tf2,0,2);
	    	grid.addComponent(tf3,0,3);
	    	grid.addComponent(button2, 1, 0);
	    	grid.addComponent(button3, 2, 0);
	    	setContent(grid);
}
}

package com.MasonCasey;

import com.MasonCasey.student.Student;
import com.MasonCasey.student.StudentList;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/*
@SpringUI
public class MyUI extends UI {
	
	
	private student student1;
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	VerticalLayout vertical = new VerticalLayout();
    	
    	TextField tf = new TextField("Enter First Name: ");
    	tf.setValue("");
    	
    	TextField tf2 = new TextField("Enter Last Name: ");
    	tf2.setValue("");
    	
    	TextField tf3 = new TextField("Enter Email Address: ");
    	
    	Button button1 = new Button("Add New User");
    	Button button2 = new Button("confirm");
    	Button button3 = new Button("Show Students");
    	
    	vertical.addComponent(button1);
    	vertical.addComponent(tf);
    	vertical.addComponent(tf2);
    	vertical.addComponent(tf3);
    	vertical.addComponent(button2);
    	vertical.addComponent(button3);
    	
    	setContent(vertical);
    	
    	studentList l1 = new studentList();
    	
        button1.addClickListener(clickEvent -> {
        	student1 = new student();
        	tf.clear();
        	tf2.clear();
        	tf3.clear();
        });
    	
        tf.addValueChangeListener(event -> {
        	String firstName = event.getValue();
        	student1.setFirst(firstName);
        });
        
        tf2.addValueChangeListener(event -> {
        	String lastName = event.getValue();
        	student1.setLast(lastName);
        });
        
        tf3.addValueChangeListener(event -> {
        	String email = event.getValue();
        	student1.setEmail(email);
        });
        
        
        button2.addClickListener(clickEvent -> {
        	l1.addStudent(student1);
        	Notification.show("Added!");

        });
        
        button3.addClickListener(clickEvent -> {

        	Notification.show(l1.toString());
        });
        
    }
}

*/
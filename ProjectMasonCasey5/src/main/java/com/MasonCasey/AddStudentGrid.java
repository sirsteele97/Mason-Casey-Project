package com.MasonCasey;

import java.util.Set;

import com.MasonCasey.student.Student;
import com.MasonCasey.student.StudentList;
import com.vaadin.event.selection.MultiSelectionEvent;
import com.vaadin.sass.internal.selector.SelectorSet;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.components.grid.MultiSelectionModel;
import com.vaadin.ui.components.grid.SingleSelectionModel;

/*

@SpringUI
public class AddStudentGrid extends UI {
	private Student student1;
	
    protected void init(VaadinRequest vaadinRequest) {
    	//Create a 3x3 grid layout
    	GridLayout grid = new GridLayout(3,4);
    	
    	//List of students
    	StudentList l1 = new StudentList();
    	l1.testAccounts(); // Test Accounts
    	
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
    	Grid<Student> gridS = new Grid<>(Student.class);
    	gridS.setItems(l1.getStudentList());
    		
    	grid.addComponent(button1, 0, 0);
    	grid.addComponent(tf,0,1);
    	grid.addComponent(tf2,0,2);
    	grid.addComponent(tf3,0,3);
    	grid.addComponent(button2, 1, 0);
    	grid.addComponent(button3, 2, 0);
    	grid.addComponent(gridS, 1, 1, 2, 3);
    	setContent(grid);
    	

    	
        button1.addClickListener(clickEvent -> { //Adds new users 
        	student1 = new Student();
        	tf.clear();
        	tf2.clear();
        	tf3.clear();
        });
    	
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
        
        
        button2.addClickListener(clickEvent -> { //Confirm Button
        	l1.addStudent(student1);
        	Notification.show("Added!");

        });
        
        button3.addClickListener(clickEvent -> {

        	Notification.show(l1.toString());
        });
        
    }
    

}
*/
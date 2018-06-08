package com.MasonCasey;

import javax.annotation.PostConstruct;

import com.MasonCasey.Database.StudentDB;
import com.MasonCasey.student.AccountChecks;
import com.MasonCasey.student.Student;
import com.vaadin.data.Binder;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
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

@SpringView(name = CreateAccount2.VIEW_NAME)
public class CreateAccount2 extends VerticalLayout implements View{
	public static final String VIEW_NAME = "CreateAccount2";
			
			
			CreateAccount2() {


			    TextField user  = new TextField("Hi"); 
			    TextField tf = new TextField("Mason");
			    TextField tf2 = new TextField("Mordue");
			    TextField tf3 = new TextField("is");
			    PasswordField password = new PasswordField("Awesome");
			    Button submitButton = new Button("Submit!");
			    
			    user.setMaxLength(15);
			    
			    
			    addComponent(user);
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
				

			    
				
				}

		    @Override
		    public void enter(ViewChangeEvent event) {

		    }
		    
		}

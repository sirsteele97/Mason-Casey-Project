package com.MasonCasey;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

@SpringView(name = CreateAccount2.VIEW_NAME)
public class CreateAccount2 extends VerticalLayout implements View{
	public static final String VIEW_NAME = "CreateAccount2";
			
			
			CreateAccount2() {
				
				

				ComboBox<String> comboBox = new ComboBox<>("College Attending");
				comboBox.setItems("University of Cincinnati", "Ohio State University",
						"Kent State University");
				
				ComboBox<String> gradBox = new ComboBox<>("Graduation Year");
				gradBox.setItems("2020", "2021",
						"2022");
				
				ListSelect<String> semesterStrings = new ListSelect<>("Current Semester");
				semesterStrings.setItems("Fall Semster", "Spring Semester",
						"Summer Semester","1st Quarter"
						, "2nd Quarter", "3rd Quarter", "4th Quarter");
				semesterStrings.setRows(5);
				
				
	
			    
			    addComponent(comboBox); //User's College
				addComponent(gradBox); // User's graduation year
				addComponent(semesterStrings); //User's current semester 
			    setComponentAlignment(comboBox, Alignment.TOP_CENTER);
			    setComponentAlignment(gradBox, Alignment.TOP_RIGHT);
			   setComponentAlignment(semesterStrings, Alignment.TOP_LEFT);
			 
			   
			   TextField textField1 = new TextField(); 
			   textField1.setCaption("List your courses");
			   textField1.setPlaceholder("Course 1");
			   
			   TextField textField2 = new TextField(); 
			   textField2.setPlaceholder("Course 2");
			   
			   TextField textField3 = new TextField(); 
			   textField3.setPlaceholder("Course 3");
			   
			   TextField textField4 = new TextField(); 
			   textField4.setPlaceholder("Course 4");
			   
			   TextField textField5 = new TextField(); 
			   textField5.setPlaceholder("Course 5");
			   
			   TextField textField6 = new TextField(); 
			   textField6.setPlaceholder("Course 6");
				
			   addComponent(textField1);
			   addComponent(textField2);
			   addComponent(textField3);
			   addComponent(textField4);
			   addComponent(textField5);
			   addComponent(textField6);
			   
			   
			   setComponentAlignment(textField1, Alignment.MIDDLE_CENTER);
			   setComponentAlignment(textField2, Alignment.MIDDLE_CENTER);
			   setComponentAlignment(textField3, Alignment.MIDDLE_CENTER);
			   setComponentAlignment(textField4, Alignment.MIDDLE_CENTER);
			   setComponentAlignment(textField5, Alignment.MIDDLE_CENTER);
			   setComponentAlignment(textField6, Alignment.MIDDLE_CENTER);
			   
			   
			    Button submitButton = new Button("Submit!", 
			    		new Button.ClickListener() {
							
							@Override
							public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
								AccountUI.navigator.navigateTo("ChatPage");
								
							}
						});
			    addComponent(submitButton);
			    setComponentAlignment(submitButton, Alignment.TOP_RIGHT);
			    
			    
				
				}

		    @Override
		    public void enter(ViewChangeEvent event) {

		    }
		    
		}

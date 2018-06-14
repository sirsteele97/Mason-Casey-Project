package com.MasonCasey;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
@Theme("darktheme")
@SpringView(name = CreateAccount2.VIEW_NAME)
public class CreateAccount2 extends VerticalLayout implements View{
	
	static Navigator navigator;
	static String thisView; 
	public static final String VIEW_NAME = "CreateAccount2";

	@Autowired
	SpringViewProvider viewProvider; 
	private Panel springViewDisplay;
	VerticalLayout vertical = new VerticalLayout();
			CreateAccount2() {
				

				ComboBox<String> comboBox = new ComboBox<>("");
				comboBox.setItems("University of Cincinnati", "Ohio State University",
						"Kent State University");
				comboBox.setPlaceholder("College Attending");
				
				ComboBox<String> gradBox = new ComboBox<>("");
				gradBox.setItems("2020", "2021",
						"2022");
				gradBox.setPlaceholder("Graduation Year");
				
				ComboBox<String> semesterStrings = new ComboBox<>("");
				semesterStrings.setItems("Fall Semster", "Spring Semester",
						"Summer Semester","1st Quarter"
						, "2nd Quarter", "3rd Quarter", "4th Quarter");
				semesterStrings.setTextInputAllowed(false);
				semesterStrings.setPlaceholder("Current Semester");
				
				TextField majorField = new TextField();
				majorField.setPlaceholder("Enter in your Major");
				
			    
			vertical.addComponent(comboBox); //User's College
			vertical.addComponent(gradBox); // User's graduation year
			vertical.addComponent(semesterStrings); //User's current semester 
			vertical.addComponent(majorField);//User's enter in their major 
			vertical.setComponentAlignment(comboBox, Alignment.TOP_LEFT);
			vertical.setComponentAlignment(gradBox, Alignment.TOP_CENTER);
			vertical.setComponentAlignment(semesterStrings, Alignment.TOP_RIGHT);
			vertical.setComponentAlignment(majorField, Alignment.MIDDLE_LEFT);
		
			
			
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
				
			   vertical.addComponent(textField1);
			   vertical.addComponent(textField2);
			   vertical.addComponent(textField3);
			   vertical.addComponent(textField4);
			   vertical.addComponent(textField5);
			   vertical.addComponent(textField6);
			   
			   
			   vertical.setComponentAlignment(textField1, Alignment.MIDDLE_CENTER);
			   vertical.setComponentAlignment(textField2, Alignment.MIDDLE_CENTER);
			   vertical.setComponentAlignment(textField3, Alignment.MIDDLE_CENTER);
			   vertical.setComponentAlignment(textField4, Alignment.MIDDLE_CENTER);
			   vertical.setComponentAlignment(textField5, Alignment.MIDDLE_CENTER);
			   vertical.setComponentAlignment(textField6, Alignment.MIDDLE_CENTER);
			   
			   
			    Button submitButton = new Button("Submit!", 
			    		new Button.ClickListener() {
							
							@Override
							public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
								AccountUI.navigator.navigateTo("ChatPage");
								
							}
						});
			    vertical.addComponent(submitButton);
			    vertical.setComponentAlignment(submitButton, Alignment.BOTTOM_RIGHT);
			    addComponent(vertical); 
			   
				
				}
			 
		    @Override
		    public void enter(ViewChangeEvent event) {

		    }
		    
		}


package com.MasonCasey;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.themes.ValoTheme;

@SpringView(name = AdminViewer.VIEW_NAME)
public class AdminViewer extends VerticalLayout implements  View, ViewDisplay {
	
	static Navigator navigator;
	static String thisView;
	protected static final String VIEW_NAME = "AdminViewer";
	
	@Autowired
	SpringViewProvider viewProvider;
	private Panel springViewDisplay;
	
	protected AdminViewer() {

		MenuBar barmenu = new MenuBar();
		Button button = new Button();
		
		MenuItem students = barmenu.addItem("Students", null, null);
        students.addItem("Student List");
        students.addItem("Student Courses");
        students.addItem("Student Chats");
        
		MenuItem colleges = barmenu.addItem("Colleges", null, null);
        colleges.addItem("College List");
        colleges.addItem("College Courses");
        
		MenuItem chats = barmenu.addItem("Chats", null, null);
        chats.addItem("Student Chats");
        chats.addItem("College Chats");
        chats.addItem("Club Chats");
        
		MenuItem admin = barmenu.addItem("Settings", null, null);
        admin.addItem("Admin Users");
        admin.addItem("Settings");
        
        //Takes us out of the AdminViewer 
        Button button1 = new Button("Return to home page",
        		new Button.ClickListener() {
					
					@Override
					public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
						AccountUI.navigator.navigateTo("");
					}
				});
        
        springViewDisplay = new Panel();
        springViewDisplay.setSizeFull();
        springViewDisplay.setStyleName(ValoTheme.PANEL_BORDERLESS);
        
       
        addComponent(button1);
        setComponentAlignment(button1, Alignment.MIDDLE_LEFT);
        addComponent(springViewDisplay);
        setExpandRatio(springViewDisplay, 1.0f);
        
        springViewDisplay.setContent(ApplicationEnterTest.ApplicationEnterTest());
     // Define a common menu command for all the menu items.
        MenuBar.Command mycommand = new MenuBar.Command() {
            public void menuSelected(MenuItem selectedItem) {
                springViewDisplay.setContent(ApplicationEnterTest.ApplicationEnterTest());
            }
        };
        
        
		addComponent(barmenu);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {

	}

	@Override
	public void showView(View view) {
		springViewDisplay.setContent((Component) view);
		
	}
	


}

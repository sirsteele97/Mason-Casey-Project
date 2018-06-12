package com.MasonCasey;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

@SpringView(name = ChatPage.VIEW_NAME)
public class ChatPage extends VerticalLayout implements View{
	public static final String VIEW_NAME = "ChatPage";

	VerticalLayout vertical = new VerticalLayout(); 
	ChatPage() {
	
	
		TextField textField = new TextField("Hello, World"); 
		
		addComponent(textField);
		
		Button button = new Button("Sign Out",
				new Button.ClickListener() {
					
					@Override
					public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
						AccountUI.navigator.navigateTo("MainView");
						
					}
				});
		
		addComponent(button);
		setComponentAlignment(button, Alignment.MIDDLE_CENTER);
		
	}
	 @Override
	    public void enter(ViewChangeEvent event) {

	    }
	    
}
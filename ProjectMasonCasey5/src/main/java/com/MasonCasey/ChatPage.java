package com.MasonCasey;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = ChatPage.VIEW_NAME)
public class ChatPage extends VerticalLayout implements View{
	public static final String VIEW_NAME = "ChatPage";

	VerticalLayout vertical = new VerticalLayout(); 
	ChatPage() {
	
	
		TextField textField = new TextField("Hello, World"); 
		
		addComponent(textField);
		
		
	}
	 @Override
	    public void enter(ViewChangeEvent event) {

	    }
	    
}
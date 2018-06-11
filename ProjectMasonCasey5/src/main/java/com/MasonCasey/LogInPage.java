package com.MasonCasey;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = LogInPage.VIEW_NAME)

public class LogInPage extends VerticalLayout implements View {



public static final String VIEW_NAME = "";
	
	LogInPage() {
		
	
	Button joinButton = new Button("JOIN US!", 
			new Button.ClickListener() {
				
				@Override
				public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
					AccountUI.navigator.navigateTo("MainView");
					
				}
			});
	Button signinButton = new Button("SIGN IN!", 
			new Button.ClickListener() {
		
		@Override
		public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
			AccountUI.navigator.navigateTo("SignIn");
			
		}
	});


	addComponent(joinButton);
	addComponent(signinButton);


	
}


@Override
public void enter(ViewChangeEvent event) {

}

}
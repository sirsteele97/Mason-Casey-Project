package com.MasonCasey;

import javax.annotation.PostConstruct;

import com.MasonCasey.student.Student;
import com.vaadin.data.Binder;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

@SpringView(name = LogInPage.VIEW_NAME)
public class LogInPage extends HorizontalLayout implements View {


public static final String VIEW_NAME = "";
	
	LogInPage() {
		
	
	Button joinButton = new Button("JOIN US!", 
			new Button.ClickListener() {
				
				@Override
				public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
					AccountUI.navigator.navigateTo("MainView");
					
				}
			});
	Button signinButton = new Button("SIGN IN!");
	
	addComponent(joinButton);
	addComponent(signinButton);





	
}


@Override
public void enter(ViewChangeEvent event) {

}



}
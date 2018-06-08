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

@SpringView(name = LogInPage.VIEW_NAME)
public class LogInPage implements View {


public static final String VIEW_NAME = "LogIn Page";
HorizontalLayout horizontal = new HorizontalLayout();
	@PostConstruct
	void init() {
		
	
	Button joinButton = new Button("JOIN US!");
	Button signinButton = new Button("SIGN IN!");
	
	horizontal.addComponent(joinButton);
	horizontal.addComponent(signinButton);
	
	horizontal.setComponentAlignment(joinButton, Alignment.MIDDLE_LEFT);
	horizontal.setComponentAlignment(signinButton, Alignment.MIDDLE_RIGHT);




	
}


@Override
public void enter(ViewChangeEvent event) {

}
}
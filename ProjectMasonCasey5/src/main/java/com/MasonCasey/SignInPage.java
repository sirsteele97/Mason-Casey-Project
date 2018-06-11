package com.MasonCasey;

import com.MasonCasey.Database.StudentDB;
import com.MasonCasey.student.AccountChecks;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

@SpringView(name = SignInPage.VIEW_NAME)
public class SignInPage extends FormLayout implements View {
	
	private boolean correctUser = false;
	private boolean correctPassword = false;
	
	private String password = "";
	private String username = "";
	
	public static final String VIEW_NAME = "SignIn";
	
	SignInPage(){
		
		TextField username = new TextField("Username:");
		TextField password = new TextField("Password");
		
		Button submit = new Button("Submit",
				new Button.ClickListener(){

					@Override
					public void buttonClick(ClickEvent event) {
						if(!AccountChecks.userNameExists(getUsername())) {
							if(getPassword().equals(StudentDB.getPasswordByUser(getUsername()))) {
								System.out.print("logged in");
								AccountUI.navigator.navigateTo("ApplicationEnterTest");
							}else {
								System.out.print("Wrong Password");
							}
						}else {
							System.out.println("username Does not exsist in database");
						}

						
					}
		});
		
		
		addComponent(username);
		addComponent(password);
		addComponent(submit);
		
		username.addValueChangeListener(event -> {
			String user = event.getValue();
			setUsername(user);
		});
		
		password.addValueChangeListener(event -> {
			String pass = event.getValue();
			setPassword(pass);
		});
		

		
	}
	
	@Override
	public void enter(ViewChangeEvent event) {

	}

	public boolean isCorrectUser() {
		return correctUser;
	}

	public void setCorrectUser(boolean correctUser) {
		this.correctUser = correctUser;
	}

	public boolean isCorrectPassword() {
		return correctPassword;
	}

	public void setCorrectPassword(boolean correctPassword) {
		this.correctPassword = correctPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}

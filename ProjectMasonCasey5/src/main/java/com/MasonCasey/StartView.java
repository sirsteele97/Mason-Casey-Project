package com.MasonCasey;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = StartView.VIEW_NAME)
public class StartView extends VerticalLayout implements View{
    public static final String VIEW_NAME = "";

    @PostConstruct
    void init() {
        addComponent(new Label("This is the default view"));
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }
	
	/*
	 
	 
	private static final long serialVersionUID = 1L;
	public StartView() {
		setSizeFull();
		
		Button button = new Button("Go to Account Creation", new Button.ClickListener() {
			
			
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				AccountCreationUI.navigator.navigateTo(AccountCreationUI.MAINVIEW);
				
			}
		});
		addComponent(button);
		setComponentAlignment(button, Alignment.MIDDLE_RIGHT);
	}
	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Welcome to Account Creation!");
	}
	*/
}

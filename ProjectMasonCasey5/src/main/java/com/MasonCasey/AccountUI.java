package com.MasonCasey;



import com.vaadin.ui.themes.ValoTheme;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.spring.navigator.SpringNavigator;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@Theme("valo")
@SpringViewDisplay
@SpringUI(path="/example3")
public class AccountUI extends UI implements ViewDisplay{
	
	
	static Navigator navigator;

	static String thisView;
	
	protected static final String MAINVIEW = "main";
	
	@Autowired
	SpringViewProvider viewProvider;
	private Panel springViewDisplay;
	
	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout root = new VerticalLayout();
		root.setSizeFull();
		setContent(root);
		
		getPage().setTitle("Page title");
		

        springViewDisplay = new Panel();
        springViewDisplay.setSizeFull();
        springViewDisplay.setStyleName(ValoTheme.PANEL_BORDERLESS);
        
        
        
		navigator = new Navigator(this, (ComponentContainer) getContent());
		
		navigator.addProvider(viewProvider);
		navigator.addView("MainView", new MainView());
		navigator.addView("", new LogInPage());
		navigator.addView("CreateAccount2", new CreateAccount2());
		
        root.addComponent(springViewDisplay);
        root.setExpandRatio(springViewDisplay, 1.0f);
        
        
        
        root.addComponent(createNavigationButton("next", "example5"));
	}
	
	
    private Button createNavigationButton(String caption, final String viewName) {
        Button button = new Button(caption);
        button.addStyleName(ValoTheme.BUTTON_SMALL);
        // If you didn't choose Java 8 when creating the project, convert this
        // to an anonymous listener class
        button.addClickListener(event -> getUI().getNavigator().navigateTo(viewName));
        return button;
    }

	@Override
	public void showView(View view) {
		springViewDisplay.setContent((Component) view);
		
	}

}

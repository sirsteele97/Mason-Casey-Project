package com.MasonCasey;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = ApplicationEnterTest.VIEW_NAME)
public class ApplicationEnterTest extends VerticalLayout implements View {
	
	public static final String VIEW_NAME = "ApplicationEnterTest";
	
	ApplicationEnterTest(){
		Label label = new Label("Entered!!!");
		
		addComponent(label);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {

	}
}

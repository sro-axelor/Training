package com.drawingapp.module;

//create a module class to provide metadata for the injector to initialize it

import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule{

	@Override
	protected void configure() {

		bind(DrawShape.class).to(DrawCircle.class);
		bind(Integer.class).toInstance(20);
		bind(String.class).toInstance("Blue");
	}
}

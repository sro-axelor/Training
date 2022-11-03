package com.drawingapp.module;

import com.drawingapp.annotations.Colorvalue;
import com.drawingapp.annotations.EdgeValue;
import com.drawingapp.requests.CircleRequest;

//create a module class to provide metadata for the injector to initialize it

import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class AppModule extends AbstractModule{

	@Override
	protected void configure() {

		bind(DrawShape.class).to(DrawCircle.class).in(Scopes.SINGLETON);
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(20);
		bind(String.class).annotatedWith(Colorvalue.class).toInstance("Blue");
		bind(CircleRequest.class).in(Scopes.SINGLETON);
	}
}

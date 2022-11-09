package com.axelor.GuiceServlet;


import com.axelor.GuiceServletModule.GuiceServletModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/*@WebListener*/
public class GuiceServletListener  extends GuiceServletContextListener{

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new GuiceServletModule());
	}
}

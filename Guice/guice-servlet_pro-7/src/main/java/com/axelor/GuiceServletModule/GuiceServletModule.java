package com.axelor.GuiceServletModule;

import com.axelor.GuiceServlet.GuiceServlet;
import com.google.inject.servlet.ServletModule;

public class GuiceServletModule extends ServletModule{

	@Override
	protected void configureServlets() {
		serve("/my").with(GuiceServlet.class);
	}
}

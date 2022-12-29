package com.axelor.action.configuration;

import com.axelor.action.service.HelloServiceImp;
import com.axelor.action.service.HelloServiceOrderImp;
import com.axelor.app.AxelorModule;

public class OrderModule extends AxelorModule{
	
	@Override
	protected void configure() {
		bind(HelloServiceImp.class).to(HelloServiceOrderImp.class);
	}
}

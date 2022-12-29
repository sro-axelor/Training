package com.axelor.action.configuration;

import com.axelor.action.service.HelloService;
import com.axelor.action.service.HelloServiceImp;
import com.axelor.app.AxelorModule;

public class ContactModule extends AxelorModule{

	 @Override
	  protected void configure() {
	    bind(HelloService.class).to(HelloServiceImp.class); 
	  }
}

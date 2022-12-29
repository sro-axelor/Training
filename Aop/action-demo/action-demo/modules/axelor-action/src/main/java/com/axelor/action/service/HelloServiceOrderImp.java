package com.axelor.action.service;

import com.axelor.action.db.Customer;

public class HelloServiceOrderImp extends HelloServiceImp {

	@Override
	  public String say(Customer customer) {
	    log.info("Overriding the default HelloService.say ...");
	    String message = super.say(customer);
	    log.info("The default message was: {}", message);
	    message = String.format("You are welcome '%s!'", customer.getFirstName());
	    log.info("I would say: {}", message);
	    return message;
	  }
}

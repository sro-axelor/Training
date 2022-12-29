package com.axelor.action.service;

import com.axelor.action.db.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloServiceImp implements HelloService{

	 protected Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public String say(Customer customer) {
		return String.format("Welcome, '%s!'", customer.getFirstName());
	}

	@Override
	public String hello() {
		return "Hello, World!";
	}


}

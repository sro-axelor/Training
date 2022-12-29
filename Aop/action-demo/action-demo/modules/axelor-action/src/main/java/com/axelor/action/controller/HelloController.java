package com.axelor.action.controller;

import com.axelor.action.db.Customer;
import com.axelor.action.service.HelloService;
import com.axelor.inject.Beans;
import com.axelor.meta.CallMethod;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.axelor.rpc.Response;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class HelloController {
	
//	@Inject private HelloService service; 
	
	public void say(ActionRequest actionRequest ,ActionResponse actionResponse) {
		
		Customer customer = actionRequest.getContext().asType(Customer.class);
		
		System.out.println(actionRequest.getContext().entrySet());
		
//		String message = service.say(customer); //this is using inject 
		
		HelloService helloService = Beans.get(HelloService.class); 
	
	    String message = helloService.say(customer); //this using Beans
		
		actionResponse.setFlash(message);
	}
		
	@CallMethod 
	public Response validate(String email) { 

	    Response response = new ActionResponse();

	    // validate email & set response properties
	    // logic can be moved to service layer

	    if (email == null) {
	      response.addError("email", "Email required");
	    } else if (!email.matches("^(.+)@(\\S+)$")) {
	      response.addError("email", "Invalid email.");
	    }

	    return response;
	  }
}


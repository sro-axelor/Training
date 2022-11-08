package com.axelor.guice_Application;


import com.axelor.guice_interface.User;
import com.google.inject.Inject;

public class Netflix {

	private User user;
	
	@Inject
	public Netflix(User user) {
		this.user =user;
	}
	
	public void makeUsercheck() {
		user.checkworking();
	}

}

package com.axelor.guice_implementclasses;

import com.axelor.guice_Annotationsclasses.UserTracker;
import com.axelor.guice_interface.User;

/*---- User implementations ----*/

public class UserImp implements User{

	@Override @UserTracker
	public void checkworking() {
		System.out.println("inside in the checkwoking method");
	}
}

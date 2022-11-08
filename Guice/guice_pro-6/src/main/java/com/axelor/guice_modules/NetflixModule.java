package com.axelor.guice_modules;



import com.axelor.guice_Annotationsclasses.UserTracker;
import com.axelor.guice_ServiceClass.UserTrackerService;
import com.axelor.guice_implementclasses.UserImp;
import com.axelor.guice_interface.User;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class NetflixModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(User.class).to(UserImp.class);
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(UserTracker.class), new UserTrackerService());
	}
	
}

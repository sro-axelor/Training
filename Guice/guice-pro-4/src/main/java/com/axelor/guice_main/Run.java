package com.axelor.guice_main;

import com.axelor.guice_Modules.FlyingModule;
import com.axelor.guice_app.Pillot;
//import com.axelor.guice_implementclasses.FlightImp;
//import com.axelor.guice_interfaces.FlyingService;
//import com.axelor.guice_Objectclasses.Pillot1;
//import com.axelor.guice_interfaces.FlyingService1;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Run {

	public static void main(String[] args) {

		Injector i = Guice.createInjector(new FlyingModule());
		Pillot p = i.getInstance(Pillot.class);

//		System.out.println(flyingservice);
		
		
//		/*---- On-demaned injection ----*/
//		FlyingService fs = new FlightImp();
//		i.injectMembers(fs);
		
		
		p.callgetService();
		
	}
}

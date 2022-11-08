package com.axelor.guice_Providers;

import com.axelor.guice_implementclasses.FlightImp;
import com.axelor.guice_interfaces.FlyingService;
import com.google.inject.Provider;

public class FlyingServiceProvider implements  Provider<FlyingService> {
	
	@Override
	public FlyingService get() {
		
		String codename = "AirBus A350 engine for service";
		String user = "Sujit";
		Integer takingtime = 250; 
		
		FlyingService FlyingService = new FlightImp(codename, user, takingtime);
		return FlyingService;
	}

}


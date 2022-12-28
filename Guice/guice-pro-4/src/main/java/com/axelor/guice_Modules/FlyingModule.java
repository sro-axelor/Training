package com.axelor.guice_Modules;

import com.axelor.guice_Providers.FlyingServiceProvider;
import com.axelor.guice_interfaces.FlyingService;
// import com.axelor.guice_implementclasses.FlightImp;
import com.google.inject.AbstractModule;
//import com.google.inject.name.Names;

public class FlyingModule extends AbstractModule{

	@Override
	protected void configure() {
		
		//bind(FlyingService.class).annotatedWith(FlightPillotid.class).to(FlightImp.class);
		//bind(Pillot.class).to(CoPillot.class);
		//bind(FlyingService.class).annotatedWith(JetPillotid.class).to(JetImp.class);

//		try {
//			bind(FlyingService.class).toConstructor(FlightImp.class.getConstructor(String.class));
//		} catch (NoSuchMethodException | SecurityException e) {
//			e.printStackTrace();
//		}
	
//		bind(String.class).annotatedWith(Names.named("AirBus")).toInstance("AirBus A350 engine for service");
		
		/*---- injecting providers ----*/
		bind(FlyingService.class).toProvider(FlyingServiceProvider.class);
	}
	
}


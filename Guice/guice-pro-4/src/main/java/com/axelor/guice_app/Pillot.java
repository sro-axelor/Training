package com.axelor.guice_app;

//import com.axelor.guice_Annotations.FlightPillotid;
import com.axelor.guice_interfaces.FlyingService;
import com.google.inject.Inject;

public class Pillot {

	private FlyingService flyingservice;

	
	@Inject
	public Pillot(FlyingService flyingservice) {
		this.flyingservice = flyingservice;
	}

//	@Inject
//	public Pillot@FlightPillotid  FlyingService flyingservice) {
//		this.flyingservice = flyingservice;
//	}

//	public Pillot() {
//	}
	
//	public void callgetService() {
//
//		this.flyingservice.getService();
//	}
	
	/*---- On-demaned injection ----*/
//	@Inject
//	public void setFlyingService(FlyingService flyingService) {
//		this.flyingservice = flyingService;
//	}
	
	public void callgetService() {
		flyingservice.getService();
	}

}


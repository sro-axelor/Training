package com.axelor.guice_implementclasses;

import com.axelor.guice_interfaces.FlyingService;
import com.google.inject.Inject;
//import com.google.inject.name.Named;


public class FlightImp implements FlyingService {

	/*---- Field injection ----*/
//	@Inject @Named("AirBus")
//	private String codename;
	
	/*---- Optional injection ----*/
//	private String codename = "AirBus A350 engine for service";
//	@Inject(optional=true)
//	public void setCodename(@Named("AirBus") String codename) {
//		this.codename = codename;
//	}
	
	/*---- Method injection ----*/
//	@Inject
//	public void setCodename(@Named("AirBus") String codename) {
//		this.codename = codename;
//	}

//	public FlightImp() {
//	}
//	
//	@Override
//	public void getService() {
//		System.out.println("getting FlightServices");
//		//System.out.println(codename);
//	}
	
	/*---- injecting providers ----*/
	private String codename;
	private String user;
	private Integer takingtime;
	
	@Inject
	public FlightImp(String codename, String user, Integer takingtime) {
		this.codename = codename;
		this.user = user;
		this.takingtime = takingtime;
	}
	
	@Override
	public void getService() {
		System.out.println("Inside in getService");
		System.out.println("What is for service => " + codename);
		System.out.println("User => " + user);
		System.out.println("How many time it should taking in minutes => " + takingtime +" minutes");
	}
	
}

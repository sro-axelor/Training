package com.axelor.guice_interfaces;

import com.axelor.guice_implementclasses.FlightImp;
import com.google.inject.ImplementedBy;

@ImplementedBy(FlightImp.class)
public interface FlyingService {
	
	public void getService();
}


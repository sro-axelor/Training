package com.axelor.guicemainclasses;

import com.axelor.guiceModuleclasses.BikeModule;
import com.axelor.guiceclasses.Bike;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class BikeRiding {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new BikeModule());
		Bike bike = injector.getInstance(Bike.class);
		bike.MakeEngineChecker();
		
	}

}

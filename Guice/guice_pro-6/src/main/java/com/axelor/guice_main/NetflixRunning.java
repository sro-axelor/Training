package com.axelor.guice_main;

/*---- AOP(Aspect oriented programming) ----*/

import com.axelor.guice_Application.Netflix;
import com.axelor.guice_modules.NetflixModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class NetflixRunning {

	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new NetflixModule());
		Netflix netflix = injector.getInstance(Netflix.class);
		netflix.makeUsercheck();
		
	}
}

package com.axelor.Mainclass;

import com.axelor.Dependencyclass.GameCreate;
import com.axelor.Initializerclass.GameInitializer;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;

public class GameTester {

	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new JpaPersistModule("sujit"));
		GameInitializer gi = injector.getInstance(GameInitializer.class);
		
		GameCreate gc = injector.getInstance(GameCreate.class);
		gc.get();
	}
	
}

package com.axelor.guice_modules;

import com.axelor.guice_implementclasses.GamerImp;
import com.axelor.guice_interface.Gamer;
import com.google.inject.AbstractModule;

public class GameModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(Gamer.class).to(GamerImp.class);
	}
	
}

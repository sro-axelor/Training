package com.axelor.guice_main;

import com.axelor.guice_Application.Game;
import com.axelor.guice_implementclasses.GamerImp;
import com.axelor.guice_interface.Gamer;
import com.axelor.guice_modules.GameModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GameRunning {

	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new GameModule());
		Gamer gamer = new GamerImp();
		injector.injectMembers(gamer);
		
		Game game = injector.getInstance(Game.class);
		System.out.println(game.getGamerId());
		
		Game game1 = injector.getInstance(Game.class);
		System.out.println(game1.getGamerId());
	}
}

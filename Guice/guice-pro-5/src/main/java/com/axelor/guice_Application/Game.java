package com.axelor.guice_Application;

import com.axelor.guice_interface.Gamer;
import com.google.inject.Inject;

public class Game {

	private Gamer gamer;
	
	@Inject
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public Game() {
		super();
	}
	
	public void makeGamecheck() {
		gamer.checkGaming();
	}
	
	public double getGamerId() {
		return gamer.getId();
	}
	
}

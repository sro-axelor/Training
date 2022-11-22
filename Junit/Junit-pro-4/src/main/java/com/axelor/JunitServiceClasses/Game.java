package com.axelor.JunitServiceClasses;

public class Game {
	
	 private final String gamename;

	    private Game(String gamename) {
	        this.gamename = gamename;
	    }

	    public static Game fromgamename(String gamename) {
	        return new Game(gamename);
	    }

	    public String getgamename() {
	        return this.gamename;
	    }
}

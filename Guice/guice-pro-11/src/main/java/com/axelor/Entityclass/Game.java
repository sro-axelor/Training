package com.axelor.Entityclass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Game {

	@Id
	private int gameid;
	private String gamename;
	private double gameprice;
	
	public Game(int gameid, String gamename, double gameprice) {
		super();
		this.gameid = gameid;
		this.gamename = gamename;
		this.gameprice = gameprice;
	}

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	public double getGameprice() {
		return gameprice;
	}

	public void setGameprice(double gameprice) {
		this.gameprice = gameprice;
	}

	@Override
	public String toString() {
		return "Game [gameid=" + gameid + ", gamename=" + gamename + ", gameprice=" + gameprice + "]";
	}
	
	
}

package com.axelor.guice_implementclasses;

import com.axelor.guice_interface.Gamer;
import com.google.inject.Singleton;

/*---- gamer implementations ----*/

/*---- with @Singleton and witout @Singleton ----*/
@Singleton
public class GamerImp implements Gamer{

	private double id;
	public GamerImp() {
		id = Math.random();
	}

	@Override
	public double getId() {
		return id;
	}

	@Override
	public void checkGaming() {
		System.out.println("inside in the checkgaming method");
	}

}

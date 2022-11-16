package com.axelor.guiceclasses;

import com.axelor.guiceInterfaceclasses.EngineChecker;
import com.google.inject.Inject;

public class Bike {

	private EngineChecker enginechecker;

	/*---- @BindingAnnotation ----*
	 * 
	 * @Inject 
	 * public Bike(@BMW EngineChecker enginechecker) {
	 * 
	 * this.enginechecker = enginechecker; 
	 * }
	 */
	
	/*---- @Named Binding ----*/
	 // @Inject 
	 // public Bike(@Named("BMW") EngineChecker enginechecker) {
	 // this.enginechecker = enginechecker; }
	 
	
	@Inject 
	public Bike(EngineChecker enginechecker) {
		 this.enginechecker = enginechecker; 
	}

	
	public void MakeEngineChecker() { 
		enginechecker.EngineChecking();
	}
	
}

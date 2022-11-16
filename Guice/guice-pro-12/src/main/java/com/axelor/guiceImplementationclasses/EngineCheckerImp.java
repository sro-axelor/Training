package com.axelor.guiceImplementationclasses;

import com.axelor.guiceCustomAnnotationclasses.BikeTracker;
import com.axelor.guiceInterfaceclasses.EngineChecker;

public class EngineCheckerImp implements EngineChecker {

/*---- @provide Annotation ---- */
//	String name;
//	
//	@Inject
//	public EngineCheckerImp(String name) {
//		this.name = name;
//	}
//	
//	@Override
//	public void EngineChecking() {
//		System.out.println("Inside EngineChecking method");
//		System.out.println(name);
//	}
	
	@Override @BikeTracker
	public void EngineChecking() {
		System.out.println("Inside EngineChecking method");
	}
}

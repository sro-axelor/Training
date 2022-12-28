package com.axelor.guiceModuleclasses;

import com.axelor.guiceCustomAnnotationclasses.BikeTracker;
import com.axelor.guiceImplementationclasses.EngineCheckerImp;
import com.axelor.guiceInterfaceclasses.EngineChecker;
import com.axelor.guiceclasses.BikeTrackerService;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class BikeModule extends AbstractModule{
	
	@Override
	protected void configure() {
		
		/*---- linked binding ----*
		 * 
		 * bind(EngineChecker.class).to(EngineCheckerImp.class);
		 * bind(EngineCheckerImp.class).to(BMWEngineCheckerImp.class);
		 */
		
		/*---- @BindingAnnotation ----*/
		////bind(EngineChecker.class).to(EngineCheckerImp.class); //using the custom annotation we direct use the interface with @custom annotation and the subclass 
		//bind(EngineChecker.class).annotatedWith(BMW.class).to(BMWEngineCheckerImp.class);
		
		/*---- @Named Binding ----*/
		//bind(EngineChecker.class).annotatedWith(Names.named("BMW")).to(BMWEngineCheckerImp.class);
	
		
		bind(EngineChecker.class).to(EngineCheckerImp.class);
		bindInterceptor(Matchers.any(),Matchers.annotatedWith(BikeTracker.class), new BikeTrackerService());
	}
	
	/*---- @provide Annotation ---- *
	 * 
	 * @Provides public EngineChecker provideName() { String name = "axelor";
	 * 
	 * EngineChecker enginechecker = new EngineCheckerImp(name); return
	 * enginechecker; }
	 */
}

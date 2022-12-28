package com.axelor.Initializerclass;

import com.google.inject.Inject;
import com.google.inject.persist.PersistService;

public class GameInitializer {

	@Inject
	GameInitializer(PersistService service){
		
		service.start();
	}

}

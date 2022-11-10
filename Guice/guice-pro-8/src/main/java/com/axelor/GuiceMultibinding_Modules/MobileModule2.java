package com.axelor.GuiceMultibinding_Modules;

import com.axelor.GuiceMultibinding_implementionclasses.Nokia;
import com.axelor.GuiceMultibinding_implementionclasses.Samsung;
import com.axelor.GuiceMultibinding_interface.MobileReview;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class MobileModule2 extends AbstractModule{

	@Override
	protected void configure() {

		Multibinder<MobileReview> mb2 = Multibinder.newSetBinder(binder(), MobileReview.class);
		mb2.permitDuplicates();
		
		mb2.addBinding().to(Samsung.class);
		mb2.addBinding().to(Nokia.class);
	}
}

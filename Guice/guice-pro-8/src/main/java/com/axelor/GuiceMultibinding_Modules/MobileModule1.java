package com.axelor.GuiceMultibinding_Modules;

import com.axelor.GuiceMultibinding_implementionclasses.Iphone;
import com.axelor.GuiceMultibinding_implementionclasses.OnePlus;
import com.axelor.GuiceMultibinding_interface.MobileReview;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class MobileModule1 extends AbstractModule{

	@Override
	protected void configure() {
		
		Multibinder<MobileReview> mb = Multibinder.newSetBinder(binder(), MobileReview.class);
		mb.permitDuplicates();
		
		mb.addBinding().to(Iphone.class);
		mb.addBinding().to(OnePlus.class);
	}
}

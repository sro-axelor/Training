package com.axelor.GuiceMultibinding_main;

import com.axelor.GuiceMultibinding_Managerclass.MobileManager;
import com.axelor.GuiceMultibinding_Managerclass.MobilePrice;
import com.axelor.GuiceMultibinding_Modules.MobileModule1;
import com.axelor.GuiceMultibinding_Modules.MobileModule2;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class MobileBuying {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new MobileModule1() , new MobileModule2());
		MobileManager mobilemanager = injector.getInstance(MobileManager.class);
		MobilePrice p = new MobilePrice();
		p.setPrice(15000);
		
		mobilemanager.getMobile(p);
	} 
}

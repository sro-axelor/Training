package com.axelor.GuiceMultibinding_implementionclasses;

import com.axelor.GuiceMultibinding_Managerclass.MobilePrice;
import com.axelor.GuiceMultibinding_interface.MobileReview;

public class Samsung implements MobileReview{

	@Override
	public String GetReview(MobilePrice m) {
		
		if(m.getPrice() >= 20000) return "it is a Samsung Mobile.";
		
		return "it is not a Samsung Mobile";
	}

}

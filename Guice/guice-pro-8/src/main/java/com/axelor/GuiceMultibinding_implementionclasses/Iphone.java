package com.axelor.GuiceMultibinding_implementionclasses;

import com.axelor.GuiceMultibinding_Managerclass.MobilePrice;
import com.axelor.GuiceMultibinding_interface.MobileReview;

public class Iphone implements MobileReview{

	@Override
	public String GetReview(MobilePrice m) {
		
		if(m.getPrice() >= 50000) return "it is a Iphone Mobile.";
		
		return "it is not a Iphone Mobile";
	}

	
}

package com.axelor.GuiceMultibinding_implementionclasses;

import com.axelor.GuiceMultibinding_Managerclass.MobilePrice;
import com.axelor.GuiceMultibinding_interface.MobileReview;

public class OnePlus implements MobileReview{

	@Override
	public String GetReview(MobilePrice m) {
		
		if(m.getPrice() >= 30000) return "it is a OnePlus Mobile.";
		
		return "it is not a OnePlus Mobile";
	}

}

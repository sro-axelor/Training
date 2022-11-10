package com.axelor.GuiceMultibinding_implementionclasses;

import com.axelor.GuiceMultibinding_Managerclass.MobilePrice;
import com.axelor.GuiceMultibinding_interface.MobileReview;

public class Nokia implements MobileReview{

	@Override
	public String GetReview(MobilePrice m) {
		
		if(m.getPrice() >= 10000) return "it is a Nokia Mobile.";
		
		return "it is not a Nokia Mobile";
	}

}

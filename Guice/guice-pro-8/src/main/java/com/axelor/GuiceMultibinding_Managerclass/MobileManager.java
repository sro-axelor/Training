package com.axelor.GuiceMultibinding_Managerclass;

import java.util.Set;

import com.axelor.GuiceMultibinding_interface.MobileReview;
import com.google.inject.Inject;

public class MobileManager {

	Set<MobileReview> set;

	@Inject
	public MobileManager(Set<MobileReview> set) {
		super();
		this.set = set;
	}
	
	public void getMobile(MobilePrice p) {
		
		for(MobileReview mr:set) System.out.println(mr.GetReview(p));
			
	}
}

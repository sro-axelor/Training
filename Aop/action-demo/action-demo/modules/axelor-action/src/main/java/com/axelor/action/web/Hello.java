package com.axelor.action.web;

import com.axelor.meta.CallMethod;

public class Hello {

	  @CallMethod
	  public String say(String what) {
		  System.err.println("oioojj");
	    return " Testing Of : " + what;
	  }
}

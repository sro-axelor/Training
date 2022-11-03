package com.drawingapp.main;

import com.drawingapp.module.AppModule;
import com.drawingapp.requests.CircleRequest;
//import com.drawingapp.services.DrawShape;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceRun {

	private static final String Circle_REQ ="CIRCLE";
	
	private static void sendRequest(String circleReq) {
		
		if(circleReq.equals(Circle_REQ)) {
			
//			DrawShape d=new DrawCircle();
//			here we use googleguice to create the object 
	
			Injector injector= Guice.createInjector(new AppModule());
			
//			DrawShape d = injector.getInstance(DrawShape.class);
//			CircleRequest request=new CircleRequest(d);
			
			CircleRequest request= injector.getInstance(CircleRequest.class);			
			request.makeRequest();
		}
	}
	
	public static void main(String[] args) {
		
		sendRequest(Circle_REQ);
		
	}
}

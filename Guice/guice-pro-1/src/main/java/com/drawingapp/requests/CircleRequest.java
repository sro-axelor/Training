package com.drawingapp.requests;

import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;

public class CircleRequest {

	DrawShape d;
	
	@Inject
	public CircleRequest(DrawShape d) {  
		this.d=d;
	}
	public void makeRequest() {
		d.draw();
	}
}

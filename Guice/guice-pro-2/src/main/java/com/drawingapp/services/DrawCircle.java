package com.drawingapp.services;

import com.drawingapp.annotations.Colorvalue;
import com.drawingapp.annotations.EdgeValue;
import com.google.inject.Inject;

//this is a concrete class which implement DrawShape

public class DrawCircle implements DrawShape{

	private Integer edge;
	private String color;
	
	@Inject
	public DrawCircle(@Colorvalue String color, @EdgeValue Integer edge) {
		super();
		this.edge = edge;
		this.color = color;
	}	

	@Override
	public void draw() {

		System.out.println("drawing circle of color: "+ color + " and edge: " +edge);
	}	
}
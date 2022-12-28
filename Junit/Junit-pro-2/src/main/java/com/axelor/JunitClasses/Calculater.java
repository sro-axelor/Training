package com.axelor.JunitClasses;

public class Calculater {

	/*---- add method ----*/
	public int add(int a, int b) {
		
		return a + b;
	}
	
	/*---- subtract method ----*/
    public int subtract(int a, int b) {
		
		return a - b;
	}
    
    /*---- multiply method ----*/
    public int multiply(int a, int b) {
		
		return a * b;
	}
    
    /*---- divide method ----*/
    public int divide(int a, int b) {
		
		return a / b;
	}
    
    /*---- radius method ----*/
	public double computeCircleArea(double radius) {
		
		//return 3.14 * radius * radius;
		
		return Math.PI * radius * radius;
		
	}
}

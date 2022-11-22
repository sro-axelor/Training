package com.axelor.JunitServiceClasses;

public class Calculator {

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
	
	
	/*---- check the String isPalindrome or not ----*/
	public Boolean isPalindrome(String str){

	    String reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) 
	    {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) 
	    {
	    	return true;
	    }
	    else 
	    {
	      return false;
	    }
     }
}

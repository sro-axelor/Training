package com.axelor.JunitServiceClasses;

public class Person {

	private String Fname;
	private String Lname;
	
	public Person(String fname, String lname) {
		super();
		Fname = fname;
		Lname = lname;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	@Override
	public String toString() {
		return "Person [Fname=" + Fname + ", Lname=" + Lname + "]";
	}
	
}

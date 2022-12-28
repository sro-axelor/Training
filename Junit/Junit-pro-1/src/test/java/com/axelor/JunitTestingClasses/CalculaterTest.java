package com.axelor.JunitTestingClasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.axelor.JunitClasses.Calculater;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculaterTest {
	
//	@BeforeAll
//	static void beforeAllInit() {
//		System.out.println("This method needs to run before all..");
//		System.out.println("-------------------------------------------------------");
//	}
	
	
	Calculater calculating;
	
	@BeforeEach   
	 void init() {
		calculating = new Calculater();
	}
	
	
//	@AfterEachS
//	void cleanup() {
//		System.out.println("This method needs to run for cleanup afterEach method..");
//		System.out.println("-------------------------------------------------------");
//	}

	
	
	
	/*-------- testing add --------*/
	/*---------- when expected is equal with actual it works -----------*/
	@Test
	@DisplayName("Testing add method")
	void testAdd() {
		
//		Calculater calculating = new Calculater(); //here we eleminate the instance creation everytime  in each method by the help of @BeforeEach annotations (it create instance for each method) 
		int expected = 2;
		int actual=calculating.add(1, 1);
		assertEquals(expected, actual, "The add method should add two numbers");
	
		//fail("Not yet implemented");
	}
	/*---------- when expected is not equal with actual it didn't work -----------*/
//	@Test
//	void testAdd() {
//		
////	Calculater calculating = new Calculater();
//		int expected = 2;
//		int actual=calculating.add(3, 1);
//		assertEquals(expected, actual, "The add method should add two numbers");
//	}
	/*----------------------add close -----------------------------*/
	
	
	
	/*-------- testing computeCircleRadius --------*/
	/*---------- when Radius match with the computeCircleArea it works -----------*/
	@Test
	void testcomputeCircleRadius() {
		
//		Calculater calculating = new Calculater();
		assertEquals(314.1592653589793, calculating.computeCircleArea(10),"Should return right circle area");	
	}
	/*---------- when Radius not match with the computeCircleArea it didn't works -----------*/
//	@Test
//	void testcomputeCircleRadius() {
//		
////	Calculater calculating = new Calculater();
//		assertEquals(314.1592653589793, calculating.computeCircleArea(20),"Should return right circle area");
//	}
	/*---------------------Radius close ------------------------------*/
	
	
	
	
	/*-------- testing Divide --------*/
	/*---------- when actual exception thrown it works -----------*/
	@Test
	void testDivide() {
		
//		Calculater calculating = new Calculater();
		assertThrows(ArithmeticException.class, () -> calculating.divide(1, 0) , "Divide by zero should throw" );
	}
	/*---------- when different exception thrown it didn't work -----------*/
//	@Test
//	void testDivide() {
//		
////	Calculater calculating = new Calculater();
//		assertThrows(NullPointerException.class, () -> calculating.divide(1, 0) , "Divide by zero should throw" );
//	}
	/*---------------------- Divide close -----------------------------*/
	
	
	
	
	@Test
	//@Disabled
	@DisplayName("TDD method. should not run")
	void testDisabled() {
		//fail("This test should be disabled");
	}
	
	
	
}

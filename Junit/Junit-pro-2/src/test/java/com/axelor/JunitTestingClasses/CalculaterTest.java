package com.axelor.JunitTestingClasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.axelor.JunitClasses.Calculater;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DisplayName("When Running Calculater")
class CalculaterTest {
	
	
	/*----------------------------  @BeforeAll annotation -----------------------------------*/
//	@BeforeAll
//  void AfterAllcleanup(){  // when we use this @TestInstance(TestInstance.Lifecycle.PER_CLASS) ,we can remove the static because for  Lifecycle.PER_CLASS there is one instance for class , otherwise we have use static 
//	static void beforeAllInit() {
//		System.out.println("This method needs to run before all..");
//	}
	/*------------------------------------ close ----------------------------------------------*/
	
	
	
	/*----------------------------  @BeforeEach annotation -----------------------------------*/
	/*-------- creating object for each method --------*/
	Calculater calculating;
	TestInfo testInfo ;
	TestReporter testReporter ;
	
	@BeforeEach   
	 void init(TestInfo testInfo ,TestReporter testReporter) {
		
		this.testInfo = testInfo ;
		this.testReporter = testReporter;
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
		
		calculating = new Calculater();
		
		
	}
	/*------------------------------------ close ----------------------------------------------*/
	
	
	
	/*----------------------------  @AfterEach annotation -----------------------------------*/
//	@AfterEach
//	void cleanup() {
//		System.out.println("This method needs to run for cleanup afterEach method..");
//		System.out.println("-------------------------------------------------------");
//	}
	/*------------------------------------ close ----------------------------------------------*/
	
	
	
	
	/*----------------------------  @AfterAll annotation -----------------------------------*/
//	@AfterAll
//  void AfterAllcleanup(){  // when we use this @TestInstance(TestInstance.Lifecycle.PER_CLASS) ,we can remove the static because for  Lifecycle.PER_CLASS there is one instance for class 
//	static void AfterAllcleanup() {
//		System.out.println("This method needs to run for cleanup afterAll method in last..");
//		System.out.println("---------------------------------------------------------------");
//	}
	/*------------------------------------ close ----------------------------------------------*/
	
	
	
	
	/*--------------------------------------- testing add --------------------------------------*/
	/*---------- when expected is equal with actual it works -----------*/
	/*------------------ also testing @Tag annotation ----------------*/
	@Test
	@DisplayName("Testing add method")
	@Tag("Math")
	void testAdd() {
		
//		Calculater calculating = new Calculater(); //here we eleminate the instance creation everytime  in each method by the help of @BeforeEach annotations (it create instance for each method) 
		
//		System.out.println("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
	
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
		
		int expected = 2;
		int actual=calculating.add(1, 1);
		assertEquals(expected, actual, () -> "should return sum is = "+ expected + " but returned = "+ actual);
	
	}
	/*---------- when expected is not equal with actual it didn't work -----------*/
//	@Test
//	void testAdd() {
//		
////	Calculater calculating = new Calculater();
//		int expected = 2;
//		int actual=calculating.add(3, 1);
//		assertEquals(expected, actual, "The add method should add two numbers");
//	
//	}
	/*----------------------------------------add close ------------------------------------------*/
	
	
	
	
	
	
	
	/*--------------------------------------- testing Subtract --------------------------------------*/
	/*------------------ also testing @Nested ----------------*/
//nested class
@Nested
//@Tag("Math")
class SubtractTest{
	
	 	@Test
	 	@DisplayName("When Subtracting two Positive numbers")
	 	void testSubtractPositive() {
		
//			Calculater calculating = new Calculater(); 
		
	 		assertEquals(2, calculating.subtract(5, 3), "should return right Substraction");
	
	 	}
	
	 	@Test
	 	@DisplayName("When Subtracting two smallernumbers with biggernumber or nagetive numbers ")
	 	void testSubtractNegative() {
		
//			Calculater calculating = new Calculater(); 
		
	 		assertEquals(-2, calculating.subtract(3, 5), "should return right Substraction");
	
	 	}
}
	/*---------------------------------------- Subtract close ------------------------------------------*/
	







	/*---------------------------------- testing computeCircleRadius --------------------------------*/
    /*-------- also testing @RepeatedTest annotation --------*/
	/*---------- when Radius match with the computeCircleArea it works -----------*/
	@Test
	@RepeatedTest(4)
//	void testcomputeCircleRadius(RepetitionInfo repetitionInfo) {
//		repetitionInfo.
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
//	
//	}
	/*----------------------------------------- Radius close -----------------------------------------*/
	

	
	
	
	
	
	/*----------------------------------------- testing multiply -------------------------------------*/
	/*-------- also testing assume --------*/
	/*-------- also testing assertAll --------*/
	@Test
	@DisplayName("Multiply method")
	void testmultiply() {
	
		//assertEquals(4, calculating.multiply(2, 2), "multiply by zero should be zero" );  // this is one assertion 

		assertAll(
				() -> assertEquals(4, calculating.multiply(2, 2)), 
				() -> assertEquals(0, calculating.multiply(2, 0)),
				() -> assertNotEquals(4, calculating.multiply(2, 1)),
				() -> assertNotEquals(4, calculating.multiply(2, 0))    //here we passing group of assertions in lambda format 
				);
	}
	/*-------- also testing assume --------*/
//	@Test
//	@DisplayName("Multiply method")
//	void testmultiply() {		
// //		Calculater calculating = new Calculater();
//		
//		boolean isServerOff = false; //here i assume that the server is Off
//		assumeTrue(isServerOff );
//		
//		int expected = 0;
//		int actual=calculating.multiply(2, 0);
//		assertNotEquals(expected, actual,  "multiply by zero should be zero" );
//	}
	/*----------------------------------------- multiply close -------------------------------------------*/

	
	
	

	
	
	/*------------------------------------------- testing Divide -------------------------------------------*/
	/*-------- also testing @EnabledOnOs(OS.LINUX) --------*/
	/*---------- when actual exception thrown it works -----------*/
	@Test
//	@EnabledOnOs(OS.LINUX)
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
//	
//	}
	/*-------------------------------------------- Divide close --------------------------------------------*/
	
	
	
	
	
	
	/*------------------------------ testing Disabled and DisplayName annotations ---------------------------*/
	@Test
	@Disabled
	@DisplayName("TDD method. should not run")
	void testDisabled() {
		//fail("This test should be disabled");
	}
	/*------------------------------------------- Disabled close -------------------------------------------*/
	
	
}
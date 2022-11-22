package com.axelor.JunitTestClasses;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.EnumSet;
import java.util.stream.Stream;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.axelor.JunitAnnotationClasses.TestOnMac;
import com.axelor.JunitServiceClasses.Calculator;
import com.axelor.JunitServiceClasses.Game;
import com.axelor.JunitServiceClasses.Person;




//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
//@Disabled("Disabled until bug #99 has been fixed")
@DisplayName("When Running Calculater")
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
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
	Calculator calculating;
	TestInfo testInfo ;
	TestReporter testReporter ;
	
	@BeforeEach   
	 void init(TestInfo testInfo ,TestReporter testReporter) {
		
		this.testInfo = testInfo ;
		this.testReporter = testReporter;
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
		
		calculating = new Calculator();	
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
		
//		Calculator calculating = new Calculator(); //here we eleminate the instance creation everytime  in each method by the help of @BeforeEach annotations (it create instance for each method) 
		
//		System.out.println("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
	
//		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
		
		int expected = 2;
		int actual=calculating.add(1, 1);
		assertEquals(expected, actual, () -> "should return sum is = "+ expected + " but returned = "+ actual);
	
	}
	/*---------- when expected is not equal with actual it didn't work -----------*/
//	@Test
//	void testAdd() {
//		
////	Calculator calculating = new Calculator();
//		int expected = 2;
//		int actual=calculating.add(3, 1);
//		assertEquals(expected, actual, "The add method should add two numbers");
//	
//	}
	/*----------------------------------------add close ------------------------------------------*/
	
	
			
	/*--------------------------------------- testing Subtract --------------------------------------*/
	/*------------------ also testing @Nested ----------------*/
/*-- nested class --*/
//@Tag("Math")
//@Nested
class SubtractTest{
	
	 	@Test
	 	@DisplayName("When Subtracting two Positive numbers")
	 	void testSubtractPositive() {
		
//			Calculator calculating = new Calculator(); 
		
	 		assertEquals(2, calculating.subtract(5, 3), "should return right Substraction");
	
	 	}
	
	 	@Test
	 	@DisplayName("When Subtracting two smallernumbers with biggernumber or nagetive numbers ")
	 	void testSubtractNegative() {
		
//			Calculator calculating = new Calculator(); 
		
	 		assertEquals(-2, calculating.subtract(3, 5), "should return right Substraction");
	
	 	}
}
	/*---------------------------------------- Subtract close ------------------------------------------*/
	


	/*---------------------------- Testing @ParameterizedTest and @ValueSource annotation -----------------------------*/

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
    
    	assertTrue(calculating.isPalindrome(candidate));
   	
    }
	/*---------------------------------- @ParameterizedTest and @ValueSource close -------------------------------------*/




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
////	Calculator calculating = new Calculator();
//		assertEquals(314.1592653589793, calculating.computeCircleArea(20),"Should return right circle area");
//	
//	}
	/*----------------------------------------- Radius close -----------------------------------------*/
	

	
		
	/*----------------------------------------- testing multiply -------------------------------------*/
	/*-------- also testing Assertions --------*/
	/*-------- also testing assertAll --------*/
//	@Test
//	@DisplayName("Multiply method")
//	void testmultiply() {
//	
//		//assertEquals(4, calculating.multiply(2, 2), "multiply by zero should be zero" );  // this is one assertion 
//
//		assertAll(
//				() -> assertEquals(4, calculating.multiply(2, 2)), 
//				() -> assertEquals(0, calculating.multiply(2, 0)),
//				() -> assertNotEquals(4, calculating.multiply(2, 1)),
//				() -> assertNotEquals(4, calculating.multiply(2, 0))    //here we passing group of assertions in lambda format 
//				);
//	}
	/*-------- also testing assume --------*/
	@Test
	@DisplayName("Multiply method")
	void testmultiply() {		
 //		Calculator calculating = new Calculator();
		
		boolean isServerOff = true; //here i assume that the server is Off
		//assumeTrue(isServerOff );
		assumeFalse(isServerOff);
		
		int expected = 0;
		int actual=calculating.multiply(2, 0);
		assertEquals(expected, actual,  "multiply by zero should be zero" );		
	}    
//    @Test
//    void timeoutExceeded() {
//        // The following assertion fails with an error message similar to:
//        // execution exceeded timeout of 10 ms by 91 ms
//        assertTimeout(ofMillis(10), () -> {
//            // Simulate task that takes more than 10 ms.
//            Thread.sleep(100);
//        });
//    }

	
//	  private Duration ofMillis(int i) {
//		 return ofMillis(i);
//	  }
		
	
//	  @Test
//    void timeoutExceededWithPreemptiveTermination() {
//        // The following assertion fails with an error message similar to:
//        // execution timed out after 10 ms
//        assertTimeoutPreemptively(ofMillis(10), () -> {
//            // Simulate task that takes more than 10 ms.
//            new CountDownLatch(1).await();
//        });
//    }
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
////	Calculator calculating = new Calculator();
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
	
	
	
		
	/*--------------------------------------------- testing Assertions ------------------------------------------*/
	
class AssertionsDemo{
		
		private final Person per = new Person("sujit","rout");
		
		@Test
		void StandardAsssertion() {
			assertEquals(2, calculating.add(1, 1));
	        assertEquals(4, calculating.multiply(2, 2),
	        		"The optional failure message is now the last parameter");
	        assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "
	                + "to avoid constructing complex messages unnecessarily.");
		}
	}
	
	
	
	/*--------------------------------------------  Assertions close --------------------------------------------*/
	
	
	
	
	/*-------------------------------------------- Testing Assumptions --------------------------------------------*/
//	    @Test
//	    void testInAllEnvironments() {
//	        assumingThat("CI".equals(System.getenv("ENV")),
//	            () -> {
//	                // perform these assertions only on the CI server
//	                assertEquals(2, calculating.divide(4, 2));
//	            });
//
//	        // perform these assertions in all environments
//	        assertEquals(42, calculating.multiply(6, 7));
//	    }

	 @Test
	 void testInAllEnvironments() {
		 
		 assumingThat("CI".equals(System.getenv("ENV")),
				 () -> {
					 	assertEquals(1, calculating.add(2, 2));  // perform these assertions only on the CI server
				 	   });
		  assertEquals(12, calculating.multiply(2, 6)); // perform these assertions in all environments
	 }
	 /*-------------------------------------------- Assumptions close --------------------------------------------*/
	 
	 
	 
	 
	 /*----------------------------- Conditional execution based on operating system ------------------------------*/

	 @Test
	 @EnabledOnOs(OS.MAC)
	 void onlyOnMacOs() {
		 
	 }

	 @TestOnMac
	 void testOnMac() {
		 
	 }

	 @Test
	 @EnabledOnOs({ OS.LINUX, OS.MAC })
	 void onLinuxOrMac() {
		 
	 }

	 @Test
	 @DisabledOnOs(OS.WINDOWS)
	 void notOnWindows() {

	 }
	 
	 /*------------------------------- Conditional execution based on architecture --------------------------------*/
	 
	 @Test
	 @EnabledOnOs(architectures = "aarch01")
	 void onArch01() {
		 
	 }
	 @Test
	 @DisabledOnOs(architectures = "s45_24")
	 void notOnS45_24() {
		 
	 }
	 
	 @Test
	 @EnabledOnOs(value = OS.MAC, architectures = "aarch01")
	 void onNewMacs() {
		 
	 }
	 /*-------------------------------------------- Assumptions close --------------------------------------------*/
	 
	 

	 
	 /*------------------------ Testing @TestClassOrder ,@Order and @Nested annotation --------------------------*/
/*-- nested class --*/	 
@Nested
@Order(2)
class Orderedclass1  {

	@Test
	void test1() 
	{
		System.out.println("test1 exicute");
	}
}


@Nested
@Order(1)
class Orderedclass2 {

	@Test
	void test2() {
		System.out.println("test2 exicute");
	}
}
/*------------------------ @TestClassOrder ,@Order and @Nested annotation close --------------------------*/




/*------------------------ Testing @TestMethodOrder ,@Order and @Nested annotation --------------------------*/
@Nested
@TestMethodOrder(OrderAnnotation.class)
class OrderedmethodDemo {

    @Test
    @Order(3)
    void nullValues() {
    	System.out.println("nullValues method exicute");
    }

    @Test
    @Order(2)
    void emptyValues() {
    	System.out.println("emptyValues method exicute");
    }

    @Test
    @Order(1)
    void validValues() {
    	System.out.println("validValues method exicute");
    }

 }
	/*---------------------------- @TestClassOrder ,@TestMethodOrder ,@Order and @Nested close -----------------------------*/	





	/*------------------------------- Dependency Injection for Constructors and Methods -----------------------------------*/
@Nested
@DisplayName("Dependency Injection for Constructors and Methods")
class TestInfoDemo {
	
	//CONSTRUCTOR
    TestInfoDemo(TestInfo testInfo) {
        assertEquals("Dependency Injection for Constructors and Methods", testInfo.getDisplayName());
    }

//    @BeforeEach
//    void init(TestInfo testInfo) {
//        String displayName = testInfo.getDisplayName();
//        assertTrue(displayName.equals("TEST 1") || displayName.equals("test2()"));
//    }
//
//    @Test
//    @DisplayName("TEST 1")
//    @Tag("my-tag")
//    void test1(TestInfo testInfo) {
//        assertEquals("TEST 1", testInfo.getDisplayName());
//        assertTrue(testInfo.getTags().contains("my-tag"));
//    }
//
//    @Test
//    void test2() {
//    }

 }
 	/*----------------------------- Dependency Injection for Constructors and Methods close ---------------------------------*/



	/*------------------------------- Testing @ParameterizedTest ,@NullSource ,@EmptySource  ------------------------------------*/
	@ParameterizedTest
//	@NullSource
//	@EmptySource
	@ValueSource(strings = { " ", "    ", "\t", "\n" })
	void nullEmptyAndBlankStrings(String text) 
	{
		assertTrue(text == null || text.trim().isEmpty());
	}

	/*------------------------------- @ParameterizedTest ,@NullSource ,@EmptySource close ---------------------------------------*/

	
	
	
	
	
	/*------------------------------------------------- testing @EnumSource ----------------------------------------------------*/
	
	@ParameterizedTest
	@EnumSource(ChronoUnit.class)
	void testWithEnumSource(TemporalUnit unit) {
		
		 assertNotNull(unit);
	}

	
	/*---------- testWithEnumSourceWithAutoDetection --------*/
	@ParameterizedTest
	@EnumSource
	void testWithEnumSourceWithAutoDetection(ChronoUnit unit) {
		
		 assertNotNull(unit);
	}
	
	
	/*-------------- testWithEnumSourceInclude --------------*/
	@ParameterizedTest
	@EnumSource(names = {"DAYS","HOURS"}) //it only takes or include (DAYS ,HOURS) and test it and rest things are not execute 
	void testWithEnumSourceInclude(ChronoUnit unit) {
		
	    assertTrue(EnumSet.of(ChronoUnit.DAYS , ChronoUnit.HOURS).contains(unit));
	}
	
	
	/*-------------- testWithEnumSourceExclude --------------*/
	@ParameterizedTest
	@EnumSource(mode = Mode.EXCLUDE ,names = {"ERAS" , "FOREVER"}) //it exclude the ERAS,FOREVER and rest things are execute 
	void testWithEnumSourceExclude(ChronoUnit unit) {
		
	    assertFalse(EnumSet.of(ChronoUnit.ERAS, ChronoUnit.FOREVER).contains(unit));
	}
	
	
	/*-------------- testWithEnumSourceRegex --------------*/
	@ParameterizedTest
	@EnumSource(mode = Mode.MATCH_ALL, names = "^.*DAYS$")
	void testWithEnumSourceRegex(ChronoUnit unit) {
		
	    assertTrue(unit.name().endsWith("DAYS"));
	}
	/*------------------------------------------------- @EnumSource close -------------------------------------------------------*/
	

	
	

	/*-------------------------------------------- testWithDefaultLocalMethodSource --------------------------------------------*/

	static Stream<String> testWithDefaultLocalMethodSource() {
	    return Stream.of("bat", "ball");
	}
	@ParameterizedTest
	@MethodSource
	void testWithDefaultLocalMethodSource(String argument) {
	    assertNotNull(argument);
	}
	/*-------------------------------------------- testWithExplicitLocalMethodSource --------------------------------------------*/
	
	static Stream<String> StringProvider() {
	    return Stream.of("bat", "ball");
	}
	
	@ParameterizedTest
	@MethodSource("StringProvider")
	void testWithExplicitLocalMethodSource(String argument) {
	    assertNotNull(argument);
	}
	/*------------------------------------------------- @MethodSource close -------------------------------------------------------*/
	
	
	
	
	
	
	/*------------------------------------------------- Testing @CsvSource -------------------------------------------------------*/	
	@ParameterizedTest(name = "{index} ==> the rank of ''{0}'' is {1}")
	@CsvSource({
	    "apple,         1"  ,  "banana,        2"
	})
	void testWithCsvSource(String fruit, int rank) {
	//   assertNotNull(fruit);
	//    assertNotEquals(0, rank);
	//  assertNotEquals(1, rank);
	}
	/*------------------------------------------------- @CsvSource close -------------------------------------------------------*/	
	
	
	
	
	
	/*------------------------------------------------- Testing @CsvFileSource -------------------------------------------------------*/	
	
	@ParameterizedTest
	@CsvFileSource(resources = "/sujit.csv", numLinesToSkip = 1)
	void testWithCsvFileSourceFromClasspath(String country, int reference) {
	    assertNotNull(country);
	    assertNotEquals(0, reference);
//	    System.out.println(country);
//	    System.out.println(reference);
	}

	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/sujit.csv", numLinesToSkip = 1)
	void testWithCsvFileSourceFromFile(String country, int reference) {
	    assertNotNull(country);
	    assertNotEquals(0, reference);
    System.out.println(country);
    System.out.println(reference);
	}

	@ParameterizedTest(name = "[{index}] {arguments}")
	@CsvFileSource(resources = "/sujit.csv", useHeadersInDisplayName = true)
	void testWithCsvFileSourceAndHeaders(String country, int reference) {
	    assertNotNull(country);
	    assertNotEquals(0, reference);
    System.out.println(country);
    System.out.println(reference);
	}
	
	/*------------------------------------------------- @CsvFileSource close -------------------------------------------------------*/	
	

	
	/*--------------------------------- (Argument Conversion) testWithImplicitArgumentConversion ------------------------------------*/	
	@ParameterizedTest
	@ValueSource(strings = "DAYS")
	void testWithImplicitArgumentConversion(ChronoUnit argument) {
	  //  assertNotNull(argument.name());
	}
	
	/*--------------------------------- Fallback String-to-Object Conversion ------------------------------------*/	
	@ParameterizedTest
	@ValueSource(strings = "2 asphalt")
	void testWithImplicitFallbackArgumentConversion(Game game) {
	  //  assertEquals("1 pubg", game.getgamename());
	    assertEquals("2 asphalt", game.getgamename());
	}
	/*------------------------------------------------ Argument Conversion close ----------------------------------------------------*/
}
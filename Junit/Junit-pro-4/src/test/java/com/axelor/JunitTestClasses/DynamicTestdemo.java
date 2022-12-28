package com.axelor.JunitTestClasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.axelor.JunitServiceClasses.Calculator;


public class DynamicTestdemo {

	/*------------------------------------------------- DynamicTest -------------------------------------------------------*/
	
	private final Calculator calculating = new Calculator();
	
//	@TestFactory
//    List<String> dynamicTestsWithInvalidReturnType() {
//        return Arrays.asList("Hello");  //this is throwing error for the invalid return
//    }
	
	/*------------------------------------------------- Collection -------------------------------------------------------*/
	
	@TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() {
        return Arrays.asList(
            dynamicTest("1st dynamictest", () -> assertTrue(calculating.isPalindrome("madam"))),
            dynamicTest("2nd dynamictest", () -> assertEquals(4, calculating.add(2, 2)))
        );
    }
	 
	/*------------------------------------------------- Iterable -------------------------------------------------------*/
	
	@TestFactory
	Iterable<DynamicTest> dynamicTestsFromIterable() {
	        return Arrays.asList(
	            dynamicTest("3rd dynamictest", () -> assertTrue(calculating.isPalindrome("madam"))),
	            dynamicTest("4th dynamictest", () -> assertEquals(0, calculating.subtract(2, 2)))
	        );
	    }
	/*------------------------------------------------- Iterator -------------------------------------------------------*/	
	@TestFactory
    Iterator<DynamicTest> dynamicTestsFromIterator() {
        return Arrays.asList(
            dynamicTest("5th dynamictest", () -> assertTrue(calculating.isPalindrome("madam"))),
            dynamicTest("6th dynamictest", () -> assertEquals(4, calculating.multiply(2, 2)))
        ).iterator();
	}
	/*--------------------------------------------------- Array ---------------------------------------------------------*/
	@TestFactory
    DynamicTest[] dynamicTestsFromArray() {
        return new DynamicTest[] {
            dynamicTest("7th dynamic test", () -> assertTrue(calculating.isPalindrome("madam"))),
            dynamicTest("8th dynamic test", () -> assertEquals(2, calculating.divide(4, 2)))
        };
  
	}
	
}
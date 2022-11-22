package com.axelor.JunitTestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TineOutTest {

	@Test
	@Timeout(3)
    void Test1()  {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Test1 running");
    }
	
	@Test
    @Timeout(3)
    void test2() throws InterruptedException {
        
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Test2 running");
    }


		@Test
	    void test3() {
	        
	        Assertions.assertTimeout(Duration.ofSeconds(7), ()-> delayseconds(6));
	        System.out.println("Test3 running");
	    }
	    private void delayseconds(int seconds) throws InterruptedException{
	        
	        TimeUnit.SECONDS.sleep(seconds);
	        
	    }
}

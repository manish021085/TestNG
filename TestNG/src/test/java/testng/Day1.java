package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void lastexecution() {
		System.out.println("i will execute last");
		
	}
	
	
	@Test
	public void demo() {
		System.out.println("hello");
		Assert.assertTrue(false);
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("i am no 1 from last");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}

}

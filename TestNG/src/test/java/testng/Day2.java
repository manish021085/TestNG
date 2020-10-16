package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"smoke"})
	public void ploan() {
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequister() {
		System.out.println("i will execute first");
	}

}

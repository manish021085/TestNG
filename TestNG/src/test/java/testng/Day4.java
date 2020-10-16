package testng;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Parameters({"URL"})
	@Test
	public void webLoginHomeLoan(String uname) {
		System.out.println("webLoginHomePersonalLoan");
		System.out.println(uname);
	}
	
	@Test(groups= {"smoke"})
	public void mobileLoginHomeLoan() {
		System.out.println("mobileLoginHomeLoan");
	}
	
	@Test
	public void loginAPIHomeLoan() {
		System.out.println("APIloginHome");
	}

}

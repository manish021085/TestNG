package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before executing any method in the class");
	}
	
//	@Parameters({"URL"})
//	@Test
//	public void webLoginCarLoan(String urlName) {
//		System.out.println("webLoginCarLoan");
//		System.out.println(urlName);
//	}
	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLoginCarLoan(String urlName, String key) {
		System.out.println("webLoginCarLoan");
		System.out.println(urlName);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("i will excute before every method in day3 class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("i will excute after every method in day3 class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after executing all method in the class");
	}
	
	@Test(groups= {"smoke"})
	public void mobileLoginCarLoan() {
		System.out.println("mobileLoginCarLoan");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void mobilesigninCarLoan() {
		System.out.println("mobilesigninCarLoan");
	}
	
	@Test(timeOut=4000)
	public void mobilesignoutCarLoan() {
		System.out.println("mobilesignoutCarLoan");
	}
	
	@Test(dataProvider="getData")
	public void mobilesignoutCarLoanDataProvider(String uname, String pass) {
		System.out.println("mobilesignoutCarLoanDataProvider");
		System.out.println(uname);
		System.out.println(pass);
	}
	
	@Test(dependsOnMethods= {"mobileLoginCarLoan", "mobilesignoutCarLoan"})
	public void APIcarLoan() {
		System.out.println("APIcarLoan");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - username password
		//2nd username password - no credit history
		//3rd - fraudelent credit history
		Object[][] data= new Object[3][2];
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		}
	

}

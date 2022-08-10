package day21;

import org.testng.annotations.*;

public class AnnotationsExample1 {
	
	@BeforeMethod
	void login()
	{
		System.out.println("Inside login");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Inside logout");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Inside search");
	}
	
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("Inside adv search");
	}
	
	@Test(priority=3)
	void recharge()
	{
		System.out.println("Inside research");
	}
	
}

package day21;

import org.testng.annotations.*;

public class AnnotationsExample2 
{
	
	@BeforeClass
	void login()
	{
		System.out.println("Inside ");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("Inside out");
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
		System.out.println("Inside recharge ");
	}
}

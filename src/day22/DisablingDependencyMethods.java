package day22;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisablingDependencyMethods {
	
	@Test(priority = 1)
	void openURL()
	{
		System.out.println("Open URL");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2 )
	void login()
	{
		System.out.println("Logged in");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3 , enabled= false )
	void search()
	{
		System.out.println("search In progress.............");
		
	}
	
	@Test(priority = 4 , enabled= false )
	void advancedSearch()
	{
		System.out.println("Advance search in progress.............");
		
	}
	
	@Test(priority = 5) //, dependsOnMethods = {"advancedSearch"})
	void logout()
	{
		System.out.println("Logged out");
		Assert.assertTrue(true);
	}
		
}

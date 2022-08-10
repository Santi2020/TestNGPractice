package day22;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	@Test(priority = 1)
	void openURL()
	{
		System.out.println("Open URL");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2 , dependsOnMethods = {"openURL"})
	void login()
	{
		System.out.println("Logged in");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3 , dependsOnMethods = { "login"})
	void search()
	{
		System.out.println("searching");
		Assert.assertTrue(false);
	}
	
	@Test(priority = 4 , dependsOnMethods = { "login", "search"})
	void advancedSearch()
	{
		System.out.println("Advance search");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 5)
	void logout()
	{
		System.out.println("Logged out");
		Assert.assertTrue(true);
	}
		
}

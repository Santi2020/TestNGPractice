package day21;

import org.testng.annotations.Test;

public class FirstTestCase {

	@Test(priority = 1)
	void openURL()
	{
		//webdriver code to open the URL
		System.out.println("OpenURL");
	}
	
	@Test(priority = 2)
	void login()
	{
		System.out.println("This is login");
	}
	
	@Test(priority = 3)
	void logout()
	{
		System.out.println("This is logout");
	}
}

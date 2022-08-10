package log4jPackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Log4jdemo {

	
	static Logger logger;
	@Test(priority=1)
	public void setup()
	{
		
		logger = Logger.getLogger("Log4jdemo");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Setup method invoked line 1. I am testing the maximum length of this string. For that i need to add many sentences. So here i go. i have now implemented Log4j in my test case. And after this i want to see how this log is displayed in the report. I end it here");
		logger.info("Setup method invoked line 2");
		logger.info("Setup method invoked line 3");
		System.out.println("WebDriver setup");
		System.out.println("Open the URL");
	}
	
	@Test(priority=2)
	public void login()
	{
		logger.info("LOGIN method invoked");
		System.out.println("Login code");
	}
	
	@Test(priority=3)
	public void logout()
	{
		logger.info("Logout method invoked");
		System.out.println("logout code");
	}
}

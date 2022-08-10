package testNGListeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter 
{
	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test method STARTED");
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Test method SUCCESS");
	}
	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Test method FAILED");
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test method SKIPPED");
	}
	
}

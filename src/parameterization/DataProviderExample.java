package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();	
	}
	
	@Test(dataProvider ="users")
	void loginTest(String uname, String pwd) throws InterruptedException
	{
		System.out.println("Username = " + uname + " pwd = " + pwd);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		 
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		//Assert.assertEquals("OrangeHRM", "OrangeHRM");
		System.out.println("ASSERTION COMPLETED");
		
	}
	
	@DataProvider(name ="users")
	String [][] loginData()
	{
		String data[][] = {{"Admin" ,"admin123"} , {"Admin1","admin123"},{"Admin1","admin123"}};
		return data;
	}
	
	@AfterClass
	//@Test
	void closeBrowser() throws InterruptedException
	{
		//Thread.sleep(3000);
		System.out.println("Closing the browser");
		driver.close();
		//Thread.sleep(5000);
	}
}

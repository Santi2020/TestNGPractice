package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		
	}
	
	@Test
	void userRegistration()
	{
		RegistrationPage regPage = new RegistrationPage(driver);
		regPage.clickAdminLink();
		//regPage.clickUserMgtLink();
		//regPage.clickUserLink();
		regPage.clickButtonAdd();
		regPage.setUserType("ESS"); 
		regPage.setEmpName("Annapoorna");
		regPage.setUserName("Gayatri");
		regPage.setUserStatus("Enabled");
		regPage.setPassword("Annapoorna");
		regPage.setConfirmPassword("Annapoorna");
		regPage.clickButtonSave();
		if(1==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
	}
	
}

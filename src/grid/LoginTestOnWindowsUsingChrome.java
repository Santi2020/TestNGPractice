package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTestOnWindowsUsingChrome {
	static WebDriver driver;
	
	@Test(priority = 1)
	void setup() throws MalformedURLException 
	{
		String nodeURL = "http://10.0.0.125:11201/wd/hub";
		DesiredCapabilities cap = new DesiredCapabilities() ;
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
		driver = new RemoteWebDriver(new URL(nodeURL), cap);	
	}
	
	@Test(priority = 2)
	void login()
	{
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.findElement(By.id("username")).sendKeys("pavanoltraining");
		driver.findElement(By.id("password")).sendKeys("Test@selenium123");
		driver.findElement(By.name("login")).click();
		
		String capText = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText();
		if (capText.contains("pavanoltraining"))
		{
			//Assert.assertTrue(true);
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		driver.close();
		
	}
}

package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	WebDriver driver = null;
	
	@Parameters("browser")
	@Test(priority = 1)
	public void launchBrowser(String br)
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();		
		}
		else if(br.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver-v0.30.0-win64/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C://Drivers//edgedriver_win64/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority = 2)
	public void verifyTitle()
	{
		//Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		//compare title
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3)
	public void registration()
	{
		//Write code for registration process
		Assert.assertTrue(true);
	}
	
	@Test(priority = 4)
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
}

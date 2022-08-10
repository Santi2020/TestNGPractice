package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver lDriver;
	LoginPage(WebDriver rDriver)
	{
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(name="txtUsername") WebElement txtUsername;
	@FindBy(name="txtPassword") WebElement txtPassword;
	@FindBy(xpath="//*[@id=\"btnLogin\"]") WebElement btnLogin;

	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}

	
	public void clickLogin()
	{
		btnLogin.click();
	}
}

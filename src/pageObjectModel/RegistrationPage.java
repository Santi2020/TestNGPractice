package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver lDriver ;
	
	RegistrationPage(WebDriver rDriver)
	{
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(linkText = "Admin") 
	@CacheLookup
	WebElement adminLink;
	
		
	@FindBy(linkText ="User Management") 
	@CacheLookup
	WebElement userMgtLink;
	//-----------------------done
	
	@FindBy(linkText ="User") 
	WebElement userLink;
	
	@FindBy(name="btnAdd") 
	@CacheLookup
	WebElement buttonAdd;
	
	//user role
	@FindBy(id="systemUser_userType") 
	@CacheLookup
	WebElement userType;
	
	
	@FindBy(id="systemUser_employeeName_empName") 
	@CacheLookup
	WebElement empName;

	
	@FindBy(id="systemUser_userName") 
	@CacheLookup
	WebElement userName;
	
	// status
	
	@FindBy(id="systemUser_status") 
	@CacheLookup 
	WebElement userStatus;
		
	@FindBy(id="systemUser_password") 
	@CacheLookup
	WebElement pwd;
	
	@FindBy(id="systemUser_confirmPassword") 
	@CacheLookup
	WebElement confirmPwd ;
	
	
	@FindBy(name="btnSave") 
	@CacheLookup
	WebElement buttonSave ;
	
	@FindBy(id="btnCancel") 
	@CacheLookup
	WebElement buttonCancel ;
	
	public void clickButtonAdd()
	{
		buttonAdd.click();
	}
	
	public void clickButtonSave()
	{
		buttonSave.click();
	}
	
	public void clickButtonCancel()
	{
		buttonCancel.click();
	}
	
	public void clickAdminLink()
	{
		adminLink.click();
	}

	public void clickUserMgtLink()
	{
		userMgtLink.click();
	}
		
	public void clickUserLink()
	{
		userLink.click();
	}
	

	public void setUserType(String val)
	{
		Select ddUserType = new Select(userType);
		ddUserType.selectByVisibleText(val);
	}
	
	public void setEmpName(String ename)
	{
		empName.sendKeys(ename);
	}
	
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void setUserStatus(String val)
	{
		Select ddUserStatus = new Select(userStatus);
		ddUserStatus.selectByVisibleText(val);
	}

	public void setPassword(String val)
	{
		pwd.sendKeys(val);
	}
	
	public void setConfirmPassword(String val)
	{
		confirmPwd.sendKeys(val);
	}
	
	
	
}

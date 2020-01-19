package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement textemail;
	
	@FindBy(id="Password")
	private WebElement textpassword;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginbutton;
	
	@FindBy(linkText="Logout")
	private WebElement linkLogout;
	
	public void setUserName(String uname)
	{
		textemail.clear();
		textemail.sendKeys(uname);
	}
	
	
	public void setPassword(String password)
	{
		textpassword.clear();
		textpassword.sendKeys(password);
	}
	
	public void clickonlogin()
	{
		
		loginbutton.click();
	}
	
	public void clickonlogout()
	{
		
		linkLogout.click();
	}
}

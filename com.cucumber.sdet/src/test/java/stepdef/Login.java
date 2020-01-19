package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import pageobjects.LoginPage;

public class Login extends BaseClass {
	@Before
	public void setup() throws FileNotFoundException, IOException {
		
		ppt=new Properties();
		ppt.load(new FileInputStream("./config.properties"));
		String browser=ppt.getProperty("browser");
		
			
		
			
	
		logger=Logger.getLogger("FT");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", ppt.getProperty("chromepath"));
		driver=new ChromeDriver();
		logger.info("Launching browser");
	}
	
	
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		
		lp=new LoginPage(driver);
		
	    
	}

	@Then("User enters URLS as {string}")
	public void user_opens_URL_https_admin_demo_nopcommerce_com_admin(String url) {
	  driver.get(url);  
	  logger.info("opening url");
	  driver.manage().window().maximize();
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		logger.info("entering credentials");
	    lp.setUserName(email);
	    lp.setPassword(password);
	}

	@When("Click on login")
	public void click_on_login() {
		logger.info("click on login button");
		lp.clickonlogin();
	    
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
	Assert.assertEquals(title,driver.getTitle());
	logger.info("Login Successful");
	}

	@When("user click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
		   Thread.sleep(3000);
	    lp.clickonlogout();
	    Thread.sleep(3000);
		logger.info("Logout Successful");
	}
	
	@And("close the browser")
	public void closebrowser()
	{
		driver.quit();
		logger.info("closing browser Successful");
	}
	
	

}

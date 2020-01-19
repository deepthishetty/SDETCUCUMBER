package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OrangeHRMlogin {
	
	WebDriver driver;
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C://Lib//chromedriver.exe");
		driver=new ChromeDriver();
	    
	}

	@When("I open Orange HRM home page")
	public void i_open_Orange_HRM_home_page() {
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("I verify logo presnt on the home page")
	public void i_verify_logo_presnt_on_the_home_page() {
	  boolean status = driver.findElement(By.xpath("//*[@id='divLogo']/img")).isDisplayed();
	  Assert.assertEquals(true, status);
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}


}

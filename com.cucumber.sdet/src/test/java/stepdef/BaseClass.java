package stepdef;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageobjects.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public static Logger logger;
	public Properties ppt;
}

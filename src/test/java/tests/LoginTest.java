package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import config.ConfigReader;
import pages.LoginPage;
import utils.ScreenShotUtil;

public class LoginTest extends BaseTest {

	
	ConfigReader config;
	LoginPage loginCred;
	
	@Test
	public void LoginSetup() {
		loginCred = new LoginPage(driver);
		config = new ConfigReader();
		loginCred.login(config.getUsername(), config.getPassword());
		ScreenShotUtil sc =  new ScreenShotUtil();
		sc.takeScreenShot(driver, "HomePage");
		System.out.println("Screenshot captured");
	}
	
}

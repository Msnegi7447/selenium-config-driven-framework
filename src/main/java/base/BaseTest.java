package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		ConfigReader config = new ConfigReader();
		String browsername = config.getBrowserName();
		String url = config.geturldetails();
		System.out.println("Browser from config: " + browsername);
	    System.out.println("URL from config: " + url);
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(config.geturldetails());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}

package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtil {

	public void takeScreenShot(WebDriver driver,String filename) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/screenshots/"+filename+".png";
		File destination = new File(path);
		
		try {
			FileUtils.copyFile(source, destination);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

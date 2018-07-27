package Utility;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static String captureScreanshot(WebDriver driver, String screenShotName) throws IOException
	{

	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE); 
	String destination = "./ScreenShots/" + screenShotName + System.currentTimeMillis() +".png"; 
	
	//copyFile(src, new File(destination)); 
	
	FileHandler.copy(src,new File(destination));
	return destination; 
	
	
	}

}

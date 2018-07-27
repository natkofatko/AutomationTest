package testCAses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Helper;
import factory.DataProviderFactory;

public class test {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natal\\Downloads\\drivers\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
		 
	       driver.get("http://www.google.com");
	      // Helper.captureScreanshot(driver, "Hello world"); 
	 Thread.sleep(3000);
	       driver.quit();
	       
	       System.out.println(DataProviderFactory.getExcel().getData(0, 0, 0)); 
	       
	}

}

package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import DataPovider.ConfigDataProvider;

public class browserFactory {
	static WebDriver driver;
	static DataProviderFactory fac; 
	public static WebDriver getBrowser(String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			ConfigDataProvider con = new ConfigDataProvider(); 
			System.setProperty("webdriver.chrome.driver", con.getChromePath()); ;
			driver= new ChromeDriver(); 
		//	DataProviderFactory.getConfig().getChromePath(); 
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			ConfigDataProvider con = new ConfigDataProvider(); 
			System.setProperty("webdriver.gecko.driver", con.getFireFox()); 
			driver = new FirefoxDriver(); 
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			ConfigDataProvider con = new ConfigDataProvider(); 
			System.setProperty("webdriver.edge.driver", con.getEdge()); 
			driver = new EdgeDriver(); 
		}
		
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		return driver; 
	
		
	}
	
	
public static void closeBrowser(WebDriver driverl)
{
	driverl.quit();
}
}

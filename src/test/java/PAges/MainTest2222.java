package PAges;

import org.openqa.selenium.WebDriver;

import factory.DataProviderFactory;
import factory.browserFactory;

public class MainTest2222 {

	
	public static void main(String[] args) {
		WebDriver driver; 	
		
		driver = browserFactory.getBrowser("edge");
		driver.get("https://stackoverflow.com/questions/51213150/selenium-python-wait-doesnt-work"); 
		//driver.get(DataProviderFactory.getConfig().getURL());
		
		
	}
}

package DataPovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties property ; 
	public ConfigDataProvider()
	{
		File file = new File("C:\\Users\\natal\\Desktop\\HybridFramework\\com.learnautomation\\Configuration\\config.properties");
		

		try {
		
			FileInputStream fis = new FileInputStream(file);
			
			 property = new Properties(); 
			property.load(fis);
		
		} 
		
		catch (Exception e) {
		System.out.println("Exception is " + e.getMessage());
		
		}
		
	}	
		public String getURL()
		{
			String url = property.getProperty("url"); 
			return url; 
		}
		
		public String getChromePath()
		{
			String chromePath = property.getProperty("chromePathNew"); 
			return chromePath; 
		}
		public String getFireFox()
		{
			String firefoxPath = property.getProperty("FireFoxPath"); 
			return firefoxPath; 
		}
		public String getEdge() {
		
			String edgePath = property.getProperty("edgePath"); 
			return edgePath; 
		}
	

}

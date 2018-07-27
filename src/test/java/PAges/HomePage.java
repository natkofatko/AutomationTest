package PAges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver; 
	public HomePage(WebDriver ldriver)
	{
		this.driver = ldriver; 
	}
	
	
	
	@FindBy (xpath = "/html/body/div[1]/header/div[2]/div[1]/ul/li[2]/a" ) WebElement signInLink; 

	@FindBy (xpath = "/html/body/div[1]/header/div[2]/div[1]/ul/li[3]/a") WebElement myAccountLink; 
	
	@FindBy (xpath = "/html/body/div[1]/header/div[2]/div[1]/ul/li[1]/span") WebElement welcomeWe; 
		
	
	public void ClickOnSignIn()
	{
		signInLink.click();
	}
	
	public void clickOnMYAccount()
	{
		myAccountLink.click();
	}
	public String getTitle()
	{
		return  driver.getTitle(); 
	}
	
	public String WelcomeMessage()
	{
		return welcomeWe.getText(); 
		
		
	}
	
	
}

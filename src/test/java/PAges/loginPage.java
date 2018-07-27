package PAges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class loginPage {
	
	WebDriver driver; 
	public loginPage(WebDriver driver)
	{
		
		this.driver = driver; 
	}
	
	@FindBy (id = "email") WebElement NickName; 
	@FindBy (id = "pass") WebElement password; 
	@FindBy (id = "send2") WebElement signUp; 
	@FindBy (id = "search") WebElement searchbutp; 
	@FindBy (id="page-title-wrapper") WebElement Description; 


	public void loginApplication(String login, String pass) throws InterruptedException
	{
		NickName.sendKeys(login); 
	
		password.sendKeys(pass); 
		Thread.sleep(2000);
		signUp.click();
		Thread.sleep(2000);
	}
	
	public void verifySomeinfo()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("Description"))); 
	String text = ele.getText(); 
	Assert.assertEquals(text, "this text is present", "sign out link not properly");
	}
}

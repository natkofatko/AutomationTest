package testCAses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PAges.HomePage;
import factory.DataProviderFactory;
import factory.browserFactory;

public class verifyHomePage {

	WebDriver driver;

	@BeforeMethod
public void setUp() {
		driver = browserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().getURL());
	}

	@Test
	public void testPage() throws InterruptedException {

		HomePage home = PageFactory.initElements(driver, HomePage.class);
		String title = home.getTitle();
		System.out.println("my app title is " + home.getTitle());

		Assert.assertTrue(title.contains("A"));
		Thread.sleep(6000);
		
		home.ClickOnSignIn();
		Thread.sleep(4000);
		
		home.clickOnMYAccount();
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		browserFactory.closeBrowser(driver);
	}

}

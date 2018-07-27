package testCAses;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PAges.HomePage;
import PAges.loginPage;
import factory.DataProviderFactory;
import factory.browserFactory;

public class verifyLoginPage2WithReports2andScreenShots {

	WebDriver driver;
	ExtentReports report; 
	ExtentTest logger; 
	

	@BeforeMethod
public void setUp() {
	
		report = new ExtentReports("./Reports/LoginPageReports.html", true); 
		//logger = new ExtentTest("Verify Login Page", "This page will verify login link"); 
		logger = report.startTest("Verify test Login"); 
		
		driver = browserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().getURL());
		logger.log(LogStatus.INFO, "Application is ready to run");
	}

	@Test
	public void testPage() throws InterruptedException {

		HomePage home = PageFactory.initElements(driver, HomePage.class);
		String title = home.getTitle();
		System.out.println("my app title is " + home.getTitle());

		Assert.assertTrue(title.contains("A"));
		logger.log(LogStatus.PASS, "Home page is verified");
		Thread.sleep(6000);
		
		logger.log(LogStatus.INFO, "click on sigh in link");
		home.ClickOnSignIn();
		Thread.sleep(4000);
		logger.log(LogStatus.PASS, "click on page is verified");
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		login.loginApplication(DataProviderFactory.getExcel().getData(0, 0, 0), DataProviderFactory.getExcel().getData(0, 0, 1));
		logger.log(LogStatus.PASS, "login page is verified");
	}
	
	@AfterMethod
	public void TearDown()
	{
		browserFactory.closeBrowser(driver);
		report.endTest(logger);
		report.flush();
		
	}

}

package com.OrangeHRMApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest {
	
	public WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);		
		//Maximizing the Browser
		driver.manage().window().maximize();
		//Web Page Wait- for the Application to be loaded on the Browser
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//Implicit Wait
		//its Global Wait/Smart Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		Log.info("Successfully navigated to OrgangeHRM Application");
	}
	
	@AfterTest
	public void tearDown() 
	{
		
		driver.quit();
		Log.info("Successfully Closed The OrangeHRM Application");
	}

}

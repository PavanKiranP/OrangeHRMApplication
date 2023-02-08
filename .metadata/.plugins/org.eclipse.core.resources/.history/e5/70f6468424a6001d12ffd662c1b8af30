package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {
	
	public static WebDriver driver;
	@Before
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		//Maximizing the Browser
		driver.manage().window().maximize();
		//Web Page Wait- for the Application to be loaded on the Browser
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//Implicit Wait
		//its Global Wait/Smart Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
	}
	
	@After
	public static void tearDown()
	{
		driver.quit();
	}

}

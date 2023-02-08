package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatatingTitle_GoogleHomePage {

	public static void main(String[] args) {
		
		String applicationUrlAdress="http://google.com";
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(applicationUrlAdress);
		String expected_GoogleHomePageTitle="Google";
		System.out.println("The Expected Title Of Google Home Page is :- "+expected_GoogleHomePageTitle);
		String actual_GoogleHomePageTitle=driver.getTitle();
		System.out.println("The Actual Title Of Google Home Page is :- "+actual_GoogleHomePageTitle);
		if(actual_GoogleHomePageTitle.equalsIgnoreCase(expected_GoogleHomePageTitle))
		{
			System.out.println("Title of Google Home Page Matched-PASS");
		}
		else
		{
			System.out.println("Title of Googler Home Page NOT Matched-FAIL");
		}
		driver.quit();
	}

}

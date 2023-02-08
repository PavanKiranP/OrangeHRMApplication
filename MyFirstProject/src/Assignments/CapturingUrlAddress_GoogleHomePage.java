package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingUrlAddress_GoogleHomePage {

	public static void main(String[] args) {
		
		String applicationUrlAdress="https://google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAdress);
		String expected_GoogleHomePageUrlAddress="google.com";
		System.out.println("The expected URL Adress of Google Home Page is :-"+expected_GoogleHomePageUrlAddress);
		
		//Identifying the Current URL Address of Google Home Page
		String actual_GoogleCurrentUrlAdress=driver.getCurrentUrl();
		System.out.println("The Current URL Adress of Google Home Page is :-"+actual_GoogleCurrentUrlAdress);;
		
		//Validating URL Address
		if(actual_GoogleCurrentUrlAdress.contains(expected_GoogleHomePageUrlAddress))
		{
			System.out.println("URL Address Matched-PASS");
		}
		else
		{
			System.out.println("URL Address is NOT Matched-FAIL");
		}
		
		//Identifying Title
		
		String expected_GoogleHomePageTitle="Google";
		System.out.println("The Expected Title Of Google Home Page is :- "+expected_GoogleHomePageTitle);
		String actual_GoogleHomePageTitle=driver.getTitle();
		System.out.println("The Actual Title Of Google Home Page is :- "+actual_GoogleHomePageTitle);
		
		//Validating Title
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

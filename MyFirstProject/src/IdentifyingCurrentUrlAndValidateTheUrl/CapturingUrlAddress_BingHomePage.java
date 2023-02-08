package IdentifyingCurrentUrlAndValidateTheUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CapturingUrlAddress_BingHomePage {

	public static void main(String[] args) {
		
		//assigning the URL Address To a variable
		String applicationUrlAdress="http://bing.com";
		WebDriver driver;
		System.setProperty("webdriver.edge.driver","./BrowserDriverFiles/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(applicationUrlAdress);
		String expected_BingHomePageUrlAddress="bing.com";
		System.out.println("The expected URL Adress of Bing Home Page is :-"+expected_BingHomePageUrlAddress);
		
		//Identifying the Current URL Address of Bing Home Page
		String actual_BingCurrentUrlAdress=driver.getCurrentUrl();
		System.out.println("The Current URL Adress of Bing Home Page is :-"+actual_BingCurrentUrlAdress);;
		
		//Validating URL Address
		if(actual_BingCurrentUrlAdress.contains(expected_BingHomePageUrlAddress))
		{
			System.out.println("URL Address Matched-PASS");
		}
		else
		{
			System.out.println("URL Address is NOT Matched-FAIL");
		}
		driver.quit();

	}

}

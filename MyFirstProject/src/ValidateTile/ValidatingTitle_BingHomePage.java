package ValidateTile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidatingTitle_BingHomePage {

	public static void main(String[] args) {
		
		//assigning the URL Address to a variable
		String applicationUrlAddress="Http://bing.com";
		System.setProperty("webdriver.edge.driver","./BrowserDriverFiles/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();//creating an object for WebDreiver
		driver.get(applicationUrlAddress);
		
		//Client Requirement
		String expected_BingHomePageTitle="Bing";
		System.out.println("The Expected Title of the Bing Home Page is"+expected_BingHomePageTitle);
		//Identifying the Actual Title of the Bing Home Page-getting the Developer DEvelopedtitle
		String actual_BingHomePageTitle=driver.getTitle();
		System.out.println("The Actual Title Of the Bing Home Page is:-"+actual_BingHomePageTitle);
		if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
		{
			System.out.println("Title of the Bing Homew Page matched-PASS");
		}
		else
		{
			System.out.println("Title of thje Bring Home Page Not matched-FaIL");
		}
		driver.quit();//closing browser
	}

}

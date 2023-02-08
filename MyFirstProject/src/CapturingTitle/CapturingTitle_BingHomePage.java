package CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTitle_BingHomePage {

	public static void main(String[] args) {
		
		//assigning the URL Address to a variable
		String applicationUrlAddress="http://bing.com";
		
		//Automating chrome Browser
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Navigating to Application URL Address
		driver.get(applicationUrlAddress);//passing the variable to get method - which is assigned with the URL Address
		
		// getting the Title of the Bing Home Page
		String actual_BingHomePageTitle=driver.getTitle();//object(driver) points to current browser web page
														  //getting title of the current web page
		
		//printing the identified title of the Bing Home Page
		System.out.println("The Actual Title Of The Bing Home Page is :-"+actual_BingHomePageTitle);
		driver.quit();//closing the browser
		
	}

}

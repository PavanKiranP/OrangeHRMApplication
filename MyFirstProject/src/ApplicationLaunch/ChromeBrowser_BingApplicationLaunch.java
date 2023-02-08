package ApplicationLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_BingApplicationLaunch {

	public static void main(String[] args) {
		
		//launching Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","D:\\WorkSpace\\MyFirstProject\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver chromeBrowser = new ChromeDriver();
		
		//Navigating to Bing application HomePage
		
		chromeBrowser.get("https://bing.com");
		chromeBrowser.get("https://google.com");
		chromeBrowser.get("https://facebook.com");
		chromeBrowser.navigate().to("https://Livetech.in");
		
		chromeBrowser.close();//closing the browser-it will close the Browser with singleTab
		chromeBrowser.quit();//close the Browser with multiple tabs opened

	}

}

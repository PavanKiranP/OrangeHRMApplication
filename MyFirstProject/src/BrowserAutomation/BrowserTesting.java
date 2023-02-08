package BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserTesting {

	public static void main(String[] args) {
	
		//ChromeBrowser Automation	
		
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\MyFirstProject\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		
		
		//Edge Browser Automation
		
		System.setProperty("webdriver.edge.driver","D:\\WorkSpace\\MyFirstProject\\BrowserDriverFiles\\msedgedriver.exe");
		EdgeDriver edge = new EdgeDriver();
		
		//Opera Browser Automation
		
		//System.setproprty("webdriver.opera.driver","./BrowserDriverFiles/operadriver.exe");
		//OperaDriver operaBrowser = new OperaDriver();
		
		// FireFox Browser Automation
		
		//System.setproperty("webdriver.gecko.driver","./BrowserDriverFiles/geckodriver.exe");
		//FirefoxDriver firefoxBrowser = new FirefoxDriver();
		chrome.quit();
		edge.quit();
	}
	
}

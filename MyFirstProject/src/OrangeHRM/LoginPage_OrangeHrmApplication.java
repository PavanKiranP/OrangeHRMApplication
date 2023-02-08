package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage_OrangeHrmApplication {

	public static void main(String[] args) {
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
	
		//Automating User name Element
		//<input name="txtUsername" id="txtUsername" type="text">
		String userNameTestData="Pavankiran";
		By userNameL=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameL);
		//Performing an operation on an Element of the WebPage
		userName.sendKeys(userNameTestData);
		
		//Automating Password Element
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		String passwordTestData="Pavan@1919";
		By passwordL=By.name("txtPassword");
		WebElement password=driver.findElement(passwordL);
		password.sendKeys(passwordTestData);
		
		//Automating Login Button
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By LogInButtonL=By.className("button");
		WebElement LogInButton=driver.findElement(LogInButtonL);
		LogInButton.click();
		driver.quit();
	}

}

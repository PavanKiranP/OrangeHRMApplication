package LinkTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninElement_Google_HomePage {

	public static void main(String[] args) {
		
		
		String applicationUrlAddress="http://google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
		/*
		<a class="gb_7 gb_8 gb_de gb_dd" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/%3Fgws_rd%3Dssl&amp;ec=GAZAmgQ" target="_top">Sign in</a>
		a - anchorTag
		href - attribute
		value - https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/%3Fgws_rd%3Dssl&amp;ec=GAZAmgQ
		Type of Element - link
		locator - linkText
		selector - Sign in
		*/
		By signInL=By.linkText("Sign in");
		WebElement signIn=driver.findElement(signInL);
		signIn.click();

	}

}

package getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) {
		
		//Automating Browser
		WebDriver driver;
		String apllicationUrlAdress="http://google.com";
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(apllicationUrlAdress);
		/*
		//Automating using linkText
		//<a class="gb_7 gb_8 gb_de gb_dd" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/%3Fgws_rd%3Dssl&amp;ec=GAZAmgQ" target="_top">Sign in</a>
		By signInL=By.linkText("Sign in");
		WebElement signIn=driver.findElement(signInL);
		*/
		//Automating Using partialLinkText
		//<a class="gb_7 gb_8 gb_de gb_dd" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/%3Fgws_rd%3Dssl&amp;ec=GAZAmgQ" target="_top">Sign in</a>
		 By signInL=By.partialLinkText("Sign");
		 WebElement signIn=driver.findElement(signInL);
		//getting the text of 'signIn' Element
		String signIn_Text=signIn.getText();
		System.out.println("The text of a element signin is:- "+signIn_Text);
		signIn.click();
		driver.quit();
		
	}

}

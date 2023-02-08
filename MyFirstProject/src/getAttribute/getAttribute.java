package getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) {
		
		
		//Automating Browser
				WebDriver driver;
				String apllicationUrlAdress="http://google.com";
				System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
				driver= new ChromeDriver();
				driver.get(apllicationUrlAdress);
				
				//Automating using linkText
				//<a class="gb_7 gb_8 gb_de gb_dd" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/%3Fgws_rd%3Dssl&amp;ec=GAZAmgQ" target="_top">Sign in</a>
				//			gb_7 gb_8 gb_de gb_dd		 https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/%3Fgws_rd%3Dssl&ec=GAZ vcAmgQ
				By signInL=By.linkText("Sign in");
				WebElement signIn=driver.findElement(signInL);
				
				//getting the text of 'signIn' Element
				String signIn_Text=signIn.getText();
				System.out.println("The text of a element signin is:- "+signIn_Text);
				
				//getting href Attribute Value Of signIn Element
				String signIn_AttributeValueOfHref=signIn.getAttribute("href");
				System.out.println("The Attribute Value Of href signIn Element is :- "+signIn_AttributeValueOfHref);
				//getting the class Attribute Value Of signIn Element
				String signIn_AttributeValueOfClass=signIn.getAttribute("class");
				System.out.println("The Attribute Value Of class signIn Element is :- "+signIn_AttributeValueOfClass);
				
				//performing click on the same element 'signIn'
				signIn.click();
				driver.quit();
				
				
	}

}

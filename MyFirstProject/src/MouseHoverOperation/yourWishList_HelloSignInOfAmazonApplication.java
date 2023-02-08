package MouseHoverOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class yourWishList_HelloSignInOfAmazonApplication {

	public static void main(String[] args) {
		
		//Automate Browser And Navigate To Amazon Application LOgin Page 
				String applicationUrlAddress="http://amazon.in";
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(applicationUrlAddress);
				
				//Maximizing the Browser
				driver.manage().window().maximize();
				
				//Implicit Wait
				//its Global Wait/Smart Wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				//Hello SignIn Element Property
				//<span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span>
				By helloSignInLocator=By.id("nav-link-accountList-nav-line-1");
				WebElement helloSignIn=driver.findElement(helloSignInLocator);
				
				//Actions class used to perform Mouse Hover operation on to HelloSignin Element
				Actions action = new Actions(driver);
				action.moveToElement(helloSignIn).build().perform();
				
				//your Wish list - Element under Test
				//<a href="/hz/wishlist/ls?requiresSignIn=1&amp;ref_=nav_AccountFlyout_wl" class="nav-link nav-item"><span class="nav-text">Your Wish List</span></a>
				//Type of Element - link
				//locator - linkText/partiallintText
				//selector - Your Wish List
				By YourWishListLocator=By.linkText("Your Wish List");
				WebDriverWait wait = new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(YourWishListLocator));
				WebElement yourWishList=driver.findElement(YourWishListLocator);
				yourWishList.click();
				driver.quit();

	}

}

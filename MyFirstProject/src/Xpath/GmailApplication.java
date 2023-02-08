package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailApplication {

	public static void main(String[] args) {
		
		String ApplicationUrl="http://gmail.com";
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "./BrowserDriverFiles/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(ApplicationUrl);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//aria-label="Email or phone"
		//*[@aria-label='Email or phone']
		By emailLocator=By.xpath("//*[@aria-label='Email or phone']");
		WebElement email=driver.findElement(emailLocator);
		email.sendKeys("pavankiran.pulipati");
		//Automating next button
		//<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
		//By nextLocator=By.xpath("//span[@jsname='V67aGc']");
		//Xpath expression creation using text() method
		// //tagname[text()='textvalue']
		//span[text()='Next']
		By nextlocator=By.xpath("//span[text()='Next']");
		WebElement next=driver.findElement(nextlocator);
		next.click();
		driver.quit();
	}

}

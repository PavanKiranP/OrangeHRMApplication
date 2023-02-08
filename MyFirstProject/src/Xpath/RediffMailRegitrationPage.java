package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RediffMailRegitrationPage {

	public static void main(String[] args) throws InterruptedException {
		
		String ApplicationUrl="http://register.rediff.com/register/register.php?FormName=user_details";
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "./BrowserDriverFiles/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(ApplicationUrl);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//FullName Automation
		/*
		 name="name26336236"
		 name="name6e30b6a2"
		 */
		//By fullNameLocator=By.name("name26336236");
		// '//' - search on the complete Web page
		// '*' - search for all the Tags
		//Selector
		//*[starts-with(@name,'name')] - Xpath creation based on available properties
		By fullNameLocator=By.xpath("//*[starts-with(@name,'name')]");
		WebElement fullName=driver.findElement(fullNameLocator);
		fullName.sendKeys("Pavankiran");
		
		//Password
		//<input type="password" name="passwd6e30b6a2" value="" style="width:calc(100% - 40px); float:left;" onblur="fieldTrack(this);" id="newpasswd">
		//name="passwd6e30b6a2"
		//name="passwdc5cee1f1"
		//  //input[starts-with(@name,'passwd')] - Dynamic relative Xpath expression
		By passwordLocator=By.xpath("//input[starts-with(@name,'passwd')]");
		WebElement password=driver.findElement(passwordLocator);
		password.sendKeys("Selenium");
		//Thread.sleep(3000);
		password.clear();
		//<input type="password"
		//Based On Single property 
		//tagname[@attribute='attributevalue'] 
		//input[@type='password'] - relative Xpath expression
		By newPasswordLocator=By.xpath("//input[@type='password']");
		WebElement newPassword=driver.findElement(newPasswordLocator);
		newPassword.sendKeys("LoadRunner");
		//Based on Multiple Properties
		//tagname[@attributename1='attributevalue1' and @attributename2='attributevalue2 and ........]
		//*[@type='password' and @id='newpasswd']
		By pwdLocator=By.xpath("//*[@type='password' and @id='newpasswd']");
		WebElement pwd=driver.findElement(pwdLocator);
		pwd.sendKeys("JMeter");
		driver.quit();
	}

}

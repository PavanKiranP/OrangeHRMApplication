package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHrmApplicationLoginPage {

	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.edge.driver","./BrowserDriverFiles/msedgedriver.exe");
		//driver = new EdgeDriver();
		
		driver.get(applicationUrlAdress);
		
		//Validating Title
		String clientTitle="OrangeHRM";
		String currentTitle=driver.getTitle();
		System.out.println("The Current Title Of Browser is :- "+currentTitle);
		if(currentTitle.equals(clientTitle))
		{
			System.out.println("The Title is Matched-PASS");
		}
		else
		{
			System.out.println("The Title is Not Matched-FAIL");
		}
		
		//Validating URL
		String clientUrl="orangehrm-4.2.0.1";
		String currentUrl=driver.getCurrentUrl();
		System.out.println("The Current URL Of Browser is:- "+currentUrl);
		if(currentUrl.contains(clientUrl))
		{
			System.out.println("The URL is Matched-PASS");
		}
		else
		{
			System.out.println("The URL is NOT Matched-FAIL");
		}
		//inspected User Name Element Properties
		//<input name="txtUsername" id="txtUsername" type="text">
		//locator = id
		//selector = txtUsername
		driver.findElement(By.id("txtUsername")).sendKeys("Pavankiran");
		
		//inspected Password Element Properties
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		//locator = name
		//selector = txtPassword
		driver.findElement(By.name("txtPassword")).sendKeys("Pavan@1919");
		
		//inspected Login Button Element Properties
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		//locator = className
		//selector = button
		driver.findElement(By.className("button")).click();
		driver.quit();
		
		

	}

}

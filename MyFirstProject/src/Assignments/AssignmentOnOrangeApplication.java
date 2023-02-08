package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnOrangeApplication {

	public static void main(String[] args) throws InterruptedException {

		//Automate Browser And Navigate To OrangeHrm Application LOgin Page 
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
	
		//Validating Title Of OrangeHrm Application Home Page
		String expectedTitle="OrangeHRM";
		String Actualtitle=driver.getTitle();
		System.out.println("the Autual Title Of Current OrangeHRM Home Page is :- "+Actualtitle);
		if(Actualtitle.equals(expectedTitle))
		{
			System.out.println("The Current Title Of OrangeHrm Home is Matched- PASS");
		}
		else
		{
			System.out.println("The Current Title Of OrangeHrm Home Page is Not Matched- FAIL");
		}
		
		//Validating URL Of OrangeHrm Application Home Page
		String expectedUrlAddress="orangehrm-4.2.0.1";
		String ActualUrlAddress=driver.getCurrentUrl();
		System.out.println("the Autual URL Of Current OrangeHRM Home Page is :- "+ActualUrlAddress);
		if(ActualUrlAddress.contains(expectedUrlAddress))
		{
			System.out.println("The Current URL Of OrangeHrm Home Page is Matched- PASS");
		}
		else
		{
			System.out.println("The Current URL Of OrangeHrm Home Page is Not Matched- FAIL");
		}
		
		//Validating Text- LOGIN PANEL
		//<div id="logInPanelHeading">LOGIN Panel</div>
		String expected_Text="LOGIN Panel";
		By loginPanelL=By.id("logInPanelHeading");
		WebElement loginPanel=driver.findElement(loginPanelL);
		String ActualLoginPanel_Text=loginPanel.getText();
		System.out.println("The Text of Element LoginPanel is :- "+ActualLoginPanel_Text);
		if(ActualLoginPanel_Text.equals(expected_Text))
		{
			System.out.println("The Current Text Of OrangeHrm Home Page Login Panel is Matched- PASS");
		}
		else
		{
			System.out.println("The Current Text Of OrangeHrm Home Page Login Panel is Not Matched- FAIL");
		}
		
		
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
		
		//Validating Text - Admin
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
		String expectedAdmin_Text="Admin";
		By AdminL=By.linkText("Admin");
		WebElement Admin=driver.findElement(AdminL);
		String ActualAdmin_Text=Admin.getText();
		System.out.println("The Actual Text Element of Admin is :-"+ActualAdmin_Text);
		if(ActualAdmin_Text.equals(expectedAdmin_Text))
		{
			System.out.println("The Text Element of Admin is Matched- Pass");
		}
		else
		{
			System.out.println("The Text Element of Admin is Not Matched- Fail");
		}
		
	
		//operating on Welcome Admin
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		//locator - className
		//selector - panelTrigger
		By welComeAdminL=By.className("panelTrigger");
		WebElement welcomeAdmin=driver.findElement(welComeAdminL);
		welcomeAdmin.click();
		
		// operation on Logout
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		//locator - linkText
		//selector - Logout
		//synchronization
		Thread.sleep(3000);
		By logoutL=By.linkText("Logout");
		WebElement logout=driver.findElement(logoutL);
		logout.click();
		//validating login page after logout
		//validate LOGIN panel Text
		//<div id="logInPanelHeading">LOGIN Panel</div>
		String expectedText_AfterLogout="LOGIN Panel";
		By loginPanel_AfterLogoutL=By.id("logInPanelHeading");
		WebElement loginPanel_AfterLogout=driver.findElement(loginPanel_AfterLogoutL);
		String LoginPanel_TextAfterLogout=loginPanel_AfterLogout.getText();
		System.out.println("The Text of Element LoginPanel is :- "+LoginPanel_TextAfterLogout);
		if(LoginPanel_TextAfterLogout.equals(expectedText_AfterLogout))
		{
			System.out.println("The OrangeHrm Login Panel Text Of login Page After Logout is Matched- PASS");
		}
		else
		{
			System.out.println("The OrangeHrm Login Panel Text Of login Page After Logout is Not Matched- FAIL");
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}

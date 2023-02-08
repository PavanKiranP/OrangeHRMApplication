package Assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class AddEmployeeOnOrangeHrmApplication {

	public static void main(String[] args) throws IOException {
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		//Maximizing the Browser
		driver.manage().window().maximize();
		
		//Implicit Wait
		//its Global Wait/Smart Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Automating User name Element
		//<input name="txtUsername" id="txtUsername" type="text"
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
		
		//PIm element property
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		By PimL=By.id("menu_pim_viewPimModule");
		WebElement Pim=driver.findElement(PimL);
		
		//Mouse Hover Action On PIM of OragneHRM Application
		Actions action=new Actions(driver);
		action.moveToElement(Pim).build().perform();
		
		//Add Employee Element property
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		By addEmployeeL=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(addEmployeeL);
		addEmployee.click();
		
		//First Name Employee Element property
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		String FirstNameTestData="Pulipati";
		System.out.println("First Name Test Data - "+FirstNameTestData);
		By FirstNameL=By.id("firstName");
		WebElement FirstName=driver.findElement(FirstNameL);
		FirstName.sendKeys(FirstNameTestData);
		
		//Middle Name Employee Element property
		//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		String MiddleNameTestData="SaiPavan";
		System.out.println("Middle Name Test Data - "+MiddleNameTestData);
		By MiddleNameL=By.id("middleName");
		WebElement MiddleName=driver.findElement(MiddleNameL);
		MiddleName.sendKeys(MiddleNameTestData);
		
		//Last Name Employee Element property
		//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		String LastNameTestData="Kiran";
		System.out.println("Last Name Test Data - "+LastNameTestData);
		By LastNameL=By.id("lastName");
		WebElement LastName=driver.findElement(LastNameL);
		LastName.sendKeys(LastNameTestData);
	
		//Employee id Element Property At Add Employee Page
		//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0008" id="employeeId">
		By EmployeeIdL=By.id("employeeId");
		WebElement EmployeeId=driver.findElement(EmployeeIdL);
		String EmployeeIdAtAddEmployeePage=EmployeeId.getAttribute("value");
		System.out.println("Actual Employee Id - "+EmployeeIdAtAddEmployeePage);

		//Save Button Element Property
		//<input type="button" class="" id="btnSave" value="Save">
		By SaveButtonL=By.id("btnSave");
		WebElement SaveButton=driver.findElement(SaveButtonL);
		SaveButton.click();
		
		//<input value="Pulipati" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">		
		By EmployeeListFirstNameL=By.id("personal_txtEmpFirstName");
		WebElement EmployeeListFirstName=driver.findElement(EmployeeListFirstNameL);
		String actualFirstName=EmployeeListFirstName.getAttribute("value");
		System.out.println("The Actual First Name Of Employee List Page - "+actualFirstName);
		if(actualFirstName.equals(FirstNameTestData))
		{
			System.out.println("The First Name Of Employee is Matched - PASS");
		}
		else
		{
			System.out.println("The First Name Of Employee is Not Matched - FAIL");
		}
		//<input value="SaiPavan" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
		By EmployeeListMiddleNameL=By.id("personal_txtEmpMiddleName");
		WebElement EmployeeListMiddleName=driver.findElement(EmployeeListMiddleNameL);
		String actualMiddleName=EmployeeListMiddleName.getAttribute("value");
		System.out.println("The Actual Middle Name Of Employee List Page - "+actualMiddleName);
		if(actualMiddleName.equals(MiddleNameTestData))
		{
			System.out.println("The Middle Name Of Employee is Matched - PASS");
		}
		else
		{
			System.out.println("The Middle Name Of Employee is Not Matched - FAIL");
		}
		//<input value="Kiran" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
		By EmployeeListLastNameL=By.id("personal_txtEmpLastName");
		WebElement EmployeeListLastName=driver.findElement(EmployeeListLastNameL);
		String actualLastName=EmployeeListLastName.getAttribute("value");
		System.out.println("The Acutal Last Name Of Employee List Page - "+actualLastName);
		if(actualLastName.equals( LastNameTestData))
		{
			System.out.println("The Last Name Of Employee is Matched - PASS");
		}
		else
		{
			System.out.println("The Last Name Of Employee is Not Matched - FAIL");
		}
		
		//Validating Employee Id in Employee List Page
		//<input value="0009" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
		By EmployeeListIdL=By.id("personal_txtEmployeeId");
		WebElement EmployeeListId=driver.findElement(EmployeeListIdL);
		String ActualEmployeeIdAtEmployeeListPage=EmployeeListId.getAttribute("value");
		System.out.println("ActualEmployeeIdAtEmployeeListPage - "+ActualEmployeeIdAtEmployeeListPage);
		if(ActualEmployeeIdAtEmployeeListPage.equals(EmployeeIdAtAddEmployeePage))
		{
			System.out.println("The Employee Id At Add Employee Page And Employee List Page is Matched - PASS ");
		}
		else
		{
			System.out.println("The Employee Id At Add Employee Page And Employee List Page is Not Matched - FAIL ");
		}
		//operating on Welcome Admin
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		By welComeAdminL=By.className("panelTrigger");
		WebElement welcomeAdmin=driver.findElement(welComeAdminL);
		welcomeAdmin.click();
				
		// operation on Logout
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		By logoutL=By.linkText("Logout");
		WebElement logout=driver.findElement(logoutL);
		logout.click();
		driver.quit();
	
	}
	
	

}
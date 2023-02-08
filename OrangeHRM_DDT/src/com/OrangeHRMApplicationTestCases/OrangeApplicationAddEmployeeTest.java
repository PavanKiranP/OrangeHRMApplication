package com.OrangeHRMApplicationTestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.OrangeHRMApplication.BaseTest;
import com.utility.Log;

public class OrangeApplicationAddEmployeeTest extends BaseTest {
	
	WebElement WelcomeAdmin;
	FileInputStream propertiesFile;
	Properties property;

	
	@Test(priority=1)
	public void logInPageValidationText() throws IOException{
		//Identifying the properties file
		propertiesFile=new FileInputStream("./src/com/config/OrangeHRMApplication.properties");
		//creating an object for properties file
		property=new Properties();
		property.load(propertiesFile);
		String expected_LogInPageText="LOGIN Panel";
		Log.info(expected_LogInPageText);
		By loginPanelL=By.id(property.getProperty("logInPageLogInPanelProperty"));
		WebElement loginPanel=driver.findElement(loginPanelL);
		String actual_LogInPageText=loginPanel.getText();
		Log.info(actual_LogInPageText);
		if(actual_LogInPageText.equals(expected_LogInPageText))
		{
			Log.info("Successfully Navigated to OrangeHRM Application LogInPage- PASS");
		}
		else
		{
			Log.info("Failed to Navigated to OrangeHRM Application LogInPage- FAIL");
		}
	}
	
	@Test(priority=2)
	public void LoginTest() throws IOException {
		
		FileInputStream File = new FileInputStream("D:\\WorkSpace\\OrangeHRM_DDT\\src\\com\\ApplicationTestDataFiles\\OHRM_LogInTestData.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(File);
		XSSFSheet Sheet=workBook.getSheet("Sheet1");
		String UserNameTestData=Sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordTestData=Sheet.getRow(1).getCell(1).getStringCellValue();
		Log.info(UserNameTestData);
		Log.info(PasswordTestData);
		
		By userNameL=By.id(property.getProperty("UserNameProperty"));
		WebElement userName=driver.findElement(userNameL);
		userName.sendKeys(UserNameTestData);
		
		By passwordL=By.name(property.getProperty("PasswordProperty"));
		WebElement password=driver.findElement(passwordL);
		password.sendKeys(PasswordTestData);

		By LogInButtonL=By.className(property.getProperty("logInButtonProperty"));
		WebElement LogInButton=driver.findElement(LogInButtonL);
		LogInButton.click();
		Log.info("Successfully Navigated to OrangeHRM Application Home Page");
		
		
		Sheet.getRow(1).createCell(2).setCellValue("PASS");
		FileOutputStream file=new FileOutputStream("D:\\WorkSpace\\OrangeHRM_DDT\\src\\com\\ApplicationTestResultFiles\\AddEmployeeResultsFile.xlsx");
		workBook.write(file);
		workBook.close();
	}
	
	@Test(priority=3)
	public void AddEmplyeeTest() throws InterruptedException, IOException {
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		By PimL=By.linkText(property.getProperty("PimProperty"));
		WebElement Pim=driver.findElement(PimL);
		Actions action=new Actions(driver);
		action.moveToElement(Pim).build().perform();
		By addEmployeeL=By.id(property.getProperty("AddEmployeeProperty"));
		WebElement addEmployee=driver.findElement(addEmployeeL);
		addEmployee.click();
		//FirstName
		String FirstNameTestData="Pulipati";
		Log.info(FirstNameTestData);
		By FirstNameL=By.id("firstName");
		WebElement FirstName=driver.findElement(FirstNameL);
		FirstName.sendKeys(FirstNameTestData);
		//MiddleName
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys("SaiPavan").build().perform();
		//LastName
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys("Kiran").build().perform();
		//EmployeeId
		action.sendKeys(Keys.TAB).build().perform();
		//Photograph
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		java.lang.Runtime.getRuntime().exec("D:\\WorkSpace\\OrangeHRM_DDT\\logoScript3.exe");
		Thread.sleep(5000);
		By saveButtonLocator=By.id(property.getProperty("SaveButtonProperty"));
		WebElement saveButton=driver.findElement(saveButtonLocator);
		saveButton.click();
		
		//validating Uploaded Photo File
		By EmployeePhotographLocator=By.id(property.getProperty("UploadedPhotoProperty"));
		WebElement EmployeePhotograph=driver.findElement(EmployeePhotographLocator);
		boolean flag=EmployeePhotograph.isDisplayed();
		if(flag)
		{
			Log.info("Employee Photograph Uploaded Successfully - PASS");
		}
		else
		{
			Log.info("Employee Photograph Uploaded Failed - FAIL");
		}
	}
	
	
	@Test(priority=4)
	
	public void logOut()
	{
		By welComeAdminL=By.linkText(property.getProperty("WelcomeAdminProperty"));
		WebElement welcomeAdmin=driver.findElement(welComeAdminL);
		welcomeAdmin.click();
		
		By logoutL=By.linkText(property.getProperty("logOutProperty"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(logoutL));
		WebElement logout=driver.findElement(logoutL);
		logout.click();
		
	}	


}
	
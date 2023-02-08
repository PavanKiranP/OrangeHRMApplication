package com.OrangeHRMApplicationTestCases;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OrangeHRMApplication.BaseTest;
import com.utility.Log;

public class OrangeHRM_LogInTest  extends BaseTest{

	
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
	public void logInTest(){
		String userNameTestData="Pavankiran";
		By userNameL=By.id(property.getProperty("UserNameProperty"));
		WebElement userName=driver.findElement(userNameL);
		userName.sendKeys(userNameTestData);
		
		String passwordTestData="Pavan@1919";
		By passwordL=By.name(property.getProperty("PasswordProperty"));
		WebElement password=driver.findElement(passwordL);
		password.sendKeys(passwordTestData);
		
		By LogInButtonL=By.className(property.getProperty("logInButtonProperty"));
		WebElement LogInButton=driver.findElement(LogInButtonL);
		LogInButton.click();
		
	}
	
	@Test(priority=3)
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

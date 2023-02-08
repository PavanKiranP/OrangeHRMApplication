package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateCurrentLocationAndIndustryDropDown {

	public static void main(String[] args) {
		
		WebDriver driver;
		String ApplicationUrlAddress="https:my.monsterindia.com/sponsered_popup.html";
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//class="border_grey1"
		By currentLocationLocator=By.className("border_grey1");
		WebElement currentLocation=driver.findElement(currentLocationLocator);
		
		//selection of a optional value of the DropDown- currentLocation
		Select selectionCurrentLocation=new Select(currentLocation);
		selectionCurrentLocation.selectByIndex(3);//index of the DropDowm Starts with 0
		//should be given with an argument of type string
		//select by value - should be provided with property attribute
		//value number - given by developer
		selectionCurrentLocation.selectByValue("492");
		//should be given with the name of the visible Text of the DropDown
		selectionCurrentLocation.selectByVisibleText("Delhi");
		
		//Automating Industry DropDown
		//id="id_industry"
		By industryLocator=By.id("id_industry");
		WebElement industry=driver.findElement(industryLocator);
		Select selectionIndustry=new Select(industry);
		selectionIndustry.selectByIndex(1);
		selectionIndustry.selectByValue("4");
		selectionIndustry.selectByVisibleText("Banking/Accounting/Financial Services");
		
		//DeSelection of Selected optional value of the DropDown-industry
		//selectionIndustry.deselectAll();//used to deSelect all the selected optional values
		selectionIndustry.deselectByVisibleText("Other");
		selectionIndustry.deselectByIndex(2);
		selectionIndustry.deselectByValue("5");
		driver.quit();
	}

}

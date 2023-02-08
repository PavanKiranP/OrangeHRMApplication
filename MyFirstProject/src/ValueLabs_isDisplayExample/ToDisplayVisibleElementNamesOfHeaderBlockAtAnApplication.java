package ValueLabs_isDisplayExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDisplayVisibleElementNamesOfHeaderBlockAtAnApplication {

	public static void main(String[] args) {
	
		
		String ApplicationUrlAddress="https://www.valuelabs.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Identifying the Header Block
		//id="navbarSupportedContent"
		By headerBlockLocator=By.id("navbarSupportedContent");
		WebElement headerBlock=driver.findElement(headerBlockLocator);
		//finding the header Block Elements
		//the elements are of type links - using anchorTag-a
		By headerBlockLinksLocator = By.tagName("a");
		List<WebElement>headerBlockLinks=headerBlock.findElements(headerBlockLinksLocator);
		int headerBlockLinksCount=headerBlockLinks.size();
		System.out.println("The number of links on the Header Block are :-"+headerBlockLinksCount);
		for(int index=0;index<headerBlockLinks.size();index++)
		{
			//getting the visible elements of the Header Block
			if(headerBlockLinks.get(index).isDisplayed())
			{
				String headerBlockLinksName=headerBlockLinks.get(index).getText();
				System.out.println(index+" "+headerBlockLinksName);
			}
		}
		driver.quit();
	}

}

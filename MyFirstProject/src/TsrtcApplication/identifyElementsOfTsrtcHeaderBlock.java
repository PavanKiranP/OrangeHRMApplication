package TsrtcApplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class identifyElementsOfTsrtcHeaderBlock {

	public static void main(String[] args) {
		
		String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Identifying the Header Block
		//class="menu-wrap"
		By tsrtcHeaderBlockLocater=By.className("menu-wrap");
		WebElement headerBlock=driver.findElement(tsrtcHeaderBlockLocater);
		
		//the elements of the headerblock are of type links-Using common propert tagName-'a'
		By headerBlockLinksLocator=By.tagName("a");
		
		//going to the Header Block and finding the elements of the Header Block
		List<WebElement>HeaderBlockLinks=headerBlock.findElements(headerBlockLinksLocator);
		
		//finding the size of the ArrayList	
		int headerBlockLinksCount=HeaderBlockLinks.size();
		System.out.println("The number of links in the Header Block of TSRTC Application are :- "+headerBlockLinksCount);
		
		//getting the elements names of Header Block
		for(int index=0;index<headerBlockLinksCount;index++)
		{
			String headerBlockLinkName=HeaderBlockLinks.get(index).getText();
			System.out.println(index+" "+headerBlockLinkName);
		}
		driver.quit();

	}

}

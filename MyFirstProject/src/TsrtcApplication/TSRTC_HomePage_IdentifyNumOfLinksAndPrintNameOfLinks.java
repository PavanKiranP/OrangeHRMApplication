package TsrtcApplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_IdentifyNumOfLinksAndPrintNameOfLinks {

	public static void main(String[] args) {
		
		String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		//<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		//When working with Similar type of Elements on the Applications - Then in the inspected properties - We should check for
		//a common property existing among all the Elements
		//When working on Links of the WebPage - The common property that can be considered is tag 'a' - using the 
		//tag finding all the Elements of the WebPage
		
		By linkTagLocator=By.tagName("a");
		
		//Since multiple elements are identified and assigned in to a variable - its WebElement more than
		//one element is found and assigned - its declared as list (List<WebElement>)
		List<WebElement> tsrtcHomePageLinks=driver.findElements(linkTagLocator);
		
		//finding the size of the Arraylist(tsrtcHomePageLinks)-since all the elements are saved in it
		int tsrtcHomePageLinksCount = tsrtcHomePageLinks.size();
		System.out.println("The number of Links on the TSRTC Application HomePage are :- "+tsrtcHomePageLinksCount);
		
		//To go to Array list(tsrtcHomePageLinks)and getting all the elements Names
		for(int index=0;index<tsrtcHomePageLinksCount;index++)
		{
			//going to the arraylist(tsrtcHomePage)-going to an Index-getting the text
			String tsrtcHomePageLinkNames=tsrtcHomePageLinks.get(index).getText();
			System.out.println(tsrtcHomePageLinkNames);
		}
		driver.quit();
	}

}

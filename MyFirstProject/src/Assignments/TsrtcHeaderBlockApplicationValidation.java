package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TsrtcHeaderBlockApplicationValidation {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web";
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


		       
		//Identifying the Header Block
		//class="menu-wrap"
		By tsrtcHeaderBlockLocater=By.className("menu-wrap");
		WebElement headerBlock=driver.findElement(tsrtcHeaderBlockLocater);

		//the elements of the headerblock are of type links-Using common property tagName-'a'
		By headerBlockLinksLocator=By.tagName("a");

		//going to the Header Block and finding the elements of the Header Block
		List<WebElement>headerBlockLinks=headerBlock.findElements(headerBlockLinksLocator);

		//finding the size of the ArrayList
		int headerBlockLinksCount=headerBlockLinks.size();
		System.out.println("The number of links in the Header Block of TSRTC Application are :- "+headerBlockLinksCount);

		//getting the elements names of Header Block
		for(int index=0;index<headerBlockLinksCount;index++)
		{
		String headerBlockLinkName=headerBlockLinks.get(index).getText();
		System.out.println(index+" "+headerBlockLinkName);
		String CurrentTittle=driver.getTitle();
		System.out.println("The Actual Title of Current Browser is -  "+CurrentTittle);

		//EXtracted Expected Url Adress of elements
		WebElement Elements=headerBlockLinks.get(index);
		       String ExpectedUrl=Elements.getAttribute("href");
		       System.out.println(" The Expected Url is :- "+ExpectedUrl);
		     
		       headerBlockLinks.get(index).click();
		     
		
		       File TsrtcScreenShots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(TsrtcScreenShots,new File("./TSRTCScreenshots/TSRTC"+headerBlockLinkName+".png"));

		       //Actual Url Adress Of elements
		       String ActualUrl=driver.getCurrentUrl();
		       System.out.println(" The Actual Current Url is :- "+ActualUrl);
		       

		       //Validation of URL Address

		       if (ActualUrl.contains(ExpectedUrl))
		       {
		       System.out.println("The Actual Url contains Expected UrlAddress -Pass");
		       }
		       else
		       {
		       System.out.println("The Actual Url Does NOT contains Expected Url Address -Fail");
		       }

		System.out.println();

		driver.navigate().back();//going back to previous browser

		//Re-creating the array list
		//identifying the Header Block again
		headerBlock=driver.findElement(tsrtcHeaderBlockLocater);
		//getting the header block elements again into the arraylist
		headerBlockLinks=headerBlock.findElements(headerBlockLinksLocator);
		}
		driver.quit();
		}

		}
package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Screenshot_BingHomePage {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		String ApplicationUrlAddress="http://bing.com";
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,15);
		//waiting for the signIn Element to be visible
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("id_s")));
		File bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bingScreenShot,new File("./Screenshots/bingHomePage2.png"));
	
	}

}
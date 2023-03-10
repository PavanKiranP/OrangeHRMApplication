package DragAndDropOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) 
	{
		
		String ApplicationUrl="https://jqueryui.com/droppable/";
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "./BrowserDriverFiles/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(ApplicationUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement WebPageFrame=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(WebPageFrame);
		
		WebElement DragMeToMyTarget=driver.findElement(By.id("draggable"));
		
		WebElement DropHere=driver.findElement(By.id("droppable"));
		
		Actions Action=new Actions(driver);
		Action.dragAndDrop(DragMeToMyTarget, DropHere).build().perform();
		
		driver.quit();
		
	}
}

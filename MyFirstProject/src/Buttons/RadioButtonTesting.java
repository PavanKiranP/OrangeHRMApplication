package Buttons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtonTesting 
{
	public static void main(String[] args)
	{
		
		String ApplicationUrl="https://echoecho.com/htmlforms10.htm";
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "./BrowserDriverFiles/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(ApplicationUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		By group1RadioButtonsL=By.name("group1");
		List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonsL);
		int group1RadioButtonsCount=group1RadioButtons.size();
		System.out.println("The No.Of RadioButton: "+group1RadioButtonsCount);
		for(int index=0;index<group1RadioButtonsCount;index++)
		{
			
			group1RadioButtons.get(index).click();
			for(int indexStatus=0;indexStatus<group1RadioButtonsCount;indexStatus++)
			{
				
			
				String radioButtonName=group1RadioButtons.get(indexStatus).getAttribute("value");
				String radioButtonStatus=group1RadioButtons.get(indexStatus).getAttribute("checked");
				System.out.println(index+" - "+radioButtonName+"  - "+radioButtonStatus);
			
			}
		}
		
		//driver.quit();
	}
}

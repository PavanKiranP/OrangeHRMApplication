package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println("*** Gmail Application launch Successfully ***");
	}
	
	@Test(priority=1)
	public void gmailInBoxTest()
	{
		System.out.println("InBox functionality Test Successful");
	}
	
	@Test(priority=2)
	public void gmailComposeMailTest()
	{
	System.out.println("Compose Mail functionality Test Successful");
	}
	
	@Test(enabled = false)
	public void gmailSentMailTest()
	{
	System.out.println("Sent Mail functionality Test successful");
	}
	
	@AfterTest
	public void gmailApplicationClose()
	{
	System.out.println("*** Gmail Application Closed Successfully ***");
	}

}

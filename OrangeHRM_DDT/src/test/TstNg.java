package test;

import org.testng.annotations.Test;

public class TstNg {

	@Test(priority=1)
	public void gmailApplicationLaunch()
	{
		System.out.println("*** Gmail Application launch Successfully ***");
	}
	
	@Test(priority=2)
	public void gmailInBoxTest()
	{
		System.out.println("InBox functionality Test Successful");
	}
	
	@Test(priority=3)
	public void gmailComposeMailTest()
	{
	System.out.println("Compose Mail functionality Test Successful");
	}
	
	@Test(enabled =  false)
	public void gmailSentMailTest()
	{
	System.out.println("Sent Mail functionality Test successful");
	}
	
	@Test(priority=5)
	public void gmailApplicationClose()
	{
	System.out.println("*** Gmail Application Closed Successfully ***");
	}

}


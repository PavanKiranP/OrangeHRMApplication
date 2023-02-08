package TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	
	//@Test - indicates its a TestCase
	//any functionality which is under test should be always be written with in the annotation of 
	//TestNG @test - implementing it with user defined methods
	//The default status of a TestCase is enable = true
	//The TestCases will be executed base on Alphabetical order of given test case names
	//if any Test case is starting with UpperCase letter - then that test case will be executing first
	//if there are multiple test cases - the test cases should be set with priority
	
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

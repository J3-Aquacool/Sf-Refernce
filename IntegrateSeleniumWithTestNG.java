package com.testngdemo.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

public class IntegrateSeleniumWithTestNG {
  
	
	
	WebDriver driver;

	
	@BeforeClass
	public void setUpTests()
	{
		
		driver=new ChromeDriver();
	}
	
	
	
	@Test
	public void browserLoadingTest()
	{
	
		ExtentReports extent = new ExtentReports();
		
		
		
		
		driver.get("http://localhost:5173/");
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	extent.createTest("browserLoadingtest")
	  .log(Status.PASS, "Browser is loading has expected");
	extent.flush();// Thios method is important so that you can write ui to file
	
		
	}
	
	@Test
	public void cleanUp()
	{
		driver.quit();
	}
	
}

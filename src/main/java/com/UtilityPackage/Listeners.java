package com.UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.saucedemo.testclasses.BaseClass;
import com.saucedemo.testclasses.TC01New;

public class Listeners implements ITestListener
{
	WebDriver driver;
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test case has successfully passed");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case has failed");
//		    Date d = new Date();
//		    DateFormat d1 = new SimpleDateFormat("YY-mm-dd & HH-mm-ss");
//		    String date = d1.format(d);
//		    
		this.driver =((TC01New)result.getInstance()).driver;
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  File Dest = new File("./screenshot/saucedemo.jpg");
		  try {
			FileHandler.copy(source, Dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
         //this.driver = ((SampleClass1)result.getInstance()).driver;
	 
		  
		  
		  
		  
		  
		  
	System.out.println("test cas is failed");
	}
	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Testing has been start");
	}
	
	
public void onTestSkip(ITestResult result)
{
	System.out.println("test case has skipped");
}
}

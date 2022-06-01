package com.saucedemo.testclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.UtilityPackage.AllCommon;
import com.saucedemo.pomclasses.Loginpagepomclass;
import com.saucedemo.pomclasses.NewHomePagePOMClass;

public class TC04ClickOnMultiplaProducts extends  BaseClass 
{
@Test(priority=3)
	public void multipleproduct() throws IOException, InterruptedException
	{
	NewHomePagePOMClass multiprod = new NewHomePagePOMClass(driver);
	multiprod.multipleclickaddtocart();
	multiprod.getTextFromCartButton();
	String Expected="6";
	String actual = multiprod.getTextFromCartButton();
	System.out.println(actual);
	if(Expected.equals(actual))
	{
		System.out.println("test case is pass");
	}
	else
	{
		System.out.println("test case is fail");
	}
	
	 AllCommon screen = new  AllCommon(driver);
	 screen.screenshot();
	 System.out.println("multiproduct");

	}

	
	
	
	
	
	
	
	
}

package com.saucedemo.testclassesnew;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.UtilityPackage.AllCommon;
import com.saucedemo.pomclassesnew.Loginpagepomclass;
import com.saucedemo.pomclassesnew.NewHomePagePOMClass;

public class TC04ClickOnMultiplaProductsPractice extends  BaseClass 
{
@Test
	public void multipleproduct() throws IOException, InterruptedException
	{
	NewHomePagePOMClass multiprod = new NewHomePagePOMClass(driver);
	multiprod.multipleclickaddtocart();
	multiprod.getTextFromCartButton();
	String Expected="6";
	String actual = multiprod.getTextFromCartButton();
	System.out.println(actual);
	Assert.assertEquals(actual, Expected, "Test case is passed for multple product");
	 AllCommon screen = new  AllCommon(driver);
	 screen.screenshot();
	 System.out.println("multiproduct");

	}

	
	
	
	
	
	
	
	
}

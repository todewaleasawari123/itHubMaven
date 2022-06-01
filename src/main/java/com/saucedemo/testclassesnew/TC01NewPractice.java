package com.saucedemo.testclassesnew;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.UtilityPackage.AllCommon;
import com.saucedemo.pomclassesnew.Loginpagepomclass;
import com.saucedemo.pomclassesnew.NewHomePagePOMClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC01NewPractice extends BaseClass
{
	  
		 @Test(priority=3)
		 public void loginFunctionalitytest() {
		  
			String Expected = "  Swag Labs";
			String Actual = driver.getTitle();
			System.out.println("login");
			Assert.assertEquals(Expected, Actual, "Test case is pass");
			
			
		 }
		 @Test(priority=0,dependsOnMethods= {"loginFunctionalitytest"})
			public void filterfunctionlity() throws IOException, InterruptedException
			{
		NewHomePagePOMClass filter = new NewHomePagePOMClass(driver);
		filter.clickfilter();
		String Expected ="PRICE (LOW TO HIGH)";
		String actual = filter.selectedfilter();

		 SoftAssert soft  = new  SoftAssert();
		 soft.assertEquals(actual, Expected , "test case is pass for filter");
		soft.assertAll();

		AllCommon ss = new AllCommon(driver);
		ss.screenshot();
			}
		 @Test(priority=2)

		 public void clicksingleproduct() throws IOException, InterruptedException
		 {
		 NewHomePagePOMClass oneproduct = new NewHomePagePOMClass(driver);
		 Thread.sleep(20);
		 oneproduct.singleclickaddtocart();
		 Thread.sleep(20);
		 oneproduct.getTextFromCartButton();
		 String Expected="1";
		 String actual = oneproduct.getTextFromCartButton();
		 System.out.println(actual);
		 Assert.assertEquals(actual, Expected,"Test case is passed for 1product");
		 }
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
	
		


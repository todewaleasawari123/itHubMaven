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

public class TC03toclick1product extends BaseClass
{
 @Test(priority =4 , invocationCount =4)

public void clicksingleproduct() throws IOException, InterruptedException
{
NewHomePagePOMClass oneproduct = new NewHomePagePOMClass(driver);
Thread.sleep(20);
oneproduct.singleclickaddtocart();
Thread.sleep(20);
//oneproduct.getTextFromCartButton();
//String Expected="1";
//String actual = oneproduct.getTextFromCartButton();
//System.out.println(actual);
//if(Expected.equals(actual))
//{
//	System.out.println("test case is pass");
//}
//else
//{
//	System.out.println("test case is fail");
//}
//AllCommon ss = new AllCommon(driver);
//ss.screenshot();
//
//System.out.println("oneproduct aplied ");
}}

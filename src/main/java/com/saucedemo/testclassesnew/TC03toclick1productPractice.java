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

public class TC03toclick1productPractice extends BaseClass
{
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
}}

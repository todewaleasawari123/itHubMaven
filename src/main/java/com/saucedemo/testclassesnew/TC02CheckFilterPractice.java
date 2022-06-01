package com.saucedemo.testclassesnew;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.UtilityPackage.AllCommon;
import com.saucedemo.pomclassesnew.Loginpagepomclass;
import com.saucedemo.pomclassesnew.NewHomePagePOMClass;

public class TC02CheckFilterPractice extends BaseClass 
{
	/// dependsOnMethods= {"loginFunctionalitytest"}
	@Test(priority=0)
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


	

}}

package com.saucedemo.testclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.UtilityPackage.AllCommon;
import com.saucedemo.pomclasses.Loginpagepomclass;
import com.saucedemo.pomclasses.NewHomePagePOMClass;

public class TC02CheckFilter extends BaseClass 
{
	// dependsOnMethods= {"loginFunctionalitytest"}
	@Test(priority=1,dependsOnMethods= {"loginFunctionalitytest"})
	public void filterfunctionlity() throws IOException, InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//driver.get("https://www.saucedemo.com/");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//Loginpagepomclass login =new Loginpagepomclass(driver);
//login.usename();
//login.password();
//login.loginbutton();

NewHomePagePOMClass filter = new NewHomePagePOMClass(driver);
filter.clickfilter();
String Expected ="Price (low to high)";
String actual = filter.selectedfilter();
System.out.println(actual);
Assert.assertEquals(actual, Expected, " **Test case pass for filter");


AllCommon ss = new AllCommon(driver);
ss.screenshot();


	

}}

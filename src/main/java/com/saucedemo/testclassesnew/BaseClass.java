package com.saucedemo.testclassesnew;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.saucedemo.pomclassesnew.Loginpagepomclass;
import com.saucedemo.pomclassesnew.NewHomePagePOMClass;

public class BaseClass 
{
	WebDriver driver;
    // @Parameters("browsername")
	@BeforeClass
	public void setup() throws InterruptedException
	{
//	if(browsername.equals("chrome"))
//	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver newwww\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
driver.get("https://www.saucedemo.com/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
//	else
//	{
//		System.setProperty("webdriver.gecko.driver","C:\\firefox driver\\geckodriver-v0.31.0-win32\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//        driver.get("https://www.saucedemo.com/");
//        Thread.sleep(1000);
//         driver.manage().window().maximize();
//		}
	//}
	
@BeforeMethod
public void login() {
Loginpagepomclass login =new Loginpagepomclass(driver);
login.usename();
login.password();
login.loginbutton();
	}
	
	@AfterMethod
	public void logout()
	{
	NewHomePagePOMClass multiprod = new NewHomePagePOMClass(driver);
multiprod.menubutton();
	multiprod.clickonlogout();
	}
	
@AfterClass
	public void teardown()
	{
		driver.close();
	}

	@AfterTest
	public void garbagecollection() throws Throwable
	{
		finalize();
	}
	
	
	
}

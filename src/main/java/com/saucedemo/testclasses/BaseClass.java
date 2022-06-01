package com.saucedemo.testclasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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

import com.saucedemo.pomclasses.Loginpagepomclass;
import com.saucedemo.pomclasses.NewHomePagePOMClass;

public class BaseClass 
{
	public WebDriver driver;
	//Logger log;
	  Logger  log = Logger.getLogger("SauceDemo12");
    @Parameters("browsername")
	@BeforeClass
	public void setup(String browsername ) throws InterruptedException
	{
	if(browsername.equals("chrome"))
	{	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 driver = new ChromeDriver();
	 PropertyConfigurator.configure("log4j.properties");
	 
	 log.info("Browser open");
	 
	 
	 
	 
		 driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
driver.get("https://www.saucedemo.com/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	else
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
         driver.manage().window().maximize();
         
         
       

			

		}
	}
	
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

package com.saucedemo.testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.UtilityPackage.AllCommon;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;


import com.saucedemo.pomclasses.Loginpagepomclass;
import com.saucedemo.pomclasses.NewHomePagePOMClass;

@Listeners(com.UtilityPackage.Listeners.class)

public class TC01New extends BaseClass
{
	
	@Test(priority=2)
		 public void loginFunctionalitytest() {
		  
			String Expected = "Swag Labs";
			String Actual = " Labs";
			System.out.println("login");
			
			
			
			
 Assert.assertEquals(Expected,Actual  , "**TTest case has passed");

log.info("login done");



}}	
		


package com.UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class AllCommon 

{
	 static WebDriver driver; 
		public  void screenshot() throws IOException, InterruptedException
		{

	Thread.sleep(2000);
	
	Date d = new Date();
	DateFormat d1 = new SimpleDateFormat("YY-mm-dd & HH-mm-ss");
	String date = d1.format(d);
	
	TakesScreenshot ts =(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/saucedemo"+ date +".jpg");
	FileHandler.copy(source, dest);
}
		public AllCommon(WebDriver driver )
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		
}

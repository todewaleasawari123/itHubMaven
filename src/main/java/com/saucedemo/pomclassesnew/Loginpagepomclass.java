package com.saucedemo.pomclassesnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagepomclass 
{
 private WebDriver driver;
 
 
	 @FindBy(id="user-name")
	 private WebElement username;
	 
	 public void usename()
	 {
		 username.sendKeys("standard_user"); 
     }
	 
	 @FindBy(id="password")
	 private WebElement password;

	 public void password()
	 {
		 password.sendKeys("secret_sauce"); 
     }
	 
	 @FindBy(id="login-button")
	 private WebElement loginbutton;
	 public void loginbutton()
	 {
		 loginbutton.click(); 
     }
 
	  public Loginpagepomclass(WebDriver driver)
	  {
		  this.driver=driver;
		  
		  //PageFactory.initElements(driver, this);
		  PageFactory.initElements(driver,this);
	  }
	 
	 
	 
	 
	 
}

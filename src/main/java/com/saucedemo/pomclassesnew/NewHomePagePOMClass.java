package com.saucedemo.pomclassesnew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewHomePagePOMClass 
{
	private WebDriver driver;
	
	
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filter;
	
	public void clickfilter()
	{
		filter.click();
		Select s = new Select(filter);
		s.selectByIndex(2);
		
	}
	@FindBy(xpath= "//span[@class='active_option']")
	private WebElement options;
	
	public String selectedfilter()
	{
		String filter1 = options.getText();
		return filter1;
	}
	
	
	
	@FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")
	private WebElement addtocartcart;
	
	public void singleclickaddtocart()
	{
		addtocartcart.click();
		
	}
	

	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> multipleaddtocartcart;
	
	public void multipleclickaddtocart()
	{
		
		for (WebElement prod : multipleaddtocartcart )
		{
			prod.click();
		}
		
		
		
		
		
//		for(int i =0;i<multipleaddtocartcart.size();i++)
//		{
//		multipleaddtocartcart.get(i).click();
		
	//}
	}
	
	
	
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menu;
	
	public void menubutton()
	{
		Actions act = new Actions(driver);
		act.click(menu).perform();
		
	}
	
	

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public void clickonlogout()
	{
		logout.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cart;
	
	public void clickcart()
	{
		cart.click();
		
	}
	public String getTextFromCartButton()
	{
		String totalProducts = cart.getText();
		return totalProducts;
		
	}

	
	
	
	
	
	
	
	public NewHomePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

}

package com.saucedemo.pomclasses;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage 
{
@FindBy(xpath="//button[text()='Remove']")
private List<WebElement>remove;
public void remove()
{
	int size =remove.size();
	System.out.println(size);
}
@FindBy(xpath="//button[text()='Checkout']")
private WebElement Checkout;

public void Checkout()
{
	Checkout.click();
}

@FindBy(xpath="//button[text()='Continue Shopping']")
private WebElement ContinueShopping;

public void ContinueShopping()
{
	ContinueShopping.click();
}












}

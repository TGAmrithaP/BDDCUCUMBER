package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author TG1690
 *
 */
public class BuyNow 
{
	WebDriver driver;
	public BuyNow(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@id='buy-now-button']")
	private WebElement clickOnBuyNow;
	
	@FindBy(xpath="//a[text()='enter a new delivery address']")
	private WebElement clickonAddAddress;
	
	public WebElement getClickonAddAddress() {
		return clickonAddAddress;
	}

	public WebElement getClickOnBuyNow() {
		return clickOnBuyNow;
	}
}
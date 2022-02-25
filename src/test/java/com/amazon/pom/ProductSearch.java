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
public class ProductSearch 
{
	WebDriver driver;
	public ProductSearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="twotabsearchtextbox")
	private WebElement Searchproduct;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement clickonproduct;
	
	
	@FindBy(linkText = "Apple iPhone 12 (64GB) - Green")
	private WebElement product;
	
	public WebElement getProduct() {
		return product;
	}

	public WebElement getClickonproduct() {
		return clickonproduct;
	}

	public WebElement getSearchproduct() {
		return Searchproduct;
	}
}
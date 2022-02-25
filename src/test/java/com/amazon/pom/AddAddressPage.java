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
public class AddAddressPage 
{
	WebDriver driver;
	public AddAddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="address-ui-widgets-enterAddressFullName")
	private WebElement clickOnFullName;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	private WebElement clickOnPhoneNo;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	private WebElement clickOnPostalAddress;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	private WebElement clickAddAddress;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	private WebElement ClickAddAddressLine2;
	
	@FindBy(id="address-ui-widgets-landmark")
	private WebElement ClickOnLandmark;
	
	@FindBy(xpath="(//a[@class='a-declarative a-button-text '])[1]")
	private WebElement clickOnBuyButton;
	
	public WebElement getClickOnBuyButton() {
		return clickOnBuyButton;
	}

	public WebElement getClickOnLandmark() {
		return ClickOnLandmark;
	}

	public WebElement getClickAddAddressLine2() {
		return ClickAddAddressLine2;
	}

	public WebElement getClickAddAddress() {
		return clickAddAddress;
	}

	public WebElement getClickOnPostalAddress() {
		return clickOnPostalAddress;
	}

	public WebElement getClickOnPhoneNo() {
		return clickOnPhoneNo;
	}

	public WebElement getClickOnFullName() {
		return clickOnFullName;
	}
}
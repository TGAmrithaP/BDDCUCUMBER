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
public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="ap_email")
	private WebElement UserEmail;
	
	@FindBy(id="continue")
	private WebElement ClickonContinue;
	
	@FindBy(id="ap_password")
	private WebElement UserPassword;
	
	@FindBy(id="signInSubmit")
	private WebElement clickonSumbit;
	
	
	@FindBy(xpath="//h2[text()='Top picks for you']")
	private WebElement homepagetxt;
	
	public WebElement getHomepagetxt() {
		return homepagetxt;
	}
	public WebElement getClickonSumbit() {
		return clickonSumbit;
	}
	public WebElement getUserPassword() {
		return UserPassword;
	}
	public WebElement getClickonContinue() {
		return ClickonContinue;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUserEmail() {
		return UserEmail;
	}
}
	
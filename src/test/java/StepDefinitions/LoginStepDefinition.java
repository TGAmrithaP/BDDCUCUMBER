package StepDefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.pom.AddAddressPage;
import com.amazon.pom.BuyNow;
import com.amazon.pom.LoginPage;
import com.amazon.pom.ProductSearch;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	public LoginPage lp;
	public ProductSearch sp;
	public BuyNow bn;
	public AddAddressPage aa;

	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "../BDDCU/Drivers/chromedriver.exe");
	}

	@Given("^The brower is launched$")
	public void the_brower_is_launched() {
		driver = new ChromeDriver();

	}

	@Given("^The Apllication is loaded$")
	public void The_apllication_is_loaded() {
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
		sp=new ProductSearch(driver);
		bn=new BuyNow(driver);
		aa=new AddAddressPage(driver);

	}

	@When("^The user Enters the valid user name$")
	public void The_user_enters_the_valid_user_name() throws Throwable {
		lp.getUserEmail().sendKeys("kanuparthichandrasekharreddy7@gmail.com");
		Thread.sleep(4000);
	}

	@When("The user click on continue button")
	public void the_user_click_on_continue_button() throws InterruptedException {
		lp.getClickonContinue().click();
		Thread.sleep(4000);
	}

	@When("^The user Enter the valid password$")
	public void The_user_enter_the_valid_password() throws InterruptedException {
		lp.getUserPassword().sendKeys("9966051900");
	}

	@When("^The user Click on Login button$")
	public void The_user_click_on_login_button() {
		lp.getClickonSumbit().click();

	}

	@Then("^Dashbord will Display$")
	public void Dashbord_will_display() throws InterruptedException {
		String HomePage = lp.getHomepagetxt().getText();
		System.out.println("Welcome to home page :" + HomePage);
	}

	@When("user search the product")
	public void user_search_the_product() throws InterruptedException {
		sp.getSearchproduct().sendKeys("iphone");
		Thread.sleep(4000);
		sp.getClickonproduct().click();
	}

	@When("select a product to purchess")
	public void select_a_product_to_purchess() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,3000)");
		sp.getProduct().click();
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println("child window id:" + childWindow);
		Thread.sleep(4000);
	}

	@When("add the product into cart")
	public void add_the_product_into_cart() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachHandle : allWindows) {
			if (!eachHandle.equals(parentWindow)) {
				driver.switchTo().window(eachHandle);
			}
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		bn.getClickOnBuyNow().click();
		bn.getClickonAddAddress().click();

	}

	@When("add address to delivery the iphone")
	public void add_address_to_delivery_the_iphone() throws InterruptedException {
		aa.getClickOnFullName().sendKeys("JuniorQaEngineer");
		Thread.sleep(3000);
		aa.getClickOnPhoneNo().sendKeys("123456789");
		Thread.sleep(3000);
		aa.getClickOnPostalAddress().clear();
		Thread.sleep(3000);
		aa.getClickOnPostalAddress().sendKeys("560059");
		Thread.sleep(3000);
		aa.getClickAddAddress().sendKeys("Truglobal");
		Thread.sleep(3000);
		aa.getClickAddAddressLine2().sendKeys("Trinity metro");
		Thread.sleep(3000);
		aa.getClickOnLandmark().sendKeys("Trinity Circle");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500)");
		jse.executeScript("window.scrollBy(1500,0)");
		aa.getClickOnBuyButton().click();

	}
}

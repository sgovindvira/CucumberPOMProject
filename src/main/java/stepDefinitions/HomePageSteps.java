package stepDefinitions;

import org.junit.Assert;

import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.TestBase;
import utility.TestUtil;

public class HomePageSteps extends TestBase{
	
	//Created Sanjay

	LoginPage lp;
	HomePage homePage;
	CheckoutPage cp;	


	@Given("^user opens browser$")
	public void user_opens_browser() {
		initialization();

	}




	@Then("^verify the loginpage title$")
	public void verify_the_loginpage_title() {
		lp= new LoginPage();
		lp.title();

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		homePage = lp.loign(prop.getProperty("username1"), prop.getProperty("password2"));

	}


	@Then("^verify cart button is displayed$")
	public void verify_cart_button_is_displayed() {
		boolean cart=	homePage.validateCartButton();
		Assert.assertTrue(cart);

	}

	@Then("^verify option button is displayed$")
	public void verify_option_button_is_displayed() {
		boolean option=	homePage.validateoptionButton();
		Assert.assertTrue(option);


	}


	@Then("^Add Sauce Lab Bike Light to cart$")
	public void add_Sauce_Lab_Bike_Light_to_cart() {

		homePage.addtoCart();
	}

	@Then("^click on cart icon$")
	public void click_on_cart_icon() {

		cp = homePage.cartclick();
	}

	@Then("^click on checkout$")
	public void click_on_checkout() {
		cp.clickCheckout();
	}

	@Then("^enter shipping info$")
	public void enter_shipping_info() {
		cp.shippinginfo(TestUtil.FirtNameSP, TestUtil.LastNameSP, TestUtil.ZIPCODE);
	}




	@Then("^click on finish$")
	public void click_on_finish() {
		cp.clickFinish();
	}

	@Then("^verify Thank you for oder message$")
	public void verify_Thank_you_for_oder_message() {
		boolean Thankyou = cp.verifyThankyou();
		Assert.assertTrue(Thankyou);
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}







}

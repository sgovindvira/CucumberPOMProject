package Pages;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestBase;

public class HomePage extends TestBase {
	
	
	
	@FindBy(id ="react-burger-menu-btn")
	WebElement optionBtnn;
	
	@FindBy(xpath ="//a[@class='shopping_cart_link']")
	WebElement cartBttn;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement BikeLightAddtoCart;
	
	
	
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean validateCartButton(){
		return cartBttn.isDisplayed();
	}
	
	
	public boolean validateoptionButton(){
		return optionBtnn.isDisplayed();
		
	}
	
	
	
	
	public void HomepagetitleVerify() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Swag Labs", title);


}
	public void addtoCart() {
		BikeLightAddtoCart.click();
		
	}
	
	public CheckoutPage  cartclick() {
		cartBttn.click();
		return new CheckoutPage();
	}
	
}
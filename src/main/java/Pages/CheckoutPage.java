package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestBase;

public class CheckoutPage extends TestBase {



	@FindBy(id ="checkout")
	WebElement checkoutBttn;

	@FindBy(id ="first-name")
	WebElement shippingFirstName;

	@FindBy(id= "last-name")
	WebElement shippingLasttName;

	@FindBy(id="postal-code")
	WebElement shippingZipcode;
	
	@FindBy(id="continue")
	WebElement continueBttn;

	@FindBy(xpath="//div[@class='summary_info']/div[2]")
	WebElement paymentInfotext;

	@FindBy(id="finish")
	WebElement finishBttn;
	
	@FindBy(xpath="//h2[@class='complete-header']")
	WebElement thankyouMessage;

	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}




	public void clickCheckout() {
		checkoutBttn.click();
	}
	
	public void shippinginfo(String fname, String lname, String zp) {
		shippingFirstName.sendKeys(fname);
		shippingLasttName.sendKeys(lname);
		shippingZipcode.sendKeys(zp);
		continueBttn.click();
		
		
	}
	
	


	
	public void clickFinish() {
		finishBttn.click();
		
	}
	
	public boolean verifyThankyou() {
	return	thankyouMessage.isDisplayed();
	
	}
	
	
}


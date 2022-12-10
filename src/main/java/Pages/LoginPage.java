package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestBase;

public class LoginPage extends TestBase{

	@FindBy(id ="user-name")
	WebElement username;

	@FindBy(id="password")
	WebElement  password;

	@FindBy(id ="login-button")
	WebElement loginBttn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void title() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Swag Labs", title);

	}

	public HomePage loign(String urname, String pasrd) {
		username.sendKeys(urname);
		password.sendKeys(pasrd);
		loginBttn.click();
		return new HomePage();
		
	}
	
	public void lockeduserLogin() {
		username.sendKeys("locked_out_user");
		password.sendKeys("secret_sauce");
		loginBttn.click();
		
	}




}
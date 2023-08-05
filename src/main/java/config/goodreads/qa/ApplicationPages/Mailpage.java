package config.goodreads.qa.ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mailpage {
	public WebDriver driver;

	public Mailpage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}

	

	@FindBy(xpath = "//input[@type=\"email\"]")
	WebElement Emailtextfield;

	@FindBy(id = "ap_password")
	WebElement passwordtextfield;



	@FindBy(id = "signInSubmit")
	WebElement clickonSigninbutton;


	public void EnetertheEmailtextfield(String username) {
		Emailtextfield.sendKeys(username);
	}

	public void Enterthepasswordtextfield(String password) {
		passwordtextfield.sendKeys(password);
	}

	

	public void clickonsigninbtn() {
		clickonSigninbutton.click();
	}

}

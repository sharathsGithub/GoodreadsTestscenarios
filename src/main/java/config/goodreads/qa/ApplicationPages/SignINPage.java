package config.goodreads.qa.ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignINPage {


	public WebDriver driver;

	public SignINPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="(//div[@id=\"choices\"]//button)[5]")
	WebElement signlnk;
	public void Signlink()
	{
		signlnk.click();
	}
	
	
	
}

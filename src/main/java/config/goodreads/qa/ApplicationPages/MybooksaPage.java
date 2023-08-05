package config.goodreads.qa.ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MybooksaPage {
	public WebDriver driver;

	public MybooksaPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//img[@title=\"Remove from my books\"]")
	WebElement removecrossmark;
	
	@FindBy(xpath="//a[contains(@class,'dropdown__trigger')]//img[@class=\"circularIcon circularIcon--border\"]")
    WebElement accountbutton;
	
	
	@FindBy(xpath="//div[contains(@class,'siteHeader__subNav')]//a[text()='Sign out']")
	WebElement signbtn;
	
	public void Removethebook() throws InterruptedException
	{
		 driver.navigate().refresh();
          removecrossmark.click();
          Thread.sleep(5000);
          driver.switchTo().alert().accept();
	}
	
	public void Accntbtn()
	{
		accountbutton.click();
	}
	public void Signoutbutn()
	{
		signbtn.click();
	}

}

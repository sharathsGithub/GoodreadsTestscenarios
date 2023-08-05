package config.goodreads.qa.ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchelementPage {

	public WebDriver driver;

	public SearchelementPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//div[@id=\"1_book_1114453\"]//button[@class=\"wtrToRead\"]")
	WebElement particularbook;
	
	
	
	@FindBy(xpath="(//li[@class=\"siteHeader__topLevelItem\"])[1]")
	WebElement mybktxt;
	public void Markasreadoption()
	{
		particularbook.click();
		
	}
public void MyBooKbutton()
{
mybktxt.click();
}
}

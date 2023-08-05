package config.goodreads.qa.ApplicationPages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class goodreadsPage {

	WebDriver driver;
public 	goodreadsPage(WebDriver d)

{
driver=d;	
PageFactory.initElements(driver, this);

}

@FindBy(xpath="//div[@class=\"siteHeader__contents\"]//input[@name=\"q\"]")
WebElement eneterthetextfields;



//@FindBy(xpath="//div[@class=\"siteHeader__contents\"]//button[@aria-label=\"Search\"]")
//WebElement eneterthetextfield;

public void clcksearchtxtfield()
{
eneterthetextfields.sendKeys("lonewolf");	
Actions act=new Actions(driver);
act.sendKeys(Keys.ENTER).perform();
}
	

}

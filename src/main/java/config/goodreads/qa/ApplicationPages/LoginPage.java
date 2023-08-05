package config.goodreads.qa.ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 public WebDriver driver;

 public LoginPage(WebDriver d)
{
	driver=d;
	PageFactory.initElements(driver, this);
	
	}

@FindBy(xpath="//a[text()='Sign In']") 
WebElement SigninmaiLbutton;


public void Clickonsigninlink()
{
SigninmaiLbutton.click();	
}



}

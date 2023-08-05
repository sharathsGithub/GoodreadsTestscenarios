package com.goodreads.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.goodreads.qa.BASE.baseclass;

import config.goodreads.qa.ApplicationPages.LoginPage;
import config.goodreads.qa.ApplicationPages.Mailpage;
import config.goodreads.qa.ApplicationPages.MybooksaPage;
import config.goodreads.qa.ApplicationPages.SearchelementPage;
import config.goodreads.qa.ApplicationPages.SignINPage;
import config.goodreads.qa.ApplicationPages.goodreadsPage;

public class TestsecnariosonGoodreads extends baseclass {
	TestsecnariosonGoodreads() {
		super();
	}

	public WebDriver driver;
	public MybooksaPage Mkpg;
	public goodreadsPage GP;
	public SearchelementPage searchpage;
	public Mailpage Rp;
	public SignINPage Sp;

	@BeforeMethod()
	public void HomePage() {
		driver = intializeBrowserandopentheApplicationURL(prop.getProperty("browser"));
		LoginPage LP = new LoginPage(driver);
		LP.Clickonsigninlink();

	}

	@AfterMethod
	public void teardwon() {
		driver.close();
		driver.quit();
	}

	@Test(dataProvider = "logindatas")
	public void Logincredentials(String username, String password) throws InterruptedException {
		Sp = new SignINPage(driver);
		Sp.Signlink();

		Rp = new Mailpage(driver);

		Rp.EnetertheEmailtextfield(username);
		Rp.Enterthepasswordtextfield(password);

		Rp.clickonsigninbtn();

		GP = new goodreadsPage(driver);

		GP.clcksearchtxtfield();

		searchpage = new SearchelementPage(driver);
		searchpage.Markasreadoption();

		searchpage.MyBooKbutton();
		Thread.sleep(5000);
		Mkpg = new MybooksaPage(driver);

		Mkpg.Removethebook();

		Mkpg.Accntbtn();
		Mkpg.Signoutbutn();

	}

	@DataProvider(name = "logindatas")

	public Object[][] datasuplier() {
		String logindata[][] = { { "sharathdevadiga2222@gmail.com", "9606137497Sh@" } };
		return logindata;
	}

}

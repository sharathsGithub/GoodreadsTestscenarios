package com.goodreads.qa.BASE;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.goodreads.qa.Utilities.utilitiesclass;



public class baseclass {
	
 public WebDriver driver;

 public Properties prop;





public  baseclass()
{
    prop=new Properties();
	File Propfile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\config\\goodreads\\qa\\config\\config.properties");
	FileInputStream fis;
	try {
		fis = new FileInputStream(Propfile);
		prop.load(fis);
	} catch (Throwable e) {
		e.printStackTrace();
	}

}

	public WebDriver intializeBrowserandopentheApplicationURL(String browserN) {
		if (browserN.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} 
		else if (browserN.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		} else if (browserN.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(utilitiesclass.ImpLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(utilitiesclass.PAGE_WAIT_TIME));
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
}

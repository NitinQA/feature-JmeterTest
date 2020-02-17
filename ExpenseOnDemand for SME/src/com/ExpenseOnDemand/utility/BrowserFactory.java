package com.ExpenseOnDemand.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	 static WebDriver driver;
@Test

	public void chromeBrowser() { 
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		driver.manage().window().maximize();



	}
@Test
	public void firefoxBrowser() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectpath + "\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

	}
@Test
	public void ieBrowser() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", projectpath + "\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();

	}

}

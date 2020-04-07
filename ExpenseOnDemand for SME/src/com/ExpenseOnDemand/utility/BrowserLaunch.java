package com.ExpenseOnDemand.utility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserLaunch {
	static WebDriver driver;
	static String projectpath=System.getProperty("user.dir");
	@Parameters("browserName")
	@Test
	public static void launchBrowser(String browserName)
	{
		System.out.println("The Browser Name is ="+browserName);

		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.getProperty("user.dir"); System.setProperty("webdriver.gecko.driver",projectpath + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();


		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", projectpath + "\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}
}






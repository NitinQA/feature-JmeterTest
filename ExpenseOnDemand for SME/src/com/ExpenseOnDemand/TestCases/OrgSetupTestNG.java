package com.ExpenseOnDemand.TestCases;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.ExpenseOnDemand.utility.*;


public class OrgSetupTestNG {
	@BeforeClass
	public void browser() {

		BrowserFactory.chromeBrowser();
		//BrowserFactory.firefoxBrowser();
	}

	@BeforeMethod()
	public void appLaunch() {
		AppUrl.appUrl();

	}

	
	@Test()
	public void orgSet()
	{
		NewLogin.loginCredentials();
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		NewLogin.orgSet();
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void logotUser()
	{
		NewLogin.logoutApp();
	}
	@AfterClass
	public void closeBrowser()
	{
		CloseBrowser.quitBrowser();
	}
}

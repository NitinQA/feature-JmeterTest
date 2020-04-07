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


public class OrgSetup {
	@Test(priority=1)
	public void browser() {

		BrowserFactory.chromeBrowser();
		//BrowserFactory.firefoxBrowser();
	}

	@Test(priority=2)
	public void appLaunch() {
		AppUrl.appUrl();

	}



	@Test(dependsOnMethods="appLaunch")
	public void loginDataApp()
	{
		NewLogin.loginCredentials();
	}
	@Test(dependsOnMethods="loginDataApp")
	public void orgSet()
	{
		NewLogin.orgSet();
	}

}

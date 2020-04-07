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

public class TestClass{

	@BeforeClass
	public void browser() {

		BrowserFactory.chromeBrowser();

	}

	@BeforeMethod
	public void appLaunch() {
		AppUrl.appUrl();

	}



	@Test(priority=1)
	public void loginData()
	{
		NewLogin.loginCredentials();
	}
	@Test(priority=2,dependsOnMethods="loginData")
	public void logout()
	{
		NewLogin.logoutApp();
	}
	
	  @Test(priority=2) 
	  public void invalidLogin()
	  { NewFailLogin.failLogin(); }
	 

	@AfterClass
	public void quitBrowser()
	{ 
		CloseBrowser.closeBrowser(); }



}

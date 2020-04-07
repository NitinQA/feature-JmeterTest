package com.ExpenseOnDemand.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ExpenseOnDemand.utility.AppUrl;
import com.ExpenseOnDemand.utility.BrowserFactory;
import com.ExpenseOnDemand.utility.CloseBrowser;
import com.ExpenseOnDemand.utility.NewLogin;

public class setCurrencyTestNG {
	@BeforeClass
	public void browser() {

		BrowserFactory.chromeBrowser();

	}

	@BeforeMethod
	public void appLaunch() {
		AppUrl.appUrl();
	}
	/*
	 * @Test(priority=1) public void loginApp() { NewLogin.loginCredentials(); }
	 */
	
	//@Test(priority=2, dependsOnMethods="loginApp")
	@Test
	public void currencySet()
	{
		NewLogin.loginCredentials();
		SetCurrency.currencyChange();
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

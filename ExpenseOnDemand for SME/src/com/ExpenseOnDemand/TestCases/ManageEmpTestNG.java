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

public class ManageEmpTestNG {
	@BeforeClass
	public void browser() {

		BrowserFactory.chromeBrowser();

	}

	@BeforeMethod
	public void appLaunch() {
		AppUrl.appUrl();
	}
	@Test
	public void ManageEmp()
	{
		NewLogin.loginCredentials();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ManageEmployee.ManageEmp();
		/*
		 * try { Thread.sleep(12000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		ManageEmployee.inviteEmp();
		/*
		 * try { Thread.sleep(12000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
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

package com.ExpenseOnDemand.TestCases;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ExpenseOnDemand.utility.*;

public class LoginTestNG{

	
	 
	
	@BeforeClass
	public void browser() {

		BrowserFactory.chromeBrowser();

	}

	@BeforeMethod
	public void appLaunch() {
		AppUrl.appUrl();
	}
	
@Test
public void loginPage()
{
	NewLogin.loginCredentials();
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	 @AfterMethod
	 public void logoutPage()
	 {
		 NewLogin.logoutApp();
		
	 
	}
	 @AfterClass
	 
	 public void closeBrowser()
	 {
		
		 CloseBrowser.quitBrowser();
	 
	}


}

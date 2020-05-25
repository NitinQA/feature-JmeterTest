package com.ExpenseOnDemand.TestCases;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
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
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

package com.ExpenseOnDemand.TestCases;
import java.io.IOException;

import org.testng.annotations.BeforeTest;

import com.ExpenseOnDemand.utility.*;

public class LoginTestCase {

	@BeforeTest
	 
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		LoginPage readdata=new LoginPage();
		readdata.chromeBrowser();
		readdata.appUrl();
		readdata.loginCredentials();
		
	

	}

}

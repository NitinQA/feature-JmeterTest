package com.ExpenseOnDemand.TestCases;
import java.io.IOException;

import org.testng.annotations.BeforeTest;

import com.ExpenseOnDemand.utility.*;

public class LoginTestCase extends LoginPage{

	
	 
	
	public static void main(String[] args) {
		
		LoginTestCase readdata=new LoginTestCase();
		//readdata.launchBrowser("Chrome");
		readdata.appUrl();
		try {
			readdata.loginCredentials();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}

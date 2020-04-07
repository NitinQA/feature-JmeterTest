package com.ExpenseOnDemand.utility;

import org.testng.annotations.Test;

public class ProdUrl extends BrowserFactory{
@Test
	public void prodUrl()
	{
		
		driver.get("https://www.expenseondemand.com/loginregister/");

	}

	
	/*
	 * public static void main(String[] args) { ProdUrl applaunch=new ProdUrl();
	 * applaunch.chromeBrowser(); applaunch.prodUrl();
	 * 
	 * }
	 */
}

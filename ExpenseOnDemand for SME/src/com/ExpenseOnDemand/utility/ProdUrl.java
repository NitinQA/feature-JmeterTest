package com.ExpenseOnDemand.utility;

public class ProdUrl extends BrowserFactory{

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

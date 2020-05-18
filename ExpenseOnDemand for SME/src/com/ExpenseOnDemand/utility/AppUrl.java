package com.ExpenseOnDemand.utility;

public class AppUrl extends BrowserFactory{
	
	public static void appUrl()
	{
		driver.get("https://qa.expenseondemand.com/");

		//driver.get("https://newqa.soloexpenses.com/login");
		driver.manage().window().maximize();
		
	}

	
	/*
	 * public static void main(String[] args) {
	 * 
	 * AppUrl applaunch=new AppUrl(); applaunch.launchBrowser(chrome);
	 * applaunch.appUrl();
	 * 
	 * }
	 */
	 

}

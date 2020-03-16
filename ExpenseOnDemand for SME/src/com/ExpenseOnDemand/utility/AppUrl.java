package com.ExpenseOnDemand.utility;

public class AppUrl extends BrowserFactory{
	
	public static void appUrl()
	{
		driver.get("http://newqa.soloexpenses.com/");
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

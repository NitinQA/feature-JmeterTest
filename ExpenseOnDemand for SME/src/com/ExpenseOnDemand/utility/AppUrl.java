package com.ExpenseOnDemand.utility;

public class AppUrl extends BrowserFactory{
	
	public void appUrl()
	{
		driver.get("http://newdev.soloexpenses.com/");
		
		
	}

	public static void main(String[] args) {
		AppUrl applaunch=new AppUrl();
		applaunch.ieBrowser();
		applaunch.appUrl();

	}

}

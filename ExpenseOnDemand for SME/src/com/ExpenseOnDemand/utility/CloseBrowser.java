package com.ExpenseOnDemand.utility;

import org.testng.annotations.Test;

public class CloseBrowser extends BrowserFactory{
	@Test
	public static void closeBrowser()
	{
		driver.close();
	}

}

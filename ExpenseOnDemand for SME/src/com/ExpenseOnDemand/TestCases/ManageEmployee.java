package com.ExpenseOnDemand.TestCases;
import java.io.IOException;

import org.openqa.selenium.By;

import com.ExpenseOnDemand.utility.*;

public class ManageEmployee extends NewLogin{
	
	public static void ManageEmp()
	{
		driver.findElement(By.cssSelector("#\\32 ")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#place2 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//clicking on Setup Icon
	driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span > i")).click();
	
	
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	}

	public static void main(String[] args) {
		ManageEmployee manage=new ManageEmployee();
		manage.chromeBrowser();
		manage.appUrl();
		manage.loginCredentials();
		manage.ManageEmp();

	}
	


}

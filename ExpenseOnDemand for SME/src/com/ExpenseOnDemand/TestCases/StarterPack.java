package com.ExpenseOnDemand.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;



public  class StarterPack extends PurchaseFunction{

	public static void startPack()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(), 'Pricing')]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Click to View Starter Pack')]")).click();
		driver.findElement(By.xpath("//b[contains(text(), ' Purchase Now')]")).click();
		driver.findElement(By.xpath("//b[contains(text(), 'Continue')]")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarterPack sp=new StarterPack();
		sp.chromeBrowser();
		sp.appUrl();
		sp.RegiApp();
		sp.purchaseFunction();
		sp.startPack();

	}

}

package com.ExpenseOnDemand.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ExpenseOnDemand.utility.AppUrl;

public class PreApproval extends AppUrl{
	
	public static void enablePre()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//clk on Orhanisation
		
		driver.findElement(By.xpath("//a[contains(text(), ' Your Organisation')]")).click();
		
		//clk on view on pre approval
		
		driver.findElement(By.cssSelector("#place1 > div:nth-child(2) > div > div > div:nth-child(4) > div > div.card-button > button")).click();
		
		//clk on setup
		
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click on toggle button
		
		
		/*
		 * Actions act = new Actions(driver);
		 * 
		 * act.moveToElement(driver.findElement(By.xpath(
		 * "//label[@class='custom-control-label']"))).click().build().perform();
		 */
		
		  driver.findElement(By.xpath("//label[@class='custom-control-label']")).click();
		//driver.findElement(By.id("customSwitch1")).click();
		
		//driver.findElement(By.className("custom-control custom-switch")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//clk on save
		
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.disabled")).click();
		
		//clk on back to settings
		
		driver.findElement(By.xpath("//i[contains(text(), 'Back to Settings')]")).click();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

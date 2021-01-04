package com.ExpenseOnDemand.TestCases;

import org.openqa.selenium.By;
import java.io.IOException;

import org.openqa.selenium.By;

import com.ExpenseOnDemand.utility.*;
public class DeleteData extends NewLogin {
	public static void deleteTestData()

	{
		driver.findElement(By.cssSelector("#place1 > div:nth-child(2) > div > div > div:nth-child(3) > div > div.card-button > button")).click();

		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//clicking on setup icon
		
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

		//driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span > i")).click();
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on checkbox
		//driver.findElement(By.cssSelector("#delete-test-data > ul > li > div.w-3pc.float-left > input")).click();
		//clk on Delete button
		driver.findElement(By.xpath("//button[contains(text(), 'Delete')]")).click();
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * //clicking on save button driver.findElement(By.
		 * cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(1) > button > span > app-confirm-icon > i"
		 * )).click(); try { Thread.sleep(10000); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
		//click on confirm
		//driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div > div > div.col-xl-3.col-lg-3.col-md-3.col-sm-3.col-xs-3.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
		
		driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div > div > div.col-xl-3.col-lg-3.col-md-3.col-sm-3.col-xs-3.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//clk on back to settings
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-right-0 > button > span > app-back-to-settings > i")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		DeleteData data=new DeleteData();
		data.chromeBrowser();
		data.appUrl();
		data.loginCredentials();
		data.deleteTestData();
		data.logoutApp();
	}
}

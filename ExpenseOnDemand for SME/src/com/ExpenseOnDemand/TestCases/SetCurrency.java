package com.ExpenseOnDemand.TestCases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ExpenseOnDemand.utility.*;

public class SetCurrency extends NewLogin{

	public static void currencyChange() {
		//click on your organisation
		driver.findElement(By.cssSelector("#place1 > div:nth-child(2) > div > div > div:nth-child(2) > div > div.card-button > button")).click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click on setup
		
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

		//driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span > i")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Selecting GBP

		//driver.findElement(By.cssSelector("#countryList > li:nth-child(17)")).click();
driver.findElement(By.xpath("//li[contains(text(), 'British Pounds - GBP')]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//driver.findElement(By.className("fas fa-check icon-Green")).click();
		//driver.findElement(By.xpath("//i[@aria-hidden='true']")).click();
		//click on save
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(1) > span > app-save-icon > i")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //back to setting click
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-right-0 > span > app-back-to-settings > i")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//click on currency under all functions on dashboard
		driver.findElement(By.cssSelector("#place1 > div:nth-child(2) > div > div > div:nth-child(2) > div > div.card-button > button")).click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

		//click on setup
	//	driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span > i")).click();
	//	driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Selecting INR
		
		//driver.findElement(By.cssSelector("#countryList > li:nth-child(56)")).click();
		driver.findElement(By.name("searchText")).click();
		driver.findElement(By.name("searchText")).sendKeys("inr");
		driver.findElement(By.xpath("//li[contains(text(), 'Indian Rupees - INR')]")).click();
		/*
		 * WebElement element=driver.findElement(By.
		 * xpath("//li[contains(text(), 'Indian Rupees - INR')]"));
		 * ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 * element.click();
		 */
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//li[contains(text(), 'Indian Rupees - INR')]")).click();
		//driver.findElement(By.xpath("//*[@id=\"countryList\"]/li[56]")).click();
		//driver.findElement(By.xpath("//li[contains(text(),'67')]")).click();
		//driver.findElement(By.xpath("//li[@value='67']")).click();
	
		
//click on save
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(1) > span > app-save-icon > i")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SetCurrency currency=new SetCurrency();
		currency.chromeBrowser();
		currency.appUrl();
		currency.loginCredentials();
		currency.currencyChange();
		currency.logoutApp();

	}
}



package com.ExpenseOnDemand.TestCases;
import com.ExpenseOnDemand.utility.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterApp extends AppUrl {
	
	public void RegisterApp()
	{
		//clicks on Register Link on Login page
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//enter Name and email id  on Register page
	driver.findElement(By.id("fName")).click();
	driver.findElement(By.id("fName")).sendKeys("solo");
	driver.findElement(By.id("eMail")).click();
	driver.findElement(By.id("eMail")).sendKeys("soloauto051@yopmail.com");
	
	driver.findElement(By.cssSelector("body > app > section > ng-component > div > div.container-fluid > div > div > div.row > div.col-md-7 > div > div:nth-child(2) > form > div > div > div.col-xl-12.col-lg-12.col-md-12.col-sm-12.col-xs-12.no-padding-left-right.mx-auto.text-center > button")).click();
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//enter Org details
	driver.findElement(By.id("orgName")).click();
	driver.findElement(By.id("orgName")).sendKeys("SOLO");
	driver.findElement(By.cssSelector("body > app > section > ng-component > div > div.container-fluid > div > div > div.row > div.col-md-7 > div > div:nth-child(2) > form > div > div > div.col-xl-12.col-lg-12.col-md-12.col-sm-12.col-xs-12.no-padding-left-right.mx-auto.text-center > button")).click();
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		//enter invite employee
		
		driver.findElement(By.name("newAttribute1FirstName")).click();
		driver.findElement(By.name("newAttribute1FirstName")).sendKeys("apone");
		driver.findElement(By.name("newAttribute1Email")).click();
		driver.findElement(By.name("newAttribute1Email")).sendKeys("ap1@yopmail.com");
		
		driver.findElement(By.name("newAttribute2FirstName")).click();
		driver.findElement(By.name("newAttribute2FirstName")).sendKeys("aptwo");
		driver.findElement(By.name("newAttribute2Email")).click();
		driver.findElement(By.name("newAttribute2Email")).sendKeys("ap2@yopmail.com");
		
		driver.findElement(By.cssSelector(".col-xl-3:nth-child(1) #newAttributeName")).click();
		driver.findElement(By.cssSelector(".col-xl-3:nth-child(1) #newAttributeName")).sendKeys("apthree");
		driver.findElement(By.id("newAttributeEmail")).click();
		driver.findElement(By.id("newAttributeEmail")).sendKeys("ap3@yopmail.com");
		driver.findElement(By.cssSelector("body > app > section > app-prewelcome-invite-employee > div > div.container-fluid > div > div > div.row > div.col-md-7 > div > div:nth-child(2) > form > div > div.col-xl-12.col-lg-12.col-md-12.col-sm-12.col-xs-12.no-padding-left-right.mx-auto.text-center > button")).click();
		driver.findElement(By.id("newAttributeName")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span > i")).click();
		
		
	}
	
	
	
	public static void main(String[] args) {
		RegisterApp rg=new RegisterApp();
		rg.chromeBrowser();
		rg.appUrl();
		rg.RegisterApp();
	}

}

package com.ExpenseOnDemand.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import java.io.IOException;



import com.ExpenseOnDemand.utility.*;
public class SetupGrades extends NewLogin{
	public static void gradeSetup()
	{
		driver.findElement(By.cssSelector("#\\32 ")).click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("#place2 > div:nth-child(2) > div > div > div:nth-child(3) > div > div.card-button > button")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > span > app-add-icon > i")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.name("gradeName")).click();
	driver.findElement(By.name("gradeName")).sendKeys("Admin Automate");
	driver.findElement(By.name("gradeDescription")).click();
	driver.findElement(By.name("gradeDescription")).sendKeys("This is for automation");
	driver.findElement(By.cssSelector("#addGradePanel > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-right-0 > span > app-back-to-settings > i")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	public static void main(String[] args) {
		SetupGrades grades=new SetupGrades();
		grades.chromeBrowser();
		grades.appUrl();
		grades.loginCredentials();
		grades.gradeSetup();
		grades.logoutApp();
	}
}

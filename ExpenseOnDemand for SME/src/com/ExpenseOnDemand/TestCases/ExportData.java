package com.ExpenseOnDemand.TestCases;

import org.openqa.selenium.By;

import com.ExpenseOnDemand.utility.*;

public class ExportData extends AppUrl {
	public static void dataExport()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("eMail")).clear();
		driver.findElement(By.id("eMail")).sendKeys("qaexport@yopmail.com");
		driver.findElement(By.id("password")).clear();
		//To check entering password through string variable
		
		
		driver.findElement(By.id("password")).sendKeys("Aa123456");
		//static Data
		//driver.findElement(By.id("password")).sendKeys("Aa123456");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//To clk Accounting export
		driver.findElement(By.id("navbarDropdown1")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//To click on dropdown icon
		driver.findElement(By.cssSelector("#manageEmployee > section.row.padding-bottom-20 > div > div.row.margin-top-40 > div.col-md-11.padding-right-0 > div > div.col-md-6.padding-left-0 > div > ng-select > div > div > div.ng-input > input[type=text]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//To select free export file
		//driver.findElement(By.cssSelector("#a9e82846603e-0 > div")).click();
	driver.findElement(By.xpath("//div[contains(text(),' Free Export File ')]")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//to clk on Export to
	driver.findElement(By.cssSelector("#manageEmployee > section.row.padding-bottom-20 > div > div.row.margin-top-40 > div.col-md-11.padding-right-0 > div > div.col-md-6.no-padding-right-left > div > ng-select > div > div > div.ng-input > input[type=text]")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 //To selct Accounting

	driver.findElement(By.xpath("//span[contains(text(), 'Accounting')]")).click();
	
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	//to change the date
	
	driver.findElement(By.cssSelector("#manageEmployee > section.row.padding-bottom-20 > div > div.row.margin-top-20 > div.col-md-11.padding-right-0 > div:nth-child(1) > div.col-md-6.padding-left-0 > div > div.col-md-6.no-padding-right-left")).click();
	//driver.findElement(By.xpath("//input[@class='form-control has-value ng-untouched ng-pristine ng-valid input']")).click();
	//to set 2019
	
	driver.findElement(By.cssSelector("body > div.flatpickr-calendar.animate.showTimeInput.arrowTop.open > div.flatpickr-months > div > div > div > span.arrowDown")).click();
	//to selct 1 may
	
	driver.findElement(By.cssSelector("body > div.flatpickr-calendar.animate.showTimeInput.arrowTop.open > div.flatpickr-innerContainer > div > div.flatpickr-days > div > span:nth-child(4)")).click();
	//To selct export type
	
		driver.findElement(By.cssSelector("#manageEmployee > section.row.padding-bottom-20 > div > div.row.margin-top-20 > div.col-md-11.padding-right-0 > div:nth-child(1) > div.col-md-6.no-padding-right-left > div > ng-select > div > div > div.ng-input > input[type=text]")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	//To selct new item.

		//driver.findElement(By.xpath("//span[contains(text(), 'New Items')]")).click();
		  
		
		//To selct prevoiusly exported
		
		driver.findElement(By.xpath("//span[contains(text(), 'Previously Exported Items')]")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	//to clk on Export
	//driver.findElement(By.xpath("//button[contains(text(), ' Export ']")).click();
	driver.findElement(By.cssSelector("#manageEmployee > section.row.padding-bottom-20.border-top > div > div > div.col-md-11.padding-right-0 > div > div > ul > li > button")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//To clk on download link
	//driver.findElement(By.xpath("//i[@data-toggle='tooltip']")).click();
	driver.findElement(By.cssSelector("#rightSideBar > div > div.block.no-padding-top-bottom > div > div > div > ul > li > span:nth-child(2) > a > i")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExportData export=new ExportData();
export.chromeBrowser();
export.appUrl();
export.dataExport();

	}

}

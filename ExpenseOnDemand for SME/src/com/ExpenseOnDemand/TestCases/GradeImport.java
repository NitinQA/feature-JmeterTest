package com.ExpenseOnDemand.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ExpenseOnDemand.utility.NewLogin;

public class GradeImport extends RegisterApp {

	public static void importGrade() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to clk on employeenapprover
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		driver.findElement(By.cssSelector("#\\32 ")).click();

		driver.findElement(By.cssSelector("#place2 > div:nth-child(2) > div > div > div:nth-child(4) > div > div.card-button > button")).click();
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace();}
		 */

		// to clk on import grade

		driver.findElement(By.xpath("//span[contains(text(), 'Import')]")).click();
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace();}
		 */

		// to clk on clk to upload icon

		driver.findElement(By.xpath("//i[@ngbtooltip='Click to Upload']")).click();
		/*
		 * Actions actions = new Actions(driver); WebElement elementLocator =
		 * driver.findElement(By.xpath("//i[@ngbtooltip='Click to Upload']")); //
		 * actions.doubleClick(elementLocator).perform();
		 */
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace();}
		 */

		// actions.doubleClick(elementLocator).perform();

		// driver.findElement(By.xpath("//i[@ngbtooltip='Click to Upload']")).click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// File upload script

		try {
			Runtime.getRuntime().exec(
					"C:\\Users\\qaadmin\\git\\Automation_Test\\ExpenseOnDemand for SME\\EXEFile\\fileupload_ImportGrade.exe");

		} catch (IOException e1) { // TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// to clk on import button

		driver.findElement(By.cssSelector("#manageEmployee > section:nth-child(3) > div > div > div.col-xl-9.col-lg-9.col-md-9.col-sm-9.padding-left-0 > div.row > div.text-right.no-padding-right-left.col-md-10.col-sm-10.col-lg-10.margin-top-10 > div > button")).click();

		
		  
		  try { Thread.sleep(5000); } catch (InterruptedException e) {
		  e.printStackTrace(); }
		 
		// clk on back to import

		driver.findElement(By.xpath("//span[contains(text(), 'Back to Import')]")).click();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeImport gd = new GradeImport();
		gd.chromeBrowser();
		gd.appUrl();
		gd.RegiApp();
		gd.importGrade();
	}

}

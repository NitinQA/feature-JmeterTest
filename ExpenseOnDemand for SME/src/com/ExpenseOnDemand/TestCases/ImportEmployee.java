
package com.ExpenseOnDemand.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.ExpenseOnDemand.utility.*;

public class ImportEmployee extends ManageEmployee{

	public static void ImportEmp()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * try { Thread.sleep(20000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//clk on Import employee
		//driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-7.text-right.padding-right-0 > div > ul > li:nth-child(4) > span > app-import-icon > i")).click();

		driver.findElement(By.xpath("//span[contains(text(), 'Import Employees')]")).click();

		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		//clk on upload icon
		driver.findElement(By.cssSelector("#btnUpload > i")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// File upload script

		try {
			Runtime.getRuntime().exec("C:\\Users\\qaadmin\\git\\Automation_Test\\ExpenseOnDemand for SME\\EXEFile\\fileupload.exe");
			
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//clk on Import button

		driver.findElement(By.cssSelector("#manageEmployee > section:nth-child(3) > div > div > div.col-xl-9.col-lg-9.col-md-9.col-sm-9.padding-left-0 > div.row > div.text-right.no-padding-right-left.col-md-10.col-sm-10.col-lg-10.margin-top-10 > div > button")).click();

		
		  try { Thread.sleep(15000); } 
		  catch (InterruptedException e) { // TODO  Auto-generated   catch
		  e.printStackTrace(); }
		 

		////clk on back to Import

		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default__importEmp.btn-default--active > span > app-back-to-import > i")).click();
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		//to clk on All functions
		 
		 driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav > li:nth-child(3) > ul > li:nth-child(2) > a")).click();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImportEmployee imp=new ImportEmployee();
		imp.chromeBrowser();
		imp.appUrl();
		imp.loginCredentials();
		imp.ManageEmp();
		imp.ImportEmp();
	}

}





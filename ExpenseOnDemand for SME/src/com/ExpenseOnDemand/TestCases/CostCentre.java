package com.ExpenseOnDemand.TestCases;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.ExpenseOnDemand.utility.AppUrl;

public class CostCentre extends AppUrl{
	static int leftLimit = 97; // letter 'a'
	static int rightLimit = 122; // letter 'z'
	static int targetStringLength = 4;
	static Random random = new Random();

	static String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		
	public static void addCostCentre()
	{
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		driver.findElement(By.id("eMail")).clear();
		driver.findElement(By.id("eMail")).sendKeys("autocost@yopmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		//To check entering password through string variable
		
		
		driver.findElement(By.id("password")).sendKeys("Aa123456");
		//static Data
		//driver.findElement(By.id("password")).sendKeys("Aa123456");
		//driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.cssSelector("#setting-wizard-new > div.setting-page > div.right-side-wizard > form:nth-child(1) > div > div > div > div.margin-top-5.btn-login > button")).click();

		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on settings icon

				driver.findElement(By.id("navbarDropdown4")).click();

				
				/*
				 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */

				


			
				//to clk on All functions

				 driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav > li:nth-child(3) > ul > li:nth-child(2) > a")).click();
					
				
				  try { Thread.sleep(10000); } catch (InterruptedException e) { 
					  // TODO		  Auto-generated catch block
					  e.printStackTrace(); }
				 
		//clk on cost cntre
		
		driver.findElement(By.cssSelector("#\\33 ")).click();
		
		//clk on View
		
		driver.findElement(By.cssSelector("#place3 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
		
		//clk on setup
		
		
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();
		
		
		//clk on add cost cetnre
		
		driver.findElement(By.xpath("//span[contains(text(), 'Add Cost Centre')]")).click();
		
		//to clk on add cost centre field
		driver.findElement(By.cssSelector("#addCostCentrePanel > div.col-md-12.col-sm-12.col-lg-12.col-xl-12.margin-top-10.no-padding-right-left > div:nth-child(1) > div > div.col-md-12.col-sm-12.no-padding-right-left.padding-top-10 > div > input")).click();

		driver.findElement(By.cssSelector("#addCostCentrePanel > div.col-md-12.col-sm-12.col-lg-12.col-xl-12.margin-top-10.no-padding-right-left > div:nth-child(1) > div > div.col-md-12.col-sm-12.no-padding-right-left.padding-top-10 > div > input")).sendKeys(generatedString+"Centre");
		
	//to clk on code
		
		driver.findElement(By.cssSelector("#addCostCentrePanel > div.col-md-12.col-sm-12.col-lg-12.col-xl-12.margin-top-10.no-padding-right-left > div:nth-child(1) > div > div:nth-child(2) > div > input")).click();
		driver.findElement(By.cssSelector("#addCostCentrePanel > div.col-md-12.col-sm-12.col-lg-12.col-xl-12.margin-top-10.no-padding-right-left > div:nth-child(1) > div > div:nth-child(2) > div > input")).sendKeys(generatedString+"Code");

		
		//to clk on save
		
		driver.findElement(By.cssSelector("#addCostCentrePanel > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
	}
	
	
	public static void assignCostCentre() {
		
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		//Click on assign cost centre
		driver.findElement(By.xpath("//span[contains(text(), 'Assign Cost Centre')]")).click();
		
		/*
		 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//click on select first radio button
		
		driver.findElement(By.cssSelector("#manageEmployee > section.row > div > div > div.col-md-4.padding-left-0 > div > div.listContainer-approvers > ul > li:nth-child(1) > div:nth-child(1) > input[type=radio]")).click();
		
		//send key for search
		driver.findElement(By.cssSelector("#manageEmployee > section.row > div > div > div.col-md-4.padding-right-0.margin-right-0 > div > div.listContainer-approvers > form > div > div > div.col-md-8.no-padding-right-left > div > input")).click();

		driver.findElement(By.cssSelector("#manageEmployee > section.row > div > div > div.col-md-4.padding-right-0.margin-right-0 > div > div.listContainer-approvers > form > div > div > div.col-md-8.no-padding-right-left > div > input")).sendKeys("autoCost");
		
		//select filter data
	//	#manageEmployee > section.row > div > div > div.col-md-4.padding-right-0.margin-right-0 > div > div.listContainer-approvers > ul > li > div > input
		driver.findElement(By.cssSelector("#manageEmployee > section.row > div > div > div.col-md-4.padding-right-0.margin-right-0 > div > div.listContainer-approvers > ul > li > div")).click();
		
		//click on arrow
		driver.findElement(By.cssSelector("#manageEmployee > section.row > div > div > div.dragIcon.ng-star-inserted > div > span > i")).click();
		
		//click on select item in seconfd field 
		
		driver.findElement(By.cssSelector("#manageEmployee > section.row > div > div > div:nth-child(2) > div > div.listContainer-approvers > ul > li > div:nth-child(1) > input")).click();
		
		//click on arrow
		driver.findElement(By.cssSelector("#manageEmployee > section.row > div > div > div.dragIcon.ng-star-inserted > div > span > i")).click();
		
		//click on create new cost centre button
		driver.findElement(By.xpath("//span[contains(text(), 'Create New Cost Centre')]")).click();
	}
	 public static void importCostCentre()
	 {
		 
		 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		 
		//clk on cost cntre
			
			driver.findElement(By.cssSelector("#\\33 ")).click();
			
			//clk on View
			
			driver.findElement(By.cssSelector("#place3 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
			
			//clk on setup
			
			
			driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();
			
			
		 
		 
		 //clk on import
			driver.findElement(By.xpath("//span[contains(text(), 'Import')]")).click();
			
			
		 //clk on upload icon
			driver.findElement(By.xpath("//i[@ngbtooltip='Click to Upload']")).click();
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //selct file
		 
		 try {
				Runtime.getRuntime().exec(
						"C:\\Users\\qaadmin\\git\\Automation_Test\\ExpenseOnDemand for SME\\EXEFile\\fileupload_CostCentre.exe");

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
			  // click  back to import
			  driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default__importEmp.btn-default--active > button > span > i")).click();
			  
			  
			  // click on Back
			  driver.findElement(By.xpath("//span[contains(text(), 'Back')]")).click();			  
			  
			  //click on back to setting button
			  driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-right-0.f-11 > button")).click();
	 }
	
	
	
	public static void main(String[] args) {
		CostCentre cost=new CostCentre();
		cost.chromeBrowser();
		cost.appUrl();
		cost.addCostCentre();
		cost.assignCostCentre();
	}
}

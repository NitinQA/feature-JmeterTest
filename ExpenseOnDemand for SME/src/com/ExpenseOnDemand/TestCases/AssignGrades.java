package com.ExpenseOnDemand.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.ExpenseOnDemand.utility.NewLogin;

public class AssignGrades extends NewLogin {
	
	public static void gradeAssign()
	{{
		//to clk on employeenapprover
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		driver.findElement(By.cssSelector("#\\32 ")).click();
		
		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		//to clk on SetupGrades 
		driver.findElement(By.cssSelector("#place2 > div:nth-child(2) > div > div > div:nth-child(4) > div > div.card-button > button")).click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		//to clk on setup button
		
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button")).click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	//to clk on assign grades button
		
		driver.findElement(By.xpath("//span[contains(text(), ' Assign Grade to Claimants ')]")).click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//to clk on first grade
		
		driver.findElement(By.cssSelector("#manageEmployee > section.row > div > div > div.col-md-4.padding-left-0 > div > div.listContainer-approvers > ul > li:nth-child(1) > div:nth-child(1) > input[type=radio]")).click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		//to clk on unassigned claimant
		
		driver.findElement(By.cssSelector("#manageEmployee > section.row > div > div > div.col-md-4.padding-right-0.margin-right-0 > div > div.listContainer-approvers > ul > li:nth-child(1) > div > input")).click();
	
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
	//to clk on add selected button
		
		driver.findElement(By.cssSelector("#manageEmployee > section.row > div > div > div.dragIcon > div")).click();
	

			/*
			 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
	
		
		//to clk on back to settings
		
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-right-0 > button > span > app-back-to-settings > i")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AssignGrades grade=new AssignGrades();
grade.chromeBrowser();
grade.appUrl();
grade.loginCredentials();
grade.gradeAssign();

	}

}

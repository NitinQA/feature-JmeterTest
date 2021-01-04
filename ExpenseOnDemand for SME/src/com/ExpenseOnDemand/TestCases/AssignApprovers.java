package com.ExpenseOnDemand.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ExpenseOnDemand.utility.*;

public class AssignApprovers extends NewLogin {

	public static void assignApprover() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		driver.findElement(By.cssSelector("#\\32 ")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// to clk on approver 1st leve

		driver.findElement(By.cssSelector(
				"#place2 > div:nth-child(2) > div > div > div:nth-child(2) > div > div.card-button > button")).click();

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		// to clk on setup

		driver.findElement(By.cssSelector(
				"body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button"))
				.click();

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// to clk on first approver radio button

		driver.findElement(By.cssSelector(
				"#manageEmployee > section.row.claimantExpenseList > div > div > div.col-md-4.padding-left-0 > div > div.listContainer-approvers > ul > li:nth-child(1) > div:nth-child(1) > input[type=radio]"))
				.click();

		// to clk on assigned claimant 1

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector(
				"#manageEmployee > section.row.claimantExpenseList > div > div > div:nth-child(2) > div > div.listContainer-approvers > ul > li > div:nth-child(1) > input"))
				.click();

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// to clk on remove button/
		driver.findElement(By.cssSelector(
				"#manageEmployee > section.row.claimantExpenseList > div > div > div.dragIcon > div > span > i"))
				.click();
		// driver.findElement(By.xpath("//span[@ngbtooltip='Remove
		// Selected']")).click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// to clk on ok on alert

		
		  driver.findElement(By.id("confirmUnassignSingle")).click();
		 
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10); WebElement
		 * passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("  //*[@id=\"rightSideBar\"]/div/header/div/div/div/div[2]/span[1]/i"))
		 * ); passwordElement.click();
		 */

		// driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div >
		// div >
		// div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right
		// > span:nth-child(1) > i")).submit();

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// to enter the text

		driver.findElement(By.name("searchTextUnAssigned")).sendKeys("soloapprover");
		// to clk on search icon

		driver.findElement(By.cssSelector(
				"#manageEmployee > section.row.claimantExpenseList > div > div > div.col-md-4.padding-right-0.margin-right-0 > div > div.listContainer-approvers > form > div > div > div.col-md-8.no-padding-right-left > div > span > i"))
				.click();

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		// to clk on claimant with no approver
		driver.findElement(By.name("AssignApprover6")).click();

		// driver.findElement(By.cssSelector("#manageEmployee >
		// section.row.claimantExpenseList > div > div > div:nth-child(2) > div >
		// div.listContainer-approvers > ul > li > div:nth-child(1) > input")).click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// to clk on add selected
		driver.findElement(By.cssSelector(
				"#manageEmployee > section.row.claimantExpenseList > div > div > div.dragIcon > div > span > i"))
				.click();

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// to clk on bact to settings

		driver.findElement(By.cssSelector(
				"#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-right-0 > span > app-back-to-settings > i"))
				.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignApprovers approver = new AssignApprovers();
		approver.chromeBrowser();
		approver.appUrl();
		approver.loginCredentials();
		approver.assignApprover();
		approver.logoutApp();
	}
}

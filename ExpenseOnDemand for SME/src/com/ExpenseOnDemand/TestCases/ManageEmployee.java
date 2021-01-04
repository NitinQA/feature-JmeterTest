package com.ExpenseOnDemand.TestCases;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.ExpenseOnDemand.utility.*;

public class ManageEmployee extends NewLogin{
	static int leftLimit = 97; // letter 'a'
	static int rightLimit = 122; // letter 'z'
	static int targetStringLength = 6;
	static Random random = new Random();

	static String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		
	public static void ManageEmp()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		//To clk on Employes&Approver
		
driver.findElement(By.cssSelector("#\\32 ")).click();
		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		//To clk on Setup on dashboard
		driver.findElement(By.cssSelector("#place2 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
		
		//#place2 > div:nth-child(2) > div > div > div:nth-child(1) > span > div > div.card-button > button
		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		//clicking on Setup Icon
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

	//driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span > i")).click();
	
	
		/*
		 * try { Thread.sleep(18000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	
	}
	 public static void inviteEmp()
	 {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to clk on invite emp
		 driver.findElement(By.xpath("//span[contains(text(), ' Invite Employees ')]")).click();
		 driver.findElement(By.name("employeeFirstName")).click();
		 driver.findElement(By.name("employeeFirstName")).sendKeys(generatedString);
		 driver.findElement(By.name("employeeEmail")).click();
		 driver.findElement(By.name("employeeEmail")).sendKeys(generatedString+"@yopmail.com");
		 
		 //invite employee
		 
		 driver.findElement(By.cssSelector("#inviteEmployees > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
		 //driver.findElement(By.cssSelector(" #manageEmployee > section.pageTitle-block > div > div > div.col-md-7.text-right.padding-right-0 > div > ul > li:nth-child(4) > span > app-invite-employees-icon > i")).click();

		// #manageEmployee > section.pageTitle-block > div > div > div.col-md-7.text-right.padding-right-0 > div > ul > li:nth-child(4) > span > app-invite-employees-icon > i
		  try { Thread.sleep(10000); } catch (InterruptedException e) {
			  // TODO		  Auto-generated catch block 
			  e.printStackTrace(); }
		 
		 driver.findElement(By.name("employeeFirstName")).click();
		 driver.findElement(By.name("employeeFirstName")).clear();
		 driver.findElement(By.name("employeeFirstName")).sendKeys(generatedString+"new");
		 driver.findElement(By.name("employeeEmail")).click();
		 driver.findElement(By.name("employeeEmail")).clear();
		 driver.findElement(By.name("employeeEmail")).sendKeys(generatedString+"1@yopmail.com");
		 
		 
		 driver.findElement(By.cssSelector("#inviteEmployees > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span:nth-child(2) > i")).click();
		 try { Thread.sleep(10000); } catch (InterruptedException e) {
			  // TODO		  Auto-generated catch block 
			  e.printStackTrace(); }
		 
		
		 
		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		 
		 //clicking on first name
		 driver.findElement(By.name("employeeFirstName")).click();
		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 try { Thread.sleep(5000); } catch (InterruptedException e) {
			  // TODO		  Auto-generated catch block 
			  e.printStackTrace(); }
		 
		 //click on cross button
		 driver.findElement(By.cssSelector("#inviteEmployees > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span.padding-right-0 > i")).click();
	 
	 
		//click on confirm text for move cursor//#rightSideBar > div > div.col-md-12.col-sm-12.col-lg-12.col-xl-12.margin-top-20.no-padding-right-left > div > div
		
		//driver.findElement(By.cssSelector("#rightSideBar > div > div.col-md-12.col-sm-12.col-lg-12.col-xl-12.margin-top-20.no-padding-right-left > div > div")).sendKeys(Keys.TAB);
		//driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div > div > div.col-xl-9.col-lg-9.col-md-9.col-sm-9.col-xs-9.padding-left-0 > h2")).click(); 
		
	
		
		
		// click on right button for confirmation
		//#rightSideBar > div > header > div > div > div > div.col-xl-3.col-lg-3.col-md-3.col-sm-3.col-xs-3.padding-right-0.header-icons.text-right > span:nth-child(1) > i
		//#rightSideBar > div > header > div > div > div > div.col-xl-3.col-lg-3.col-md-3.col-sm-3.col-xs-3.padding-right-0.header-icons.text-right > span.padding-right-0 > i
		//driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div > div > div.col-xl-3.col-lg-3.col-md-3.col-sm-3.col-xs-3.padding-right-0.header-icons.text-right > span.padding-right-0 > i")).sendKeys(Keys.TAB);
		//driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div > div > div.col-xl-3.col-lg-3.col-md-3.col-sm-3.col-xs-3.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
         // driver.findElement(By.id("ngb-tooltip-200")).click();
	 	 
	 }
	
	
	

	public static void main(String[] args) {
		ManageEmployee manage=new ManageEmployee();
		manage.chromeBrowser();
		manage.appUrl();
		manage.loginCredentials();
		manage.ManageEmp();
		manage.inviteEmp();

	}
	
	
	
}

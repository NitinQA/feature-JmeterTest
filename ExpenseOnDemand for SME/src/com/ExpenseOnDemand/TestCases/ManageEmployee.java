package com.ExpenseOnDemand.TestCases;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;

import com.ExpenseOnDemand.utility.*;

public class ManageEmployee extends NewLogin{
	static int leftLimit = 97; // letter 'a'
	static int rightLimit = 122; // letter 'z'
	static int targetStringLength = 6;
	static Random random = new Random();

	static String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		
	public static void ManageEmp()
	{
		driver.findElement(By.cssSelector("#\\32 ")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#place2 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//clicking on Setup Icon
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

	//driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span > i")).click();
	
	
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	 public static void inviteEmp()
	 {
		
		 driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > span > app-invite-employees-icon > i")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.name("employeeFirstName")).click();
		 driver.findElement(By.name("employeeFirstName")).sendKeys(generatedString);
		 driver.findElement(By.name("employeeEmail")).click();
		 driver.findElement(By.name("employeeEmail")).sendKeys(generatedString+"@yopmail.com");
		 
		 //invite employee
		 driver.findElement(By.cssSelector("#inviteEmployees > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.name("employeeFirstName")).click();
		 driver.findElement(By.name("employeeFirstName")).clear();
		 driver.findElement(By.name("employeeFirstName")).sendKeys(generatedString+"new");
		 driver.findElement(By.name("employeeEmail")).click();
		 driver.findElement(By.name("employeeEmail")).clear();
		 driver.findElement(By.name("employeeEmail")).sendKeys(generatedString+"1@yopmail.com");
		 driver.findElement(By.cssSelector("#inviteEmployees > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span:nth-child(2) > i")).click();
		 
		 
		
		 
		 try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 
		 //clicking on cross icon
		 driver.findElement(By.name("employeeFirstName")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.cssSelector("#inviteEmployees > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span.padding-right-0 > i")).click();
	 }
	
	
	
	
	
	
	

	public static void main(String[] args) {
		ManageEmployee manage=new ManageEmployee();
		manage.chromeBrowser();
		manage.appUrl();
		manage.loginCredentials();
		manage.ManageEmp();
		manage.inviteEmp();

	}
	
	/*
	 * public static void main(String args[]) { String firstname = "Virat"; String
	 * lastname = "Kohli"; // 1st way - Use + operator to concatenate String String
	 * name = firstname + " " + lastname; System.out.println(name); // 2nd way - by
	 * using StringBuilder StringBuilder sb = new StringBuilder(14);
	 * sb.append(firstname).append(" ").append(lastname);
	 * System.out.println(sb.toString()); // 3rd way - by using StringBuffer
	 * StringBuffer sBuffer = new StringBuffer(15);
	 * sBuffer.append(firstname).append(" ").append(lastname);
	 * System.out.println(sBuffer.toString()); } }
	 */
}

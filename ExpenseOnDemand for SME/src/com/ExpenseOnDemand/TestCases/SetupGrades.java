package com.ExpenseOnDemand.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.ExpenseOnDemand.utility.*;
public class SetupGrades extends NewLogin{
	static int leftLimit = 97; // letter 'a'
	static int rightLimit = 122; // letter 'z'
	static int targetStringLength = 4;
	static Random random = new Random();

	static String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		
	public static void gradeSetup()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//TO CLK ON EMPLOYEES AND aPPROVERS
		driver.findElement(By.cssSelector("#\\32 ")).click();

		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		driver.findElement(By.cssSelector("#place2 > div:nth-child(2) > div > div > div:nth-child(4) > div > div.card-button > button")).click();
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

		
		//driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button")).click();
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		//clk on Add grade
	driver.findElement(By.xpath("//span[contains(text(), 'Add Grade')]")).click();
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	
	driver.findElement(By.name("gradeName")).click();
	driver.findElement(By.name("gradeName")).sendKeys(generatedString+"AutomateGrade");
	driver.findElement(By.name("gradeDescription")).click();
	driver.findElement(By.name("gradeDescription")).sendKeys("This is for automation");
	driver.findElement(By.cssSelector("#addGradePanel > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
	
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	
	
	//back to setting
	driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-right-0 > button > span")).click();
		
		  try { Thread.sleep(10000); } catch (InterruptedException e) { 
			  // TODO		  Auto-generated catch block 
			  e.printStackTrace(); }
		 
	
	
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

package com.ExpenseOnDemand.TestCases;
import com.ExpenseOnDemand.utility.*;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterApp extends AppUrl {
	static int leftLimit = 97; // letter 'a'
	static int rightLimit = 122; // letter 'z'
	static int targetStringLength = 5;
	static Random random = new Random();

	static String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		
	
	public static void RegiApp()
	{
		//String username="automarcus";
		try { Thread.sleep(6000); } 
		catch (InterruptedException e) {
							//			TODO Auto-generated catch block 
			e.printStackTrace(); }
		//clicks on Register Link on Login page
		driver.findElement(By.xpath("//a[text()='Register']")).click(); 
		try { Thread.sleep(6000); } 
		catch (InterruptedException e) {
							//			TODO Auto-generated catch block 
			e.printStackTrace(); }//enter Name and email id on Register page
		driver.findElement(By.id("fName")).click();
		driver.findElement(By.id("fName")).sendKeys("solo");
		driver.findElement(By.id("eMail")).click();
		
		driver.findElement(By.id("eMail")).sendKeys(generatedString+"@yopmail.com");
		

		driver.findElement(By.cssSelector("body > app > section > ng-component > div > div.container-fluid > div > div > div.row > div.col-md-7 > div > div:nth-child(2) > form > div > div > div.col-xl-12.col-lg-12.col-md-12.col-sm-12.col-xs-12.no-padding-left-right.mx-auto.text-center > button"
						)).click(); 
		try { Thread.sleep(6000); } 
		catch (InterruptedException e) {
							//			TODO Auto-generated catch block 
			e.printStackTrace(); } //enter Org details
							driver.findElement(By.id("orgName")).click();
							driver.findElement(By.id("orgName")).sendKeys("SOLO"); driver.findElement(By.
									cssSelector("body > app > section > ng-component > div > div.container-fluid > div > div > div.row > div.col-md-7 > div > div:nth-child(2) > form > div > div > div.col-xl-12.col-lg-12.col-md-12.col-sm-12.col-xs-12.no-padding-left-right.mx-auto.text-center > button"
											)).click(); 
							
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
							


						driver.findElement(By.name("newAttribute1FirstName")).click();
						driver.findElement(By.name("newAttribute1FirstName")).sendKeys("apone");
						driver.findElement(By.name("newAttribute1Email")).click();
						driver.findElement(By.name("newAttribute1Email")).sendKeys(generatedString+"1@yopmail.com");
						;

						driver.findElement(By.name("newAttribute2FirstName")).click();
						driver.findElement(By.name("newAttribute2FirstName")).sendKeys("aptwo");
						driver.findElement(By.name("newAttribute2Email")).click();
						driver.findElement(By.name("newAttribute2Email")).sendKeys(generatedString+"2@yopmail.com")
						;

						driver.findElement(By.cssSelector(".col-xl-3:nth-child(1) #newAttributeName")
								).click();
						driver.findElement(By.cssSelector(".col-xl-3:nth-child(1) #newAttributeName")
								).sendKeys("apthree");
						driver.findElement(By.id("newAttributeEmail")).click();
						driver.findElement(By.id("newAttributeEmail")).sendKeys(generatedString+"3@yopmail.com");
						driver.findElement(By.cssSelector("body > app > section > app-prewelcome-invite-employee > div > div.container-fluid > div > div > div.row > div.col-md-7 > div > div:nth-child(2) > form > div > div.col-xl-12.col-lg-12.col-md-12.col-sm-12.col-xs-12.no-padding-left-right.mx-auto.text-center > button")).click(); 
										
						//driver.findElement(By.id("newAttributeName")).click(); 
										
										
								
											try {
												Thread.sleep(10000);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											
										
										

	driver.findElement(By.xpath("//i[@class='fal fa-check-circle color-white']")).click();

	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//i[@ngbtooltip='Next']")).click();
	
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//To click on explore app
	//driver.findElement(By.xpath("//button[contains(text(),' Explore the App ']")).click();
	driver.findElement(By.cssSelector("#rightSideBar > div > div.block > div > div.row.padding-top-0 > div > button")).click();
	}


	





  public static void main(String[] args) {
	  RegisterApp rg=new RegisterApp();
  rg.chromeBrowser();
  rg.appUrl();
  rg.RegiApp(); }
  }
 



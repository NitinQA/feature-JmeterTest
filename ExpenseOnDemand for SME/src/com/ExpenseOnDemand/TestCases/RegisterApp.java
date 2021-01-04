package com.ExpenseOnDemand.TestCases;
import com.ExpenseOnDemand.utility.*;


import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterApp extends AppUrl {
	/*
	 * static int leftLimit = 97; // letter 'a' static int rightLimit = 122; //
	 * letter 'z' static int targetStringLength = 5; static Random random = new
	 * Random();
	 * 
	 * static String generatedString = random.ints(leftLimit, rightLimit +
	 * 1).limit(targetStringLength).collect(StringBuilder::new,
	 * StringBuilder::appendCodePoint, StringBuilder::append).toString();
	 */
	
	public static void RegiApp()
	{
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 5;
	Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
			
		//String username="automarcus";
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//clicks on Register Link on Login page
		//driver.findElement(By.xpath("//a[text()='Register']")).click(); 
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 *///enter Name and email id on Register page
		driver.findElement(By.id("fName")).click();
		driver.findElement(By.id("fName")).sendKeys("solo");
		//driver.findElement(By.id("eMail")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='email']")).click();

		//driver.findElement(By.className("form-control border text-ellipsis-approver ng-pristine ng-invalid ng-touched")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys(generatedString+"@yopmail.com");
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//To clk on register

		driver.findElement(By.xpath("//*[@id=\"setting-wizard-new\"]/div[1]/div[2]/form[2]/div/div[2]/button")).click();


		
		  try { Thread.sleep(10000); } catch (InterruptedException e) { 
			  // TODO		  Auto-generated catch block
			  e.printStackTrace(); }
		  //enter Org details
		driver.findElement(By.id("orgName")).click();
		driver.findElement(By.id("orgName")).sendKeys("SOLO"); 
		
		driver.findElement(By.cssSelector("#setting-wizard-new > div.setting-page > div.right-side-wizard > div.register-account > div.d-flex.justify-content-center.xs-mt-4 > button")).click(); 
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */



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

		//driver.findElement(By.cssSelector(".col-xl-3:nth-child(1) #newAttributeName")).click();
		//driver.findElement(By.cssSelector(".col-xl-3:nth-child(1) #newAttributeName")).sendKeys("apthree");
		driver.findElement(By.name("newAttributeFirstName")).click();
		driver.findElement(By.name("newAttributeFirstName")).sendKeys("apthree");

		driver.findElement(By.id("newAttribute3Email")).click();
		driver.findElement(By.id("newAttribute3Email")).sendKeys(generatedString+"3@yopmail.com");

		//To clk on Next
		driver.findElement(By.cssSelector("#setting-wizard-new > div > div.right-side-wizard > div.register-account > div.d-flex.justify-content-center.xs-mt-4 > button")).click(); 





		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		//to clksetup the mileage
		driver.findElement(By.name("rateForFourWheeler")).clear();
		driver.findElement(By.name("rateForFourWheeler")).sendKeys("0.50");
		driver.findElement(By.name("rateForTwoWheeler")).clear();
		driver.findElement(By.name("rateForTwoWheeler")).sendKeys("0.10");
		driver.findElement(By.name("mileageUOM")).click();
		//driver.findElement(By.xpath("//option[contains(text(), 'Kilometre')]")).click();
		WebElement testDropDown = driver.findElement(By.name("mileageUOM"));  
		org.openqa.selenium.support.ui.Select dropdown = new org.openqa.selenium.support.ui.Select(testDropDown); 
		dropdown.selectByValue("2");
		try { Thread.sleep(5000); } catch (InterruptedException e) { 
			  // TODO		  Auto-generated catch block 
			  e.printStackTrace(); }
		//To clk on Next on mileag estup screen
				driver.findElement(By.cssSelector("#setting-wizard-new > div > div.right-side-wizard > div.register-account > div.d-flex.justify-content-center.xs-mt-4 > button")).click();

		//driver.findElement(By.xpath("//i[@class='fal fa-check-circle color-white']")).click();

		
		  try { Thread.sleep(25000); } catch (InterruptedException e) { 
			  // TODO		  Auto-generated catch block 
			  e.printStackTrace(); }
		 

		//To clk on  Finish n cont
		driver.findElement(By.cssSelector("#setting-wizard-new > div > div.right-side-wizard > div.register-account > div.d-flex.justify-content-center.xs-mt-4 > button")).click();
		//driver.findElement(By.xpath("//button[@type='button']")).click();

		
		  try { Thread.sleep(25000); } catch (InterruptedException e) { 
			  // TODO		  Auto-generated catch block
			  e.printStackTrace(); }
		 

		//To clk on continue
		driver.findElement(By.cssSelector("#rightSideBar > div > div.d-flex.position-absolute.bottom-0.w-100pc.justify-content-center.bg-white.padding-15 > span > button")).click();
		//driver.findElement(By.xpath("//i[@ngbtooltip='Next']")).click();

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//driver.findElement(By.xpath("//button[@type='submit']")).click();

		//To clk on chatbot close
		//driver.findElement(By.xpath("//img[@class='chat-icon agent-img']")).click();

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		

		//to clk on resend verification
		
		driver.findElement(By.xpath("//button[contains(text(),'Resend Verification Email')]")).click();
		
		//driver.findElement(By.cssSelector("#rightSideBar > div > div.d-flex.position-absolute.bottom-10.w-100pc.justify-content-center.bg-white.padding-15 > span:nth-child(1) > button > b")).click();
		
		  try { Thread.sleep(10000); } catch (InterruptedException e) {
			  // TODO		  Auto-generated catch block 
			  e.printStackTrace(); }
		 
		
		
		//to clk on All functions

				driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav > li:nth-child(3) > ul > li:nth-child(2) > a")).click();
		
		System.out.println(generatedString+"@yopmail.com");
	}


	




	/*
	 * public static void rateFetch() { JavascriptExecutor js = (JavascriptExecutor)
	 * driver; // String url = js.executeScript("return document.URL;").toString();
	 * String value = js.
	 * executeScript("return document.querySelectorAll('[formcontrolname=\"twowheelerrate\"]')[0].value"
	 * ).toString(); //return value;
	 * 
	 * System.out.println("The value is"+value); }
	 */
	
//public static String Value(this WebElement element, IJavaScriptExecutor javaScriptExecutor)





public static void main(String[] args) {
	  RegisterApp rg=new RegisterApp();
  rg.chromeBrowser();
  rg.appUrl();
  rg.RegiApp();
  //rg.mileageRate();
  //rg.rateFetch()  ;
  
  }
  }
 



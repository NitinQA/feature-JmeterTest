package com.ExpenseOnDemand.TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.openqa.selenium.By;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.ExpenseOnDemand.utility.*;
public class BasicMileage extends NewLogin{

	public static void setupMileage()
	
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		  
		  //To clk on Mileage rate
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(), 'Mileage Rates')]")).click();

		
		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
//to clk on view
		driver.findElement(By.cssSelector("#place8 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//To clk on Setup button
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

		//driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();
		//driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span > i")).click();
		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		//click on 4 wheeler tab
	
		
				
		
		
		
		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).clear();


		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).sendKeys("0.60");

		
		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//click on 2 wheeler tab
	

				
		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).clear();


		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).sendKeys("0.20");
		
		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//click on save
		driver.findElement(By.cssSelector("#save > button > span")).click();

		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 

		//click on Back to Settings
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(3) > button")).click();
		
		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//chaning back to initial
		driver.findElement(By.xpath("//a[contains(text(), 'Mileage Rates')]")).click();

		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
//to clk on view
			driver.findElement(By.cssSelector("#place8 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//To clk on Setup button
		
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

		//driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

		//driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span > i")).click();
		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		//click on 4 wheeler tab
		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).clear();


		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).sendKeys("0.45");

		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//click on 2 wheeler tab
		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).clear();


		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).sendKeys("0.25");
		
		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//click on save
		driver.findElement(By.cssSelector("#save > button > span")).click();

		
		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 

		//click on Back to Settings
		
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(3) > button")).click();

		


		  try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO Auto-generated catch block
		   e.printStackTrace(); }

	}
	
	public static void assignVehicle()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		  
		  //To clk on Mileage rate
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(), 'Mileage Rates')]")).click();
		
		//clk on view on assign vehicle
		
		driver.findElement(By.cssSelector("#place8 > div:nth-child(2) > div > div > div:nth-child(2) > div > div.card-button > button")).click();
		
		//clk on setup
		
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();
		
		
		//clk on checkbof of first user
		
		driver.findElement(By.cssSelector("#expTableValues > tr:nth-child(1) > td:nth-child(1) > input")).click();
		
		//clk on 2 wheeler
		
		driver.findElement(By.cssSelector("#updateVehicle > div.col-md-12.col-sm-12.col-lg-12.col-xl-12.mt10.no-padding-right-left > div > div > ul > li:nth-child(1) > span > app-two-wheeler-icon > i")).click();
		
		//clk on save
		
		driver.findElement(By.cssSelector("#updateVehicle > header > div > div > div > div.col-xl-3.col-lg-3.col-md-3.col-sm-3.col-xs-3.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//clk on checkbof of first user
		
				driver.findElement(By.cssSelector("#expTableValues > tr > td:nth-child(1) > input")).click();
				
				//clk on 4 wheeler
				
				driver.findElement(By.cssSelector("#updateVehicle > div.col-md-12.col-sm-12.col-lg-12.col-xl-12.mt10.no-padding-right-left > div > div > ul > li:nth-child(2) > span")).click();
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//clk on save
				
				driver.findElement(By.cssSelector("#updateVehicle > header > div > div > div > div.col-xl-3.col-lg-3.col-md-3.col-sm-3.col-xs-3.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
				
				//clk on back settings
				
				driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span")).click();
				
	}
	public static void mileageRate()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		  
		  //To clk on Mileage rate
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(), 'Mileage Rates')]")).click();

		
		/*
		 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
	//to clk on view
		driver.findElement(By.cssSelector("#place8 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//To clk on Setup button
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();
		try { Thread.sleep(5000); } catch (InterruptedException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace(); }
			 
		//verify 4 whheler
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		// String url = js.executeScript("return document.URL;").toString();			
		String value = js.executeScript("return document.querySelectorAll('[formcontrolname=\"fourwheelerrate\"]')[0].value").toString();
	//return value;

	System.out.println("The value is "+value);
		
		//WebElement textValidation = driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']"));
		//System.out.println(textValidation);
	 //driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).getAttribute("textContent");
		
		
		//verify .50
			
			
			 
			  //validate actual text 
			  String expectedText = "0.50"; 
			  String actualText=value;
			  
			  //comparing text
			  if(actualText.equals(expectedText)) {
			  System.out.println("Actual and Expected are same for FourWheeler = "+actualText); } 
	else {
			  System.out.println("Actual and Expected are Different for FourWheeler"+actualText);
			  driver.findElement(By.className("test"));}
			  
		
		//two wheeler
			  JavascriptExecutor jstwo = (JavascriptExecutor) driver;  
				// String url = js.executeScript("return document.URL;").toString();			
				String valuetwo = jstwo.executeScript("return document.querySelectorAll('[formcontrolname=\"twowheelerrate\"]')[0].value").toString();
			//return value;

			System.out.println("The value is "+valuetwo);
		
			 //validate actual text 
			String expectedTexttwo = "0.10"; 
			  String actualTexttwo=valuetwo;
			  
			  //comparing text
			  if(actualTexttwo.equals(expectedTexttwo)) {
			  System.out.println("Actual and Expected are same for TwoWheeler = "+actualTexttwo); } 
	else {
			  System.out.println("Actual and Expected are Different for TwoWheeler"+actualTexttwo); 
			  driver.findElement(By.className("test"));}
			 
			//to chk kilometer is selcted

			  Boolean Select=driver.findElement(By.cssSelector("#manageEmployee > section.margin-top-0.basicMileage-panels > div > div.panel.panel-default.col-md-6.padding-left-0 > div.panel-body.padding-top-20.height-160px.minHeight-auto > label:nth-child(2) > input")).isSelected();
			  
			  System.out.println("Element selected is :"+Select);
			  
			  if(Select=true)
			  {
				System.out.println("The Element is Passed");  
			  }
			  else
			  {
				  System.out.println("The element is not Cheked");
				  driver.findElement(By.cssSelector("Test"));
			  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicMileage mileage=new BasicMileage();
		mileage.chromeBrowser();
		mileage.appUrl();
		mileage.loginCredentials();
		mileage.setupMileage();
		mileage.assignVehicle();
		mileage.logoutApp();
	}

}

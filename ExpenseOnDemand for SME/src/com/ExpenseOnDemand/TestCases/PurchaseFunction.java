package com.ExpenseOnDemand.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ExpenseOnDemand.utility.*;

public class PurchaseFunction extends RegisterApp {

	public static void purchaseFunction() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		// to click on subscribe on Pre Approval
		driver.findElement(By.cssSelector(
				"#place1 > div:nth-child(2) > div > div > div:nth-child(4) > div > div.card-button > button")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// to clk on add to cart

		driver.findElement(By.cssSelector(
				"body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0.my-custom-tooltip-addtocart > button > span > i"))
				.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// to clk on Go to cart

		driver.findElement(By.cssSelector(
				"body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0.my-custom-tooltip-addtocart.ng-star-inserted > button > span > i")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// to clk on Pruchase

		driver.findElement(By.xpath("//button[contains(text(), 'Proceed to Purchase')]")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { // TODAuto-generated catch block
			e.printStackTrace();
		}

		// to clk on PReview info for billing (tick) on side panel

		// driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div >
		// div >
		// div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right
		// > span:nth-child(1) > i")).click();
		driver.findElement(By.id("confirmInfoPanel")).click();

		// to clk on Preview on side panel (new change by ashendra on 9/12/2020)

		// driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div >
		// div >
		// div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right
		// > span:nth-child(1) > i")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { // TODAuto-generated catch block
			e.printStackTrace();
		}

		// to clk on Confirm (new change by ashendra on 9/12/2020)

		driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { // TODAuto-generated catch block
			e.printStackTrace();
		}

		// to clk on confirm (yes) on side panel

		driver.findElement(By.cssSelector(
				"#rightSideBar > div > div.d-flex.position-absolute.bottom-10.w-100pc.justify-content-center.bg-white.padding-15 > span:nth-child(1) > button > b"))
				.click();
		// #rightSideBar > div >
		// div.d-flex.position-absolute.bottom-10.w-100pc.justify-content-center.bg-white.padding-15
		// > span:nth-child(1) > button > b

		// enable the toggle button (new change by ashendra on 9/12/2020)

		// driver.findElement(By.cssSelector("#manageEmployee >
		// section.panel-toggleSwitch > div > div > div > header > div:nth-child(2) >
		// div > label")).click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

	}

	public static void stripeDetails() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// to clk on I accept checkbox

		driver.findElement(By.cssSelector("#orgSettings > div > div > div > p:nth-child(4) > input[type=checkbox]"))
				.click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// to clk on continue

		driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// to enter card number

		driver.findElement(By.name("cardNumber")).click();
		driver.findElement(By.name("cardNumber")).sendKeys("4111111111111111");

		// to enter card expiry

		driver.findElement(By.name("cardExpiry")).click();
		driver.findElement(By.name("cardExpiry")).sendKeys("12 22");

		// to enter cvv

		driver.findElement(By.name("cardCvc")).click();
		driver.findElement(By.name("cardCvc")).sendKeys("345");

		// to clk on name
		driver.findElement(By.name("billingName")).click();
		driver.findElement(By.name("billingName")).sendKeys("Auto test");

		// to enter postl code
		driver.findElement(By.name("billingPostalCode")).click();
		driver.findElement(By.name("billingPostalCode")).sendKeys("E49XL");

		// to clk on save

		//driver.findElement(By.className("SubmitButton-Icon SubmitButton-Icon--pre")).click();
		driver.findElement(By.cssSelector("#root > div > div > div.App-Payment > div > form > div:nth-child(2) > div:nth-child(4) > button > div.SubmitButton-IconContainer")).click();
		//*[@id="root"]/div/div/div[2]/div/form/div[2]/div[4]/button

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) { // TODO
			e.printStackTrace();
		}

		// to clk on back
		driver.findElement(By.cssSelector(
				"body > app > section > app-shoppingcart-confirm > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-0.border-0 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li > button > span > app-back-to-parent > i"))
				.click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) { // TODO
			e.printStackTrace();
		}

		// to clk on back to settings (new change by ashendra on 9/12/2020)

		//driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-right-0 > span > app-back-to-settings > i")).click();
		//to clk on All functions

		driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav > li:nth-child(3) > ul > li:nth-child(2) > a")).click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) { // TODO
			e.printStackTrace();
		}

	}

	public static void trialFunction()

	{

//to take trail of the expense policy
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to take trail of the expense policy
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		// driver.findElement(By.cssSelector("#\36")).click();
		driver.findElement(By.id("6")).click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// to click on subscribe

		driver.findElement(
				By.cssSelector("#place6 > div:nth-child(2) > div > div > div > div > div.card-button > button"))
				.click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// to clk on add to cart
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { // TODO
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector(
				"body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0.my-custom-tooltip-addtocart > button > span > i"))
				.click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) { // TODOAuto-generated catch block
			e.printStackTrace();
		}

		// to clk on Go to cart

		driver.findElement(By.cssSelector(
				"body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0.my-custom-tooltip-addtocart > button"))
				.click();
		
		  try { Thread.sleep(30000); } catch (InterruptedException e) { 
			  // TODO		  Auto-generated catch block 
			  e.printStackTrace(); }
		 

		
		  //to clk on proceed for trail
		  
		  driver.findElement(By.
		  xpath("//button[contains(text(), 'Proceed for 30 day Trial')]")).click();
		  
		  try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO		  Auto-generated catch block 
			  e.printStackTrace(); }
		  
		  
		  //to clk on Confirm
		  
		  driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]")).click()	;
		  
		  
		  
		  try { Thread.sleep(6000); } catch (InterruptedException e) { // TODO
		  e.printStackTrace(); }
		  
		  
		  //to clk on back
		  
		  driver.findElement(By.
		  cssSelector("body > app > section > app-shoppingcart-confirm > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-0.border-0 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li > button > span > app-back-to-parent > i"
		  )).click();
		  
		  
		  try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		  e.printStackTrace(); }
		  
		  //to clk on back to settings 
		  driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-right-0 > button > span > i"
		  )).click();
		  
		  //driver.findElement(By.cssSelector("#dashboard > div > div:nth-child(1) > div > section > div > div.col-md-6.text-right.padding-right-0 > div > ul > li > button")).click();
		  
		  
		  try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO Auto-generated catch block 
		  e.printStackTrace(); }
		 
		

	}

	public static void costCentrePurchase() {
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		// clk on cost cntre

		driver.findElement(By.cssSelector("#\\33 ")).click();

		// clk on subscribe

		driver.findElement(By.cssSelector("#place3 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// to clk on add to cart

		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0.my-custom-tooltip-addtocart > button > span > i"))
				.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// to clk on Go to cart

		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0.my-custom-tooltip-addtocart.ng-star-inserted > button > span > i")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		// clk on proceed to purch
//		driver.findElement(By.xpath("//button[contains(text(), 'Proceed to Purchase')]")).click();
//
//		// clk on Confirm
//
//		driver.findElement(By.xpath("//button[contains(text(), ' Confirm ')]")).click();
		
		
		//to clk on Pruchase
		
		driver.findElement(By.xpath("//button[contains(text(), ' Proceed to Purchase ')]")).click();
		//driver.findElement(By.cssSelector("#orgSettings > div > div > div > div.col-md-5.functionDetailRight.ng-star-inserted > div > div > div.d-block.w-100pc.float-left.mb-3 > div > div > button.d-block.btn.btn-success.mx-auto.mt-2.w-50")).click();

			
		 try { Thread.sleep(5000); } 
		  catch (InterruptedException e) { // TODAuto-generated catch block 
			  e.printStackTrace(); }
		 
		//to clk on PReview info for billing (tick) on side panel

		// driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
			driver.findElement(By.id("confirmInfoPanel")).click();
		
			
			//to clk on Preview on side panel  (new change by ashendra on 9/12/2020)
			
			//driver.findElement(By.cssSelector("#rightSideBar > div > header > div > div > div > div.col-xl-4.col-lg-4.col-md-4.col-sm-4.col-xs-4.padding-right-0.header-icons.text-right > span:nth-child(1) > i")).click();
			
				
				  try { Thread.sleep(3000); } 
				  catch (InterruptedException e) { // TODAuto-generated catch block 
					  e.printStackTrace(); }
				  
				 
			//to clk on Confirm  (new change by ashendra on 9/12/2020)
			
			 driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]")).click();
			
			
			 try { Thread.sleep(5000); } 
			  catch (InterruptedException e) { // TODAuto-generated catch block 
				  e.printStackTrace(); }
			 
			//to clk on confirm (yes) on side panel

				driver.findElement(By.cssSelector("#rightSideBar > div > div.d-flex.position-absolute.bottom-10.w-100pc.justify-content-center.bg-white.padding-15 > span:nth-child(1) > button > b")).click();
				//#rightSideBar > div > div.d-flex.position-absolute.bottom-10.w-100pc.justify-content-center.bg-white.padding-15 > span:nth-child(1) > button > b	
			 
			//enable the toggle button (new change by ashendra on 9/12/2020)
				  
				 // driver.findElement(By.cssSelector("#manageEmployee > section.panel-toggleSwitch > div > div > div > header > div:nth-child(2) > div > label")).click();
			/*
				 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PurchaseFunction pf = new PurchaseFunction();
		pf.chromeBrowser();
		pf.appUrl();
		pf.RegiApp();
		pf.purchaseFunction();
		// pf.trialFunction();

	}

}

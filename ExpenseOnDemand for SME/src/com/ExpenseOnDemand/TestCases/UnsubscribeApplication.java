package com.ExpenseOnDemand.TestCases;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

	import com.ExpenseOnDemand.utility.*;
	import com.ExpenseOnDemand.TestCases.*;


	public class UnsubscribeApplication extends RegisterApp{
		
		public static void unsubscribe()
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			/*
			 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
				//clk on profile icon
				
				driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(5) > a > i")).click();
				
			/*
			 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
				driver.findElement(By.xpath("//span[contains(text(), 'Unsubscribe ExpenseOnDemand')]")).click();
				
				//driver.findElement(By.cssSelector("body > app > section > app-nav-menu > div.container-fluid.top-bar.fixed-top > div:nth-child(1) > nav > div.profilePopup.active.ng-star-inserted > ul > li:nth-child(4) > a > p > span.font-weight-bold")).click();
				
			/*
			 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
				//add comment
				
				driver.findElement(By.cssSelector("#unsubscribe > div:nth-child(5) > textarea")).click();
				
				driver.findElement(By.cssSelector("#unsubscribe > div:nth-child(5) > textarea")).sendKeys("Automation Unsubscribe");
				
				//click on unsubscribe icon
			/*
			 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
				driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();
			
			//click on unsubscribe confirmation
				
				driver.findElement(By.xpath("//button[contains(text(), ' Unsubscribe ')]")).click();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
				}
		

		public static void main(String[] args) {
			
			UnsubscribeApplication unsub =new UnsubscribeApplication();
			unsub.chromeBrowser();
			unsub.appUrl();
			unsub.RegiApp();
			unsub.unsubscribe();
			
			// TODO Auto-generated method stub

		}

	}



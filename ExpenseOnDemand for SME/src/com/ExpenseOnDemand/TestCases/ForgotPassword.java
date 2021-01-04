package com.ExpenseOnDemand.TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ExpenseOnDemand.utility.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForgotPassword extends AppUrl{
	
	public static void forgotPass()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 50); WebElement
		 * email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eMail")
		 * ));
		 */
		/*
		 * driver.findElement(By.id("eMail")).click();
		 * driver.findElement(By.id("eMail")).clear();
		 * driver.findElement(By.id("eMail")).sendKeys("qagru@yopmail.com");
		 */
		//to clk on forgot password
		driver.findElement(By.cssSelector("#setting-wizard-new > div.setting-page > div.right-side-wizard > form:nth-child(1) > div > div > div > div:nth-child(2) > span.d-block.padding-top-5")).click();
	
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		
		driver.findElement(By.name("emailId")).click();
		driver.findElement(By.name("emailId")).sendKeys("sivta@yopmail.com");
		
		//to clk on submit
		
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();
	

		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		
		
		
	
	}
	
	public static void Yopmail()
	{
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//to enter the url
		driver.get("http://www.yopmail.com/en/");
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		//to enter the name
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("login")).sendKeys("sivta@yopmail.com");
		
		//to clk on chk email
				driver.findElement(By.className("sbut")).click();
				
				  try { Thread.sleep(10000); } catch (InterruptedException e) { 
					  // TODO Auto-generated catch block 
					  e.printStackTrace(); }
				 
				//to clk on first email
				
				//driver.findElement(By.xpath("//span[contains(text(), 'ExpenseOnDemand - Password request')]")).click();;
				//driver.findElement(By.id("m1")).click();
				
				//to switch to Frame
				
				//driver.switchTo().frame("index2");
				driver.switchTo().frame(2);
			  		driver.getWindowHandles();
			    driver.findElement(By.linkText("here")).click();
				
				//to clk on show pictures
				
				/*
				 * WebElement element= new
				 * WebDriverWait(driver,1).until(ExpectedConditions.elementToBeClickable(By.id(
				 * "affim"))); element.click();
				 */
				//driver.findElement(By.id("affim")).click();
				
				//to clk on here
				
				
				/*
				 * List<WebElement> links = driver.findElements(By.tagName("a"));
				 * 
				 * for(WebElement ele:links) System.out.println(ele.getAttribute("href"));
				 */
				//driver.findElement(By.linkText("here")).click();
				/*
				 * WebElement element= new WebDriverWait(driver,
				 * 1).until(ExpectedConditions.elementToBeClickable(By.xpath(
				 * "//a[text()='here']"))); element.click();
			
				 * Actions action=new Actions(driver);
				 * action.moveToElement(driver.findElement(By.xpath(
				 * "//a[contains(text(),'here']"))); action.perform();
				 */
				//driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/table/tbody/tr[2]/td/a")).click();
				//driver.findElement(By.cssSelector("#mailmillieu > div:nth-child(2) > table > tbody > tr:nth-child(2) > td > a")).click();
				//driver.findElement(By.linkText("here")).click();
				/*
				 * try { Thread.sleep(15000); } catch (InterruptedException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */
				
				//to switch to newly opened window
				
				String winHandleBefore = driver.getWindowHandle();
		        for(String winHandle : driver.getWindowHandles()){
		            driver.switchTo().window(winHandle);
		        }  
				
				//to clk on new password
				
				driver.findElement(By.id("newPassword")).click();
				driver.findElement(By.id("newPassword")).clear();
				driver.findElement(By.id("newPassword")).sendKeys("Aa123456");
				
				/*
				 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */
				
				//to clk on confrim new passwrd
				
				driver.findElement(By.cssSelector("#formArea > div > div > div.col-xl-6.col-lg-6.col-md-6.no-padding-right-left > div > div:nth-child(2) > div > div > input")).click();
				driver.findElement(By.cssSelector("#formArea > div > div > div.col-xl-6.col-lg-6.col-md-6.no-padding-right-left > div > div:nth-child(2) > div > div > input")).clear();

				driver.findElement(By.cssSelector("#formArea > div > div > div.col-xl-6.col-lg-6.col-md-6.no-padding-right-left > div > div:nth-child(2) > div > div > input")).sendKeys("Aa123456");

				
				//to clk on submit
				driver.findElement(By.cssSelector("#change-forgot-pwd > form > section.pageTitle-block.margin-top-0 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();
			  
				
				//to clk on id
				driver.findElement(By.id("eMail")).click();
				 driver.findElement(By.id("eMail")).clear();
		 driver.findElement(By.id("eMail")).sendKeys("sivta@yopmail.com");
		 
		 
		 driver.findElement(By.id("password")).click();
			driver.findElement(By.id("password")).clear();
			//To check entering password through string variable


			driver.findElement(By.id("password")).sendKeys("Aa123456");
			//static Data
			//driver.findElement(By.id("password")).sendKeys("Aa123456");
			//driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			
			
			//driver.findElement(By.cssSelector("#setting-wizard-new > div.setting-page > div.right-side-wizard > form:nth-child(1) > div > div > div > div.margin-top-5.btn-login > button")).click();
			
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
			driver.findElement(By.cssSelector("#setting-wizard-new > div.setting-page > div.right-side-wizard > form:nth-child(1) > div > div > div > div.margin-top-5.btn-login > button")).click();
	
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ForgotPassword fg=new ForgotPassword();
fg.chromeBrowser();
fg.appUrl();
fg.forgotPass();
fg.Yopmail();
	}

}

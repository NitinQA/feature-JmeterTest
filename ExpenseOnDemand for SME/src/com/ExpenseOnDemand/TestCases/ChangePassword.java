package com.ExpenseOnDemand.TestCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ExpenseOnDemand.utility.*;

public class ChangePassword extends NewLogin{

	public static void setPasswordOne()
	{
		//To click on profile icon
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement settings=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(3) > a > i")));

		driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(3) > a > i")).click();
		
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { //TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 */
		
		WebElement chpasswd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Change Password')]")));

		driver.findElement(By.xpath("//span[contains(text(), 'Change Password')]")).click(); 
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { //TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		//driver.findElement(By.id("exisitingPassword")).click();
		//driver.findElement(By.xpath("//input[@formcontrolname='exisitingPassword']")).click();
		//driver.switchTo().frame("exisitingPassword");
		String MainWindow=driver.getWindowHandle();
		driver.switchTo().window(MainWindow);
		WebElement existpasswd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#exisitingPassword")));

		driver.findElement(By.cssSelector("#exisitingPassword")).click();
		
		//driver.findElement(By.id("exisitingPassword")).clear();
		driver.findElement(By.id("exisitingPassword")).sendKeys(NewLogin.Password);
		//driver.findElement(By.id("exisitingPassword")).sendKeys("Aa123456");

		driver.findElement(By.id("newPassword")).click();
		//driver.findElement(By.id("newPassword")).clear();
		driver.findElement(By.id("newPassword")).sendKeys(NewLogin.NewPassword);

		//driver.findElement(By.id("newPassword")).sendKeys("Aa@123456");

		driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys(NewLogin.NewPassword);
		//driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys("Aa@123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */


		//driver.switchTo().alert();

		//driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		WebElement ok=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app > section > app-change-password > div.modal.fade.show.active > div > div > div.modal-footer > button")));

		
		driver.findElement(By.cssSelector("body > app > section > app-change-password > div.modal.fade.show.active > div > div > div.modal-footer > button")).click();
	}
	public static void setPasswordTwo()
	{
		//To click on profile icon
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement settings2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(3) > a > i")));

		driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(3) > a > i")).click();
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		driver.findElement(By.xpath("//span[contains(text(), 'Change Password')]")).click();
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//driver.findElement(By.id("exisitingPassword")).click();
		//driver.findElement(By.xpath("//input[@formcontrolname='exisitingPassword']")).click();
		//driver.switchTo().frame("exisitingPassword");
		String MainWindow=driver.getWindowHandle();
		driver.switchTo().window(MainWindow);
		WebElement existpasswd2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#exisitingPassword")));

		driver.findElement(By.cssSelector("#exisitingPassword")).click();
		//driver.findElement(By.id("exisitingPassword")).clear();
		driver.findElement(By.id("exisitingPassword")).sendKeys(NewLogin.NewPassword);
		//driver.findElement(By.id("exisitingPassword")).sendKeys("Aa123456");

		driver.findElement(By.id("newPassword")).click();
		//driver.findElement(By.id("newPassword")).clear();
		driver.findElement(By.id("newPassword")).sendKeys(NewLogin.Password);

		//driver.findElement(By.id("newPassword")).sendKeys("Aa@123456");

		driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys(NewLogin.Password);
		//driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys("Aa@123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 */
		//driver.switchTo().alert();

		//driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		WebElement ok=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app > section > app-change-password > div.modal.fade.show.active > div > div > div.modal-footer > button")));

		
		driver.findElement(By.cssSelector("body > app > section > app-change-password > div.modal.fade.show.active > div > div > div.modal-footer > button")).click();
	}
	public static void main(String[] args) {
		ChangePassword password=new ChangePassword();
		password.chromeBrowser();
		password.appUrl();
		password.loginCredentials();
		password.setPasswordOne();
		password.setPasswordTwo();
		
	}

}

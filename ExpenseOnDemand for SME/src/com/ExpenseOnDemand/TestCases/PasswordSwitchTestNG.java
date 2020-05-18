package com.ExpenseOnDemand.TestCases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ExpenseOnDemand.utility.*;



public class PasswordSwitchTestNG  extends AppUrl{

	@BeforeClass
	public void browser() {

		BrowserFactory.chromeBrowser();

	}

	@BeforeMethod
	public void appLaunch() {
		AppUrl.appUrl();

	}
	@Test()
	public static void passwordOne() //throws IOException, InterruptedException
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("eMail")).clear();
		driver.findElement(By.id("eMail")).sendKeys("conor@yopmail.com");
		driver.findElement(By.id("password")).clear();

		driver.findElement(By.id("password")).sendKeys(NewLogin.Password);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		ChangePassword.setPasswordOne();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	driver.findElement(By.id("eMail")).clear();
	driver.findElement(By.id("eMail")).sendKeys("conor@yopmail.com");
	driver.findElement(By.id("password")).clear();

	driver.findElement(By.id("password")).sendKeys(NewLogin.NewPassword);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}

	ChangePassword.setPasswordTwo();

}
	
	@AfterClass
	public void closeBrowser()
	{
		CloseBrowser.quitBrowser();
	}


/*@Test(priority=2)
	public static void passwordTwo() //throws IOException, InterruptedException
	{*/
/*
 * driver.findElement(By.id("eMail")).clear();
 * driver.findElement(By.id("eMail")).sendKeys("solomar02@yopmail.com");
 * driver.findElement(By.id("password")).clear();
 * 
 * driver.findElement(By.id("password")).sendKeys(NewLogin.Password);
 * 
 * driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
 * Auto-generated catch block e.printStackTrace();
 * //Assert.assertEquals(driver.findElement(By.
 * cssSelector("#place1 > div:nth-child(2) > div > div")).isDisplayed(),
 * "Wrong EMail or Password"); }
 * 
 * ChangePassword.setPasswordTwo();
 */
//}
/*
 * @Test(priority=2, dependsOnMethods={"passwordOne"}) public static void
 * changedPasswordone() { //ChangePassword.setPasswordOne(); }
 * 
 * @Test(priority=4, dependsOnMethods={"passwordTwo"}) public static void
 * changedPasswordtwo() { //ChangePassword.setPasswordTwo(); }
 */

}




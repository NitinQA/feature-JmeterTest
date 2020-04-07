package com.ExpenseOnDemand.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class NewLogin extends AppUrl{
	
	public static String Password="Aa123456";
	public static String NewPassword="Aa@123456";

	public static void loginCredentials() //throws IOException, InterruptedException
	{
		/*ArrayList<String> username= readExcel(0);
		ArrayList<String> password=readExcel(1);
		for(int i =0;i<username.size();i++)
		{
		*/	driver.findElement(By.id("eMail")).clear();
			driver.findElement(By.id("eMail")).sendKeys("solomar02@yopmail.com");
			driver.findElement(By.id("password")).clear();
			//To check entering password through string variable
			
			
			driver.findElement(By.id("password")).sendKeys(NewPassword);
			//static Data
			//driver.findElement(By.id("password")).sendKeys("Aa123456");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		/*
		 * if { Click succesfukll } else {
		 * driver.findElement(By.id("password")).sendKeys(Password); }
		 */
			
			
		/*
		 * driver.findElement(By.
		 * cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(4) > a > i"
		 * )).click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		 */
			
		}
	public static void logoutApp()
	{
		driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(3) > a > i")).click();
		
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				 driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	}
	public static void orgSet()
	{
		driver.findElement(By.cssSelector("#place1 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#orgSettings > div > div > div > div.col-md-4.no-padding-right-left > div.row.margin-top-20 > div > div.row.margin-top-20 > div.col-md-8.no-padding-right-left > div > button > span")).click();
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElement(By.id("orgName")).click();
		driver.findElement(By.id("orgName")).clear();
		driver.findElement(By.id("orgName")).sendKeys("Test Automation");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(1) > button > span > app-save-icon > i")).click();
		
	}
	
	  public static void main(String[] args) { NewLogin lg=new NewLogin();
	  lg.chromeBrowser(); lg.appUrl(); lg.loginCredentials(); lg.orgSet();
	  lg.logoutApp();
	  
	  }
}
	 

	/*
	 * public static void getTtl() { String title=driver.getTitle();
	 * System.out.println(title);
	 * 
	 * }
	 */



/*
 * public static ArrayList<String> readExcel(int colNo)throws IOException {
 * 
 * FileInputStream fis=new
 * FileInputStream("C:\\Users\\nehadadwal\\git\\Automation_Test\\ExpenseOnDemand for SME\\ExcelFiles\\credentials.xlsx"
 * );
 * 
 * 
 * XSSFWorkbook wb=new XSSFWorkbook(fis); XSSFSheet
 * sheet=wb.getSheet("credentials"); Iterator<Row> rowIterator=sheet.iterator();
 * rowIterator.next();
 * 
 * ArrayList<String> list= new ArrayList<String> (); while
 * (rowIterator.hasNext()) {
 * list.add(rowIterator.next().getCell(colNo).getStringCellValue());
 * 
 * } System.out.println("List is =" +list); return list;
 */

//}

/*
 * public static void main(String[] args) { LoginPage readdata=new LoginPage();
 * readdata.chromeBrowser(); readdata.appUrl(); try { try {
 * readdata.loginCredentials(); } catch (InterruptedException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } } catch (IOException e) {
 * // TODO Auto-generated catch block e.printStackTrace(); }
 */

/*
 * }
 * 
 * }
 */

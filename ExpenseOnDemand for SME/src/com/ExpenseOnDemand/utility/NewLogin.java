package com.ExpenseOnDemand.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewLogin extends AppUrl {

	public static String Password="Aa123456";
	public static String NewPassword="Aa@123456";

	public static void loginCredentials() //throws IOException, InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*ArrayList<String> username= readExcel(0);
		ArrayList<String> password=readExcel(1);
		for(int i =0;i<username.size();i++)
		{


		 */	
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 


		driver.findElement(By.id("eMail")).clear();
		driver.findElement(By.id("eMail")).sendKeys("conor@yopmail.com");
		//rkmsd to use for org
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		//To check entering password through string variable


		driver.findElement(By.id("password")).sendKeys(Password);
		//static Data
		//driver.findElement(By.id("password")).sendKeys("Aa123456");
		//driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//to clk on login
		driver.findElement(By.cssSelector("#setting-wizard-new > div.setting-page > div.right-side-wizard > form:nth-child(1) > div > div > div > div.margin-top-5.btn-login > button")).click();


		
		
		  try { Thread.sleep(5000); } catch (InterruptedException e) { 
			  // TODO		  Auto-generated catch block
			  e.printStackTrace(); }
		 
		 

	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//click on settings icon

		driver.findElement(By.id("navbarDropdown4")).click();

		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		


	
		//to clk on All functions

		 driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav > li:nth-child(3) > ul > li:nth-child(2) > a")).click();
			
		
		  try { Thread.sleep(10000); } catch (InterruptedException e) { 
			  // TODO		  Auto-generated catch block
			  e.printStackTrace(); }
		 
		 
		 
	}
	public static void logoutApp()
	{
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.
		 * cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(3) > a > i"
		 * )))).click(); // click on the compose button as soon as the "compose" button
		 * is visible
		 * 
		 */
		//driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(4) > a > i")).click();// on 18 nov 
		
		driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(5) > a > i")).click();
		//#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(4) > a > i


		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 

		//driver.findElement(By.cssSelector("body > app > section > app-nav-menu > div.container-fluid.top-bar.fixed-top > div:nth-child(1) > nav > div.profilePopup.active > ul > li:nth-child(6) > a > p > span.font-weight-bold")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();

		//driver.findElement(By.cssSelector("body > app > section > app-nav-menu > div.container-fluid.top-bar.fixed-top > div:nth-child(1) > nav > div.profilePopup.active.ng-star-inserted > ul > li:nth-child(5) > a > p > span.font-weight-bold")).click();
	}
	public static void orgSet()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//to clk on view
		driver.findElement(By.cssSelector("#place1 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();

		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 


		//click on setup
		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li.btn-default.padding-left-0 > button > span > i")).click();

		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 


		driver.findElement(By.id("orgName")).click();
		driver.findElement(By.id("orgName")).clear();
		driver.findElement(By.id("orgName")).sendKeys("Test Automation");

		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//To clk on org address

		driver.findElement(By.id("orgAddress")).click();
		driver.findElement(By.id("orgAddress")).clear();
		driver.findElement(By.id("orgAddress")).sendKeys("Automation Company,");

		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 

		//to clk on adres

		driver.findElement(By.id("orgAddress1")).click();
		driver.findElement(By.id("orgAddress1")).clear();
		driver.findElement(By.id("orgAddress1")).sendKeys("3 Street, Housing Bd.");


		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//to clk on postal code

		driver.findElement(By.id("orgPostalCode")).click();
		driver.findElement(By.id("orgPostalCode")).clear();
		driver.findElement(By.id("orgPostalCode")).sendKeys("16102");
		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 

		//to clk on city

		driver.findElement(By.id("orgCity")).click();
		driver.findElement(By.id("orgCity")).clear();
		driver.findElement(By.id("orgCity")).sendKeys("New City");
		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//to clk on icon on Country

		driver.findElement(By.cssSelector("#formArea > div > div.col-xl-8.col-lg-8.col-md-12.col-sm-12.col-xs-12.no-padding-right-left > form > div:nth-child(4) > div > ng-select > div > span")).click();
		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//to tpe in country name

		driver.findElement(By.cssSelector("#formArea > div > div.col-xl-8.col-lg-8.col-md-12.col-sm-12.col-xs-12.no-padding-right-left > form > div:nth-child(4) > div > ng-select > div > div > div.ng-input > input[type=text]")).sendKeys("India"); 
		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//to clk on India

		//driver.findElement(By.cssSelector("#adbc2ca149a1-43")).click();

		driver.findElement(By.xpath("//div[@role='option']")).click();
		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 

		//to clk on state icon

		driver.findElement(By.cssSelector("#formArea > div > div.col-xl-8.col-lg-8.col-md-12.col-sm-12.col-xs-12.no-padding-right-left > form > div:nth-child(4) > div.col-xl-6.col-lg-6.col-md-6.col-sm-12.resPadding0.padding-left-0 > ng-select > div > span")).click();
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 

		//to typ ein chd

		driver.findElement(By.cssSelector("#formArea > div > div.col-xl-8.col-lg-8.col-md-12.col-sm-12.col-xs-12.no-padding-right-left > form > div:nth-child(4) > div.col-xl-6.col-lg-6.col-md-6.col-sm-12.resPadding0.padding-left-0 > ng-select > div > div > div.ng-input > input[type=text]")).sendKeys("Chandigarh");

		//to clk on chandigarh

		driver.findElement(By.xpath("//div[@role='option']")).click();
		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		
		//click on delete icon
		
		//driver.findElement(By.cssSelector("#formArea > div > div.col-xl-4.col-lg-4.col-md-12.col-sm-12.col-xs-12.padding-right-0.res-paddingLeftZero > div > div > div > div:nth-child(1) > span > a > i")).click();
		
		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		
		// click on upload icon
		 driver.findElement(By.cssSelector("#formArea > div > div.col-lg-4.padding-right-0.res-paddingLeftZero > div > div > div:nth-child(1) > div > div > p > button")).click();
		
		 //#formArea > div > div.col-lg-4.padding-right-0.res-paddingLeftZero > div > div > div:nth-child(1) > div > div > p > button
		  try { Thread.sleep(10000); } catch (InterruptedException e) {
			  // TODO		  Auto-generated catch block
			  e.printStackTrace(); }
		 
		 
		// File upload script

			try {
				Runtime.getRuntime().exec("C:\\Users\\qaadmin\\git\\Automation_Test\\ExpenseOnDemand for SME\\EXEFile\\fileupload_logo.exe");
				
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				 
		
			
			  try { Thread.sleep(10000); } catch (InterruptedException e) {
				  // TODO		  Auto-generated catch block
				  e.printStackTrace(); }
			 
		 
			//clk on save
			//WebDriverWait wait = new WebDriverWait(driver,30);
			//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(1) > button > span > app-save-icon > i")))).click();
			// click on the compose button as soon as the "compose" button is visible
			

		//click on save
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(1) > button > span > app-save-icon > i")).click();
		
		/*
		 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */


	}

	public static void main(String[] args) {
		NewLogin lg=new NewLogin();
		lg.chromeBrowser(); 
		lg.appUrl();
		lg.loginCredentials();
		lg.orgSet();
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

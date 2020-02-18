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



public class LoginPage extends AppUrl{

	public void loginCredentials() throws IOException, InterruptedException
	{
		ArrayList<String> username= readExcel(0);
		ArrayList<String> password=readExcel(1);
		for(int i =0;i<username.size();i++)
		{
			//driver.findElement(By.id("eMail")).clear();
			driver.findElement(By.id("eMail")).sendKeys(username.get(i));
			//driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("password")).sendKeys(password.get(i));
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			Thread.sleep(6000);
			driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(4) > a > i")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		}
	}

	public ArrayList<String> readExcel(int colNo)throws IOException {

		FileInputStream fis=new FileInputStream("C:\\Users\\nehadadwal\\git\\Automation_Test\\ExpenseOnDemand for SME\\ExcelFiles\\credentials.xlsx");


		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("credentials");
		Iterator<Row> rowIterator=sheet.iterator();
		rowIterator.next();

		ArrayList<String> list= new ArrayList<String> ();
		while (rowIterator.hasNext()) {
			list.add(rowIterator.next().getCell(colNo).getStringCellValue());

		}
		System.out.println("List is =" +list);
		return list;


	}

	/*public static void main(String[] args) 
	{
		LoginPage readdata=new LoginPage();
		readdata.chromeBrowser();
		readdata.appUrl();
		try {
			try {
				readdata.loginCredentials();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}


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



public class ProdLogin extends ProdUrl{

	public void loginCredentials() throws IOException, InterruptedException
	{
		ArrayList<String> username= readExcel(0);
		ArrayList<String> password=readExcel(1);
		for(int i =0;i<username.size();i++)
		{
			//driver.findElement(By.id("eMail")).clear();
			driver.findElement(By.id("email_login")).sendKeys(username.get(i));
			//driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("login_password")).sendKeys(password.get(i));
			driver.findElement(By.name("Login")).click();
			Thread.sleep(10000);
			driver.findElement(By.className("u-name")).click();
			Thread.sleep(6000);
			driver.findElement(By.cssSelector("#aLogOff > span > button > img")).click();
		}
	}

	public ArrayList<String> readExcel(int colNo)throws IOException {
		String filepath=System.getProperty("user.dir");


		FileInputStream fis=new FileInputStream(filepath+"\\ExcelFiles\\prodcred.xlsx");


		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("prodcred");
		Iterator<Row> rowIterator=sheet.iterator();
		rowIterator.next();

		ArrayList<String> list= new ArrayList<String> ();
		while (rowIterator.hasNext()) {
			list.add(rowIterator.next().getCell(colNo).getStringCellValue());

		}
		System.out.println("List is =" +list);
		return list;


	}
/*public static void main(String[] args) {
	ProdLogin pl=new ProdLogin();
	pl.chromeBrowser();
	pl.prodUrl();
	try {
		pl.loginCredentials();
	} catch (IOException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
}




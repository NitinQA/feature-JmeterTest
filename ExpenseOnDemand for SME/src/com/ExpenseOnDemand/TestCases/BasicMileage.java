package com.ExpenseOnDemand.TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import java.io.IOException;



import com.ExpenseOnDemand.utility.*;
public class BasicMileage extends NewLogin{

	public static void setupMileage()
	{
		driver.findElement(By.xpath("//a[contains(text(), 'Mileage Rates')]")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("#place8 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span > i")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//click on 4 wheeler tab
		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).clear();


		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).sendKeys("0.60");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on 2 wheeler tab
		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).clear();


		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).sendKeys("0.20");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on save
		driver.findElement(By.cssSelector("#save > span > app-save-icon > i")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//click on Back to Settings
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(3) > span > app-back-to-settings > i")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//chaning back to initial
		driver.findElement(By.xpath("//a[contains(text(), 'Mileage Rates')]")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("#place8 > div:nth-child(2) > div > div > div:nth-child(1) > div > div.card-button > button")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("body > app > section > app-addtocartfuntion > div.container-fluid.padding-LR-15 > section.pageTitle-block.margin-top-5 > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(2) > button > span > i")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//click on 4 wheeler tab
		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).clear();


		driver.findElement(By.xpath("//input[@formcontrolname='fourwheelerrate']")).sendKeys("0.45");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on 2 wheeler tab
		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).clear();


		driver.findElement(By.xpath("//input[@formcontrolname='twowheelerrate']")).sendKeys("0.25");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on save
		driver.findElement(By.cssSelector("#save > span > app-save-icon > i")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//click on Back to Settings
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#manageEmployee > section.pageTitle-block > div > div > div.col-md-6.text-right.padding-right-0 > div > ul > li:nth-child(3) > span > app-back-to-settings > i")).click();



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicMileage mileage=new BasicMileage();
		mileage.chromeBrowser();
		mileage.appUrl();
		mileage.loginCredentials();
		mileage.setupMileage();
		mileage.logoutApp();
	}

}

package appModules;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.CorporateCreateExpense_Page;
import pageObjects.CorporateHome_Page;
import pageObjects.PersonalHome_Page;
import utility.ExcelUtils;
import utility.Log;
import utility.Constant_CreateExpense;

public class CreateBusinessExp_Action {
	
	


	public static void Execute (int iTestCaseRow) throws Exception {
		
		String SwitchExpense = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
		
		CorporateHome_Page.CreateExpense().click();
		Thread.sleep(15000);
		System.out.println("Switch case : "+SwitchExpense);
			
		switch (SwitchExpense) {
		
		case "Entertainment - Clients":
		
		{
		
			String sExpCat = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
			CorporateCreateExpense_Page.SelectExpType(sExpCat);
			Log.info("Selected expense type is :"+sExpCat);
			Thread.sleep(5000);
			
			String sExpCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
			CorporateCreateExpense_Page.SelectExpCat(sExpCategory);
			Log.info("Selected category is :"+sExpCategory);
			Thread.sleep(5000);
			
			String sAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
			CorporateCreateExpense_Page.Amount(sAmount);
			Log.info("Amount entered :"+sAmount);
			Thread.sleep(5000);
			
			String sSuplier = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Supplier);
			CorporateCreateExpense_Page.Supplier(sSuplier);
			Log.info("Supplier name is :"+sSuplier);
			Thread.sleep(5000);
			
			String nEmployee = ExcelUtils.getCellData(iTestCaseRow,Constant_CreateExpense.Col_Employees);
			CorporateCreateExpense_Page.Employees(nEmployee);
			Log.info("Number of Employees :"+nEmployee);
			Thread.sleep(5000);
			
		}
		break;
			
			
			
		case "Hotels & Lodgings":
			
		{
			
			String sExpCat = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
			CorporateCreateExpense_Page.SelectExpType(sExpCat);
			Log.info("Selected expense type is :"+sExpCat);
			Thread.sleep(5000);
			
			String sExpCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
			CorporateCreateExpense_Page.SelectExpCat(sExpCategory);
			Log.info("Selected category is :"+sExpCategory);
			Thread.sleep(5000);
			
			String sAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
			CorporateCreateExpense_Page.Amount(sAmount);
			Log.info("Amount entered :"+sAmount);
			Thread.sleep(5000);
		
			String sSuplier = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Supplier);
			CorporateCreateExpense_Page.Supplier(sSuplier);
			Log.info("Supplier name is :"+sSuplier);
			Thread.sleep(5000);
			
			String sRooms = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_NumberOfRooms);
			CorporateCreateExpense_Page.Rooms(sRooms);
			Log.info("Number of rooms :"+sRooms);
			Thread.sleep(5000);
			
			String sNights = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_NumberOfNights);
			CorporateCreateExpense_Page.Nights(sNights);;
			Log.info("Number of nights :"+sNights);
			Thread.sleep(5000);
			
			
		}
		break;
			
			
		case "Mileage":
			
		{
			
			String sExpCat = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
			CorporateCreateExpense_Page.SelectExpType(sExpCat);
			Log.info("Selected expense type is :"+sExpCat);
			Thread.sleep(5000);
			
			
			String sExpCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
			CorporateCreateExpense_Page.SelectExpCat(sExpCategory);
			Log.info("Selected category is :"+sExpCategory);
			Thread.sleep(5000);
								
			String sFrom = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_From);
			CorporateCreateExpense_Page.From(sFrom);
			Log.info("From Distance entered :"+sFrom);
			Thread.sleep(5000);
			
			String sTo = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_To);
			CorporateCreateExpense_Page.To(sTo);
			Log.info("To Distance entered :"+sTo);
			Thread.sleep(5000);
		
			String sDistance = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Distance);
			CorporateCreateExpense_Page.Distance(sDistance);
			Log.info("Distance entered :"+sDistance);
			Thread.sleep(5000);
			
			String sRatePerMileKm = CorporateCreateExpense_Page.RatePerMileKm();
			Log.info("Rate per mile/km is :"+sRatePerMileKm);
			Thread.sleep(5000);
			
			String sCalcMileRate = CorporateCreateExpense_Page.MileageAmount();
			Log.info("Rate per mile/km is :"+sCalcMileRate);
			Thread.sleep(5000);
			
			String aCorrectAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
			
			try {
				
				if (sCalcMileRate.equals(aCorrectAmount)) {
					Log.info("Mileage amount is calculated correct");	
					System.out.println("Mileage amount is calculated correct");
				}
				
			} catch (Exception e) {
				Log.error("Mileage amount is not calculated correct");	
				System.out.println("Mileage amount is not calculated correct");
			}
		
			
			
			
		}
			
			break;
			
			
		default:
						
		{
			String sExpCat = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
			CorporateCreateExpense_Page.SelectExpType(sExpCat);
			Log.info("Selected expense type is : "+sExpCat);
			Thread.sleep(8000);
			
			String sExpCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
			CorporateCreateExpense_Page.SelectExpCat(sExpCategory);
			Log.info("Selected category is : "+sExpCategory);
			Thread.sleep(3000);
				
			String sAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
			CorporateCreateExpense_Page.Amount(sAmount);
			Log.info("Amount entered : "+sAmount);
			Thread.sleep(3000);
		
			String sSuplier = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Supplier);
			CorporateCreateExpense_Page.Supplier(sSuplier);
			Log.info("Supplier name is : "+sSuplier);
			Thread.sleep(3000);
			}
				
			
		
		break;
				
		}
		CorporateCreateExpense_Page.Save();
		Thread.sleep(10000);
		
		
				
	}
	
	

}

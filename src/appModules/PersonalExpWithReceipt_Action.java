package appModules;

import pageObjects.PersonalCreateExpense_Page;
import pageObjects.PersonalHome_Page;
import utility.ExcelUtils;
import utility.Log;
import utility.Constant_CreateExpense;

public class PersonalExpWithReceipt_Action {
	
	public static class PersonalExpWithReceiptPDF_Action {

	public static void Execute (int iTestCaseRow) throws Exception {
			
		PersonalHome_Page.CreateExpense().click();
		

		String sExpType = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
		PersonalCreateExpense_Page.SelectExpType(sExpType);
		Thread.sleep(8000);
		
		
		String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
		PersonalCreateExpense_Page.SelectPersonalExpCat(sCategory);
		Thread.sleep(5000);
		
		
		String sAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
		PersonalCreateExpense_Page.PersonalAmount(sAmount);
		//Thread.sleep(5000);
		
		String sSuplier = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Supplier);
		PersonalCreateExpense_Page.Supplier(sSuplier);
		//Thread.sleep(5000);
		
		PersonalCreateExpense_Page.UploadPDFReceipt();
		Thread.sleep(5000);	
		
		PersonalCreateExpense_Page.Save();
		//Thread.sleep(5000);
		
				
	}

}




public static class PersonalExpWithReceiptPNG_Action {
	
	

	public static void Execute (int iTestCaseRow) throws Exception {
			
		
		PersonalHome_Page.CreateExpense().click();
		

		String sExpType = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
		PersonalCreateExpense_Page.SelectExpType(sExpType);
		Thread.sleep(8000);
		
		
		String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
		PersonalCreateExpense_Page.SelectPersonalExpCat(sCategory);
		Thread.sleep(5000);
		
		
		String sAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
		PersonalCreateExpense_Page.PersonalAmount(sAmount);
		//Thread.sleep(5000);
		
		String sSuplier = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Supplier);
		PersonalCreateExpense_Page.Supplier(sSuplier);
		//Thread.sleep(5000);
		
		PersonalCreateExpense_Page.UploadPNGReceipt();
		Thread.sleep(5000);	
		
		PersonalCreateExpense_Page.Save();
		//Thread.sleep(5000);
		
				
	}

}



public static class PersonalExpWithReceiptPNGandPDF_Action {
	
	

	public static void Execute (int iTestCaseRow) throws Exception {
			
		
		PersonalHome_Page.CreateExpense().click();


		String sExpType = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
		PersonalCreateExpense_Page.SelectExpType(sExpType);
		Thread.sleep(8000);
		
		
		String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
		PersonalCreateExpense_Page.SelectPersonalExpCat(sCategory);
		Thread.sleep(5000);
		
		
		String sAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
		PersonalCreateExpense_Page.PersonalAmount(sAmount);
		//Thread.sleep(2000);
		
		String sSuplier = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Supplier);
		PersonalCreateExpense_Page.Supplier(sSuplier);
		//Thread.sleep(2000);
		
		PersonalCreateExpense_Page.UploadPDFandPNGReceipt();
		Thread.sleep(2000);	

		
		PersonalCreateExpense_Page.Save();
		//Thread.sleep(5000);
		
				
	}
}
}

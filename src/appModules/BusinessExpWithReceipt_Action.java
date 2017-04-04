package appModules;


import pageObjects.CorporateCreateExpense_Page;
import pageObjects.CorporateHome_Page;
import utility.ExcelUtils;
import utility.Log;
import utility.Constant_CreateExpense;

public class BusinessExpWithReceipt_Action {
	
	public static class BusinessExpWithReceiptPDF_Action {

	public static void Execute (int iTestCaseRow) throws Exception {
			
		
		
		CorporateHome_Page.CreateExpense().click();
		
		String sExpType = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
		CorporateCreateExpense_Page.SelectExpType(sExpType);
		Thread.sleep(5000);
		
		
		String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
		CorporateCreateExpense_Page.SelectExpCat(sCategory);
		Thread.sleep(5000);
		
		
		String sAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
		CorporateCreateExpense_Page.Amount(sAmount);
		//Thread.sleep(5000);
		
		String sSuplier = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Supplier);
		CorporateCreateExpense_Page.Supplier(sSuplier);
		//Thread.sleep(5000);
		
		CorporateCreateExpense_Page.scrollup();
		
		CorporateCreateExpense_Page.UploadPDFReceipt();
				
		Thread.sleep(5000);	
		
		CorporateCreateExpense_Page.Save();
		Thread.sleep(5000);
		
				
	}

}




public static class BusinessExpWithReceiptPNG_Action {
	
	

	public static void Execute (int iTestCaseRow) throws Exception {
			
		
		CorporateHome_Page.CreateExpense().click();
			
		String sExpType = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
		CorporateCreateExpense_Page.SelectExpType(sExpType);
		Thread.sleep(5000);
		
		
		String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
		CorporateCreateExpense_Page.SelectExpCat(sCategory);
		Thread.sleep(5000);
		
		
		String sAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
		CorporateCreateExpense_Page.Amount(sAmount);
		//Thread.sleep(5000);
		
		String sSuplier = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Supplier);
		CorporateCreateExpense_Page.Supplier(sSuplier);
		//Thread.sleep(5000);
		
		CorporateCreateExpense_Page.scrollup();
		
		CorporateCreateExpense_Page.UploadPNGReceipt();
		Thread.sleep(5000);	
		
		CorporateCreateExpense_Page.Save();
		//Thread.sleep(5000);
		
				
	}

}



public static class BusinessExpWithReceiptPNGandPDF_Action {
	
	

	public static void Execute (int iTestCaseRow) throws Exception {
			
		
		CorporateHome_Page.CreateExpense().click();
		
		String sExpType = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
		CorporateCreateExpense_Page.SelectExpType(sExpType);
		Thread.sleep(8000);
		
		
		String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
		CorporateCreateExpense_Page.SelectExpCat(sCategory);
		Thread.sleep(3000);
		
		
		String sAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
		CorporateCreateExpense_Page.Amount(sAmount);
		//Thread.sleep(5000);
		
		String sSuplier = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Supplier);
		CorporateCreateExpense_Page.Supplier(sSuplier);
		//Thread.sleep(5000);
		
		CorporateCreateExpense_Page.scrollup();
		
		CorporateCreateExpense_Page.UploadPDFandPNGReceipt();;

		//Thread.sleep(5000);	
		
		CorporateCreateExpense_Page.Save();
		Thread.sleep(3000);
		
						
	}
}
}

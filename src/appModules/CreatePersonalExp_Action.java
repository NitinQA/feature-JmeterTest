package appModules;


import pageObjects.PersonalCreateExpense_Page;
import pageObjects.PersonalHome_Page;
import utility.Constant_CreateExpense;
import utility.ExcelUtils;
import utility.Log;



public class CreatePersonalExp_Action {

	public static void Execute (int iTestCaseRow) throws Exception {
		
	
			
			try {
				 PersonalHome_Page.CreateExpense().click();
				Log.info("Create Expense Page opened");
			} catch (Exception e) {
				Log.error("Create Expense page is not  opened");
				
				throw (e);
			}

			String sExpType = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseType);
			System.out.printf("Selected Expense Type is : ", iTestCaseRow);
			PersonalCreateExpense_Page.SelectExpType(sExpType);
			Log.info("Selected expense type is :"+sExpType);
			Thread.sleep(5000);
			
			
			String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_ExpenseCategory);
			System.out.printf("Selected Expense Category is : ",sCategory);
			PersonalCreateExpense_Page.SelectPersonalExpCat(sCategory);
			Log.info("Selected category is :"+sCategory);
			Thread.sleep(5000);
			
			
			String sAmount = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Amount);
			PersonalCreateExpense_Page.PersonalAmount(sAmount);
			Log.info("Amount entered :"+sAmount);
			Thread.sleep(5000);
			
			String sSuplier = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Supplier);
			PersonalCreateExpense_Page.Supplier(sSuplier);
			Log.info("Supplier name is :"+sSuplier);
			Thread.sleep(5000);
			
			PersonalCreateExpense_Page.Save();
			Thread.sleep(5000);
			
					
		}

	}

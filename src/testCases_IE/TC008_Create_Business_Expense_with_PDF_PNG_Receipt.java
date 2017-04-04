package testCases_IE;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjects.BaseClass;
import utility.Constant_CreateExpense;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import appModules.BusinessExpWithReceipt_Action;
import appModules.CheckCorporateOrPersonal_Action;
import appModules.SignIn_Action;
import appModules.SignOut_Action;

public class TC008_Create_Business_Expense_with_PDF_PNG_Receipt {


	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;

  @BeforeMethod
  public void beforeMethod() throws Exception {
	  	DOMConfigurator.configure("log4j.xml");
	   	sTestCaseName = this.toString();
	  	
	  	sTestCaseName = Utils.getTestCaseName(this.toString());
	  	
	  	// Start printing the logs and printing the Test Case name
		Log.startTestCase(sTestCaseName);
		
		// Setting up the Test Data Excel file using Constants variables
		ExcelUtils.setExcelFile(Constant_CreateExpense.Path_TestData + Constant_CreateExpense.File_TestData,"IE");
		
		// Fetching the Test Case row number from the Test Data Sheet
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant_CreateExpense.Col_TestCaseName);
		
		// Launching the browser, this will take the Browser Type from Test Data Sheet 
		driver = Utils.OpenBrowser(iTestCaseRow);
		
		// Initializing the Base Class for Selenium driver
		new BaseClass(driver);  
        }
  
  // This is the starting of the Main Test Case
  @Test
  public void CreateBusinessExpensewithPDFandPNGReceipt() throws Exception {
	  
	
	  
	  try{
		  
			SignIn_Action.Execute(iTestCaseRow);
			Thread.sleep(10000);
			CheckCorporateOrPersonal_Action.CheckCorporateOrPersonal.Execute();
			CheckCorporateOrPersonal_Action.SwitchToBusinessOwnerScreen.Execute();
			Thread.sleep(5000);
			BusinessExpWithReceipt_Action.BusinessExpWithReceiptPNGandPDF_Action.Execute(iTestCaseRow);
			SignOut_Action.Execute();
			Thread.sleep(5000);
		
		
		//Check whether the test case is pass or fail
		if(BaseClass.bResult==true){
			
			ExcelUtils.setCellData("Pass", iTestCaseRow, Constant_CreateExpense.Col_Result);
		}else{
			throw new Exception("Test Case Failed because of Verification");
		}
		
	  // Below are the steps you may like to perform in case of failed test or any exception faced before ending your test 
	  }catch (Exception e){
		  
		  ExcelUtils.setCellData("Fail", iTestCaseRow, Constant_CreateExpense.Col_Result);
		  
		  Utils.takeScreenshot(driver, sTestCaseName);
		  
		  Log.error(e.getMessage());
		  
		  throw (e);
	  }
		
  }
		
  		
  @AfterMethod
  public void afterMethod() throws Exception {
	    
	    Log.endTestCase(sTestCaseName);
	    
	    driver.close();
	    Thread.sleep(3000);
	    
	   /* try {
			SendFileEmail.execute("index.html");
			Log.info("Report emailed successfully");
			
		} catch (Exception e) {
			
			Log.error("Email not sent");
			
			throw (e);
		}*/
	    
	   }
  

}


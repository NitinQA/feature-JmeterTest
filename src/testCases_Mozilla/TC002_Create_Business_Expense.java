package testCases_Mozilla;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjects.BaseClass;
import pageObjects.CorporateCreateExpense_Page;
import utility.Constant_CreateExpense;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import appModules.CheckCorporateOrPersonal_Action;
import appModules.CheckExpenseSaved_Action;
import appModules.CreateBusinessExp_Action;
import appModules.SignIn_Action;
import appModules.SignOut_Action;

public class TC002_Create_Business_Expense {


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
		ExcelUtils.setExcelFile(Constant_CreateExpense.Path_TestData + Constant_CreateExpense.File_TestData,"Mozilla");
		
		// Fetching the Test Case row number from the Test Data Sheet
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant_CreateExpense.Col_TestCaseName);
		
		// Launching the browser, this will take the Browser Type from Test Data Sheet 
		driver = Utils.OpenBrowser(iTestCaseRow);
		
		// Initializing the Base Class for Selenium driver
		new BaseClass(driver);  
        }
  
  // This is the starting of the Main Test Case
  @Test
  public void CreateBusinessExpense() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, 30000);
	  
	  try{
	  
		// Here we are calling the SignIN Action and passing argument (iTestCaseRow)
			SignIn_Action.Execute(iTestCaseRow);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divSelectionSegmentedControl']/label[1]")));
			CheckCorporateOrPersonal_Action.CheckCorporateOrPersonal.Execute();	
			CheckCorporateOrPersonal_Action.SwitchToBusinessOwnerScreen.Execute();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divSelectionSegmentedControl']/label[2]")));
			CheckCorporateOrPersonal_Action.CheckCorporateOrPersonal.Execute();
			CreateBusinessExp_Action.Execute(iTestCaseRow);
			
			//CheckExpenseSaved_Action.CheckExpenseSaved.Execute();
			SignOut_Action.Execute();
			Thread.sleep(5000);
			
			if(BaseClass.bResult==true){
				
				ExcelUtils.setCellData("Pass", iTestCaseRow, Constant_CreateExpense.Col_Result);
			}else{
				throw new Exception("Test Case Failed because of Verification");
			}
			
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
	    
 
	   }
  

}


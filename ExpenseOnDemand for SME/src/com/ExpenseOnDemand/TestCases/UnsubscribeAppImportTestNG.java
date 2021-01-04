
	package com.ExpenseOnDemand.TestCases;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import com.ExpenseOnDemand.utility.AppUrl;
	import com.ExpenseOnDemand.utility.BrowserFactory;
	import com.ExpenseOnDemand.utility.CloseBrowser;
	import com.ExpenseOnDemand.utility.NewLogin;

	public class UnsubscribeAppImportTestNG {
		
		@BeforeClass
		public void browser() {

			BrowserFactory.chromeBrowser();

		}

		@BeforeMethod
		public void appLaunch() {
			AppUrl.appUrl();
		}
		
		@Test
		public void unsubscribe()
		{
			RegisterApp.RegiApp();
	/*
	 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 */
			 SetCurrency.currencyChange();
	
	/*
	 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 */
	 
			
			ManageEmployee.ManageEmp();
	/*  
	 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 */
			
			ImportEmployee.ImportEmp();
	
	  try { Thread.sleep(10000); } catch (InterruptedException e) { 
		  // TODO		  Auto-generated catch block
		  e.printStackTrace(); }
	  
	  GradeImport.importGrade();
	  
	  try { Thread.sleep(10000); } catch (InterruptedException e) { 
		  // TODO		  Auto-generated catch block
		  e.printStackTrace(); }
	 
			UnsubscribeApplication.unsubscribe();
	/*
	 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 */
		}
		
			
			@AfterMethod
			public void closeBrowser()
			{
				CloseBrowser.quitBrowser();
			}
	}



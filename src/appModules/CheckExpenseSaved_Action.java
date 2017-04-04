package appModules;

import org.openqa.selenium.WebElement;

import junit.framework.TestResult;
import pageObjects.Home_Page;
import pageObjects.TestResult_Page;
import utility.ExcelUtils;
import utility.Log;

public class CheckExpenseSaved_Action {
	public static class CheckExpenseSaved {
	
	public static void Execute (){
		
		if ( TestResult_Page.ConfirmSave().isDisplayed()) {
			System.out.println("Expense Saved");
				
		} else {
			System.out.println("Expense not Saved");

		}
	
	}
	}	
}

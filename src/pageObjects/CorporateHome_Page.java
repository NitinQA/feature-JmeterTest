package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;


public class CorporateHome_Page extends BaseClass{
    private static WebElement element = null;
   
public CorporateHome_Page(WebDriver driver){
    	super(driver);
}
		
		public static WebElement CreateExpense() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divBusinessOwner']/div[1]/div[3]/a/div[1]/table/tbody/tr/td[3]/h4[@id='lblCreateExpense']"));
	        	Log.info("Create Expense tile is vissible");
	      
            }catch (Exception e){
            	Log.error("Create Expense tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement UploadReceipts() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divCorporate']/div[1]/div[5]/a[@id='uploadreceipts']/div/table/tbody/tr/td[3]/h4[@id='lblUploadReceipt']"));
	        
	            Log.info("Upload Receipts tile is vissible");
            }catch (Exception e){
            	Log.error("Upload Receipts tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement CardImport() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divCorporate']/div[1]/div[7]/a[@href='/Expense/ImportStatement']/div/table/tbody/tr/td[3]/h4[@id='lblImportCardStatement']"));
	        
	            Log.info("Card Import tile is vissible");
            }catch (Exception e){
            	Log.error("Card Import tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement RequestAdvance() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divCorporate']/div[1]/div[9]/a[@href='/AdvanceManagement/AdvanceList']/div/table/tbody/tr/td[3]/h4[@id='lblAdvanceRequest']"));
	        
	            Log.info("Request Advance tile is vissible");
            }catch (Exception e){
            	Log.error("Request Advance tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement ExpenseList() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divCorporate']/div[2]/div[3]/a[@id='OrganisationExpenseList']/div/table/tbody/tr/td[3]/h4[@id='lblExpenseList']"));
	        
	            Log.info("Expense List tile is vissible");
            }catch (Exception e){
            	Log.error("Expense List tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
        
    	public static WebElement Reports() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divCorporate']/div[2]/div[5]/a[@id='expensereport']/div/table/tbody/tr/td[3]/h4[@id='lblCreateReport']"));
	        
	            Log.info("Reports tile is vissible");
            }catch (Exception e){
            	Log.error("Reports tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
    	
    	public static WebElement IncompleteCardExpenses() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divCorporate']/div[2]/div[7]/a[@id='aIncompleteCardExpenses']/div/table/tbody/tr/td[3]/h4[@id='lblIncompleteCardExpenses']"));
	        
	            Log.info("Incomplete Card Expenses tile is vissible");
            }catch (Exception e){
            	Log.error("Incomplete Card Expenses tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
    	
    	public static WebElement Approvals() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divCorporate']/div[3]/div[3]/a[@id='approverlist']/div/table/tbody/tr/td[3]/h4[@id='lblApproverDashboard']"));
	        
	            Log.info("Approvals tile is vissible");
            }catch (Exception e){
            	Log.error("Approvals tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
    	
    	public static WebElement FinanceApprovals() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divCorporate']/div[3]/div[5]/a[@id='financeapproverlist']/div/table/tbody/tr/td[3]/h4[@id='lblFinanceApproval']"));
	        
	            Log.info("Finance Approvals tile is vissible");
            }catch (Exception e){
            	Log.error("Finance Approvals tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
    	
    	public static WebElement Upgrade() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divCorporate']/div[3]/div[7]/a[@id='idIndex']/div/table/tbody/tr/td[3]/h4[@id='lblUpgrade']"));
	        
	            Log.info("Upgrade tile is vissible");
            }catch (Exception e){
            	Log.error("Upgrade tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
    	
    	public static WebElement Organisationdashboard() throws Exception{
            try{
	        	element = driver.findElement(By.id("//*[@id='divCorporate']/div[4]/div[3]/a[@id='idEdit']/div/table/tbody/tr/td[3]/h4[@id='lblOrganisationSettings']"));
	        
	            Log.info("Organisation dashboard tile is vissible");
            }catch (Exception e){
            	Log.error("Organisation dashboard tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
    	
    

}



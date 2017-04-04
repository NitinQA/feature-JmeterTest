package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;


public class PersonalHome_Page extends BaseClass{
    private static WebElement element = null;
   
public PersonalHome_Page(WebDriver driver){
    	super(driver);
}
		
		public static WebElement CreateExpense() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divPersonal']/div[1]/div[3]/a[@id='CreateExpense']/div/table/tbody/tr/td[3]/h4[@id='lblCreateExpense']"));
	        
	            Log.info("Create Expense tile is vissible");
            }catch (Exception e){
            	Log.error("Create Expense tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement UploadReceipts() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divPersonal']/div[1]/div[5]/a[@id='uploadreceipts']/div/table/tbody/tr/td[3]/h4[@id='lblUploadReceipt']"));
	        
	            Log.info("Upload Receipts tile is vissible");
            }catch (Exception e){
            	Log.error("Upload Receipts tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement CardImport() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divPersonal']/div[1]/div[7]/a[@href='/Expense/ImportStatement']/div/table/tbody/tr/td[3]/h4[@id='lblImportCardStatement']"));
	        
	            Log.info("Card Import tile is vissible");
            }catch (Exception e){
            	Log.error("Card Import tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement ExpenseList() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divPersonal']/div[2]/div[3]/a[@id='expenselist']/div/table/tbody/tr/td[3]/h4[@id='lblExpenseList']"));
	        
	            Log.info("Expense List tile is vissible");
            }catch (Exception e){
            	Log.error("Expense List tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
        
    	public static WebElement Reports() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divPersonal']/div[2]/div[5]/a[@id='expensereport']/div/table/tbody/tr/td[3]/h4[@id='lblCreateReport']"));
	        
	            Log.info("Reports tile is vissible");
            }catch (Exception e){
            	Log.error("Reports tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
    	
    	public static WebElement IncomplateCardExpenses() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divPersonal']/div[2]/div[7]/a[@id='aIncompleteCardExpenses']/div/table/tbody/tr/td[3]/h4[@id='lblIncompleteCardExpenses']"));
	        
	            Log.info("Incomplate Card Expenses tile is vissible");
            }catch (Exception e){
            	Log.error("Incomplate Card Expenses tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
    	
    	public static WebElement Invite() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divPersonal']/div[3]/div[3]/a[@id='invitefriends']/div/table/tbody/tr/td[3]/h4[@id='lblInvite']"));
	        
	            Log.info("Invite tile is vissible");
            }catch (Exception e){
            	Log.error("Invite tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
    	
    	public static WebElement Account() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divPersonal']/div[4]/div[3]/a[@id='userprofile']/div/table/tbody/tr/td[3]/h4[@id='lblAccount']"));
	        
	            Log.info("Account tile is vissible");
            }catch (Exception e){
            	Log.error("Account tile not is vissible");
           		throw(e);
           		}
           	return element;
        }
    	
    	public static WebElement Application() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divPersonal']/div[4]/div[5]/a[@id='UserSetting']/div/table/tbody/tr/td[3]/h4[@id='lblApplication']"));
	        
	            Log.info("Application tile is vissible");
            }catch (Exception e){
            	Log.error("Application tile not is vissible");
           		throw(e);
           		}
           	return element;
        }

}



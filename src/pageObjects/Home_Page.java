package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

    public class Home_Page extends BaseClass{
            private static WebElement element = null;
           
        public Home_Page(WebDriver driver){
            	super(driver);
        }    
     
        public static WebElement lnk_LogOut() throws Exception{
            try{
	        	element = driver.findElement(By.id("LogOut"));
	        
	            Log.info("Log Out is found on the Home Page");
            }catch (Exception e){
            	Log.error("Log Out is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }
        
        
   
        
        public static WebElement switchHousehold() {
        	
        	element = driver.findElement(By.xpath("//*[@id='divSelectionSegmentedControl']/label[1]"));
        	
			return element;
        }
        
        public static WebElement switchBusinessOwner() {
        	
        	element = driver.findElement(By.xpath("//*[@id='divSelectionSegmentedControl']/label[2]"));
        	
			return element;
        }
        
        
        public static WebElement CorporateScreen() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divBusinessOwner']"));
	        
	            Log.info("Corporate screen is displayed");
            }catch (Exception e){
            	Log.error("Corporate screen is not displayed");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement PersonalScreen() throws Exception{
            try{
	        	element = driver.findElement(By.xpath("//*[@id='divPersonal']"));
	        
	            Log.info("Personal screen is displayed");
            }catch (Exception e){
            	Log.error("Personal screen is not displayed");
           		throw(e);
           		}
           	return element;
        }
               
       

      
    }

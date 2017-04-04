package pageObjects;
        import org.openqa.selenium.*;

import utility.Log;
    public class LogIn_Page extends BaseClass {
           private static WebElement element = null;
        
        public LogIn_Page(WebDriver driver){
            	super(driver);
        }   
        
        public static WebElement img_SOLOweb() throws Exception{
            try{ 
            	
	        	 element = driver.findElement(By.xpath("//*[@id='Solologo']"));
	             Log.info("SOLO Expenses logo image appears on the screen");
            }catch (Exception e){
           		Log.error("SOLO Expenses logo image is not found on the screen");
           		throw(e);
           		}
           	return element;
        }
           	
        public static WebElement txtbx_UserName() throws Exception{
        	try{
	            element = driver.findElement(By.id("email_login"));
	            Log.info("Username text box is found on the Login Page");
        	}catch (Exception e){
           		Log.error("UserName text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement txtbx_Password() throws Exception{
        	try{
	        	element = driver.findElement(By.id("login_password"));
	            Log.info("Password text box is found on the Login page");
        	}catch (Exception e){
        		Log.error("Password text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement btn_LogIn() throws Exception{
        	try{
	        	element = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[7]/input"));
	            Log.info("Submit button is found on the Login page");
        	}catch (Exception e){
        		Log.error("Submit button is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
    }

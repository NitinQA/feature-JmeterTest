package utility;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
		public static WebDriver driver = null;
	public static WebDriver OpenBrowser(int iTestCaseRow) throws Exception{
		String driverpath = "D://Testing//Workspace//SOLO_OnBoarding//Drivers//";
		String sBrowserName;
		try{
		sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant_CreateExpense.Col_Browser);
		if(sBrowserName.equals("Mozilla")){
			driver = new FirefoxDriver();
			Log.info("New Firefox driver instantiated");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    Log.info("Implicit wait applied on the driver for 10 seconds");
		    driver.get(Constant_CreateExpense.URL);
		    Log.info("Web application launched successfully");
		    driver.manage().window().maximize();
			}
		
		if(sBrowserName.equals("Chrome")){
			
				System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
				driver = new ChromeDriver();
				Log.info("New Chrome driver instantiated");
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    Log.info("Implicit wait applied on the driver for 10 seconds");
			    driver.get(Constant_CreateExpense.URL);
			    Log.info("Web application launched successfully");
			    driver.manage().window().maximize();
		
			} 
		
		if(sBrowserName.equals("IE")){
				DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();  
				ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				System.setProperty("webdriver.ie.driver", driverpath+"IEDriverServer.exe");
				driver = new InternetExplorerDriver(ieCapabilities);
				Log.info("New IE driver instantiated");
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    Log.info("Implicit wait applied on the driver for 10 seconds");
			    driver.get(Constant_CreateExpense.URL);
			    Log.info("Web application launched successfully");
			    driver.manage().window().maximize();
			}
				
			
		}catch (Exception e){
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		return driver;
	}
	
	public static String getTestCaseName(String sTestCase)throws Exception{
		String value = sTestCase;
		try{
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");	
			value = value.substring(posi + 1);
			return value;
				}catch (Exception e){
			Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
			throw (e);
					}
			}
	
	public static void mouseHoverAction(WebElement mainElement, String subElement){
		
		 Actions action = new Actions(driver);
         action.moveToElement(mainElement).perform();
         if(subElement.equals("Create Expense")){
        	 action.moveToElement(driver.findElement(By.xpath("//*[@id='lblCreateExpense']")));
        	 Log.info("Create Expense tile found on home page");
         }
         if(subElement.equals("Upload Receipts")){
        	 action.moveToElement(driver.findElement(By.xpath("//*[@id='lblUploadReceipt']")));
        	 Log.info("Upload Receipt tile found on home page");
         }
        /* if(subElement.equals("iPads")){
        	 action.moveToElement(driver.findElement(By.xpath("//*[@id='lblOrganisationExpenseList']")));
        	 Log.info("iPads link is found under Product Category");
         }
         if(subElement.equals("iPhones")){
        	 action.moveToElement(driver.findElement(By.linkText("iPhones")));
        	 Log.info("iPhones link is found under Product Category");
         }*/
         action.click();
         action.perform();
         Log.info("Click action is performed on the selected Product Type");
	 }
	 public static void waitForElement(WebElement element){
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	 	}
		
	 public static void takeScreenshot(WebDriver driver, String sTestCaseName) throws Exception{
			try{
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File(Constant_CreateExpense.Path_ScreenShot + sTestCaseName +".jpg"));	
			} catch (Exception e){
				Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
				throw new Exception();
			}
		}

	public static String stackTrace(Throwable exception) {
		if (exception==null)
	      {
	          return "";
	      }
	      StringWriter str = new StringWriter();
	      PrintWriter writer = new PrintWriter(str);
	      try
	      {
	    	  exception.printStackTrace(writer);
	          return str.getBuffer().toString();
	      }
	      finally
	      {
	          try
	          {
	              str.close();
	              writer.close();
	          }
	          catch (IOException e)
	          {
	              //ignore
	          }
	      }
	}

	public static String toString(Object p) {
		return p == null ? "" : p.toString();
	}

	public static String escapeHtml(String s) {
		 StringBuilder out = new StringBuilder(Math.max(16, s.length()));
		    for (int i = 0; i < s.length(); i++) {
		        char c = s.charAt(i);
		        if (c > 127 || c == '"' || c == '<' || c == '>' || c == '&') {
		            out.append("&#");
		            out.append((int) c);
		            out.append(';');
		        } else {
		            out.append(c);
		        }
		    }
		    return out.toString();
	}

}

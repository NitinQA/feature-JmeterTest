package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.glass.events.KeyEvent;

import utility.Log;

public class CorporateCreateExpense_Page extends BaseClass {
	private static WebElement element = null;
	WebDriverWait wait = new WebDriverWait(driver, 100000);

	public CorporateCreateExpense_Page(WebDriver driver) {
		super(driver);
	}
	
			 public static void SelectExpType (String sExpType){
			   
			   WebElement CategoryDropDown = driver.findElements(By.cssSelector("span.k-input")).get(0);

			   		CategoryDropDown.click();
				    List<WebElement> CatList = driver.findElements(By.cssSelector("#ExpenseCategoryType-list"));
				    System.out.println(CatList);
				switch (sExpType) {
				    
				case "Business":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement Business = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryType_listbox']/li[2]"));
				        if (Business.isDisplayed());
				        Business.click();
				        Log.info("Selected Expense Type is 'Business'");
				       }
					break;
					
				case "Personal":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement Personal = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryType_listbox']/li[1]"));
				        if (Personal.isDisplayed());
				        Personal.click();
				        Log.info("Selected expense Type is 'Personal'");
				       }
					break;
				}
		
		}

	public static void Amount(String sAmount){
		 driver.findElement(By.xpath("//*[@id='divAmount']/div/span[1]/span/input[1]")).click();
			element = driver.findElement(By.xpath("//*[@id='ActualAmount']"));
			element.click();
			element.sendKeys(sAmount);
				
	}
	
	
		public static void Supplier(String sSuplier){
			
				element = driver.findElement(By.id("SupplierName"));
				element.sendKeys(sSuplier);
						
	}
		
		public static void Employees(String sEmployee){
			try {
				driver.findElement(By.xpath("//*[@id='divEntertainment']/div[1]/div/span[1]/span/input[1]")).click();
				element = driver.findElement(By.xpath("//*[@id='NoOfAttendee']"));
				element.click();
				Log.info(element+ ": 'No. of Employees' field is found");
			} catch (Exception e) {
				Log.error("'No. of Employees' field is not found");
			}
			
			element.sendKeys(sEmployee);
					
		}
		
		public static void Rooms(String sRooms){
			try {
				driver.findElement(By.xpath("//*[@id='divHotelLodging']/div[1]/div/span[1]/span/input[1]")).click();
				element = driver.findElement(By.xpath("//*[@id='NoOfRooms']"));
				Log.info(element+ ": 'Number of Rooms' field is found");
			} catch (Exception e) {
				Log.error("'Number of Rooms' field is not found");
			}
			
			element.sendKeys(sRooms);
						
	}
		
		public static void Nights(String sNights){
			try {
				driver.findElement(By.xpath("//*[@id='divHotelLodging']/div[2]/div/span[1]/span/input[1]")).click();
				element = driver.findElement(By.xpath("//*[@id='NoOfNights']"));
				Log.info(element+ ": 'Number of Nights' field is found");
			} catch (Exception e) {
				Log.error("'Number of Nights' field is not found");
			}
			
			element.sendKeys(sNights);
					
	}
		
		
		public static void From(String sFrom){
			try {
				//driver.findElement(By.xpath("//*[@id='divHotelLodging']/div[2]/div/span[1]/span/input[1]")).click();
				element = driver.findElement(By.id("Field1"));
				Log.info(element+ ": 'From' field is found");
			} catch (Exception e) {
				Log.error("'From' field is not found");
			}
			
			element.sendKeys(sFrom);
					
	}
		
		
		public static void To(String sTo){
			try {
				//driver.findElement(By.xpath("//*[@id='divHotelLodging']/div[2]/div/span[1]/span/input[1]")).click();
				element = driver.findElement(By.id("Field2"));
				Log.info(element+ ": 'To' field is found");
			} catch (Exception e) {
				Log.error("'To' field is not found");
			}
			
			element.sendKeys(sTo);
					
	}
		
		public static void Distance(String sDistance){
			try {
				driver.findElement(By.xpath("//*[@id='divMileage']/div[3]/div/span[1]/span/input[1]")).click();
				element = driver.findElement(By.xpath("//*[@id='Field3']"));
				Log.info(element+ ": 'Distance' field is found");
			} catch (Exception e) {
				Log.error("'Distance' field is not found");
			}
			
			element.sendKeys(sDistance);
			
			
					
	}
		
		public static String RatePerMileKm(){
			try {
				driver.findElement(By.xpath("//*[@id='divMileage']/div[4]/div/span/span/input[1]")).click();
				element = driver.findElement(By.xpath("//*[@id='MileageRate']"));
				Log.info(element+ ": 'Rate per mile/km' field is found");
			} catch (Exception e) {
				Log.error("'Rate per mile/km' field is not found");
			}
			
			return element.getText();
			
					
	}
		
		public static String MileageAmount (){
			try {
				driver.findElement(By.xpath(".//*[@id='divAmount']/div/span[1]/span/input[1]")).click();
				element = driver.findElement(By.xpath("//*[@id='ActualAmount']"));
				Log.info(element+ ": 'Mileage Amount' field is found");
			} catch (Exception e) {
				Log.error("'Mileage Amount' field is not found");
			}
			
			return element.getText();
			
					
	}
		
		
		 
		
		public static void Save(){
				driver.findElement(By.id("btnMore")).click();
				element = driver.findElement(By.id("aSave"));
				element.click();
						
	}
		

		
		public static void scrolldown(){
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			
		}
		
		public static void scrollup(){
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,-250)", "");
					
		}
		
		
		
		//Select Exp Cat
		   public static void SelectExpCat (String sCategory){
			   
			   WebElement BusinessexpCat = driver.findElements(By.cssSelector("span.k-input")).get(1);

			   BusinessexpCat.click();
				    List<WebElement> CatList = driver.findElements(By.cssSelector("#ExpenseCategoryId-list"));
				switch (sCategory) {
				    
				case "Air Travel":
					System.out.printf("Selected Category is : ",sCategory);
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement AirTravel = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[1]"));
				        if (AirTravel.isDisplayed());
				        AirTravel.click();
				       }
					break;
					
				case "Books & Publications":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement BooksPublications = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[2]"));
				        if (BooksPublications.isDisplayed());
				        BooksPublications.click();
				       }
					break;
					
				case "Bus & Trains":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement BusTrains = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[3]"));
				        if (BusTrains.isDisplayed());
				        BusTrains.click();
				       }
					break;
					
				case "Car Hire - Rental":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement CarHireRental = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[4]"));
				        if (CarHireRental.isDisplayed());
				        CarHireRental.click();
				       }
					break;
				
				case "Car Repair & Service":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement CarRepairService = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[5]"));
				        if (CarRepairService.isDisplayed());
				        CarRepairService.click();
				       }
					break;
				    
				    
				case "Cleaning Costs":
					  for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
					        WebElement webElement1 = (WebElement) iterator1.next();
					        System.out.println(webElement1);
					        WebElement CleaningCosts = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[6]"));
					        if (CleaningCosts.isDisplayed());
					        CleaningCosts.click();
					       }
					  break;
					  
					    
				case "Course & Conference Fees":			
					  for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
					        WebElement webElement1 = (WebElement) iterator1.next();
					        System.out.println(webElement1);
					        WebElement CourseConferenceFees = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[7]"));
					        if (CourseConferenceFees.isDisplayed());
					        CourseConferenceFees.click();
					       }
					  break;
					  
					  
				case "Entertainment - Clients":
					  for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
					        WebElement webElement1 = (WebElement) iterator1.next();
					        System.out.println(webElement1);
					        WebElement EntertainmentClients = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[8]"));
					        if (EntertainmentClients.isDisplayed());
					        EntertainmentClients.click();
					       }	
					  break;
					  
					 
				case "Food & Drinks":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement FoodDrinks = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[9]"));
				        if (FoodDrinks.isDisplayed());
				        FoodDrinks.click();
				       }
					break;
					
				case "Hardware & Office Equipment":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement HardwareOfficeEquipment = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[10]"));
				        if (HardwareOfficeEquipment.isDisplayed());
				        HardwareOfficeEquipment.click();
				       }
					break; 
					
				case "Hotels & Lodgings":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement HotelsLodgings = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[11]"));
				        if (HotelsLodgings.isDisplayed());
				        HotelsLodgings.click();
				       }
					break; 
					
					
				case "Media":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement Media = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[12]"));
				        if (Media.isDisplayed());
				        Media.click();
				       }
					break;
					
					
				case "Mileage":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement Mileage = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[13]"));
				        if (Mileage.isDisplayed());
				        Mileage.click();
				       }
					break;
					
					
				case "Miscellaneous":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement Miscellaneous = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[14]"));
				        if (Miscellaneous.isDisplayed());
				        Miscellaneous.click();
				       }
					break;
					
					
				case "Office Rent":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement OfficeRent = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[15]"));
				        if (OfficeRent.isDisplayed());
				        OfficeRent.click();
				       }
					break;
					
				case "Office Supplies":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement OfficeSupplies = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[16]"));
				        if (OfficeSupplies.isDisplayed());
				        OfficeSupplies.click();
				       }
					break;
					
				case "Others - Zero Tax Items":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement OthersZeroTaxItems = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[17]"));
				        if (OthersZeroTaxItems.isDisplayed());
				        OthersZeroTaxItems.click();
				       }
					break;
					
				case "Parking":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement Parking = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[18]"));
				        if (Parking.isDisplayed());
				        Parking.click();
				       }
					break;
					
				case "Petrol & Fuel":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement PetrolFuel = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[19]"));
				        if (PetrolFuel.isDisplayed());
				        PetrolFuel.click();
				       }
					break;
					
				case "Postage & Courier":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement PostageCourier = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[20]"));
				        if (PostageCourier.isDisplayed());
				        PostageCourier.click();
				       }
					break;
					
				case "Software":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement Software = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[21]"));
				        if (Software.isDisplayed());
				        Software.click();
				       }
					break;
					
				case "Taxis":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement Taxis = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[22]"));
				        if (Taxis.isDisplayed());
				        Taxis.click();
				       }
					break;
					
				case "Telephone & Internet":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement TelephoneInternet = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[23]"));
				        if (TelephoneInternet.isDisplayed());
				        TelephoneInternet.click();
				       }
					break;
					
				case "Tips & Gratuities":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement TipsGratuities = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[24]"));
				        if (TipsGratuities.isDisplayed());
				        TipsGratuities.click();
				       }
					break;
					
				case "Toll Tax":
					for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
				        WebElement webElement1 = (WebElement) iterator1.next();
				        System.out.println(webElement1);
				        WebElement TollTax = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[25]"));
				        if (TollTax.isDisplayed());
				        TollTax.click();
				       }
					break;	
					

					
				}
				
			}
		   
	   
		   
		   public static void UploadPNGReceipt() throws AWTException, InterruptedException{
			   
			   	element = driver.findElement(By.id("receiptImage0"));
				element.click();
				Thread.sleep(2000);
				//Set file path
				StringSelection ss = new StringSelection("D:\\Docs_SOLO\\Testing_ScreenShots\\hhhh.png");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				
				//Perform native key strokes for ctrl+v and Enter
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_V);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_V);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				//element.sendKeys("D:\\Docs_SOLO\\Testing_ScreenShots\\hhhh.png");
							
		} 
		   
		   public static void UploadPDFReceipt() throws AWTException, InterruptedException{
					element = driver.findElement(By.id("receiptImage0"));
					element.click();
					Thread.sleep(2000);
				//Set file path
				StringSelection ss = new StringSelection("D:\\Docs_SOLO\\Testing_ScreenShots\\NewReport.pdf");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				
				//Perform native key strokes for ctrl+v and Enter
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_V);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_V);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				//element.sendKeys("D:\\Docs_SOLO\\Testing_ScreenShots\\hhhh.png");
							
		} 
		   
		   
		   public static void UploadPDFandPNGReceipt() throws AWTException, InterruptedException{
			   		element = driver.findElement(By.xpath("//*[@id='receiptImage0']"));
					element.click();
					Thread.sleep(2000);
				//Set file path
				StringSelection ss = new StringSelection("D:\\Docs_SOLO\\Testing_ScreenShots\\hhhh.png");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				
				//Perform native key strokes for ctrl+v and Enter
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_V);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_V);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				//element.sendKeys("D:\\Docs_SOLO\\Testing_ScreenShots\\hhhh.png");
				
				
				element = driver.findElement(By.xpath("//*[@id='receiptImage1']"));
				element.click();
				Thread.sleep(2000);
				//Set file path
				StringSelection sss = new StringSelection("D:\\Docs_SOLO\\Testing_ScreenShots\\NewReport.pdf");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss, null);
				
				//Perform native key strokes for ctrl+v and Enter
				Robot robot1 = new Robot();
				robot1.keyPress(KeyEvent.VK_ENTER);
				//Thread.sleep(3000);
				robot1.keyRelease(KeyEvent.VK_ENTER);
				//Thread.sleep(3000);
				robot1.keyPress(KeyEvent.VK_CONTROL);
				//Thread.sleep(3000);
				robot1.keyPress(KeyEvent.VK_V);
				//Thread.sleep(3000);
				robot1.keyRelease(KeyEvent.VK_V);
				//Thread.sleep(3000);
				robot1.keyRelease(KeyEvent.VK_CONTROL);
				//Thread.sleep(3000);
				robot1.keyPress(KeyEvent.VK_ENTER);
				//Thread.sleep(3000);
				robot1.keyRelease(KeyEvent.VK_ENTER);
				//Thread.sleep(3000);
							
		} 
		   
		   
		   public static void SelectDate() throws InterruptedException {
			   driver.findElement(By.xpath("//*[@id='divMultiDateExpense']/div[1]/div/button")).click();
			   Thread.sleep(5000);
			   
			   driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/select[1]")).click();
			   WebElement selectElement11 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/select[1]/option[5]")));
			   //Select select431 = new Select(selectElement11);
			   //select431.selectByValue("5");
			   selectElement11.click();
			   Thread.sleep(6000);
			   
			   driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/select[2]")).click();
			   WebElement selectElement1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/select[2]/option[11]")));
			   //Select select43 = new Select(selectElement1);
			   //select43.selectByValue("11");
			   selectElement1.click();
			   Thread.sleep(6000);
			   
			   
			   WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div")); 
			   List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

			   for (WebElement cell:columns) {
			   //Select 13th Date 
			   if (cell.getText().equals("13")){
			   cell.findElement(By.linkText("13")).click();
			   break;
			   }
			   } 
			   
			  // driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/select[2]")).click();
			 //  Select selectYear = new Select(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/select[2]/option")));
			 //  Thread.sleep(5000);
			  // selectYear.selectByVisibleText("2014");
			//   Thread.sleep(30000);
			   
			   
			 
		   }
		   
	
}

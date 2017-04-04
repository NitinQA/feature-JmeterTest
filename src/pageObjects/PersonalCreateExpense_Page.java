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

import com.sun.glass.events.KeyEvent;

import utility.Log;

	public class PersonalCreateExpense_Page extends BaseClass {
			private static WebElement element = null;

			public PersonalCreateExpense_Page(WebDriver driver) {
				super(driver);
			}
			
					 public static void SelectExpType (String sExpType){
					   
					   WebElement secondDropDown = driver.findElements(By.cssSelector("span.k-input")).get(0);

						    secondDropDown.click();
						    List<WebElement> CatList = driver.findElements(By.cssSelector("#ExpenseCategoryType-list"));
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

			public static void PersonalAmount(String sAmount){
				try {
					driver.findElement(By.xpath("//*[@id='divAmount']/div/span[1]/span/input[1]")).click();
					element = driver.findElement(By.xpath("//*[@id='ActualAmount']"));
					element.click();
					Log.info(element+ ": Actual amount field is found");
				} catch (Exception e) {
					Log.error("Actual amount field is not found");
					System.out.println("Amount is : "+element);
				}
				
				element.sendKeys(sAmount);
						
			}
				
				
				public static void Supplier(String sSuplier){
					try {
						//driver.findElement(By.xpath("//*[@id='divAmount']/div/span[1]/span/input[1]")).click();
						element = driver.findElement(By.id("SupplierName"));
						Log.info(element+ ": Supplier field is found");
					} catch (Exception e) {
						Log.error("Supplier field is not found");
					}
					
					element.sendKeys(sSuplier);
								
			}
				
				public static void Save(){
					try {
						//driver.findElement(By.xpath("//*[@id='divAmount']/div/span[1]/span/input[1]")).click();
						driver.findElement(By.id("btnMore")).click();
						element = driver.findElement(By.id("aSave"));
						Log.info("Save button is found");
					} catch (Exception e) {
						Log.error("Save button is not found");
					}
					
					
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
				   public static void SelectPersonalExpCat (String sCategory) throws InterruptedException{
					   
					   WebElement PersonalexpCat = driver.findElements(By.cssSelector("span.k-input")).get(1);

					   		PersonalexpCat.click();
						    List<WebElement> CatList = driver.findElements(By.cssSelector("#ExpenseCategoryId-list"));
						switch (sCategory) {
						    
						case "Books/Media/Publications":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement BooksMediaPublications = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[1]"));
						        if (BooksMediaPublications.isDisplayed());
						        BooksMediaPublications.click();
						       }
							break;
							
						case "Clothing":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						       // System.out.println(webElement1);
						        WebElement Clothing = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[2]"));
						        if (Clothing.isDisplayed());
						        Clothing.click();
						        Thread.sleep(3000);
						       }
							break;
							
						case "Education":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement Education = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[3]"));
						        if (Education.isDisplayed());
						        Education.click();
						       }
							break;
							
						case "Electricity/Gas/Water":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement AirTravel = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[4]"));
						        if (AirTravel.isDisplayed());
						        AirTravel.click();
						       }
							break;
						
						case "Entertainment":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement AirTravel = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[5]"));
						        if (AirTravel.isDisplayed());
						        AirTravel.click();
						       }
							break;
						    
						    
						case "Gifts":
							  for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
							        WebElement webElement1 = (WebElement) iterator1.next();
							        System.out.println(webElement1);
							        WebElement BooksAndPublications = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[6]"));
							        if (BooksAndPublications.isDisplayed());
							        BooksAndPublications.click();
							       }
							  break;
							  
							    
						case "Groceries	":			
							  for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
							        WebElement webElement1 = (WebElement) iterator1.next();
							        System.out.println(webElement1);
							        WebElement BusAndTrain = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[7]"));
							        if (BusAndTrain.isDisplayed());
							        BusAndTrain.click();
							       }
							  break;
							  
							  
						case "Household Maintenance":
							  for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
							        WebElement webElement1 = (WebElement) iterator1.next();
							        System.out.println(webElement1);
							        WebElement CarHireRental = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[8]"));
							        if (CarHireRental.isDisplayed());
							        CarHireRental.click();
							       }	
							  break;
							  
							 
						case "Household Staff Salaries":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement CarHireRental = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[9]"));
						        if (CarHireRental.isDisplayed());
						        CarHireRental.click();
						       }
							break;
							
						case "Insurance":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement CleaningCost = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[10]"));
						        if (CleaningCost.isDisplayed());
						        CleaningCost.click();
						       }
							break; 
							
							
						case "Loans/Interest":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement CoursesConferenceFees = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[11]"));
						        if (CoursesConferenceFees.isDisplayed());
						        CoursesConferenceFees.click();
						       }
							break;
							
						case "Medical Expenses":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement CoursesConferenceFees = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[12]"));
						        if (CoursesConferenceFees.isDisplayed());
						        CoursesConferenceFees.click();
						       }
							break;
							
							
						case "Miscellaneous":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement EntertainmentClients = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[13]"));
						        if (EntertainmentClients.isDisplayed());
						        EntertainmentClients.click();
						       }
							break;
							
							
						case "Parking":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement FoodAndDrinks = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[14]"));
						        if (FoodAndDrinks.isDisplayed());
						        FoodAndDrinks.click();
						       }
							break;
							
							
						case "Personal Shopping":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement HardwareAndOfficeEquip = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[15]"));
						        if (HardwareAndOfficeEquip.isDisplayed());
						        HardwareAndOfficeEquip.click();
						       }
							break;
							
						case "Petrol/Fuel/Gas":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement HotelAndLodging = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[16]"));
						        if (HotelAndLodging.isDisplayed());
						        HotelAndLodging.click();
						       }
							break;
							
						case "Property Tax":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement Media = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[17]"));
						        if (Media.isDisplayed());
						        Media.click();
						       }
							break;
							
						case "Rent/Mortgage":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement Mileage = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[18]"));
						        if (Mileage.isDisplayed());
						        Mileage.click();
						       }
							break;
							
						case "Savings":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement MileageDistance = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[19]"));
						        if (MileageDistance.isDisplayed());
						        MileageDistance.click();
						       }
							break;
							
						case "Subscriptions":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement MileageGPS = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[20]"));
						        if (MileageGPS.isDisplayed());
						        MileageGPS.click();
						       }
							break;
							
						case "Taxis":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement Miscellaneous = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[21]"));
						        if (Miscellaneous.isDisplayed());
						        Miscellaneous.click();
						       }
							break;
							
						case "TV/Internet/Telephone":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement OfficeSupplies = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[22]"));
						        if (OfficeSupplies.isDisplayed());
						        OfficeSupplies.click();
						       }
							break;
							
						case "Vacation":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement OthersZeroTaxItems = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[23]"));
						        if (OthersZeroTaxItems.isDisplayed());
						        OthersZeroTaxItems.click();
						       }
							break;
							
						case "Vehicle Maintenance":
							for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
						        WebElement webElement1 = (WebElement) iterator1.next();
						        System.out.println(webElement1);
						        WebElement Parking = webElement1.findElement(By.xpath("//*[@id='ExpenseCategoryId_listbox']/li[24]"));
						        if (Parking.isDisplayed());
						        Parking.click();
						       }
							break;
							
					}
				   }
				   
				   public static void UploadPNGReceipt() throws AWTException, InterruptedException{
						
						element = driver.findElement(By.id("receiptImage0"));
						element.click();
						Thread.sleep(3000);
						//Set file path
						StringSelection ss = new StringSelection("D:\\Docs_SOLO\\Testing_ScreenShots\\hhhh.png");
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
						
						//Perform native key strokes for ctrl+v and Enter
						Robot robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						//Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_ENTER);
						//Thread.sleep(3000);
						robot.keyPress(KeyEvent.VK_CONTROL);
						//Thread.sleep(3000);
						robot.keyPress(KeyEvent.VK_V);
						//Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_V);
						//Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						//Thread.sleep(3000);
						robot.keyPress(KeyEvent.VK_ENTER);
						Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_ENTER);
						//Thread.sleep(3000);
						
						//element.sendKeys("D:\\Docs_SOLO\\Testing_ScreenShots\\hhhh.png");
									
				} 
				   
				   public static void UploadPDFReceipt() throws AWTException, InterruptedException{
						
					   element = driver.findElement(By.id("receiptImage0"));
					   element.click();
					   Thread.sleep(3000);
						//Set file path
						StringSelection ss = new StringSelection("D:\\Docs_SOLO\\Testing_ScreenShots\\NewReport.pdf");
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
						
						//Perform native key strokes for ctrl+v and Enter
						Robot robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						//Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_ENTER);
						//Thread.sleep(3000);
						robot.keyPress(KeyEvent.VK_CONTROL);
						//Thread.sleep(3000);
						robot.keyPress(KeyEvent.VK_V);
						//Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_V);
						//Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						//Thread.sleep(3000);
						robot.keyPress(KeyEvent.VK_ENTER);
						Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_ENTER);
						//Thread.sleep(3000);
						
						//element.sendKeys("D:\\Docs_SOLO\\Testing_ScreenShots\\hhhh.png");
									
				} 
				   
		
				   public static void UploadPDFandPNGReceipt() throws AWTException, InterruptedException{
						
							element = driver.findElement(By.xpath("//*[@id='receiptImage0']"));
							element.click();
							Thread.sleep(3000);
						//Set file path
						StringSelection ss = new StringSelection("D:\\Docs_SOLO\\Testing_ScreenShots\\hhhh.png");
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
						
						//Perform native key strokes for ctrl+v and Enter
						Robot robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						//Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_ENTER);
						//Thread.sleep(3000);
						robot.keyPress(KeyEvent.VK_CONTROL);
						//Thread.sleep(3000);
						robot.keyPress(KeyEvent.VK_V);
						//Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_V);
						//Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						//Thread.sleep(3000);
						robot.keyPress(KeyEvent.VK_ENTER);
						Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_ENTER);
						//Thread.sleep(3000);
						
						//element.sendKeys("D:\\Docs_SOLO\\Testing_ScreenShots\\hhhh.png");
						
						
						element = driver.findElement(By.xpath("//*[@id='receiptImage1']"));
						element.click();
						
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
						Thread.sleep(3000);
						robot1.keyRelease(KeyEvent.VK_ENTER);
						//Thread.sleep(3000);
									
				}    
				   
				   
}

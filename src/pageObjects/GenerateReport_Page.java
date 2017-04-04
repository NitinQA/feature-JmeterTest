package pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GenerateReport_Page extends BaseClass{
	@SuppressWarnings("unused")
	private static WebElement element = null;
	static WebDriverWait wait = new WebDriverWait(driver, 10);

	public GenerateReport_Page(WebDriver driver) {
		super(driver);
		
	}
	
	public static void OpenSelectFromDate() {
		driver.findElement(By.id("btnFromDateCalendar")).click();
						
	}
	
	public static void OpenSelectToDate() {
		driver.findElement(By.id("btnToDateCalendar")).click();
			
	}
	
	public static void SelectMonth(String sMonth) {
		WebElement month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/select[1]"));
		Select monthCombo = new Select(month);
		monthCombo.selectByVisibleText(sMonth);
	}
	
	
	public static void SelectYear(String sYear) {
		WebElement year = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/select[2]"));
		Select yearCombo = new Select(year);
		yearCombo.selectByVisibleText(sYear);
	}
	
	public static void SelectDate(String sDate) {
		driver.findElement(By.linkText(sDate));
	}

	public static void ClickGenerateReport() {
		driver.findElement(By.id("btndisplay")).click();
				
	}
	

	public static void ExportToExcel() {
		driver.findElement(By.xpath("//*[@id='GridContainer']/div/div[1]/a")).click();
				
	}
	
	public static void GeneratePDF(String sPDFType) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='divOption']/span/span/span[1]")).click();
		
		List<WebElement> CatList = driver.findElements(By.xpath("//*[@id='ReportList-list']"));
		
		switch (sPDFType) {
	    
		case "With Receipt":
		
		for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
	        WebElement webElement1 = (WebElement) iterator1.next();
	        Thread.sleep(5000);
	        WebElement PDFType = webElement1.findElement(By.xpath("//*[@id='ReportList_listbox']/li[1]"));
	        if (PDFType.isDisplayed());
	        PDFType.click();
	       }
		break;
		
		case "Without Receipt":
			
		for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
	        WebElement webElement1 = (WebElement) iterator1.next();
	        Thread.sleep(5000);
	        WebElement PDFType = webElement1.findElement(By.xpath("//*[@id='ReportList_listbox']/li[2]"));
	        if (PDFType.isDisplayed());
	        PDFType.click();
	       }
		break;
		
		case "Single Expense Per Page":
			
		for (Iterator<WebElement> iterator1 = CatList.iterator(); iterator1.hasNext();) {
	        WebElement webElement1 = (WebElement) iterator1.next();
	        Thread.sleep(5000);
	        WebElement PDFType = webElement1.findElement(By.xpath("//*[@id='ReportList_listbox']/li[3]"));
	        if (PDFType.isDisplayed());
	        PDFType.click();
	       }
		break;
		
		}
				
	}
	
	
	public static void ClickPDFExportBtn() {
		driver.findElement(By.id("Export")).click();
				
	}
	



}

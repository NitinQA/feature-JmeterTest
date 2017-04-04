package TEST;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.glass.events.KeyEvent;


public class testCaseTest {


	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		
		driver.get("https://testurapp.com/expenseondemand/loginregister/");
		driver.findElement(By.id("email_login")).sendKeys("soloqa4+Ap@gmail.com");
		driver.findElement(By.id("login_password")).sendKeys("Aa123456");
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[7]/input")).click();
		Thread.sleep(30000);
				
		if (driver.findElement(By.xpath("//*[@id='divCorporate']")).isDisplayed()){
			
			System.out.println("Corporate Screen is displayed");
			
		}
			
	else if (driver.findElement(By.xpath("//*[@id='divPersonal']")).isDisplayed()) {
		
		System.out.println("Personal Screen is displayed");
		
	}
		else {
			
			System.out.println("Error");
			
		}
		
		driver.findElement(By.xpath("//*[@id='divSelectionSegmentedControl']/label[2]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='lblCreateExpense']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='divCategory']/div/span[1]/span/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='ExpenseCategoryId-list']/span/input")).sendKeys("Clothing");	
		
		
		//driver.findElement(By.xpath("//*[@id='divOption']/span/span/span[1]")).click();
		String date = "15-October-2016";
		String splitter[]= date.split("-");
		String Month = splitter[1];
		String Year = splitter[2];
		String Day = splitter[0];
		 
		 System.out.println(Day);
		 System.out.println(Year);
		 System.out.println(Month);
	}

}
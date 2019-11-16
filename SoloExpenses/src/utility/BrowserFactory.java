package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	 public static WebDriver driver;
	public static void startApplication() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehadadwal\\eclipse-workspace\\SoloExpenses\\Drivers\\chromedriver.exe");
		 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expenseondemand.com/loginregister/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
	}

}

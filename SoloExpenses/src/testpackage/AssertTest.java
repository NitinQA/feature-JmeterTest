package testpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertTest {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Neha Dadwal\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newqa.soloexpenses.com/login");
	}




	@Test(priority=1)
	public void titleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Expense Management Software | Expense Management System");
		
	}
	@Test(priority=2)
	public void chkAssert()
	{
		boolean b=driver.findElement(By.className("solo-logo")).isDisplayed();
		Assert.assertTrue(b);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}

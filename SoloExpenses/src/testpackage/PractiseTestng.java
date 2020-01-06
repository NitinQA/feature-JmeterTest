package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PractiseTestng {

	
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehadadwal\\git\\Automation_Test\\SoloExpenses\\Drivers\\chromedriver.exe");
		 
		driver=new ChromeDriver();
		driver.get("http://newdev.soloexpenses.com/");
	}
	
	
	
	@Test(priority=2,groups="Title")
	public void getTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=1,groups="Title")
	public void test1()
	{
		System.out.println("Test 1");
		
	}
	@Test(priority=3,groups="Title")
	public void test2()
	{
		System.out.println("Test 2");
	}
	@Test(priority=4,groups="Register")
	public void clkRegister()
	{

		driver.findElement(By.linkText("Register")).click();
	}
	@Test(priority=5,groups="Register",dependsOnMethods="clkRegister")
	public void test3()
	{
		System.out.println("Test3");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

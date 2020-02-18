package testpackage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utility.loginData;

public class UserLogin {


	WebDriver driver;

	@BeforeMethod
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehadadwal\\git\\Automation_Test\\SoloExpenses\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://solodev-qa2.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	}



	@DataProvider
	public Object[][] getData() {
		Object[][] data=loginData.datafromExcel("credentials");
		return data;
	}

	@Test(dataProvider="getData")
	public void loginCred(String EmailId, String Password)
	{
		driver.findElement(By.id("txtEmail")).clear();
		driver.findElement(By.id("txtEmail")).sendKeys("EmailId");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("Password");
		driver.findElement(By.id("btnLogin")).click();
	}

	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}

package com.ExpenseOnDemand.utility;
import org.openqa.selenium.By;
public class NewFailLogin extends AppUrl{
	public static void failLogin() //throws IOException, InterruptedException
	{
		/*ArrayList<String> username= readExcel(0);
		ArrayList<String> password=readExcel(1);
		for(int i =0;i<username.size();i++)
		{
		 */	
		driver.findElement(By.id("eMail")).clear();
		driver.findElement(By.id("eMail")).sendKeys("solomar0m");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Aa@123456");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav2 > li:nth-child(4) > a > i")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	}
}


package pageObject;



import org.openqa.selenium.By;

import utility.BrowserFactory;

public class LoginPage extends BrowserFactory
{
	public static void main(String[] args) {
			

	 BrowserFactory.startApplication();

		driver.findElement(By.id("email_login")).sendKeys("inrsme@gmail.com");
		driver.findElement(By.id("login_password")).sendKeys("Aa123456");
		driver.findElement(By.name("Login")).click();
	
}

}


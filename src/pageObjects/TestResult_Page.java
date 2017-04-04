package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestResult_Page extends BaseClass {
	public TestResult_Page(WebDriver driver) {
		super(driver);
		}
	private static WebElement element = null;
	public static WebElement ConfirmSave(){
		element = driver.findElement(By.xpath("//*[@id='toast-container']/div/div"));
		System.out.println("Expense Saved");
		return element;
	}

}

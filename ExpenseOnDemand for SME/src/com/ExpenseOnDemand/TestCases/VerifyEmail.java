
 package com.ExpenseOnDemand.TestCases; 
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ExpenseOnDemand.utility.AppUrl;
import com.ExpenseOnDemand.utility.BrowserFactory;



public class VerifyEmail extends AppUrl {
	
	
	
	
	

	public static void verifyEmail(String generatedString)

	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
// //to enter the url // //
		WebDriver driver = BrowserFactory.driver;
		driver.get("http://www.yopmail.com/en/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
// TODo   Auto-generated catch block // 
			e.printStackTrace();
		}
// // //to enter the  name
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("login")).sendKeys(generatedString);
		driver.findElement(By.className("sbut")).click();

//to switch to Frame // //
		driver.switchTo().frame("index2");
		driver.switchTo().frame(2);
		driver.getWindowHandles();
		driver.findElement(By.linkText("verification link")).click();
		try { //
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO // Auto-generated catch block
			e.printStackTrace();
		}
		// // // //to switch to newly opened window // //
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		// // // //to click on create password
		driver.findElement(By.id("Password")).click();
		driver.findElement(By.id("Password")).sendKeys("Aa123456");
		// // //to clk on save and Login

		driver.findElement(By.xpath("//button[contains(text(), 'Save & Login')]")).click();

		// to clk on id
		driver.findElement(By.id("eMail")).click();
		driver.findElement(By.id("eMail")).clear();
		// driver.findElement(By.id("eMail")).sendKeys(RegisterApp.generatedString+
		// "@yopmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		// To check entering password
		// through string variable // // //
		driver.findElement(By.id("password")).sendKeys("Aa123456");
		// static Data //
		driver.findElement(By.id("password")).sendKeys("Aa123456");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.cssSelector(
				"#setting-wizard-new > div.setting-page > div.right-side-wizard > form:nth-child(1) > div > div > div > div.margin-top-5.btn-login > button"))
				.click();

		// to click on Login // //
		driver.findElement(By.cssSelector(
				"#setting-wizard-new > div.setting-page > div.right-side-wizard > form:nth-child(1) > div > div > div > div.margin-top-5.btn-login > button"))
				.click();
	}




public static void randomid() {

    
    int leftLimit = 97; // letter 'a'
	int rightLimit = 122; // letter 'z'
	int targetStringLength = 5;
Random random = new Random();

	String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		
Randomname(generatedString);


  }


private static void Randomname(String generatedString) {
	
	
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		/*
		 * int leftLimit = 97; // letter 'a' int rightLimit = 122; // letter 'z' int
		 * targetStringLength = 5; Random random = new Random();
		 * 
		 * String generatedString = random.ints(leftLimit, rightLimit +
		 * 1).limit(targetStringLength).collect(StringBuilder::new,
		 * StringBuilder::appendCodePoint, StringBuilder::append).toString();
		 */
	//String username="automarcus";
	/*
	 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 */
	//clicks on Register Link on Login page
	//driver.findElement(By.xpath("//a[text()='Register']")).click(); 
	/*
	 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 *///enter Name and email id on Register page
	driver.findElement(By.id("fName")).click();
	driver.findElement(By.id("fName")).sendKeys("solo");
	//driver.findElement(By.id("eMail")).click();

	driver.findElement(By.xpath("//input[@formcontrolname='email']")).click();

	//driver.findElement(By.className("form-control border text-ellipsis-approver ng-pristine ng-invalid ng-touched")).click();

	driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys(generatedString+"@yopmail.com");
	/*
	 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 */
	//To clk on register

	driver.findElement(By.xpath("//*[@id=\"setting-wizard-new\"]/div[1]/div[2]/form[2]/div/div[2]/button")).click();


	
	  try { Thread.sleep(10000); } catch (InterruptedException e) { 
		  // TODO		  Auto-generated catch block
		  e.printStackTrace(); }
	  //enter Org details
	driver.findElement(By.id("orgName")).click();
	driver.findElement(By.id("orgName")).sendKeys("SOLO"); 
	
	driver.findElement(By.cssSelector("#setting-wizard-new > div.setting-page > div.right-side-wizard > div.register-account > div.d-flex.justify-content-center.xs-mt-4 > button")).click(); 
	/*
	 * try { Thread.sleep(30000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 */



	driver.findElement(By.name("newAttribute1FirstName")).click();
	driver.findElement(By.name("newAttribute1FirstName")).sendKeys("apone");
	driver.findElement(By.name("newAttribute1Email")).click();
	driver.findElement(By.name("newAttribute1Email")).sendKeys(generatedString+"1@yopmail.com");
	;

	driver.findElement(By.name("newAttribute2FirstName")).click();
	driver.findElement(By.name("newAttribute2FirstName")).sendKeys("aptwo");
	driver.findElement(By.name("newAttribute2Email")).click();
	driver.findElement(By.name("newAttribute2Email")).sendKeys(generatedString+"2@yopmail.com")
	;

	//driver.findElement(By.cssSelector(".col-xl-3:nth-child(1) #newAttributeName")).click();
	//driver.findElement(By.cssSelector(".col-xl-3:nth-child(1) #newAttributeName")).sendKeys("apthree");
	driver.findElement(By.name("newAttributeFirstName")).click();
	driver.findElement(By.name("newAttributeFirstName")).sendKeys("apthree");

	driver.findElement(By.id("newAttribute3Email")).click();
	driver.findElement(By.id("newAttribute3Email")).sendKeys(generatedString+"3@yopmail.com");

	//To clk on Next
	driver.findElement(By.cssSelector("#setting-wizard-new > div > div.right-side-wizard > div.register-account > div.d-flex.justify-content-center.xs-mt-4 > button")).click(); 





	

	//To clk on Next on mileag estup screen
			driver.findElement(By.cssSelector("#setting-wizard-new > div > div.right-side-wizard > div.register-account > div.d-flex.justify-content-center.xs-mt-4 > button")).click();

	//driver.findElement(By.xpath("//i[@class='fal fa-check-circle color-white']")).click();

	
	  try { Thread.sleep(25000); } catch (InterruptedException e) { 
		  // TODO		  Auto-generated catch block 
		  e.printStackTrace(); }
	 

	//To clk on  Finish n cont
	driver.findElement(By.cssSelector("#setting-wizard-new > div > div.right-side-wizard > div.register-account > div.d-flex.justify-content-center.xs-mt-4 > button")).click();
	//driver.findElement(By.xpath("//button[@type='button']")).click();

	
	  try { Thread.sleep(25000); } catch (InterruptedException e) { 
		  // TODO		  Auto-generated catch block
		  e.printStackTrace(); }
	 

	//To clk on continue
	driver.findElement(By.cssSelector("#rightSideBar > div > div.d-flex.position-absolute.bottom-0.w-100pc.justify-content-center.bg-white.padding-15 > span > button")).click();
	//driver.findElement(By.xpath("//i[@ngbtooltip='Next']")).click();


	

	//to clk on resend verification
	
	driver.findElement(By.xpath("//button[contains(text(),'Resend Verification Email')]")).click();
	
	//driver.findElement(By.cssSelector("#rightSideBar > div > div.d-flex.position-absolute.bottom-10.w-100pc.justify-content-center.bg-white.padding-15 > span:nth-child(1) > button > b")).click();
	
	  try { Thread.sleep(10000); } catch (InterruptedException e) {
		  // TODO		  Auto-generated catch block 
		  e.printStackTrace(); }
	 
	
	
	//to clk on All functions

			driver.findElement(By.cssSelector("#navbarSupportedContent > ul.navbar-nav > li:nth-child(3) > ul > li:nth-child(2) > a")).click();
	
	System.out.println(generatedString+"@yopmail.com");	
	
}

public static void main(String[] args) {
	VerifyEmail vm = new VerifyEmail();
vm.chromeBrowser();
vm.appUrl();
//vm.Randomname;
//vm.
//rg.mileageRate();
//rg.rateFetch()  ;

}

}
 

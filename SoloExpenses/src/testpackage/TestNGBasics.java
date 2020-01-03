package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	/*launch chrome browser
Enter the URL
Login to the Application
Test Execute
Logout from the Application
Delete All Cookies
Close the browser
	  */
	 
	 @BeforeTest
	   public void LaunchBrowser()
	   {
		   System.out.println("launch chrome browser");  
	   }
	 @BeforeClass
	public void enterURL()
	{
		System.out.println("Enter the URL");
	}

    
   @BeforeMethod
   
   public void loginApp()

{
	   System.out.println("Login to the Application");
}
   @Test
   public void testOnly()
   {
	   System.out.println("Test Execute");
   }
   @Test
   public void searchText()
   {
	   System.out.println("Search Text");
   }
   
   @AfterMethod
   public void logoutApp()
   {
	   System.out.println("Logout from the Application");
	   
   }
   @AfterClass
   public void deleteCookie()
   {
	   System.out.println("Delete All Cookies");
   }
   @AfterTest
   public void closeBrowser()
   {
	   System.out.println("Close the browser");
   }
   
  
}

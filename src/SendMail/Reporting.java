package SendMail;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utility.Log;
import utility.SendFileEmail;

public class Reporting {
	
@BeforeSuite
public void beforeSuite() throws Exception {
	  
	  System.out.println("Started execution of Before Suite");
	
	  
}


	
	
@Test
	public static void SendReport() throws Exception {
		System.out.println("Started sending report");
		  
		  Thread.sleep(10000);
		  try {
			  		  
			SendFileEmail.execute("custom-report.html");
				Log.info("Report emailed successfully");
				
			} catch (Exception e) {
				
				Log.error("Email not sent");
				
				throw (e);
			}
		 

	}


@AfterSuite
public void afterSuite() throws Exception {
	  System.out.println("Started execution of After Suite");
	  
	  }


}

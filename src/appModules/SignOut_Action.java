package appModules;

import pageObjects.Home_Page;
import utility.Log;


public class SignOut_Action {

	public static void Execute() throws Exception {
		Home_Page.lnk_LogOut().click();
		Log.info("Click action performed on Logout button");

	}

}

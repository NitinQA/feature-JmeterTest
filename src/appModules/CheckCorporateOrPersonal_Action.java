package appModules;

import pageObjects.Home_Page;

public class CheckCorporateOrPersonal_Action {
	
	public static class CheckCorporateOrPersonal{
		
	
		public static void Execute () throws Exception{
			
			if (Home_Page.CorporateScreen().isDisplayed()){
				
				System.out.println("Corporate Screen is displayed");
				
			}
				
		else if (Home_Page.PersonalScreen().isDisplayed()) {
			
			System.out.println("Personal Screen is displayed");
			
		}
			else {
				
				System.out.println("Error");
				
			}
		
		}
		
		
	}
	
	public static class SwitchToPersonalScreen{
		
		public static void Execute () throws Exception{
			
			Home_Page.switchHousehold().click();
		}
	}
	
	public static class SwitchToBusinessOwnerScreen{
		
		public static void Execute () throws Exception{
			
			Home_Page.switchBusinessOwner().click();
			
			Thread.sleep(5000);
		}
	}
	
}



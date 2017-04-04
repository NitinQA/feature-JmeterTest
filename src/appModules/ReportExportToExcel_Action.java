package appModules;

import pageObjects.GenerateReport_Page;
import utility.Constant_Reports;
import utility.ExcelUtils;

public class ReportExportToExcel_Action {
	
	public static class GenerateReport{
		
		public static void Execute (int iTestCaseRow) throws Exception{
				
				
				String sFromDate = ExcelUtils.getCellData(iTestCaseRow, Constant_Reports.Col_FromDate);
				System.out.println("From Date is = "+sFromDate);
				String splitter[]= sFromDate.split("-");
				String Day = splitter[0];
				String Month = splitter[1];
				String Year = splitter[2];
				
				System.out.println(Day);
				System.out.println(Month);
				System.out.println(Year);
				
				GenerateReport_Page.OpenSelectFromDate();
				GenerateReport_Page.SelectMonth(Month);
				GenerateReport_Page.SelectYear(Year);
				GenerateReport_Page.SelectDate(Day);
			
					
			String sToDate = ExcelUtils.getCellData(iTestCaseRow, Constant_Reports.Col_ToDate);
			System.out.println("From Date is = "+sToDate);
			String ToDateSplitter[]= sToDate.split("-");
			String ToDay = ToDateSplitter[0];
			String ToMonth = ToDateSplitter[1];
			String ToYear = ToDateSplitter[2];
			
			System.out.println(ToDay);
			System.out.println(ToMonth);
			System.out.println(ToYear);
			
			GenerateReport_Page.OpenSelectToDate();
			GenerateReport_Page.SelectMonth(ToMonth);
			GenerateReport_Page.SelectYear(ToYear);
			GenerateReport_Page.SelectDate(ToDay);
			

			GenerateReport_Page.ClickGenerateReport();					

				
		}
	
	
	}
	
}

package utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;

public class ExcelUtil
{
	public static void getRowCount()
	{
		try {
			
			XSSFWorkbook workbook=new XSSFWorkbook("C:\\Users\\nehadadwal\\eclipse-workspace\\SoloExpenses\\Excel\\App_ReadWrite.xlsx");
			XSSFSheet sheet= workbook.getSheet("Sheet1");
			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No. of Rows= "+rowCount);
		} catch (Exception exp)
		{
			System.out.println(exp.getMessage());;
			System.out.println(exp.getCause());;
			exp.printStackTrace();
		}}


		public static void main(String[] args) {

			getRowCount();
		}
	
}






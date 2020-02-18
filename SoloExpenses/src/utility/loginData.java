package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class loginData {
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	public static String TestData_sheetPath="C:\\Users\\nehadadwal\\git\\Automation_Test\\SoloExpenses\\Excel\\credentials.xlsx";


	public static Object[][] datafromExcel(String Sheetname)
	{
		FileInputStream file=null;
		try {
			file=new FileInputStream(TestData_sheetPath);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		sheet=book.getSheet(Sheetname);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
		for(int i =1;i<sheet.getLastRowNum();i++)
		{
			for(int k=1;k<sheet.getRow(1).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i).getCell(k).toString();
			}
		}
		return data;

	}

}

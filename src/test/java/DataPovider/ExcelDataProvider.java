package DataPovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb; 
	public ExcelDataProvider() {
		File src = new File("C:\\Users\\natal\\Desktop\\HybridFramework\\com.learnautomation\\AplicationTestData\\New Microsoft Excel Worksheet.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			 wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {

		System.out.println("Exception is  " + e.getMessage() );
		}

	}

	public String getData(int sheetIndex, int row, int coll)
	
	{
	String value = wb.getSheetAt(sheetIndex).getRow(row).getCell(coll).getStringCellValue(); 	
	return value; 
	
	}
	
	public String getDataInt(String SheetName, int row, int coll)
	{
		String data = wb.getSheet(SheetName).getRow(row).getCell(coll).getStringCellValue(); 
		return data; 
	}
}

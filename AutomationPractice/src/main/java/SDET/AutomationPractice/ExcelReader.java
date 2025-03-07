package SDET.AutomationPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private static final String Try = null;
	XSSFWorkbook workBook;
	XSSFSheet sheet;

    public ExcelReader(String filePath,String fileName) throws IOException{

    //Create an object of File class to open xlsx file

    File file =    new File(filePath+"\\"+fileName);

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    //If it is xlsx file then create object of XSSFWorkbook class

    	workBook = new XSSFWorkbook(inputStream); 

    }
    
	public String getData(String sheetName, int row, int column) {
		sheet = workBook.getSheet(sheetName);
		XSSFCell cell=sheet.getRow(row).getCell(column);
		String data = null;
		
		try {
			 data = cell.getStringCellValue();
			
		}catch(NullPointerException NPE) {
			
		}
		
		

		return data;
	}
	
	
	public int getRowCount(String sheetName) {

		int rows = workBook.getSheet(sheetName).getPhysicalNumberOfRows();
		return rows;
	}
	
	
	
    

}

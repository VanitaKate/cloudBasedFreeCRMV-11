package cloudBasedFreeCRM_Utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConnectivity {

		public String getCellData(String sheetName,int rowNum,int columnNum) throws IOException {
			
		
		Logger logger=LogManager.getLogger(ExcelConnectivity.class);      

        String projPath= System.getProperty("user.dir");
		
		
		File src= new File(projPath + "\\TestData\\TestData.xlsx");
		logger.info("Project path is: "+projPath);
		
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook WB= new XSSFWorkbook(fis);
		XSSFSheet sheet=WB.getSheet("Sheet1");
		int totalRows=sheet.getPhysicalNumberOfRows();
		logger.info("Total Number of Rows in the Test Data are: "+totalRows);
		
		int totalColumns=sheet.getRow(0).getPhysicalNumberOfCells();
			
			String cellData=sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
			
			//return TestData;
			return cellData;
				
		}

	public int getRowCount(String excelPath, String sheetName) throws IOException {
		File src= new File(excelPath);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook WB= new XSSFWorkbook(fis);
		XSSFSheet sheet=WB.getSheet(sheetName);
		int totalRows=sheet.getPhysicalNumberOfRows();
		return totalRows;
		
	}
	public int getColumnCount(String excelPath, String sheetName) throws IOException {
		File src= new File(excelPath);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook WB= new XSSFWorkbook(fis);
		XSSFSheet sheet=WB.getSheet(sheetName);
		int totalColumns=sheet.getRow(0).getPhysicalNumberOfCells();
		return totalColumns;
		
	}
}

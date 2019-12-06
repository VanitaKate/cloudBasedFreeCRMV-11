

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConnectivityTest {

	public static void main(String[] args) throws IOException {
		
		
		Logger logger=LogManager.getLogger(ExcelConnectivityTest.class);      

        String projPath= System.getProperty("user.dir");
		try{
		System.out.println(projPath);
		File src= new File(projPath + "\\TestData\\TestData.xlsx");
		logger.info("Project path is: "+projPath);
		System.out.println("Project Path is: " +projPath);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook WB= new XSSFWorkbook(fis);
		XSSFSheet sheet=WB.getSheet("Sheet1");
		int totalRows=sheet.getPhysicalNumberOfRows();
		logger.info("Total Number of Rows in the Test Data are: "+totalRows);
		System.out.println("Total Rows: " +totalRows);
		int totalColumns=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total Columns: "+totalColumns);
		for (int i=1;i<=totalColumns;i++) {
			String TestData=sheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(TestData);
			//return TestData;
		}
		}catch (Exception e) {
			e.getMessage();
		}

	}

}

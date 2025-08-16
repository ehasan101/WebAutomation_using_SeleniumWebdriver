package google.search;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.testng.annotations.Test;



public class PracQ1 {

	public static void main(String[] args) throws IOException {
		
		//WebDriver driver = Config.getDriver();		
		
		FileInputStream file = new FileInputStream("C://Users/Problemv1/Music/EEExam/qups/ExcelSample.xlsx");
		
		
		

		//XSSFSheet sheet = workbook.getSheetAt("Sheet1");
		
		
		
	    try {
	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheet("Sheet1");
	        workbook.close();
	        
	        
	      } catch (Exception e) {
	        System.out.println("Something went wrong.");
	        
	        
	      }
		
	
		//driver.get("");
		//file.close();
		
		

	}
}

package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException {
		
		
		//Identifying The File(Excel) in the System - any type of File
				FileInputStream file=new FileInputStream("./src/ExcelFiles/SingleTestData.xlsx");
				
				//Identifying The WorkBook of the File
				XSSFWorkbook workBook=new XSSFWorkbook(file);
				
				//Identifying The Sheet-in the Workbook
				XSSFSheet sheet=workBook.getSheet("Sheet1");
				
				//Create a Row
				Row row=sheet.createRow(3);
				
				//Create row of a cell
				Cell rowOfCell=row.createCell(4);
				
				//Setting the value into row of Cell created
				rowOfCell.setCellValue("Selenium");
				
				//Saving the file with the workbook
				FileOutputStream FileOut=new FileOutputStream("./src/ExcelFiles/SingleTestData.xlsx");
				workBook.write(FileOut);
				workBook.close();
	}

}

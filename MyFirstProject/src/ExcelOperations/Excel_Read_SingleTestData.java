package ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
		
		//Identifying The File(Excel) in the System - any type of File
		FileInputStream file=new FileInputStream("./src/ExcelFiles/SingleTestData.xlsx");
		
		//Identifying The WorkBook of the File
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		
		//Identifying The Sheet-in the Workbook
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		//Identifying The row of a sheet
		Row row=sheet.getRow(0);
		
		//Identifying The roe of Cell
		Cell rowOfCell=row.getCell(0);
		
		//get the Data from the Row of Cell
		String data=rowOfCell.getStringCellValue();
		System.out.println(data);
		workBook.close();

	}

}

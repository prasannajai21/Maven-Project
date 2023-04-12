package com.Mavan_Project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dadadriven {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\vickysingle\\eclipse-workspace\\com.Mavan_Project\\Excel\\datadriven.xlsx");
		
		Workbook book = new XSSFWorkbook();
		Sheet createSheet = book.createSheet();
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("selenium");
		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);
	}

}

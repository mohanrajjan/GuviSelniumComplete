package org.excel.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteEx {
public static void main(String[] args) throws IOException {
	File src= new File("Utils\\Mydata.xlsx");
	//FileInputStream fs = new FileInputStream(src);
	XSSFWorkbook res= new XSSFWorkbook();
	XSSFSheet sheet2=res.createSheet("Employees1");
	
	//FileOutputStream fos = new FileOutputStream(src);
	XSSFRow row1 = sheet2.createRow(0);
	row1.createCell(0).setCellValue("EmpName");
	row1.createCell(1).setCellValue("Age");
	row1.createCell(2).setCellValue("Dept");
	
	XSSFRow row2 = sheet2.createRow(1);
	row2.createCell(0).setCellValue("Mani");
	row2.createCell(1).setCellValue("30");
	row2.createCell(2).setCellValue("IT");
	
	XSSFRow row3 = sheet2.createRow(2);
	row3.createCell(0).setCellValue("Raja");
	row3.createCell(1).setCellValue("29");
	row3.createCell(2).setCellValue("RPM");
	
	FileOutputStream fos = new FileOutputStream(src);
	res.write(fos);
	//res.close();
	int size =sheet2.getLastRowNum();
	int column=sheet2.getRow(0).getLastCellNum();
	for(int i=0; i<=size; i++) {
		for(int j=0; j<column; j++) {
		String data=sheet2.getRow(i).getCell(j).getStringCellValue();
		System.out.print(data +" ");
	}
		System.out.println();
}
	res.close();
}

}

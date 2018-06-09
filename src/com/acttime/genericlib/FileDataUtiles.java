package com.acttime.genericlib;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * 
 * @author Deepak
 *
 */
public class FileDataUtiles {
	String exelPath = "./testData/testdata.xlsx";
	String filePath = "./testData/commonData.properties";
	
	/**
	 * 
	 * @param sheetName , rownum , columNum

	 * @return String data
	 * @throws Throwable
	 * 
	 * its used to read data from Excel-WorkBook based on user Input
	 */
	public String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream(exelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		wb.close();
		return data;
	}
	
	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @param data
	 * @throws Throwable
	 * 
	 * its used to write data back Excel based on user input
	 */
	public void setEcelData(String sheetName, int rowNum, int celNum, String data) throws Throwable {
		FileInputStream fis = new FileInputStream(exelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(exelPath);
		wb.write(fos);
		wb.close();

	}
	/**
	 * 
	 * @return
	 * @throws Throwable
	 * its always return properteis File Object & load all the Keys availble in 
	 * commondata.properteis File in data folder
	 */
	public Properties getPropertiesFileObj() throws Throwable {
		FileInputStream fis = new FileInputStream(filePath);
		Properties pObj = new Properties();
		pObj.load(fis);
		return pObj;
	}

}

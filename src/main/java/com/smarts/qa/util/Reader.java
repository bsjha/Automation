package com.smarts.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reader {
	public final static int RESPONSE_CODE_200=200;
	public final static int RESPONSE_CODE_201=201;
	public final static int RESPONSE_CODE_400=400;
	public final static int RESPONSE_CODE_401=401;
	public final static String WeatherSheetName= "weather info";
	static org.apache.poi.ss.usermodel.Sheet sheet;
	static Workbook book;
	public static String Teatdatasheetpath="C:\\myproject\\jyoReal\\src\\test\\java\\testData\\newdata.xlsx";
	public static Object[] []  getdata(String sheetName) {
		FileInputStream file=null;
		
			try {
		
		file=new FileInputStream(Teatdatasheetpath);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				
			
		book=WorkbookFactory.create(file);
			}catch(InvalidFormatException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		sheet= book.getSheet(sheetName);
		Object[] [] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i=0; i<sheet.getLastRowNum(); i++) {
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
			
		}
		return data;
	}
	

}



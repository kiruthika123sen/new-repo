package utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import wrappers.LeafTapWrappers;


public class DataInputProvider extends LeafTapWrappers {

	public static Object[][] readExcel(String excelname) throws InvalidFormatException, IOException
	{
		
	
		File loginworkBook=new File("./data/"+excelname+".xlsx");
		XSSFWorkbook wbook=new XSSFWorkbook(loginworkBook);
		
		XSSFSheet sheet=wbook.getSheet("Sheet1");
		//XSSFSheet sheet1=wbook.getSheet("Sheet2");
		
		
		
		int rowcount=sheet.getLastRowNum();
		
		System.out.println("no. of rows"+rowcount);
		
		int columnCount=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rowcount][columnCount];
		
		for(int i=1;i<=rowcount;i++)
		{
			
		XSSFRow row=sheet.getRow(i);
		
		for(int j=0;j<columnCount;j++)
		{
			XSSFCell cell=row.getCell(j);
			String username=cell.getStringCellValue();
			System.out.println(username);
			data[i-1][j]=username;
		}
	

	}
		return data;

	}
}

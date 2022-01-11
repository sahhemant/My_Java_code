 package Excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtility {
	
public static String getreaddata(String path,int row,int column)
{
	String data="";
	try
	{
		FileInputStream fis=new FileInputStream(path) ;
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		data=sheet.getRow(row).getCell(column).getStringCellValue(); 
	}
	catch(Exception e)
	{
		
		System.out.println("issue in getread data" + e);
	}
	return data;
}
	public static void main (String[]args)
	{
		
		String path="C:\\Users\\yogesh\\eclipse-workspace\\my program\\Testdata\\12-1pm.xlsx";
		String out=getreaddata(path, 1, 0);
		System.out.println(out);
	}
}


package UPANDDOWN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SAMPLE
{
	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream input=new FileInputStream("./excel/corona.xlsx");
		 XSSFWorkbook book=new XSSFWorkbook(input);
		 
		 XSSFSheet sheet=book.getSheet("Sheet1");
		 
		 XSSFRow row=sheet.getRow(1);
		 XSSFCell cell = row.getCell(1);
		 String value = cell.toString();
		 
		 System.out.println("value is :"+value);
		
	}

}

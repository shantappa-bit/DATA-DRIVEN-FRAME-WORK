package UPANDDOWN;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class multipleread 
{
	public static void main(String[] args) throws IOException 
	{
	FileInputStream input=new FileInputStream("./excel/corona1.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(input);
	
	XSSFSheet sheet=book.getSheet("Sheet1");
	int count_row=sheet.getLastRowNum();
	
	for(int i=0;i<=count_row;i++)
	{
		XSSFRow row = sheet.getRow(i);
		
		for(int j=0;j<row.getLastCellNum();j++)
		{
			System.out.print(row.getCell(j).toString()+" ");
			
			
		}
		System.out.println(" ");
		
		
		
		
		
	}
	
	
	
		
	}

}

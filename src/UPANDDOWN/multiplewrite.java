package UPANDDOWN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class multiplewrite 
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream out=new FileOutputStream("./excel/newcoronapart2.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		
		XSSFSheet sheet=book.createSheet("shantushivu");
		
		for(int i=0;i<=5;i++)
		{
			XSSFRow row=sheet.createRow(i);
			
			for(int j=0;j<5;j++)
			{
				row.createCell(j).setCellValue("BIG_DUMMY");
			}
			
		}
		
		book.write(out);
		out.flush();
		
		
	}

}

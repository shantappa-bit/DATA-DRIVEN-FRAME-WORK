package UPANDDOWN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream out=new FileOutputStream("./excel/newcorona.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("shantu");
		XSSFRow row=sheet.createRow(1);
		XSSFCell cell=row.createCell(1);
		cell.setCellValue("hello");
		book.write(out);
		//out.flush(); not required here 
		
		
		
		
	}

}

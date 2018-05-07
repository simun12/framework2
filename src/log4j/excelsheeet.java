package log4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelsheeet {

	public static void main(String[] args) throws IOException {
		
		FileInputStream st=new FileInputStream("//Users//mohammadhasan//Documents//Workbook1.xlsx");
  XSSFWorkbook workbook = new XSSFWorkbook(st);
  XSSFSheet worksheet= workbook.getSheet("sheet1");
  //xssf=xlsx
  //hssf=
  
  String value= worksheet.getRow(7).getCell(1).getStringCellValue();
  double intvalue=worksheet.getRow(2).getCell(1).getNumericCellValue();
  System.out.println(value);
  System.out.println(intvalue);
  
  
	}

}

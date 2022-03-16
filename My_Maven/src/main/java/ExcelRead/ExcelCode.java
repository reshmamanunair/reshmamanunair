package ExcelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode
{
public static FileInputStream f;
	
public static XSSFWorkbook w;
public static XSSFSheet s;

public static String readStringData(int i,int j) throws IOException 
{
f=new FileInputStream("C:\\Users\\reshm\\OneDrive\\Desktop\\Excelread.xlsx");	
w=new XSSFWorkbook(f);	
s=w.getSheet("sheet1");
Row r=s.getRow(i);
Cell c=r.getCell(j);
return c.getStringCellValue();
}
public static String readIntegerData(int i,int j) throws IOException 
{
	f=new FileInputStream("C:\\Users\\reshm\\OneDrive\\Desktop\\excelread.xlsx");	
	w=new XSSFWorkbook(f);	
	s=w.getSheet("sheet1");
	Row r=s.getRow(i);
	Cell c=r.getCell(j);
	int a=(int) c.getNumericCellValue();
	return String.valueOf(a);
}
}

package utilpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Oroshealthutil {

public static WebDriver driver;
	
	public static int rowCount(String xl, String sheet) throws IOException
	{
		try
		{
		FileInputStream fi= new FileInputStream(xl);
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		int r= wb.getSheet(sheet).getLastRowNum();
		return r;
		}
		
		catch(Exception e)
		{
			return 0;
		}
	}
	
	public static String cellData(String xl,String sheet, int r, int c)
	{
		try
		{
			FileInputStream fi= new FileInputStream(xl);
			XSSFWorkbook wb= new XSSFWorkbook(fi);
			XSSFCell cell= wb.getSheet(sheet).getRow(r).getCell(c);	
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
			
			
		}
		
		catch(Exception e)
		{
			return("");
		}
		
		
	}
	
}

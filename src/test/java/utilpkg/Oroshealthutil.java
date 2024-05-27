package utilpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	
	public static void uploadpgm(WebElement img) throws AWTException, InterruptedException
	{
		img.click();
		Thread.sleep(2000);
	    fileupload("C:\\Users\\deepe\\Documents\\seleniumfldr\\skincare.jpg");
		Thread.sleep(2000);

	}
	
	
	public static void fileupload(String p) throws AWTException
	{
		StringSelection strgslctn= new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strgslctn, null);
		
	    Robot rt= new Robot();
	     
	    rt.delay(3000);
	    
	    rt.keyPress(KeyEvent.VK_CONTROL);
	    rt.keyPress(KeyEvent.VK_V);
	    rt.keyRelease(KeyEvent.VK_V);
	    rt.keyRelease(KeyEvent.VK_CONTROL);
	    
	    rt.delay(3000);
	    
	    rt.keyPress(KeyEvent.VK_ENTER);
	    rt.keyRelease(KeyEvent.VK_ENTER);
	    rt.delay(3000);
	}
	
}

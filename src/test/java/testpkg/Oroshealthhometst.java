package testpkg;

import java.io.IOException;

//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.Oroshealthbase;
import pagepkg.Oroshealthpage;
//import pratice.OroshealthpracUtil;
import utilpkg.Oroshealthutil;

public class Oroshealthhometst extends Oroshealthbase
{
	@Test(priority=1,enabled=false)
	public void userSearch() throws InterruptedException
	{
		  Oroshealthpage p1= new Oroshealthpage(driver);
			// User search option
           // p1.srchUsers();
           // Thread.sleep(5000);
            
            //Profession
            p1.addProfesn();
			Thread.sleep(4000);
            p1.dltProfesn(); 
            Thread.sleep(4000);
            
            p1.addProfesn();
			Thread.sleep(6000);
            p1.edtProfesn(); 
            Thread.sleep(3000);
         
            
	}
	
	@Test(priority=2,enabled=false)
	public void humnAspects() throws InterruptedException
	{
	    Oroshealthpage p1= new Oroshealthpage(driver);
		String title="Abcd";
		String title1="Eating disorder";
		Thread.sleep(3000);
		//Profession
		driver.navigate().refresh();
        p1.addHumanAspct(title);
		Thread.sleep(6000);
        p1.dltHumanAspct(); 
        Thread.sleep(3000);
        
        p1.addHumanAspct(title);
		Thread.sleep(6000);
        p1.edtHumanAspct(title1); 
        Thread.sleep(3000);

	}
	
	@Test(priority=3,enabled=false)
	public void emojiRctn() throws InterruptedException
	{
		    Oroshealthpage p1= new Oroshealthpage(driver);
			Thread.sleep(5000);
			
			// User search option
            p1.srchUsers();
            Thread.sleep(5000);
            
            //Profession
            p1.addProfesn();
			Thread.sleep(6000);
            p1.dltProfesn(); 
            Thread.sleep(3000);
	}
	

	@Test(priority=4)
	public void therapyStatus() throws InterruptedException, IOException
	{
		  Oroshealthpage p1= new Oroshealthpage(driver);		
            
            //Therapy Status
		  String xl= "C:\\Users\\deepe\\Documents\\seleniumfldr\\Oroshealthlogin_input.xlsx";
		  String sheet= "Therapy_status";
		  int rowcount= Oroshealthutil.rowCount(xl, sheet);
		  System.out.println("Rowcount="+rowcount);
		  
		  //Adding therapy status from excel
		  for(int i=1;i<rowcount;i++)
		   {
			  String status= Oroshealthutil.cellData(xl, sheet, i,0);
			  System.out.println("Status-"+status);			  
              p1.addThrpyStts(status);
     		  Thread.sleep(4000);			 				  			   			 
		   }
		  		  		  
		  //Deleting therapy status from excel
		  for(int i=1;i<rowcount;i++)
		  {
			  String status= Oroshealthutil.cellData(xl, sheet, i,0);
              p1.dltThrpyStts(status,rowcount); 
              Thread.sleep(4000);
		  }
		  
           // Thread.sleep(4000);                      
	}
}

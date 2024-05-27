package testpkg;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.Oroshealthbase;
import pagepkg.Oroshealthpage;
import utilpkg.Oroshealthutil;

public class Oroshealthlogintest extends Oroshealthbase
{

	@Test
	//Logging in
	public void logintst() throws IOException, InterruptedException
	{
		  Oroshealthpage p1= new Oroshealthpage(driver);
		  String xl= "C:\\Users\\deepe\\Documents\\seleniumfldr\\Oroshealthlogin_input.xlsx";
		  String sheet= "Sheet1";
		  int rowcount= Oroshealthutil.rowCount(xl, sheet);
		  System.out.println("Rowcount="+rowcount);
		  for(int i=1;i<=rowcount;i++)
		  {
			  String emailid= Oroshealthutil.cellData(xl, sheet, i,0);
			  System.out.println(emailid);
			  String password= Oroshealthutil.cellData(xl, sheet, i,1);
			  System.out.println(password);
			 
			  
			  p1.setValues(emailid,password);
	          p1.loginlink();
		      Thread.sleep(2000);
		  
		  String actual= driver.getCurrentUrl();
	      String expected= "https://oros-dev-portal-jfts4.ondigitalocean.app/user/listUsers";
	      if(actual.equals(expected))
	      {
	    	  System.out.println("pass");
	      }
	      else
	      {
	    	  System.out.println("fail");
	    	  p1.clearemail();
	    	  p1.clearpass();
	      }
	      }
	}
	
}

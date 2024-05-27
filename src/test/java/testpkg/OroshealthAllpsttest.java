package testpkg;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Oroshealthbase;
import pagepkg.OroshealthAllpstpage;
import utilpkg.Oroshealthutil;

public class OroshealthAllpsttest extends Oroshealthbase
{

	@Test(priority=1) 
	public void postSearch() throws InterruptedException, IOException, AWTException
	 {
		  OroshealthAllpstpage p1= new OroshealthAllpstpage(driver);

		  String xl= "C:\\Users\\deepe\\Documents\\seleniumfldr\\Oroshealthlogin_input.xlsx";
		  String sheet= "AllpostFilter";
		  int rowcount= Oroshealthutil.rowCount(xl, sheet);
		  System.out.println("Rowcount="+rowcount);
		  for(int i=1;i<=rowcount;i++)
		  {
			  String preference = Oroshealthutil.cellData(xl, sheet, i,0);
			  System.out.println(preference);
			  String searchByPost = Oroshealthutil.cellData(xl, sheet, i,1);
			  System.out.println(searchByPost);
			  String searchByUser = Oroshealthutil.cellData(xl, sheet, i,2);
			  System.out.println(searchByUser);
			  String postedFrom = Oroshealthutil.cellData(xl, sheet, i,3);
			  System.out.println(postedFrom);
			  String postedTo = Oroshealthutil.cellData(xl, sheet, i,4);
			  System.out.println(postedTo);
			  String sortBy = Oroshealthutil.cellData(xl, sheet, i,5);
			  System.out.println(sortBy);
			  
		      p1.allPstfltr(preference,searchByPost,searchByUser,postedFrom,postedTo,sortBy);		  		  
	          Thread.sleep(1000);
			  
		  }
	 
		  String sheet1= "viewpost";
		  int rowcount1= Oroshealthutil.rowCount(xl, sheet1);
		  System.out.println("Rowcount="+rowcount1);
		  for(int j=1;j<=rowcount1;j++)
		  {
			  String post_text = Oroshealthutil.cellData(xl, sheet1, j,0);
			  System.out.println(post_text);
		      p1.viewPost(post_text);
		  }   
      }
}

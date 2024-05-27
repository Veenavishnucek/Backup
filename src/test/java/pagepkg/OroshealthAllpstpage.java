package pagepkg;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class OroshealthAllpstpage {
	
	public static WebDriver driver;

	@FindBy(xpath="//button[text()='All Post']")
	WebElement allpst;
	@FindBy(xpath="//select[@name='preferenceJson']")
	WebElement prfrnc;
	@FindBy(xpath="//input[@name=\"searchPost\"]")
	WebElement srchpst;
	@FindBy(xpath="//input[@name='searchUser']")
	WebElement srchusr;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement pstdfrm;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement pstdto;
	@FindBy(xpath="//select[@name='sortBy']")
	WebElement srtby;
	@FindBy(xpath="//div[@id='headlessui-radiogroup-option-:r7:' and @role='radio']")
	WebElement ordrbyup;
	@FindBy(xpath="//div[@id='headlessui-radiogroup-option-:r8:' and @role='radio']")
	WebElement ordrbydwn;
	@FindBy(xpath="//button[text()='Apply']")
	WebElement apply;
	@FindBy(xpath="//button[text()='Clear']")
	WebElement clear;
	@FindBy(xpath="(//span[@style='cursor: pointer;'])[2]")
	WebElement yr_slct;
	@FindBy(xpath="(//span[@style='cursor: pointer;'])[1]")
	WebElement mnth_slct;
	@FindBy(xpath="(//i[@class='rmdp-arrow'])[2]")
	WebElement rgtarrw_slct;
	@FindBy(xpath="(//i[@class='rmdp-arrow'])[1]")
	WebElement lftarrw_slct;
	@FindBy(xpath="//div[@class='rmdp-year-picker']/div/div/span")
	public List<WebElement> yearlist;
	@FindBy(xpath="//div[@class='rmdp-month-picker']/div/div/span")
	public List<WebElement> monthlist;
	@FindBy(xpath="//div[@class='rmdp-day-picker ']/div/div/div")
	public List<WebElement> datelst;
	
	@FindBy(xpath="(//tr[@class='cursor-pointer'])/td[5]/div/a[1]")
	public List<WebElement> viewPst;
	@FindBy(xpath="(//tr[@class='cursor-pointer'])/td[2]")
	public List<WebElement> pstLst;
	@FindBy(xpath="(//tr[@class='cursor-pointer'])/td[5]/div/a[2]")
	public List<WebElement> deletePst;
	@FindBy(xpath="//button[text()='Next']")
	WebElement nxtpageBtn;
	@FindBy(xpath="((//nav[@class='flex items-center justify-between px-4 sm:px-0'])/div)[2]/a")
	public List<WebElement> totlPgs;
	//@FindBy(xpath="((//nav[@class='flex items-center justify-between px-4 sm:px-0'])/div)[2]/a[6]")
	//WebElement lastpage;
	
	
	
	public OroshealthAllpstpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void allPstfltr(String prf,String pstsrch,String usrsrch,String dateFrom,String dateTo,String sortby) throws InterruptedException, IOException, AWTException
	{
		allpst.click();
		Thread.sleep(1000);
		prfrnc.click();
		Thread.sleep(2000);
		Select dropdownprf = new Select(prfrnc);
		dropdownprf.selectByVisibleText(prf);
		Thread.sleep(2000);
		srchpst.sendKeys(pstsrch);
		Thread.sleep(2000);
		srchusr.sendKeys(usrsrch);
		Thread.sleep(2000);
		pstdfrm.click();
		String []datePartsFrm = dateformatChange(dateFrom);
		dateSelectn(datePartsFrm[0], datePartsFrm[1], datePartsFrm[2]);
		Thread.sleep(2000);
		pstdto.click();
		String []datePartsTo = dateformatChange(dateTo);
		dateSelectn(datePartsTo[0], datePartsTo[1], datePartsTo[2]);
		Thread.sleep(2000);
		Select dropdownsrt = new Select(srtby);
		Thread.sleep(1000);
		dropdownsrt.selectByVisibleText(sortby);
		Thread.sleep(2000);
		Boolean sort = ordrbyup.isSelected();
		if(!sort)
		{
			ordrbyup.click();
		}
		apply.click();
	}
	
	public String[] dateformatChange(String dateText) throws IOException, InterruptedException, AWTException
	   {
		 String month;
	     String [] dateParts = dateText.split("-");
	     int mnth = Integer.parseInt(dateParts[1]);	        	     
	     String monthName = Month.of(mnth).name();
	     monthName = monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();
	     dateParts[1]= monthName;
	     return dateParts;
	   }
	
	public void dateSelectn(String year,String month,String day) throws InterruptedException
	{
		
			mnth_slct.click();
            int list1=monthlist.size();
            System.out.println(list1);
			Thread.sleep(1000);
      	    for(WebElement ech:monthlist)
      	      {
    		    String monthname = ech.getText();
    		    System.out.println(monthname);
    		    if(monthname.equals(month))
    		      {
        		     ech.click();
       			     break;
       			  }
    	       }
		    Thread.sleep(2000);
      	    yr_slct.click();
            int list2=yearlist.size();            
            System.out.println(list2);
			Thread.sleep(1000);
    	    for(WebElement ele:yearlist)
    	      {
  		        String yearname = ele.getText();
  		        System.out.println(yearname);
  		        if(yearname.equals(year))
  		          {
      		        ele.click();
     			    break;
     			  }
  		       /*else
  		       {
  		    	 rgtarrw_slct.click(); 
  		       }*/
  	          }
		    Thread.sleep(2000);
        	for(WebElement element:datelst)
        	 {
        		String dt= element.getText();
        		System.out.println(dt);
                if(dt.equals(day))
        		{
        			element.click();
        			break;
        		}
        	 }
	}
	
	public void viewPost(String pst2vw) throws IOException, InterruptedException, AWTException
	   {
		  String vwstatus=null;
		  int lastPg = totlPgs.size();
	      System.out.println(lastPg);
	      WebElement lastPage=driver.findElement(By.xpath("((//nav[@class='flex items-center justify-between px-4 sm:px-0'])/div)[2]/a"+"["+lastPg+"]"));	
		  String lstpage=lastPage.getText();
	      System.out.println(lstpage);
		  int numPages = Integer.parseInt(lstpage);
	       System.out.println(pst2vw);
		  for(int i=1;i<=(numPages);i++)
			{
		      System.out.println("page number="+i);
		      for(WebElement pst:pstLst)
	            {
			        String postTxt= pst.getText(); 
			        System.out.println(postTxt);
                    if(pst2vw.equals(postTxt))
      		           {
            	         WebElement view=driver.findElement(By.xpath("((//td[text()='"+postTxt+"']/parent::*/td)[5]/div/a)[1]"));	
        		         view.click();
        		         vwstatus="Found";
        				 System.out.println(vwstatus);
        		         break;
      		            }
                    Thread.sleep(1000);
	             }
		      if(vwstatus=="Found") 
		       {
		    	break;  
		       }
		      else 
		       {
			    nxtpageBtn.click();  
		       }
			 }
		  if(vwstatus==null)
		  {
			  System.out.println("Post not found!!");
		  }
	    }	
	
	
	
		
		
	
}

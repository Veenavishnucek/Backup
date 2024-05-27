package pagepkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oroshealthpage {
	
	WebDriver driver;
	
	//Login page
	@FindBy(name="email")
	WebElement emailfld;	
	@FindBy(name="password")
	WebElement pass;
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/div/form/div[4]/button")
	WebElement loginbtn;
	
	//Users search field
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/input")
	WebElement srchbtn;
	
	
	//Profession 
	@FindBy(xpath="//button[text()='Profession']")
	WebElement profsn;
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement addNwPr;
	@FindBy(name="title")
	WebElement ttlPr;
	@FindBy(xpath="//*[@ type='submit']")
	WebElement savePr;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[4]/td[3]/div/a[2]")
	WebElement dltPr;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/button[1]")
	WebElement dltcnfmPr;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[4]/td[3]/div/a[1]")
	WebElement edtPr;
	@FindBy(xpath="//*[@type=\"submit\"]")
	WebElement svedtPr;
	
	
	//Therapy Status
		@FindBy(xpath="//button[text()='Therapy Status']")
		WebElement thrpsts;
		@FindBy(xpath="//button[text()='Add New']")
		WebElement addNwTS;
		@FindBy(name="title")
		WebElement ttlTS;
		@FindBy(xpath="//button[text()='Save']")
		WebElement saveTS;
		@FindBy(xpath="//button[text()='Cancel']")
		WebElement cnclTS;
		@FindBy(xpath="//p[text()='This field is required']")
		WebElement errorTS;
		//@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/a[2]")
		//WebElement dltTS;
		@FindBy(xpath="(//td[text()='Therapy status123']/parent::*/td[3]/div/a)[2]")
		WebElement dltTS;
		@FindBy(xpath="//button[text()='Delete']")
		WebElement dlt_cfmTS;
		//@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[4]/td[3]/div/a[1]")
		//WebElement edtTS;
		@FindBy(xpath="(//td[text()='wea']/parent::*/td[3]/div/a)[1]")
		WebElement edtTS;
		@FindBy(xpath="//button[text()='Save']")
		WebElement svedtTS;
		@FindBy(xpath="//div[@class='hidden md:-mt-px md:flex']/a[1]")
		WebElement fstpgTS;
		@FindBy(xpath="//button[text()='Next']")
		WebElement nxtTS;
	
	//Human Aspects
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/nav/ul/li/div/button[3]")
	WebElement hmnAspct;
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement addNwHA;
	@FindBy(name="title")
	WebElement ttlHA;
	@FindBy(xpath="//*[@ type='submit']")
	WebElement saveHA;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[3]/div/a[2]")
	WebElement dltHA;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/button[1]")
	WebElement dltcnfmHA;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[3]/div/a[1]")
	WebElement edtHA;
	@FindBy(xpath="//*[@type=\"submit\"]")
	WebElement svedtHA;
	@FindBy(xpath="//*[contains(text(),'Eating disorder')]")    
	WebElement element;

	
	
	
	//Emoji Reactions
		@FindBy(xpath="//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/nav/ul/li/div/button[5]")
		WebElement emjrctn;
		@FindBy(xpath="//*[@id=\"__next\"]/div/div[2]/div/div/div/div[2]/div[1]/div/button")
		WebElement addNwER;
		@FindBy(xpath="//*[@name=\"name\"]")
		WebElement ttlER;
		@FindBy(xpath="//*[@id=\"headlessui-dialog-panel-:rm:\"]/div[2]/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div/div[2]")
		WebElement emjfld;
		@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div[2]/button[7]/span/span")
		WebElement emjslct;
		@FindBy(xpath="//*[@ type='submit']")
		WebElement saveER;
		/*@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[3]/div/a[2]")
		WebElement dltHA;
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/button[1]")
		WebElement dltcnfmHA;*/
		
		
		//Post Reactions
				@FindBy(xpath="///*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/nav/ul/li/div/button[6]")
				WebElement pstrctn;
				@FindBy(xpath="//*[@id=\"__next\"]/div/div[2]/div/div/div/div[2]/div[1]/div/button")
				WebElement addNwPR;
				@FindBy(name="shortCode")
				WebElement ttlPR;
				@FindBy(name="description")
				WebElement emjdesc;
				@FindBy(name="name")
				WebElement emjname;
				@FindBy(xpath="//input[@aria-label=\"Type to search for an emoji\"]")
				WebElement emjsrchfld;
				//@FindBy(xpath="//input[@aria-label=\"Type to search for an emoji\"]")
				//WebElement emjsrchfld;
				@FindBy(xpath="//*[@ type='submit']")
				WebElement savePR;
				/*@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[3]/div/a[2]")
				WebElement dltHA;
				@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/button[1]")
				WebElement dltcnfmHA;*/
	
	
	
	public Oroshealthpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void setValues(String emailid,String password)
	{
		emailfld.sendKeys(emailid);
		pass.sendKeys(password);
	}
	public void loginlink()
	{
		loginbtn.click();
	}
	public void clearemail()
	{
		emailfld.clear();
	}
	public void clearpass()
	{
		pass.clear();
		driver.navigate().refresh();
	}
	public void srchUsers()
	{
		srchbtn.sendKeys("sai");
	}
	public void addProfesn() throws InterruptedException
	{
		profsn.click();
		addNwPr.click();
		ttlPr.sendKeys("Teacher");
		Thread.sleep(3000);
		savePr.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
	}
	public void dltProfesn() throws InterruptedException
	{
		Thread.sleep(1000);
		//profsn.click();
        dltPr.click();
        dltcnfmPr.click();
	}
	public void edtProfesn() throws InterruptedException
	{
		Thread.sleep(1000);
		//profsn.click();
        edtPr.click();
        ttlPr.clear();
		ttlPr.sendKeys("Dancer");
		svedtPr.click();
	}
	
	
	
	public void addThrpyStts(String status) throws InterruptedException
	{
		
		  thrpsts.click();	
		  addNwTS.click();
		  ttlTS.sendKeys(status);
		  Thread.sleep(3000);
		  saveTS.click();
		  Thread.sleep(2000);
		  String pgsrc= driver.getPageSource();
		  if(pgsrc.contains("This field is required"))
		   {
			System.out.println("This status can not be created");
			cnclTS.click();
			Thread.sleep(2000);
		   }
		
	}
	public void dltThrpyStts(String status,int rowcount) throws InterruptedException
	{
		thrpsts.click();
		Thread.sleep(1000);
		System.out.println("status--"+status);
		driver.getCurrentUrl();
		List<WebElement> pagelist= driver.findElements(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[2]/div[3]/nav/div[2]/a"));
		//System.out.println("pages "+pagelist.size());
		fstpgTS.click();
		String delstatus=null;
		for(int i=1;i<=pagelist.size();i++)
		{
			//System.out.println("Total page count--"+pagelist.size());
		  //driver.navigate().refresh();
		  //Thread.sleep(5000);
		  String src= driver.getPageSource();
		  Thread.sleep(1000);
		  //System.out.println("page count--"+i);
		  if(src.contains(status))
			{
			  //List<WebElement> statuslist= driver.findElements(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[2]"));
			  //System.out.println("Inside first if");
			  List<WebElement> statuslist= driver.findElements(By.xpath("//tr[@class='cursor-pointer']/td[2]"));
              int slno=statuslist.size();
			  Thread.sleep(1000);
        	  for(WebElement ele:statuslist)
        	  {
        	  // System.out.println("Serial no"+slno);
        	   //System.out.println("page count"+i);
        	   String text = ele.getText();
        	   //System.out.println(text);
        	  
        	   if(status.equals(text))
        		{
        		  WebElement toBdltd=driver.findElement(By.xpath("(//td[text()='"+status+"']/parent::*/td[3]/div/a)[2]"));	
        		  toBdltd.click();
        		  dlt_cfmTS.click();
       		      System.out.println("deleted"+status);
       		      delstatus="deleted";
       		      i=pagelist.size();
       		      break;
        		  
        		}	
        	  }		
			}
		  if(i==pagelist.size() && delstatus!="deleted")
		  {
			  System.out.println("This status does not exist!!");
		  }
		  
		  else
		  {
			 nxtTS.click();
			 Thread.sleep(1000);
		  } 
 
	}
	}
	public void edtThrpyStts() throws InterruptedException
	{
		Thread.sleep(1000);
		//profsn.click();
        edtTS.click();
        ttlTS.clear();
		ttlTS.sendKeys("TherapyStatus123");
		svedtTS.click();
	}
	
	
	
	public void addHumanAspct(String title) throws InterruptedException
	{
		driver.navigate().refresh();
		hmnAspct.click();
		Thread.sleep(3000);
		addNwHA.click();
		ttlHA.sendKeys(title);
		//Thread.sleep(3000);
		saveHA.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	public void dltHumanAspct() throws InterruptedException
	{
		Thread.sleep(1000);
        dltHA.click();
        dltcnfmHA.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	public void edtHumanAspct(String title1) throws InterruptedException
	{
		Thread.sleep(1000);
        edtHA.click();
        ttlHA.clear();
		ttlHA.sendKeys(title1);
		svedtHA.click();
		Thread.sleep(2000);
		//WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Eating disorder')]"));    
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();",element);
		js.executeScript("window.scrollBy(0, 250)", "");
	}
	
	public void addEmojiRectn(String title) throws InterruptedException
	{
		driver.navigate().refresh();
		emjrctn.click();
		Thread.sleep(3000);
		addNwER.click();
		emjfld.sendKeys(title);
		emjslct.click();
		//Thread.sleep(3000);
		saveHA.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.navigate().refresh();
		Thread.sleep(2000);


	}
	
}

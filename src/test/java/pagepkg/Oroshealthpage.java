package pagepkg;

import java.time.Duration;

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
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/nav/ul/li/div/button[4]")
	WebElement profsn;
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement addNwPr;
	@FindBy(name="title")
	WebElement ttlPr;
	@FindBy(xpath="//*[@ type='submit']")
	WebElement savePr;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[6]/td[3]/div/a[2]")
	WebElement dltPr;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/button[1]")
	WebElement dltcnfmPr;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[6]/td[3]/div/a[1]")
	WebElement edtPr;
	@FindBy(xpath="//*[@type=\"submit\"]")
	WebElement svedtPr;
	
	
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
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
		//profsn.click();
        dltHA.click();
        dltcnfmHA.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	public void edtHumanAspct(String title1) throws InterruptedException
	{
		Thread.sleep(1000);
		//profsn.click();
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

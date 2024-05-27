package pagepkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilpkg.Oroshealthutil;

public class Oroshealthpage2 {
	
WebDriver driver;
WebDriverWait wait;
	
	//Blog Post page
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/nav/ul/li/div/button[7]")
	WebElement blgpst;	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement addnwBP;
	@FindBy(name="title")
	WebElement ttlBP;
	@FindBy(name="subtitle")
	WebElement subttlBP;
	@FindBy(name="description")
	WebElement decrptnBP;
	@FindBy(name="postCategoryId")
	WebElement catgBP;
	@FindBy(xpath="//*[@title='Rich Text Area']")
	WebElement cntntBP;
	@FindBy(name="subscriptionmode")
	WebElement subscrptnBP;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/form/div/div[7]/div/div/div/div/div/div[2]/label")
	WebElement imgBP;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/form/div/div[9]/button")
	WebElement actvBP;
	@FindBy(xpath="//*[@type='color']")
	WebElement bgColorBP;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/form/div/div[10]/button[1]")
	WebElement cnclBP;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/form/div/div[10]/button[2]")
	WebElement saveBP;
	
	
	//Blog Post Catagory page
		@FindBy(xpath="//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/nav/ul/li/div/button[8]")
		WebElement blgpstcat;	
		@FindBy(xpath="//*[@id=\"__next\"]/div/div[2]/div/div/div/div[2]/div[1]/div/button")
		WebElement addnwBPC;
		@FindBy(name="title")
		WebElement ttlBPC;
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/form/div/div[2]/div/div/div/div/div[2]/label")
		WebElement img1BPC;
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/form/div/div[3]/div/div/div/div/div[2]/label")
		WebElement img2BPC;
		@FindBy(xpath="//*[@id=\"headlessui-dialog-panel-:rf:\"]/div[2]/div/div[2]/div/form/div/div[5]/button[1]")
		WebElement cnclBPC;
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/form/div/div[5]/button[2]")
		WebElement svBPC;
	
	public Oroshealthpage2(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void blogPostng(String title,String subtitle,String description,String catagory,String contents,String subscription) throws AWTException, InterruptedException
	{
	    Robot rt= new Robot();
		Thread.sleep(3000);
		blgpst.click();
		Thread.sleep(5000);
		addnwBP.click();
		Thread.sleep(2000);
		ttlBP.sendKeys(title);
		Thread.sleep(1000);
		subttlBP.sendKeys(subtitle);
		Thread.sleep(1000);
		decrptnBP.sendKeys(description);
		Thread.sleep(2000);
		Select dropdown = new Select(catgBP);  
		dropdown.selectByVisibleText(catagory); 
		Thread.sleep(4000);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable( cntnt_iframBP));
		cntntBP.sendKeys(contents);
		Thread.sleep(2000);
		for (int i=0;i<=8;i++)
		{
			rt.keyPress(KeyEvent.VK_PAGE_DOWN);	 
			rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(1000);
		}
		//Thread.sleep(2000);
		subscrptnBP.sendKeys(subscription);
		Thread.sleep(1000);
		Oroshealthutil.uploadpgm(imgBP);
		Thread.sleep(2000);
		saveBP.click();
		Thread.sleep(1000);
	}
	
	public void blogPostCatagory(String title) throws InterruptedException, AWTException
	{
		
		blgpstcat.click();
		Thread.sleep(1000);
		addnwBPC.click();
		Thread.sleep(2000);
		ttlBP.sendKeys(title);
		Thread.sleep(2000);
		Oroshealthutil.uploadpgm(img1BPC);
		Thread.sleep(2000);
		Oroshealthutil.uploadpgm(img2BPC);
		Thread.sleep(3000);
		svBPC.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.navigate().refresh();
		Thread.sleep(2000);
	}

}

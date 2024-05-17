package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.Oroshealthbase;
import pagepkg.Oroshealthpage;

public class Oroshealthhometst extends Oroshealthbase
{
	@Test(priority=1)
	public void userSearch() throws InterruptedException
	{
		  Oroshealthpage p1= new Oroshealthpage(driver);
		    WebElement email= driver.findElement(By.name("email"));
			email.sendKeys("admin@oros.com");
			WebElement pass= driver.findElement(By.name("password"));
			pass.sendKeys("CKhWkT44kq4vsNk");
			WebElement lognbtn= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/div/form/div[4]/button"));
			lognbtn.click();
			Thread.sleep(5000);
			
			// User search option
           // p1.srchUsers();
           // Thread.sleep(5000);
            
            //Profession
            p1.addProfesn();
			Thread.sleep(5000);
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
	    WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("admin@oros.com");
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys("CKhWkT44kq4vsNk");
		WebElement lognbtn= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/div/form/div[4]/button"));
		lognbtn.click();
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
		   /* WebElement email= driver.findElement(By.name("email"));
			email.sendKeys("admin@oros.com");
			WebElement pass= driver.findElement(By.name("password"));
			pass.sendKeys("CKhWkT44kq4vsNk");
			WebElement lognbtn= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/div/form/div[4]/button"));
			lognbtn.click();*/
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
}

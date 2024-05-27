package testpkg;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.Oroshealthbase;
import pagepkg.Oroshealthpage;
import pagepkg.Oroshealthpage2;

public class Oroshealthtest2_Blog extends Oroshealthbase
{
	@Test(priority=1)
	public void blogPost() throws InterruptedException, AWTException
	{
		
		  Oroshealthpage2 p2= new Oroshealthpage2(driver);
		  String title="Healthcare";
		  String subtitle="Skincare";
		  String description="Skincare in winter";
		  String catagory="skin";
		  String contents="  Detailed Skincare Routine";
		  String subscription="Paid";
		  p2.blogPostng(title,subtitle, description,catagory, contents, subscription);
		  Thread.sleep(2000);

	}
	
	@Test(priority=2)
	public void blogPostCatgry() throws InterruptedException, AWTException
	{
		  Oroshealthpage2 p2= new Oroshealthpage2(driver);
		  String title="Healthcare";
          p2.blogPostCatagory(title);
	}
}

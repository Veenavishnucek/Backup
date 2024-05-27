package basepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Oroshealthbase {

public static WebDriver driver;
public static WebDriverWait wait;
	
	@BeforeTest
	public void setUp() throws InterruptedException
	{
		driver= new ChromeDriver();
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Maximum wait time of 10 seconds
		driver.get("https://oros-dev-portal-jfts4.ondigitalocean.app/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("admin@oros.com");
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys("CKhWkT44kq4vsNk");
		WebElement lognbtn= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/div/form/div[4]/button"));
		lognbtn.click();
		Thread.sleep(5000);
		
		
	}
}

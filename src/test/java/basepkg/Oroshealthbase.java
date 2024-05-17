package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Oroshealthbase {

public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://oros-dev-portal-jfts4.ondigitalocean.app/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
}

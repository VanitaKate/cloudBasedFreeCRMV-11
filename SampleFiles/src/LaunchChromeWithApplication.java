import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeWithApplication {

	public static void main(String[] args) 
	{
		//File file = new File("C:/Selenium Drivers/chromedriver.exe"); 
		 //System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()); 
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		boolean status1= driver.findElement(By.xpath("//span[contains(text(),'Continue to Gmail')]")).isDisplayed();
		System.out.println(status1);
		Assert.assertEquals("True", status1);
		
	    boolean status2=driver.findElement(By.xpath("//button[contains(text(),'Forgot email?')]")).isDisplayed();  
		System.out.println(status2);
	    boolean status3=driver.findElement(By.id("//a[@class='h-c-button h-c-header__cta-li-link h-c-header__cta-li-link--primary']")).isDisplayed();
	    Assert.assertEquals("True", status3); 
	    	
    
		//driver.findElement(By.xpath("//button[contains(text(),'Forgot email?')]")).click();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}

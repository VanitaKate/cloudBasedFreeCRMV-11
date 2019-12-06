import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium Drivers\\geckodriver.exe");
	//Thread.sleep(5000);
	driver=new FirefoxDriver();
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("make")));
	Thread.sleep(5000);
    driver.get("https://www.google.com/gmail/about/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	System.out.println(driver.getTitle());
    	boolean status1=driver.findElement(By.xpath("//a[@class='h-c-button h-c-header__cta-li-link h-c-header__cta-li-link--primary']")).isEnabled();
    	boolean status2=driver.findElement(By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(@class,'h-c-header__nav-li-link')][contains(text(),'Sign in')]")).isDisplayed();
    	System.out.println(status1);
    	System.out.println(status2);
    	
    	
    			driver.quit();
	//Thread.sleep(5000);

	}

}

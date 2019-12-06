

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//@Parameters ("Browser")
public class BaseClass {
	readConfig readConfig=new readConfig();
	WebDriver driver;
	public void setup(String Browser) {
		if(Browser=="ChromeDriver") {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+readConfig.getChromePath());
			ChromeDriver driver=new ChromeDriver();
		} else if(Browser=="ChromeDriver") {
		  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+readConfig.getFireFoxPath());
			FirefoxDriver driver=new FirefoxDriver();
		}else if(Browser=="IEDriver") {
			  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+readConfig.getIEPath());
				InternetExplorerDriver driver=new InternetExplorerDriver();
			}
	}

}

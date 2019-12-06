package cloudBasedFreeCRM_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cloudBasedFreeCRM_Utilities.readConfig;

public class Test1 {
	
	readConfig readConfig=new readConfig();
public static	WebDriver driver;
//	static String Browser="FireFox";

@Parameters ("Browser")
@BeforeClass
	public void setup() {
	
	String Browser="FireFox";
	System.out.println("Test Execution started");
	String FireFoxPath=readConfig.getFireFoxPath();
	System.out.println("FireFoxPath: " +FireFoxPath);
		//logger=LogManager.getLogger()
			//	PropertyConfigurator.configure("log4j2.properties");
			if(Browser.equalsIgnoreCase("ChromeDriver")) {
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+readConfig.getChromePath());
					 
				driver=new ChromeDriver();
				driver.get("https://ui.cogmento.com/");
			} else if(Browser.equalsIgnoreCase("FireFox")) {
			  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+readConfig.getFireFoxPath());
					  
				driver=new FirefoxDriver();
				
			}else if(Browser.equalsIgnoreCase("IEDriver")) {
				  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")); //+readConfig.getIEPath());
					driver=new InternetExplorerDriver();
					driver.get("https://ui.cogmento.com/");
				}
			driver.close();
		}
}

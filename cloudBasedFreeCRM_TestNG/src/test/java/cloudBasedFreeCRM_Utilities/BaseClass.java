package cloudBasedFreeCRM_Utilities;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	readConfig readConfig=new readConfig();
	public static   WebDriver driver;
	org.apache.logging.log4j.Logger logger;
	@Parameters ("Browser")
	@BeforeClass	
	public void setup(String Browser) {
		logger=LogManager.getLogger();
		//	PropertyConfigurator.configure("log4j2.properties");
		if(Browser.equalsIgnoreCase("ChromeDriver")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+readConfig.getChromePath());
			driver=new ChromeDriver();
			driver.get("https://ui.cogmento.com/");
		} else if(Browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
			//+//readConfig.getFireFoxPath());
			//readConfig.getFireFoxPath());
			driver=new FirefoxDriver();
			driver.get("https://ui.cogmento.com/");

		}else if(Browser.equalsIgnoreCase("IEDriver")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+readConfig.getIEPath());
			driver=new InternetExplorerDriver();
			driver.get("https://ui.cogmento.com/");
			
		}
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}

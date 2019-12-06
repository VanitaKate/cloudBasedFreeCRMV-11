package cloudBasedFreeCRM_TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cloudBasedFreeCRM_PageObjects.freeCrmHomePage;
import cloudBasedFreeCRM_PageObjects.freeCrmLoginPage;
import cloudBasedFreeCRM_Utilities.BaseClass;
import cloudBasedFreeCRM_Utilities.readConfig;

public class TC_LoginTest_002 {

	
	//@Parameters ("Browser")
	@Test
	public void loginTest() throws InterruptedException{
		driver.get("https://ui.cogmento.com/");
		System.out.println("TestCase Started");
		freeCrmLoginPage LP= new freeCrmLoginPage(driver);
		Thread.sleep(4000);

		//freeCrmHomePage HP= new freeCrmHomePage(driver);
		LP.setUserName("vani_ket@rediffmail.com");
		LP.setPassword("Hariom001");
		LP.clickLogin();
		Thread.sleep(3000);
		String HomePgTitle=driver.getTitle();
		//Assert.assertEquals(HP.getuserDisplay(), "VANITA KATE");     
		Assert.assertEquals(HomePgTitle, "Cogmento CRM");
	}

//	readConfig readConfig=new readConfig();
    WebDriver driver;

	
	  @Parameters ("Browser")
	  
	  @BeforeClass public void setup(String Browser) {
	  
	  
	  if(Browser.equalsIgnoreCase("ChromeDriver")) {
	  System.setProperty("webdriver.chrome.driver",
	  System.getProperty("user.dir"));//+readConfig.getChromePath()); 
	  driver=new ChromeDriver();
	  
	  driver.get("https://ui.cogmento.com/"); } else
	  if(Browser.equalsIgnoreCase("FireFox")) {
	  System.setProperty("webdriver.gecko.driver",
	  System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
	  //readConfig.getFireFoxPath()); driver=new FirefoxDriver();
	  
	  }else if(Browser.equalsIgnoreCase("IEDriver")) {
	  System.setProperty("webdriver.ie.driver",
	  System.getProperty("user.dir"));//+readConfig.getIEPath());
	  driver=new InternetExplorerDriver(); driver.get("https://ui.cogmento.com/"); } }
	  
	  @AfterClass 
	  public void tearDown() { 
		  driver.close(); 
		  }
	 


}

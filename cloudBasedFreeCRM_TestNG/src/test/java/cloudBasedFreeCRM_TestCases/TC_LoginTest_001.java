package cloudBasedFreeCRM_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import cloudBasedFreeCRM_PageObjects.freeCrmLoginPage;
import cloudBasedFreeCRM_Utilities.BaseClass;


public class TC_LoginTest_001 extends BaseClass{

	
	//@Parameters ("Browser")
	@Test
	public void loginTest() throws InterruptedException{
		
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


}

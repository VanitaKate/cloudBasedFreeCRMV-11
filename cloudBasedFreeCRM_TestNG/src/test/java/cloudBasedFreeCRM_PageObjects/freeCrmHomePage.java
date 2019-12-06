package cloudBasedFreeCRM_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class freeCrmHomePage {
	WebDriver ldriver;
public freeCrmHomePage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(ldriver,this);
}
	//@SuppressWarnings("unused")
	WebElement txtuserDisplay=ldriver.findElement(By.className("user-display"));


public String getuserDisplay() {
	return txtuserDisplay.getText();
}
}

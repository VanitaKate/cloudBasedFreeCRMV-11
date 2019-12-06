package cloudBasedFreeCRM_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class freeCrmLoginPage {
WebDriver ldriver;
 @SuppressWarnings("unused")
public freeCrmLoginPage(WebDriver rdriver){
ldriver=rdriver;
PageFactory.initElements(ldriver, this);
 }
WebElement txtUserEmail=ldriver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
WebElement txtPassword=ldriver.findElement(By.xpath("//input[@placeholder='Password']"));
WebElement buttLogin=ldriver.findElement(By.className("ui fluid large blue submit button"));


public void setUserName(String userEmail) {
	txtUserEmail.clear();
	txtUserEmail.sendKeys(userEmail);
}

public void setPassword(String Password) {
	txtPassword.clear();
	txtPassword.sendKeys(Password);
}

public void clickLogin(){
	buttLogin.click();
}
public void clickForgotPassword() {
	
}


}

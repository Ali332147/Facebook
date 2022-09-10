package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LoginPage {
 public LoginPage() {
	 PageFactory.initElements(Driver.getDriver(), this);//
 }
 
 @FindBy (id ="email")// FindBy is using for replacement of driver. findelement
 public WebElement useremail;
 
 
 @FindBy (id ="pass")// FindBy is using for replacement of driver. findelement
 public WebElement userpassword;
 
 @FindBy (name ="login")// FindBy is using for replacement of driver. findelement
 public WebElement login;
 
}

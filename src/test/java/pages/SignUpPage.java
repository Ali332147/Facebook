package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SignUpPage {
	public SignUpPage() {
		 PageFactory.initElements(Driver.getDriver(), this);//
	 }
	 
	 @FindBy (xpath ="(//a[@role = 'button'])[2]")// FindBy is using for replacement of driver. findelement
	 public WebElement createnewaccount;
	 
	 
	 @FindBy (name ="firstname")// FindBy is using for replacement of driver. findelement
	 public WebElement firstname;
	 
	 @FindBy (name ="lastname")// FindBy is using for replacement of driver. findelement
	 public WebElement lastname;
	 
	 @FindBy (name ="reg_email__")// FindBy is using for replacement of driver. findelement
	 public WebElement email;
	 
	 @FindBy (name ="reg_email_confirmation__")// FindBy is using for replacement of driver. findelement
	 public WebElement renteremail;
	 
	 @FindBy (xpath ="//input[@name = 'reg_passwd__']")// FindBy is using for replacement of driver. findelement
	 public WebElement newpassword;
	 
	 @FindBy (id ="month")// FindBy is using for replacement of driver. findelement
	 public WebElement month;
	 
	 @FindBy (id ="day")// FindBy is using for replacement of driver. findelement
	 public WebElement day;
	
	 @FindBy (id ="year")// FindBy is using for replacement of driver. findelement
	 public WebElement year;
	 
	 @FindBy (xpath ="(//input[@name ='sex'])[2]")// FindBy is using for replacement of driver. findelement
	 public WebElement gender;
	 
	 @FindBy (name ="websubmit")// FindBy is using for replacement of driver. findelement
	 public WebElement signup;
	 
	 
}

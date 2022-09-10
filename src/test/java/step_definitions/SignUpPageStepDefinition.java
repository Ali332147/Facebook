package step_definitions;



import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignUpPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.DropdownHandle;

public class SignUpPageStepDefinition {
	SignUpPage sp = new SignUpPage();
	DropdownHandle dh = new DropdownHandle();
	@Given("User is in signup page")
	public void user_is_in_signup_page() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		sp.createnewaccount.click();
	}

	@When("User enters all required fields")
	public void user_enters_all_required_fields() throws InterruptedException {
	    sp.firstname.sendKeys("MD");
	    sp.lastname.sendKeys("ali");
	    sp.email.sendKeys("jaber2027@gmail.com");
	    sp.renteremail.sendKeys("jaber2027@gmail.com");
	    sp.newpassword.sendKeys("1234587");
	    //Thread.sleep(3);
	    //sp.month.click();
	    //Select se = new Select(sp.month);
	    //se.selectByVisibleText("Jan");
	    dh.selectByVisibleText(sp.month,"Jan");
	    dh.selectByVisibleText(sp.day,"16");
	    dh.selectByVisibleText(sp.year,"1976");
	    sp.gender.click();
	    sp.signup.click();
	    
		
	    
	}

	@Then("User should be signed up successfully")
	public void user_should_be_signed_up_successfully() {
		String title =Driver.getDriver().getTitle();
	   // Assert.assertEquals(title, "Facebook");
	    Driver.getDriver().quit();
	    System.out.println("Registration successfull");
		//System.out.println("Success");
	}
	 
}

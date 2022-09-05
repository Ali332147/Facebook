package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepDefinition {
	LoginPage lp = new LoginPage()
;	@Given("user has a valid credential")//ctrl,shift+o will import all together
	public void user_has_a_valid_credential() {

	}

	@Given("user has a valid email and passwod")
	public void user_has_a_valid_email_and_passwod() {
	    
	}

	@When("user enter his email and password")
	public void user_enter_his_email_and_password() {
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
	    
	}

	@Then("user should successfully logged in\\/\\/ verify the test")
	public void user_should_successfully_logged_in_verify_the_test() {
	
	}

	@When("user enters as a user id")
	public void user_enters_as_a_user_id() {
	   
	}

	@When("user enters <password> as a password")
	public void user_enters_password_as_a_password() {
	   
	}

	@Then("user should successfully be logged in")
	public void user_should_successfully_be_logged_in() {
	    
	}



}

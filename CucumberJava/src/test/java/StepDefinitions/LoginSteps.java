package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on login page");
		//throw new io.cucumber.java.PendingException();
	}

	@And("user enters username and password")
	public void user_enters_useername_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User Enters username and password");
		//throw new io.cucumber.java.PendingException();
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User Clicks login button");
		//throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User navigates to Home Page");
		//throw new io.cucumber.java.PendingException();
	}


}

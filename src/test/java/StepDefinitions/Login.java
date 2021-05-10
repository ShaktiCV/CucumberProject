package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
	}

	@When("User enters login name and pwd")
	public void user_enters_login_name_and_pwd() {
		System.out.println("User enters login name and pwd");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("User clicks on login button");
	}

	@Then("Navigated to the home page")
	public void navigated_to_the_home_page() {
		System.out.println("User is navigated to home page");
	}


}

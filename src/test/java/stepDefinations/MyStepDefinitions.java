package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on Net Banking Landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
    	System.out.println("Login net banking");
        
    }

    @When("^User login to application with username and password$")
    public void user_login_to_application_with_username_and_password() throws Throwable {
    	System.out.println("username and password");
        
    }

    @Then("^Home Page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Home Page is populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	 System.out.println("cards are displayed");
       
    }

}
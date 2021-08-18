package stepDefinations;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import objectRepository.AmazonHomePage;
import objectRepository.AmazonLoginPage;
import resources.Base;

import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
public class Homepagetest extends Base {
	

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	driver = initializedriver();
    	
    		
    	
     
    }
    @And("^Navigate to Amazon Site$")
    public void navigate_to_amazon_site() throws Throwable {
    	driver.get("https://www.amazon.in/");
               
    }
    @When("^User clicks on SignIn$")
    public void user_clicks_on_signin() throws Throwable {
    	
        AmazonHomePage HomePage = new AmazonHomePage(driver);
    	HomePage.GoToSignIn().click();
       
    }
   
  
    
	@And("^Enter Username and click on Continue$")
    public void enter_username_and_click_on_continue() throws Throwable {
		AmazonLoginPage log = new AmazonLoginPage(driver);
		log.Username().sendKeys("vijayrock1@gmail.com");
		log.Continue_button().click();
		
      
    }

    @And("^Enter Password and click on SignIn Button$")
    public void enter_password_and_click_on_signin_button() throws Throwable {
    	AmazonLoginPage log = new AmazonLoginPage(driver);
    	log.Password().sendKeys("Sagitec@123");
    	log.SignIn_Button().click();
       

}
    
    
    @Then("^Navigate to Login screen$")
    public void navigate_to_login_screen() throws Throwable {

    	System.out.println("In Landing Page");
    }

   

  

    

}
package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
	
	WebDriver driver = new ChromeDriver();
	main.pageObjects.orangePage op = new main.pageObjects.orangePage(driver);
	
	//Step Definition File
	
    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
    	
        // Code to navigate to the login page
		op.goTo("https://digitaladvancer.com/login");
		System.out.println("user is on loginpage");
    	
    }

    @When("the user enters valid username and password")
    public void userEntersValidCredentials() {

    	// Code to enter valid userName and password
    	op.loginCredentials("user204@digitaladvancer.com","Test@123");
		
    }
    
    @When("the user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        // Code to enter the provided userName and password
        op.loginCredentials(username, password);
    }
    
    @When("the user enters invalid username and password")
    public void userEntersInvalidCredentials() {

    	// Code to enter valid userName and password
    	op.loginCredentials("Admin123","admin123");
		
    }

    @Then("the user should be logged in successfully")
    public void userLoggedInSuccessfully() {
    	
        // Code to verify successful login
    	op.login();
    			
    }
    
    @Then("the user should not be logged")
    public void userDoesntLoggedIn() {
    	
        // Code to verify unsuccessful login
    	op.login();
    	System.out.println("Entererd invalid email and password");
    			
    }
}

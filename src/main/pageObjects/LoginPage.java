package main.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

	private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

		//declare the UI elements
	    private By usernameField = By.id("user-name");
	    private By passwordField = By.id("password");
	    private By loginButton = By.id("login-button");

	    public void goToWebsite(String url){
			driver.get(url);
			//maximize the script
			driver.manage().window().maximize();
		}
	    
	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }
	    
	    public void clickLoginButton() {
	    	driver.findElement(loginButton).click();
	    	
	    }
	    
}

package main.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangePage {
	
	WebDriver driver;
	
	public orangePage(WebDriver driver) {
		
		this.driver = driver;

		//init elements for the FindBy
		PageFactory.initElements(driver, this);
	}
	
	//oldMethod
	//WebElement userEmail = driver.findElement(By.id("userEmail"));
	
	//Page Factory Design Pattern "useFindBy"
	@FindBy(name="password")
	WebElement webPassword;
	
	@FindBy(name="email")
	WebElement webUsername;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement login;
	
	@FindBy(xpath="//div[@class='cookieButton']/a")
	WebElement alert;
		
	public WebDriver loginApplication(String username, String password) {
		webUsername.sendKeys(username);
		webPassword.sendKeys(password);
		login.click();
		return driver;
	}

	public void loginCredentials(String username, String password) {
		alert.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		webUsername.sendKeys(username);
		webPassword.sendKeys(password);
		
	}
	
	public void goTo(String website) {
		driver.get(website);
	}

	public void login() {
		login.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();	
	}

	
	public void getErrorMessage() {
		System.out.println("Error message");
	}

	public void getSuccessMessage() {
		System.out.println("Success message");		
	}
	
	
}

package main.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
		//declare the UI elements
	    private By headingText = By.className("app_logo");
	    private By productHeading = By.xpath("//span[@class=\"title\"]");
	    private By addToCart = By.id("add-to-cart-sauce-labs-backpack"); 
	    
	    public String getTitleText() {
	        return driver.findElement(headingText).getText();
	    }
	    
	    public String getProductsText() {
	    	return driver.findElement(productHeading).getText();
	    }
    
	    public void clickAddToCartBtn() {
	    	driver.findElement(addToCart).click();
	    }

}

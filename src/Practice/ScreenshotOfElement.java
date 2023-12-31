package Practice;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstName = driver.findElement(By.cssSelector("input#firstName"));
		
		WebElement lastName = driver.findElement(By.cssSelector("input#lastName"));
		
		firstName.sendKeys("John");
		
		//driver.findElement(By.cssSelector("input#firstName")).clear();
		
		lastName.sendKeys("Doe");
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a"));
		
        // Capture screenshot of the web element
        File screenshotFile = ((TakesScreenshot) lastName).getScreenshotAs(OutputType.FILE);
        File screenshotFile1 = ((TakesScreenshot) firstName).getScreenshotAs(OutputType.FILE);
        File screenshotOfLogo = ((TakesScreenshot) logo).getScreenshotAs(OutputType.FILE);

        // Save the screenshot to a file
        try {
        	
        	//replace the location with your own location
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\sanket.dudhe\\Documents\\drivers\\lastName.png"));
            
            FileUtils.copyFile(screenshotFile1, new File("C:\\Users\\sanket.dudhe\\Documents\\drivers\\firstName.png"));
            
            FileUtils.copyFile(screenshotOfLogo, new File("C:\\Users\\sanket.dudhe\\Documents\\drivers\\screenshotOfLogo.png"));
            } 
        catch (IOException e) {
            	e.getMessage();
        }

        driver.quit();
    }
}

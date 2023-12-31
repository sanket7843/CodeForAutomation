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

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");

		WebElement firstName = driver.findElement(By.cssSelector("input#firstName"));

		WebElement lastName = driver.findElement(By.cssSelector("input#lastName"));

		firstName.sendKeys("John");

		//driver.findElement(By.cssSelector("input#firstName")).clear();

		lastName.sendKeys("Doe");

        // Capture screenshot of the entire browser window
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the screenshot to a file
        try {

        	FileUtils.copyFile(screenshotFile, new File("C:\\Users\\sanket.dudhe\\Documents\\drivers\\homepageImage.png"));

        	System.out.println("In try block");

        } catch (IOException e) {
            
            System.out.println("In catch block");
        }

        //driver.quit();
    }
}

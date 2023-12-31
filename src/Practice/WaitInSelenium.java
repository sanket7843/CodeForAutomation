package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
//		//set implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		
		//set explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));

		//maximize the script
		driver.manage().window().maximize();
		
		//navigate to the webPage
		
		//wait for page to load
		//Thread.sleep(10000);

		//give correct id password
		driver.findElement(By.name("user-name")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		// Locate the form element
		WebElement form = driver.findElement(By.className("oxd-form"));

		// Submit the form
		form.submit();
		
		//wait for page to load
	//	Thread.sleep(3000);
		
		//Fluent wait to wait for an element to be visible
      FluentWait<WebDriver> wait1 = new FluentWait<>(driver)
              .withTimeout(Duration.ofSeconds(30))
              .pollingEvery(Duration.ofSeconds(3));

      WebElement element1 = wait.until(driver1 -> driver.findElement(By.xpath("(//ul[@class=\"oxd-main-menu\"])//li")));

		//click on admin button from side navigation
		driver.findElement(By.xpath("(//ul[@class=\"oxd-main-menu\"])//li")).click();
		
		//wait for page to load
//		Thread.sleep(2000);
		
		//close the browser
		driver.quit();

	}

}

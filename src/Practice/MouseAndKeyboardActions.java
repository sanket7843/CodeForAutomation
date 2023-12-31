package Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseAndKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//create a new instance for chromeDriver
				WebDriver log=new ChromeDriver();
				
				//maximize the window
				log.manage().window().maximize();
				
				//Implicitly wait
				log.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Navigate to webPage
				log.get("https://www.digitaladvancer.com/login");
				
				//login the web page find locator for userName
				WebElement userName=log.findElement(By.xpath("//input[@name='email']"));
				
				userName.sendKeys("user204@digitaladvancer.com");
				
				//find locator for password field
				WebElement password=log.findElement(By.xpath("//input[@name='password']"));
				
				password.sendKeys("Test@123");
				
				//find locator for "login" button
				WebElement loginn=log.findElement(By.xpath("//button[@class='btn red radius-5 mt-4 w-100']"));
				
				loginn.submit();
			
				WebElement acceptAlert=log.findElement(By.xpath("//div[@class=\"cookieButton\"]/a"));
				
				acceptAlert.click();
				
				Thread.sleep(1000);
				
				Actions action=new Actions(log);

			   //move to element contain "SEO Fundamentals"
				WebElement mainItem=log.findElement(By.xpath("(//h5[@class='title'])[3]"));
				
//				//scroll the page to find the element
//				JavascriptExecutor js = (JavascriptExecutor) log;
//				js.executeScript("window.scrollBy(0,500)");

				action.moveToElement(mainItem);
				
				Thread.sleep(2000);

				//Move to sub Item or popUp
				WebElement subItem=log.findElement(By.xpath("(//button[@class='btn red add-to-cart-btn  big-cart-button-9'])[2]/following-sibling::button"));

				action.moveToElement(subItem).click().build().perform();

				Thread.sleep(3000);
				//perform
				
				log.quit();
			}

		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://demoqa.com/menu");
//
//	    // Create an Actions object
//        Actions actions = new Actions(driver);
//
//        // Find the element to hover over
//        WebElement menuItem = driver.findElement(By.linkText("Main Item 2"));
//
//        // Perform the hover action
//        actions.doubleClick(menuItem).build().perform();
//        
//        actions.dragAndDrop(menuItem, menuItem).build().perform();
//        
//        actions.contextClick(menuItem).build().perform();
//
//        Thread.sleep(2000);
//        
//        //Press Enter by using 
//		driver.get("https://demoqa.com/text-box");
//        
//		driver.findElement(By.id("currentAddress")).sendKeys("Line One");
//
//        // Simulate pressing the ENTER key
//        actions.sendKeys(Keys.ENTER).build().perform();
//
//        // Simulate pressing the ENTER key
//        actions.sendKeys(Keys.BACK_SPACE).build().perform();
//
//		driver.findElement(By.id("currentAddress")).sendKeys("Line Two");
//		
		        
	}


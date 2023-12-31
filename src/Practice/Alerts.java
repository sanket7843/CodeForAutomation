package Practice;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/alerts");
		
		String h1 = driver.findElement(By.className("main-header")).getText();
		
		assertEquals("Alert", h1);
		
		System.out.println("asertion done");
		
		driver.findElement(By.id("alertButton")).click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();

		Thread.sleep(2000);
		
//		// Get the text of the alert
		String alertText = alert.getText();

		System.out.println(alertText);

//		Thread.sleep(2000);		

		// Accept the alert
		alert.accept();

		
		//delayed timer
		driver.findElement(By.id("timerAlertButton")).click();

		Thread.sleep(6000);				
		//switch to alert
		Alert alert1 = driver.switchTo().alert();


		// Accept the alert
		alert1.accept();

		
				//click on confirmation button
		driver.findElement(By.id("confirmButton")).click();

		// Switch to the confirmation dialog
		Alert confirmationAccept = driver.switchTo().alert();

		Thread.sleep(2000);
		
		// Accept the dialog (confirm)
		confirmationAccept.accept();

		System.out.println("Clicked on accept");
		
		driver.quit();
		
	}

}

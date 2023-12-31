package Practice;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");

		//open a new tab
		driver.findElement(By.id("tabButton")).click();

		Thread.sleep(2000);

		// hold all window handles in array list
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());

		//switch to new tab
		driver.switchTo().window(newTab.get(1));


		String newTabText = driver.findElement(By.id("sampleHeading")).getText();

		Thread.sleep(2000);

		System.out.println("Page title of new tab: " + driver.getTitle());

		System.out.println("text of new tab: " + newTabText );

		driver.close();

		Thread.sleep(2000);

		//switch to parent window
		driver.switchTo().window(newTab.get(0));

		System.out.println("Page title of parent window: " + driver.getTitle());

		Thread.sleep(2000);

		//open new window
		driver.findElement(By.id("windowButton")).click();

		Thread.sleep(2000);

		// hold all window handles in array list
		ArrayList<String> newTab1 = new ArrayList<String>(driver.getWindowHandles());

		//switch to new tab
		driver.switchTo().window(newTab1.get(1));

		Thread.sleep(2000);

		String newTabText1 = driver.findElement(By.id("sampleHeading")).getText();

		System.out.println("Page title of new tab: " + driver.getTitle());
		System.out.println("text of new tab: " + newTabText1 );
		driver.close();

		Thread.sleep(2000);

		driver.switchTo().window(newTab1.get(0));

		// Close the main tab (this will also close the browser)
		driver.quit();

	}

}

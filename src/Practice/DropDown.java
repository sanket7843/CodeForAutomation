package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 
public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		//maximize the script
		driver.manage().window().maximize();
		
		//navigate to the webPage
		driver.get("https://www.saucedemo.com/inventory.html");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);
		
		// Locate the dropdown element
		WebElement dropdown = driver.findElement(By.className("product_sort_container"));

		Thread.sleep(2000);
		
		// Create an instance of the Select class
		Select select = new Select(dropdown);

		// Select an option by visible text
		select.selectByVisibleText("Price (low to high)");
		System.out.println("clicked on z to a");
		Thread.sleep(2000);
		
		// Select an option by value
		select.selectByValue("lohi");
		System.out.println("clicked on z to a");
		Thread.sleep(2000);
		
		// Select an option by index
		select.selectByIndex(1);
		Thread.sleep(2000);		
		
	}

}

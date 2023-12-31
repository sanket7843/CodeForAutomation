package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		//findElement by xpath
		WebElement input  = driver.findElement(By.xpath("//input"));
		
		System.out.println("single input field: "+input.getAttribute("id"));
		
		//findElements
		List<WebElement> inputfields = driver.findElements(By.xpath("//input"));
		
		for(WebElement inputfield :inputfields) {
			System.out.println("input field: "+inputfield.getAttribute("id"));
		}
		
	}

}

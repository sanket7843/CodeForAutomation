package Practice;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class propertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	        FileReader reader = new FileReader("C:\\Users\\sanket.dudhe\\eclipse-workspace\\SeleniumFramework\\src\\testData.properties"); 
	        
	        Properties props = new Properties(); 
	        
	        props.load(reader); 
	        
	        ChromeDriver driver = new ChromeDriver(); 
	        
	        driver.manage().window().maximize();
	  
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			driver.get(props.getProperty("url"));

			//give correct id password
			driver.findElement(By.name("user-name")).sendKeys(props.getProperty("username"));
			driver.findElement(By.name("password")).sendKeys(props.getProperty("password"));
			
			Thread.sleep(2000); 
	        
			driver.quit();  

	}

}

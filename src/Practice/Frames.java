package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");

		String outerText = driver.findElement(By.id("framesWrapper")).getText();
		
		System.out.println(outerText);
		
		//not able to find the element
		WebElement frame = driver.findElement(By.id("frame1"));
		
		// Switch to the first frame on the page
        driver.switchTo().frame(frame);
		
		String iFrameText = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println(iFrameText);
		
		//switch to default content (main page)
		driver.switchTo().defaultContent();
		
		//switch to second frame
		WebElement frame2 = driver.findElement(By.id("frame2"));
		
		// Switch to the first frame on the page
        driver.switchTo().frame(frame2);
		
		String iFrameText2 = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println(iFrameText2);
		
		driver.quit();
	}
}

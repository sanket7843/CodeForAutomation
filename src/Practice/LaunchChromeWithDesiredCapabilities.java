package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeWithDesiredCapabilities {
    public static void main(String[] args) {
    	
        // Step : Create a ChromeOptions object to define desired capabilities
        ChromeOptions options = new ChromeOptions();

        // Step : Customize capabilities (e.g., maximize the window and disable extensions)
//      options.addArguments("--start-maximized");
//      options.addArguments("--disable-extensions");
//      options.addArguments("--incognito");
        options.addArguments("--headless");

//        options.AddArgument("--start-maximized");
//        options.AddArgument("--ignore-certificate-errors"); //SSL certificate error
//        options.AddArgument("--disable-popup-blocking");
        

        // Step : Launch the Chrome browser with the desired capabilities
        WebDriver driver = new ChromeDriver(options);

        // Perform further actions with the WebDriver instance (e.g., navigate to a website)
        
        driver.get("https://stackoverflow.com/");
        
    }
}

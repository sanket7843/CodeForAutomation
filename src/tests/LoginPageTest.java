package tests;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import main.pageObjects.LoginPage;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		// Create ChromeOptions
		ChromeOptions options = new ChromeOptions();

		// Enable the performance logging
		options.setCapability("goog:loggingPrefs", "{\"performance\": \"ALL\"}");

		// Create a ChromeDriver with the configured options
		ChromeDriver driver = new ChromeDriver(options);

		// Perform network throttling
		throttleNetwork(driver, "Regular 3G");

		// Now, navigate to your web application or perform other actions
		driver.get("https://google.com");

		// Your test steps go here...

		// Close the browser
		driver.quit();
	}

		// Throttle network
		public static void throttleNetwork(ChromeDriver driver, String networkConditions) {
		    // Execute JavaScript to set network conditions
		    String script = "chrome.send('NetworkConditions.setUserAgentType', " +
		                    "{'userAgent': 'Regular 3G', 'upstreamKbps': 750, 'downstreamKbps': 1000, 'latencyMs': 150})";
		    Map<String, Object> params = new HashMap<>();
		    params.put("script", script);
		    driver.executeCdpCommand("Network", params);
		}
}

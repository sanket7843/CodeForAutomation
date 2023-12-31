package Practice;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Report {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Create an ExtentHtmlReporter
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\sanket.dudhe\\Documents\\drivers\\report.html");

        // Create an ExtentReports and attach the reporter
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // Create a tests in the report
        ExtentTest test = extent.createTest("My Test", "Description of My Test");

        // Add logs and tests steps
        test.log(Status.INFO, "Starting tests execution");
        test.pass("Step 1: Open browser");
        test.fail("Step 2: Navigate to example.com");

//        // Capture screenshot and add to the report
//        tests.addScreenCaptureFromPath("C:\\Users\\sanket.dudhe\\Documents\\drivers\\screenshot.png");

        // Generate the report
        extent.flush();

        driver.quit();

	}

}

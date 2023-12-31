package cucumber;

import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = ".src/cucumber", // Specify the path to your feature files
    glue = ".src/cucumber", //specify the step definition for the feature file
    monochrome = true, // Makes the console output more readable
    plugin = {"html", "html:target/cucumber.html"} // Specify plugins like HTML reports
)

@Test
public class CucumberTestRunner {
	
}

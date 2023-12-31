
package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGBeforeAfter {
	    
		@Test
	    public void myFirstTest() {
	        System.out.println("This is my first TestNG test case.");
	    }

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Before Suite");
	    }
	    
	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before Class");
	    }
	    
	    @Test(groups = "regression")
	    public void regressionTest1() {
	        openbrowser();
	    }

	    @Test(groups = {"regression"})   
	    public void regressionTest2() {
	    	System.out.println("Smoke");
			openbrowser();
	    }
	    
	    @Test(groups = {"regression"})   
	    public void regressionTest3() {
			openbrowser();
	    }
	    
	    @Test(groups = {"regression"})   
	    public void regressionTest4() {
			openbrowser();
	    }
	    
	    @Test
	    public void dependentTest() {
	        System.out.println("Dependent Test");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("After Class");
	    }
	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("After Suite");
	    }

	    
	    
	    private void openbrowser() {
	    	WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println("Page Title: " + driver.getTitle());
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("Page URL: " + driver.getCurrentUrl());
	        
	        driver.quit();

		}

	    
	    
}

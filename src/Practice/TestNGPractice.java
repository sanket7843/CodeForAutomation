package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	WebDriver driver = new ChromeDriver();

	@BeforeClass
	public void beforeclass() {
		System.out.println("before class is running");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass is running");
	}
	@BeforeTest
	public void openBrowser() {
		System.out.println("before test is running");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method is running");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method is running");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("after test is running");
	}
	
	
		 @Test
		    public void testLogin() {
		        // Your test logic goes here
		        System.out.println("Test Login Page");
		    }

//		    @Test
//		    public void testHome() {
//		        // Your test logic goes here
//		        System.out.println("Test Home Page Logo");
//		        System.out.println("Test Home Page Title");
//		        System.out.println("Test Home Page Add to cart");
//		    }
//		    
//		    @Test
//		    public void testCheckoutPage() {
//		    	System.out.println("Test CheckoutPage");
//		    }
//		    
		    
		    private void openbrowser() {
		        driver.get("https://www.google.com");
		        System.out.println("Page Title: " + driver.getTitle());


			}
		    
		    private void closebrowser() {
		        driver.quit();

			}
}
//
//	    @Test(dependsOnMethods = "testLogin")
//	    public void testCase2() {
//	        // Your test logic goes here
//	    	// Precondition - open browser and navigate to the page 
//	    	
//	    	System.out.println("Checking the homepage content");	
//			int actualResult = 10;
//	        int expectedResult = 10;
//	        Assert.assertEquals(actualResult, expectedResult, "Values do not match.");
//	        
////	        Postcondition - close browser
//	    }	
//	    
//	    @Test(dependsOnMethods = "testCase1")
//	    public void testCase3() {
//	        // Your test logic goes here
//	        
//	    	// Precondition - open browser and navigate to the page 
//	    	
//	    	System.out.println("Checking the homepage content");	
//			int actualResult = 10;
//	        int expectedResult = 10;
//	        Assert.assertEquals(actualResult, expectedResult, "Values do not match.");
//	        
////	        Postcondition - close browser
//	    }	}
		    					
		    
	//}

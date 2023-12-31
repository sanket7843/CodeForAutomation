package Practice;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
        // Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();

        // Print cookie information
        for (Cookie cookie : cookies) {
            System.out.println("Name: " + cookie.getName());
            System.out.println("Value: " + cookie.getValue());
//            System.out.println("Domain: " + cookie.getDomain());
//            System.out.println("Path: " + cookie.getPath());
//            System.out.println("Expiry: " + cookie.getExpiry());
//            System.out.println("Is Secure: " + cookie.isSecure());
            System.out.println("-----------------------------------");
        }
        
        
        //verify if a cookie is present "__gads"
        for (Cookie cookie : cookies) {
        	
        	if(cookie.getName() == "__gads") {
        		System.out.println("cookie exists");
        	}
        	else {
        		System.out.println("cookie doesn't exist");
        	}
           
        }
        
        //add new cookie
        driver.manage().addCookie(new Cookie("uID", "2u37525"));

        // Get cookie details with named cookie 'myCookie'
        Cookie cookie1 = driver.manage().getCookieNamed("uID");
        System.out.println("manually cookie made is "+cookie1);

        // Delete a specific cookie by name
        driver.manage().deleteCookieNamed("uID");

        // Delete all cookies
        driver.manage().deleteAllCookies();
       
        driver.quit();

        
    }
}

package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import main.pageObjects.HomePage;
import main.pageObjects.LoginPage;

public class POMExplanation2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();

        LoginPage lp = new LoginPage(driver);

        lp.goToWebsite("https://www.saucedemo.com/inventory.html");

        lp.enterUsername("standard_user");

        lp.enterPassword("secret_sauce");

        lp.clickLoginButton();

        HomePage hp = new HomePage(driver);

        System.out.println(hp.getTitleText());

        System.out.println(hp.getProductsText());

        hp.clickAddToCartBtn();

    }

}

package Practice;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParameterizedTest {
    @Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password) {
        System.out.println("Username is: " + username);
        System.out.println("Password is: " + password);
        // Your test logic here
    }
}

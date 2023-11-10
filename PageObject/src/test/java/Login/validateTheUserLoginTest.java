package Login;

import org.example.ConfigManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.example.Page.*;

import static org.example.HomePage.loginPage.*;

public class validateTheUserLoginTest {
    static final String USER_NAME = ConfigManager.getProperty("Username");
    static final String PASSWORD = ConfigManager.getProperty("Password");



    @BeforeTest
    public void testSetUP(){
        navigateToParaBank();
    }

    @Test
    public void validateTheLoginWithPositiveCredentials(){
        signInWithCredentials(USER_NAME,PASSWORD);

    }

    @Test
    public void validateTheLoginWithNegativeCredentials(){
        signInWithCredentials("",PASSWORD);
    }
    @Test
    public void loginWithWrongUsername(){

    }
    @Test
    public void loginWithWrongPassword(){

    }

    @AfterTest
    public void tearDown(){

    }



}

package homework.com.herokuapp;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LoginTest extends BaseTest {

    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyTheUsernameErrorMessage() throws InterruptedException {
        //Enter “tomsmith1” username
        driver.findElement(By.id("username")).sendKeys("tomsmith1");
        Thread.sleep(2000);
        // Enter “SuperSecretPassword!” password
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        Thread.sleep(2000);
        //Click on ‘LOGIN’ button
        driver.findElement(By.className("radius")).click();
        Thread.sleep(2000);
        // Verify the error message “Your username is invalid!”
        String expectedResult = "Your username is invalid!";
        String actualResult = driver.findElement(By.id("flash")).getText();
        Assert.assertEquals(expectedResult, actualResult.substring(0, 25));
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}

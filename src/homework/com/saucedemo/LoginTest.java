package homework.com.saucedemo;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LoginTest extends BaseTest {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() throws InterruptedException {
        //Enter “standard_user” username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Enter “secret_sauce” password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // Click on ‘LOGIN’ button
        driver.findElement(By.id("login-button")).click();
        // Verify that six products are displayed on
        //find the web elements list
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        System.out.println("Total products are: " + products.size());
        Assert.assertEquals("",6, products.size());
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}

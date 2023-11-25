package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo4 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest4() {
        //CSS Selector
        //ID
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mobile");
        //Tag and ID

        //Class

        // Tag and Class

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}

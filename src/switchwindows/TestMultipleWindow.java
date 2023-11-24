package switchwindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

import java.util.Set;

/**
 * Created by Jay Vaghani
 */
public class TestMultipleWindow extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchMultipleWindowExample() {

//        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[1]"));
//        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[2]"));
//        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[3]"));
//        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[4]"));

        //Get the parent window id
        String parentHandle = driver.getWindowHandle();

        //Get all handles
        Set<String> handles = driver.getWindowHandles();
        //Convert Set into List

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}

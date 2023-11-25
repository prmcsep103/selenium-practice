package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo5 extends BaseTest {

    String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest5() {
         driver.findElement(By.xpath("//p[text()='Consent']")).click(); // Click on consent button
        // Self --- Select the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'TCI Ltd.')]/self::a")).getText();
        System.out.println(text); //TCI Ltd.

        // Parent --- Select the parent of the current node (always one)
        text =driver.findElement(By.xpath("//a[contains(text(),'TCI Ltd.')]/parent::td")).getText();
        System.out.println(text); //TCI Ltd.

        //Child --- Select the children of current node (one or many)
       List<WebElement> children = driver.findElements(By.xpath("//a[contains(text(),'TCI Ltd.')]/ancestor::tr/child::td"));
        System.out.println("Number of children : " + children.size()); //5

        //Ancestor --- Select all ancestors (parent grandparent etc)
        text = driver.findElement(By.xpath("//a[contains(text(),'TCI Ltd.')]/ancestor::tr")).getText();
        System.out.println(text); // TCI Ltd. A 851.80 852.45 + 0.08

        //Descendant -- Select all descendants (children, grand children etc)
        //a[contains(text(),'TCI Ltd.')]/ancestor::tr/descendant::*

        // Following -- Select everything in document after the closing tag of the current node.
        //a[contains(text(),'TCI Ltd.')]/ancestor::tr/following::tr

        // Following-Sibling  -- Select all siblings after the current node
        //a[contains(text(),'TCI Ltd.')]/ancestor::tr/following-sibling::tr

        // Preceding -- Select all nodes that appear before the current node in the document
        //a[contains(text(),'TCI Ltd.')]/ancestor::tr/preceding::tr

        // Preceding-sibling -- Select all siblings before the current node
        //a[contains(text(),'TCI Ltd.')]/ancestor::tr/preceding-sibling::tr

    }
    @After
    public void tearDown() {
        closeBrowser();
    }

}

package switchwindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestIFrame extends Utility {
    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchIFrameExample() {
        // Switch to frame

        //Find the element inside the frame and send text

        //Switch to default content

        //Send text to search box

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}

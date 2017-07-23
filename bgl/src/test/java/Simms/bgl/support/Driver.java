package Simms.bgl.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Sets up the webdriver instance. Using Chrome here as there are some issues with
 * Firefox versions. @TBD the system property.
 * @author Paul
 *
 */
public class Driver {

    public static WebDriver driver;

    /**
     * Fires up a chrome browser which is then used by the pageObjects to trigger browser events.
     */
    public static void initialiseDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\develop\\chromedriver.exe");

        driver = new ChromeDriver();
        }

    }


package Simms.bgl.stepdefinitions;

import Simms.bgl.support.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 * Common functions that interact with Selenium, such as combining wait for element and click
 * These are used throughout the project as superclass to each page object
 * @author Paul
 *
 */
public class GenericStepDef extends Driver{
    /**
     * Load the given page. Used generic in case want other actions to be performed.
     * @param pageToLoad
     */
    public static boolean loadPage(String pageToLoad)
    {
        try {
            Driver.driver.get(pageToLoad);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Check if the given element is present on the page
     *
     * @param by The link to the element to be checked for
     * @return
     */
    public static boolean isElementPresent(By by)
    {
        try {
            Driver.driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Loops around to check if the the element is present.
     * @param by  The link to the element to be checked for
     * @return Is element present by the timeout period
     */
    public static boolean waitForElementToBePresent(By by)
    {
        for (int second = 0; second <= 30; second++) {
            try { if (isElementPresent(by)) break; } catch (Exception e) {}
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public static void sleepSecs(int time)
    {
	    for (int second = 0; second <= time; second++) {
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
    }

    
    public static boolean waitForElementToBePresentAndClick(By by)
    {
        if (!waitForElementToBePresent(by)) return false;
        return clickElement(by);
    	
    }

    public static boolean waitForElementToBePresentAndEnterText(By by, String text)
    {
        if (!waitForElementToBePresent(by)) return false;
        return enterText(by, text);
    	
    }

    public static boolean waitForElementToBePresentAndConfirmTextAsExpected(By by, String expText)
    {
        if (!waitForElementToBePresent(by)) return false;
    	WebElement we = driver.findElement(by);
    	String text = we.getText();
    	System.out.println("TEXTEXTEXTEXT = " + text);
        return text.startsWith(expText);
    }
    
    /**
     * Enters text into the identified field
     * @param by  The link to the element to be checked for
     * @param text The text to enter
     * @return Has text been sent
     */
    public static boolean enterText(By by, String text) {
        try {
            Driver.driver.findElement(by).sendKeys(text);
            return true;
        }     catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * Clicks the element specified
     * @param by  The link to the element to be checked for
     * @return
     */
    public static boolean clickElement(By by) {
        try {
            Driver.driver.findElement(by).click();
            return true;
        }     catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }
}

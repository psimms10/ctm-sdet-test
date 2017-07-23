package Simms.bgl.pageobjects;

import org.openqa.selenium.By;

import Simms.bgl.stepdefinitions.GenericStepDef;
/**
 * Page object for the results page. Not actualy testing - apart from if it is loaded
 * @author Paul
 *
 */

public class YourResultsPage  extends GenericStepDef {

	public static final String PANEL_XPATH=".//*[@id='relevancy-panel']/div[4]";
    
    public static boolean isPageLoaded () {
    	System.out.println("loading results page");
    	return waitForElementToBePresent(By.xpath(PANEL_XPATH));
    }
    
}

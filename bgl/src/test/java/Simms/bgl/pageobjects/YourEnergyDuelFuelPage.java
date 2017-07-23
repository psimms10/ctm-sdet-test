package Simms.bgl.pageobjects;

import org.openqa.selenium.By;

import Simms.bgl.stepdefinitions.GenericStepDef;
/**
 * There is a page with both duel fuels in. This was started but @TBD tidy this up and actually use
 * @author Paul
 *
 */
public class YourEnergyDuelFuelPage  extends GenericStepDef {

    public static final String GOTO_ELECTRICITY_ID = "goto-your-energy";
    public static final String ELECTRICITY_SPEND_XPATH=".//*[@id='electricity-current-spend']";
    public static final String GAS_SPEND_XPATH=".//*[@id='electricity-current-spend']";
    public static final String GAS_SPEND="50";
    public static final String ELECTRICITY_SPEND="100";
    
    
    public static final String ELECTRICITY_SPEND_IN_POUNDS_XPATH=".//*[@id='electricity-type-of-bill-question']/div/div/div[1]/label[2]/span";
    public static final String ELECTRICITY_CALENDAR_XPATH=".//*[@id='electricity-bill-date-field']/div/div/span[1]";    
    public static final String ELECTRICITY_CALENDAR_TODAY_XPATH=".//*[@id='electricity-bill-day_root']/div/div/div/div/div[2]/button[1]";
    
    
    public static final String ELECTRICITY_ECONOMY_7_YES_XPATH=".//*[@id='economy-7-question']/div/div/label[1]/span";
    public static final String ELECTRICITY_ECONOMY_7_NO_XPATH=".//*[@id='economy-7-question']/div/div/label[2]/span";
    public static final String ELECTRICITY_DONT_KNOW_SPEND_XPATH=".//*[@id='electricity-dont-know-check']";
    public static boolean isPageLoaded () {
        
        waitForElementToBePresentAndEnterText(By.xpath(ELECTRICITY_SPEND_XPATH), ELECTRICITY_SPEND);
        waitForElementToBePresentAndEnterText(By.xpath(GAS_SPEND_XPATH), GAS_SPEND);
        
        // Check URL start
        return true;

    }
    
    
    public static boolean goToNextPage () {    
    	return waitForElementToBePresentAndClick(By.id(GOTO_ELECTRICITY_ID));
    }
	
}





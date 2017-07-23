package Simms.bgl.pageobjects;

import org.openqa.selenium.By;

import Simms.bgl.stepdefinitions.GenericStepDef;

/**
 * This class handle the page specific details for the original page in the test URL
 * https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT
 * This class has the comments - others follow very similar format
 *  
 * @author Paul
 *
 */
public class EnergySupplierPage  extends GenericStepDef {

    public static final String POSTCODE_ID = "your-postcode";
    public static final String FIND_POSTCODE_BUTTON_ID = "find-postcode";
    public static final String POSTCODE = "PE2 6YS";
    public static final String ENERGY_HOME_URL = "https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT";
    public static final String ENERGY_HOME_START_URL = "https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT";

    public static final String HAVE_BILL_CSS = "span.icon.have-bill-yes";
    public static final String NO_BILL_CSS = "span.icon.have-bill-no";
    public static final String COMPARE_BOTH_CSS = "span.icon.energy-gas-electricity";
    public static final String COMPARE_ELECTRICITY_CSS = "span.icon.energy-electricity";
    public static final String COMPARE_GAS_CSS = "span.icon.energy-gas";
    
    public static final String GOTO_SUPPLIER_DETAILS_XPATH=".//*[@id='goto-your-supplier-details']";    
    public static final String GOTO_SUPPLIER_DETAILS_ID="goto-your-supplier-details";    
    public static final String GOTO_BUTTON_ID="button-primary";    

    /**
     * Checks if the page is loaded - should be called at the start of testing on this page
     * @return - boolean - success
     */
    public static boolean isPageLoaded () {
        loadPage(ENERGY_HOME_START_URL);
        // Check URL start
        return driver.getCurrentUrl().startsWith(ENERGY_HOME_START_URL);
    }
    
    /**
     * Sets the postcode value and if successful clicks the button
     * 
     * @param code
     * @return - boolean - success
     */
    public static boolean enterPostcode (String code)
    {
    	boolean retVal = waitForElementToBePresentAndEnterText(By.id(POSTCODE_ID), POSTCODE);
    	if (retVal) {
    		retVal = waitForElementToBePresentAndClick(By.id(FIND_POSTCODE_BUTTON_ID));
    	}
    	return retVal;
    }
    
    /**
     * Sets the parameter
     * @return - boolean - success
     */
    public static boolean selectDualFuel () {    
    	return waitForElementToBePresentAndClick(By.cssSelector(COMPARE_BOTH_CSS));
    }

    /**
     * Sets the parameter
     * @return - boolean - success
     */
    public static boolean selectIHaveBill () {    
    	return waitForElementToBePresentAndClick(By.cssSelector(HAVE_BILL_CSS));
    }

    /**
     * Clicks the button to the next page in the process. @TBD handle the sleep more elegantly
     * @return - boolean - success
     */
    public static boolean goToNextPage () {    
		sleepSecs(2);
        return waitForElementToBePresentAndClick(By.id(GOTO_SUPPLIER_DETAILS_ID));
    }

}

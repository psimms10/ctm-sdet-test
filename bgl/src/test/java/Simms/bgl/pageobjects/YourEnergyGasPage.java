package Simms.bgl.pageobjects;

import org.openqa.selenium.By;

import Simms.bgl.stepdefinitions.GenericStepDef;
/**
 * Page object for the your gas page - @TBD if can be combined with the electricity page
 * @author Paul
 *
 */

public class YourEnergyGasPage  extends GenericStepDef {

    public static final String GOTO_GAS_ID = "goto-your-energy";
    public static final String GAS_SPEND_IN_POUNDS_XPATH=".//*[@id='gas-type-of-bill-question']/div/div/div[1]/label[2]/span";
    public static final String GAS_SPEND_XPATH=".//*[@id='gas-spend']";
    public static final String GAS_CALENDAR_XPATH=".//*[@id='gas-bill-date-field']/div/div/span[1]";    
    public static final String GAS_CALENDAR_TODAY_XPATH=".//*[@id='gas-bill-day_root']/div/div/div/div/div[2]/button[1]";
	public static final String HEADER_XPATH="html/body/div/div/main/section[1]/h2";
	public static final String HEADER_TEXT="Electricity";
	public static final String GAS_PAYMENT_QUESTION_XPATH=".//*[@id='gas-payment-method-question']/div/label";
	
    public static boolean isPageLoaded () {
    	return waitForElementToBePresent(By.xpath(GAS_PAYMENT_QUESTION_XPATH));
    }
    
    
    public static boolean selectValueInPounds () {    
    	return waitForElementToBePresentAndClick(By.xpath(GAS_SPEND_IN_POUNDS_XPATH));
    }

    public static boolean enterSpendInPounds (String value) {    
    	return waitForElementToBePresentAndEnterText(By.xpath(GAS_SPEND_XPATH), value);
    }

    
    public static boolean selectBillFromToday() {
    	boolean retVal = waitForElementToBePresentAndClick(By.xpath(GAS_CALENDAR_XPATH));
        if (retVal) retVal = waitForElementToBePresentAndClick(By.xpath(GAS_CALENDAR_TODAY_XPATH));
    	return retVal;
    }
    
    public static boolean goToNextPage () {    
    	return waitForElementToBePresentAndClick(By.id(GOTO_GAS_ID));
    }
	
}





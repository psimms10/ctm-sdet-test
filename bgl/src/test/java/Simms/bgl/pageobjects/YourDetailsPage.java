package Simms.bgl.pageobjects;

import org.openqa.selenium.By;

import Simms.bgl.stepdefinitions.GenericStepDef;

/**
 * Page object for the your details page
 * @author Paul
 *
 */
public class YourDetailsPage  extends GenericStepDef {

	public static final String ALL_TARIFFS_XPATH=".//*[@id='tariff-selection-question']/div/label[3]/span/span";
	public static final String ALL_PAYMENT_TYPES_XPATH=".//*[@id='payment-selection-question']/div/label[4]/span/span";
	public static final String COMPARE_THE_MARKET_ONLY_XPATH=".//*[@id='same-supplier-question']/div[2]/div[1]/div[1]/label/span";
    public static final String EMAIL_FIELD_XPATH=".//*[@id='Email']";
    public static final String TEST_EMAIL_TEXT="a@b.co.uk";
    public static final String LATEST_PRODUCT_XPATH=".//*[@id='marketingT']/div/div[2]/label/span[2]";
    public static final String TERMS_AND_C_XPATH= ".//*[@id='terms-label']/span[2]";
    public static final String GOTO_PRICES_XPATH=".//*[@id='email-submit']";
	public static final String TARIFF_QUESTION_XPATH=".//*[@id='tariff-selection-question']/span";

    
    
    public static boolean isPageLoaded () {
    	return waitForElementToBePresent(By.xpath(TARIFF_QUESTION_XPATH));
    }
    
    public static boolean setAllTariffs () {    
    	return waitForElementToBePresentAndClick(By.xpath(ALL_TARIFFS_XPATH));
    }

    public static boolean setAllPayments () {    
    	return waitForElementToBePresentAndClick(By.xpath(ALL_PAYMENT_TYPES_XPATH));
    }

    public static boolean setEmail (String email) {    
    	return waitForElementToBePresentAndEnterText(By.xpath(EMAIL_FIELD_XPATH), email);
    }

    public static boolean setLatestProducts () {    
    	return waitForElementToBePresentAndClick(By.xpath(LATEST_PRODUCT_XPATH));
    }

    public static boolean setTermsAndConds () {    
    	return waitForElementToBePresentAndClick(By.xpath(TERMS_AND_C_XPATH));
    }

    public static boolean goToNextPage () {    
		sleepSecs(2);
    	return waitForElementToBePresentAndClick(By.xpath(GOTO_PRICES_XPATH));
    }
	
}

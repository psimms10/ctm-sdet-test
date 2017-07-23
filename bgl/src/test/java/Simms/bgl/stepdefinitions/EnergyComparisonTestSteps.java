package Simms.bgl.stepdefinitions;

import Simms.bgl.pageobjects.EnergySupplierPage;
import Simms.bgl.pageobjects.YourDetailsPage;
import Simms.bgl.pageobjects.YourEnergyElectricityPage;
import Simms.bgl.pageobjects.YourEnergyGasPage;
import Simms.bgl.pageobjects.YourResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 * This class has methods defined from the feature files and converts it into steps that are requried for the actions
 * to be performed. It is the interface between the business facing feature, and solution facing pages.
 */
public class EnergyComparisonTestSteps extends GenericStepDef {

	
	
	@Given("^I am on energy home page$")
	public void I_am_on_energy_home_page() {
	  Assert.assertTrue("I_am_on_energy_home_page: Energy Home Page failed to load", EnergySupplierPage.isPageLoaded());
	}
	
	@When("^On supplier page I enter postcode \"([^\"]*)\" select dual fuel and I have bill$")
	public void On_supplier_page_I_enter_postcode_select_dual_fuel_and_I_have_bill(String arg1) {
		Assert.assertTrue("I_enter_postcode: Energy Home Page failed to load", EnergySupplierPage.enterPostcode(arg1));
	    Assert.assertTrue("I_select_I_have_bill: Energy Home Page - select I have bill", EnergySupplierPage.selectIHaveBill());
	    Assert.assertTrue("I_select_dual_fuel: Energy Home Page - select dual fuel", EnergySupplierPage.selectDualFuel());
		Assert.assertTrue("I_am_on_energy_home_page: Go to next page", EnergySupplierPage.goToNextPage());
	}	
	 
	@When("^I spend \"([^\"]*)\" pounds per month electricity with bill from today$")
	public void I_spend_pounds_per_month_electricity_with_bill_from_today(String arg1) {
		System.out.println("F");
		  Assert.assertTrue("I select all default items: Supplier Electricity Page failed to load", YourEnergyElectricityPage.isPageLoaded());
	      Assert.assertTrue("I_spend_pounds_per_month_electricity: Electricity Supplier Page - select I spend in pounds", YourEnergyElectricityPage.selectValueInPounds());
	      Assert.assertTrue("I_spend_pounds_per_month_electricity: Electricity Supplier Page - enter value in pounds spent", YourEnergyElectricityPage.enterSpendInPounds(arg1));
	      Assert.assertTrue("I_select_bill_from_today_electricity: Electricity Supplier Page - select bill from today", YourEnergyElectricityPage.selectBillFromToday());
		  Assert.assertTrue("I select all default items: Go to next page", YourEnergyElectricityPage.goToNextPage());
		System.out.println("I_spend_pounds_per_month_electricity");
	}
	
	@When("^I spend \"([^\"]*)\" pounds per month gas with bill from today$")
	public void I_spend_pounds_per_month_gas_with_bill_from_today(String arg1) {
		  Assert.assertTrue("I select all default items: Supplier Gas Page failed to load", YourEnergyGasPage.isPageLoaded());
	      Assert.assertTrue("I_spend_pounds_per_month_electricity: Gas Supplier Page - select I spend in pounds", YourEnergyGasPage.selectValueInPounds());
	      Assert.assertTrue("I_spend_pounds_per_month_electricity: Gas Supplier Page - enter value in pounds spent", YourEnergyGasPage.enterSpendInPounds(arg1));
	      Assert.assertTrue("I_select_bill_from_today_gas: Gas Supplier Page - select bill from today", YourEnergyGasPage.selectBillFromToday());
		  Assert.assertTrue("I select all default items: Go to next page", YourEnergyGasPage.goToNextPage());
		System.out.println("I_spend_pounds_per_month_gas");
	}

	@When("^I select all tariffs, payment types, latest products, terms and conditions with email \"([^\"]*)\"$")
	public void I_select_all_tariffs_payment_types_latest_products_terms_and_conditions_with_email(String arg1)  {
		  Assert.assertTrue("Setting your details page: failed to load", YourDetailsPage.isPageLoaded());
		  Assert.assertTrue("Setting your details page: set all tariffs", YourDetailsPage.setAllTariffs());
		  Assert.assertTrue("Setting your details page: set all payments", YourDetailsPage.setAllPayments());
		  Assert.assertTrue("Setting your details page: set email", YourDetailsPage.setEmail(arg1));
		  Assert.assertTrue("Setting your details page: set latest products", YourDetailsPage.setLatestProducts());
		  Assert.assertTrue("Setting your details page: set T&Cs", YourDetailsPage.setTermsAndConds());
		  Assert.assertTrue("Setting your details page: go to next page", YourDetailsPage.goToNextPage());
	}

	@Then("^I see the results page$")
	public void I_see_the_results_page()  {
	    // Express the Regexp above with the code you wish you had
	  System.out.println("^I see the results$");
	  Assert.assertTrue("Setting results page: failed to load", YourResultsPage.isPageLoaded());
	  System.out.println("FINISHED");
	}
	
	
	
	// BELOW ARE FROM STEPS DEFINED IN OTHER TESTS NOT IMPLEMENTED

@When("^I select I do not know spending on electricity and gas pages$")
public void I_select_I_do_not_know_spending_on_electricity_and_gas_pages()  {
}

@When("^I select a value for each selection$")
public void I_select_a_value_for_each_selection()  {
}

@When("^On supplier page I enter postcode \"([^\"]*)\" select electricity only and supplyer \"([^\"]*)\"$")
public void On_supplier_page_I_enter_postcode_select_electricity_only_and_supplyer(String arg1, String arg2)  {
}

@When("^I select prepaid meter, economy (\\d+) and \"([^\"]*)\" pounds Annually$")
public void I_select_prepaid_meter_economy_and_pounds_Annually(int arg1, String arg2) {
}

@When("^I select fixed tariffs, payment types, latest products, terms and conditions with email \"([^\"]*)\"$")
public void I_select_fixed_tariffs_payment_types_latest_products_terms_and_conditions_with_email(String arg1)  {
}

@Then("^I see an error page that the selected tariff is not available$")
public void I_see_an_error_page_that_the_selected_tariff_is_not_available() {
}

}


/**
 * Below are the set of initial step definitions per item. Thought to group these though for the 
 * user facing test definitions - group them per page
 * 	
	@When("^I enter postcode \"([^\"]*)\"$")
	public void I_enter_postcode(String arg1) throws Throwable {
      Assert.assertTrue("I_enter_postcode: Energy Home Page failed to load", EnergySupplierPage.enterPostcode(arg1));
	}

	@When("^I select dual fuel$")
	public void I_select_dual_fuel() throws Throwable {
	      Assert.assertTrue("I_select_dual_fuel: Energy Home Page - select dual fuel", EnergySupplierPage.selectDualFuel());
	}

	@When("^I select I have bill$")
	public void I_select_I_have_bill() throws Throwable {
	      Assert.assertTrue("I_select_I_have_bill: Energy Home Page - select I have bill", EnergySupplierPage.selectIHaveBill());
	}

	@When("^I move to electricity usage page$")
	public void I_move_to_electricity_usage_page() throws Throwable {
		  Assert.assertTrue("I_am_on_energy_home_page: Go to next page", EnergySupplierPage.goToNextPage());
	}

	
	@When("^I select all tariffs$")
	public void I_select_all_tariffs() throws Throwable {
		System.out.println("------- TARIFFS");
		  Assert.assertTrue("I select all default items: Supplier Gas Page failed to load", YourEnergyGasPage.isPageLoaded());
	}

	@When("^I select all payment types$")
	public void I_select_all_payment_types() throws Throwable {
	}

	@When("^I enter email \"([^\"]*)\"$")
	public void I_enter_email(String arg1) throws Throwable {
	}

	@When("^I select latest products$")
	public void I_select_latest_products() throws Throwable {
	}

	@When("^I select terms and conditions$")
	public void I_select_terms_and_conditions() throws Throwable {
	}

	@When("^I select show results$")
	public void I_select_show_results() throws Throwable {
	}

	@Then("^I see the results page$")
	public void I_see_the_results_page() throws Throwable {
	}
	

@When("^I select all default items$")
public void I_select_all_default_items() throws Throwable {
    // Express the Regexp above with the code you wish you had
	  System.out.println("^I select all default items$");
	  Assert.assertTrue("I select all default items: Supplier Electricity Page failed to load", YourEnergyElectricityPage.isPageLoaded());
	  Assert.assertTrue("I select all default items: Go to next page", YourEnergyElectricityPage.goToNextPage());

	  
	  Assert.assertTrue("I select all default items: Supplier Gas Page failed to load", YourEnergyGasPage.isPageLoaded());
	  Assert.assertTrue("I select all default items: Go to next page", YourEnergyGasPage.goToNextPage());

	  Assert.assertTrue("I select all default items: My details Page failed to load", YourDetailsPage.isPageLoaded());
	  Assert.assertTrue("I select all default items: Go to next page", YourDetailsPage.goToNextPage());

	  Assert.assertTrue("I select all default items: My results Page failed to load", YourResultsPage.isPageLoaded());
}
@When("^I spend \"([^\"]*)\" pounds per month electricity$")
public void I_spend_pounds_per_month_electricity(String arg1) throws Throwable {
	System.out.println("F");
	  Assert.assertTrue("I select all default items: Supplier Electricity Page failed to load", YourEnergyElectricityPage.isPageLoaded());
      Assert.assertTrue("I_spend_pounds_per_month_electricity: Electricity Supplier Page - select I spend in pounds", YourEnergyElectricityPage.selectValueInPounds());
      Assert.assertTrue("I_spend_pounds_per_month_electricity: Electricity Supplier Page - enter value in pounds spent", YourEnergyElectricityPage.enterSpendInPounds(arg1));
	System.out.println("I_spend_pounds_per_month_electricity");
}

@When("^I select bill from today electricity$")
public void I_select_bill_from_today_electricity() throws Throwable {
      Assert.assertTrue("I_select_bill_from_today_electricity: Electricity Supplier Page - select bill from today", YourEnergyElectricityPage.selectBillFromToday());
}

@When("^I move to gas usage page$")
public void I_move_to_gas_usage_page() throws Throwable {
	  Assert.assertTrue("I select all default items: Go to next page", YourEnergyElectricityPage.goToNextPage());
}

@When("^I spend \"([^\"]*)\" pounds per month gas$")
public void I_spend_pounds_per_month_gas(String arg1) throws Throwable {
	  Assert.assertTrue("I select all default items: Supplier Gas Page failed to load", YourEnergyGasPage.isPageLoaded());
      Assert.assertTrue("I_spend_pounds_per_month_electricity: Gas Supplier Page - select I spend in pounds", YourEnergyGasPage.selectValueInPounds());
      Assert.assertTrue("I_spend_pounds_per_month_electricity: Gas Supplier Page - enter value in pounds spent", YourEnergyGasPage.enterSpendInPounds(arg1));
	System.out.println("I_spend_pounds_per_month_gas");
}

@When("^I select bill from today gas$")
public void I_select_bill_from_today_gas() throws Throwable {
      Assert.assertTrue("I_select_bill_from_today_gas: Gas Supplier Page - select bill from today", YourEnergyGasPage.selectBillFromToday());
}

@When("^I move to my details page$")
public void I_move_to_my_details_page() throws Throwable {
	  Assert.assertTrue("I select all default items: Go to next page", YourEnergyGasPage.goToNextPage());
}
*/

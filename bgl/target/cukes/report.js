$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Simms/bgl/EnergyComparisonTests.feature");
formatter.feature({
  "line": 1,
  "name": "As a customer, I wish to verify paths through the Energy Comparison use cases",
  "description": "on Compare The Market website. Any tests will include paths to enter - \nSuppliers details\nEnergy usage\nUser details\nFinally a check will be made to ensure that the price comparison page is displayed",
  "id": "as-a-customer,-i-wish-to-verify-paths-through-the-energy-comparison-use-cases",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1303136315,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Select dual fuel option at PE2 6YS, entering values - good path",
  "description": "",
  "id": "as-a-customer,-i-wish-to-verify-paths-through-the-energy-comparison-use-cases;select-dual-fuel-option-at-pe2-6ys,-entering-values---good-path",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on energy home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "On supplier page I enter postcode \"PE2 6YS\" select dual fuel and I have bill",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I spend \"50\" pounds per month electricity with bill from today",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I spend \"100\" pounds per month gas with bill from today",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select all tariffs, payment types, latest products, terms and conditions with email \"a@b.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I see the results page",
  "keyword": "Then "
});
formatter.match({
  "location": "EnergyComparisonTestSteps.I_am_on_energy_home_page()"
});
formatter.result({
  "duration": 11775684149,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PE2 6YS",
      "offset": 35
    }
  ],
  "location": "EnergyComparisonTestSteps.On_supplier_page_I_enter_postcode_select_dual_fuel_and_I_have_bill(String)"
});
formatter.result({
  "duration": 5009528410,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 9
    }
  ],
  "location": "EnergyComparisonTestSteps.I_spend_pounds_per_month_electricity_with_bill_from_today(String)"
});
formatter.result({
  "duration": 9976025026,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 9
    }
  ],
  "location": "EnergyComparisonTestSteps.I_spend_pounds_per_month_gas_with_bill_from_today(String)"
});
formatter.result({
  "duration": 2033452752,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a@b.com",
      "offset": 87
    }
  ],
  "location": "EnergyComparisonTestSteps.I_select_all_tariffs_payment_types_latest_products_terms_and_conditions_with_email(String)"
});
formatter.result({
  "duration": 11180524575,
  "status": "passed"
});
formatter.match({
  "location": "EnergyComparisonTestSteps.I_see_the_results_page()"
});
formatter.result({
  "duration": 10438022914,
  "status": "passed"
});
formatter.after({
  "duration": 69790,
  "status": "passed"
});
formatter.before({
  "duration": 31247520,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Select energy suppliers without knowing usage - to have that additional page",
  "description": "",
  "id": "as-a-customer,-i-wish-to-verify-paths-through-the-energy-comparison-use-cases;select-energy-suppliers-without-knowing-usage---to-have-that-additional-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I am on energy home page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "On supplier page I enter postcode \"PE2 6YS\" select dual fuel and I have bill",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I select I do not know spending on electricity and gas pages",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select a value for each selection",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select all tariffs, payment types, latest products, terms and conditions with email \"a@b.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I see the results page",
  "keyword": "Then "
});
formatter.match({
  "location": "EnergyComparisonTestSteps.I_am_on_energy_home_page()"
});
formatter.result({
  "duration": 10868577594,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PE2 6YS",
      "offset": 35
    }
  ],
  "location": "EnergyComparisonTestSteps.On_supplier_page_I_enter_postcode_select_dual_fuel_and_I_have_bill(String)"
});
formatter.result({
  "duration": 280830832,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d59.0.3071.115)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.2.9200 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 120 milliseconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027KYRIAKOS\u0027, ip: \u0027192.168.1.101\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\Maria\\AppData\\Local\\Temp\\scoped_dir7828_19823}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d59.0.3071.115, platform\u003dWIN8, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: ec785d06e1bdcb9c9fa86f25ffd0e01c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:89)\r\n\tat Simms.bgl.stepdefinitions.GenericStepDef.enterText(GenericStepDef.java:111)\r\n\tat Simms.bgl.stepdefinitions.GenericStepDef.waitForElementToBePresentAndEnterText(GenericStepDef.java:90)\r\n\tat Simms.bgl.pageobjects.EnergySupplierPage.enterPostcode(EnergySupplierPage.java:51)\r\n\tat Simms.bgl.stepdefinitions.EnergyComparisonTestSteps.On_supplier_page_I_enter_postcode_select_dual_fuel_and_I_have_bill(EnergyComparisonTestSteps.java:29)\r\n\tat ✽.When On supplier page I enter postcode \"PE2 6YS\" select dual fuel and I have bill(Simms/bgl/EnergyComparisonTests.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "EnergyComparisonTestSteps.I_select_I_do_not_know_spending_on_electricity_and_gas_pages()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EnergyComparisonTestSteps.I_select_a_value_for_each_selection()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "a@b.com",
      "offset": 87
    }
  ],
  "location": "EnergyComparisonTestSteps.I_select_all_tariffs_payment_types_latest_products_terms_and_conditions_with_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EnergyComparisonTestSteps.I_see_the_results_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 25316,
  "status": "passed"
});
formatter.before({
  "duration": 17604911,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Select Electricity only, and with an invalid tariff selection",
  "description": "",
  "id": "as-a-customer,-i-wish-to-verify-paths-through-the-energy-comparison-use-cases;select-electricity-only,-and-with-an-invalid-tariff-selection",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "I am on energy home page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "On supplier page I enter postcode \"PE2 6YS\" select electricity only and supplyer \"E\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I select I do not know spending on electricity and gas pages",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select prepaid meter, economy 7 and \"500\" pounds Annually",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select fixed tariffs, payment types, latest products, terms and conditions with email \"a@b.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I see an error page that the selected tariff is not available",
  "keyword": "Then "
});
formatter.match({
  "location": "EnergyComparisonTestSteps.I_am_on_energy_home_page()"
});
formatter.result({
  "duration": 3303100052,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PE2 6YS",
      "offset": 35
    },
    {
      "val": "E",
      "offset": 82
    }
  ],
  "location": "EnergyComparisonTestSteps.On_supplier_page_I_enter_postcode_select_electricity_only_and_supplyer(String,String)"
});
formatter.result({
  "duration": 108107,
  "status": "passed"
});
formatter.match({
  "location": "EnergyComparisonTestSteps.I_select_I_do_not_know_spending_on_electricity_and_gas_pages()"
});
formatter.result({
  "duration": 31474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 32
    },
    {
      "val": "500",
      "offset": 39
    }
  ],
  "location": "EnergyComparisonTestSteps.I_select_prepaid_meter_economy_and_pounds_Annually(int,String)"
});
formatter.result({
  "duration": 1479962,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a@b.com",
      "offset": 89
    }
  ],
  "location": "EnergyComparisonTestSteps.I_select_fixed_tariffs_payment_types_latest_products_terms_and_conditions_with_email(String)"
});
formatter.result({
  "duration": 91685,
  "status": "passed"
});
formatter.match({
  "location": "EnergyComparisonTestSteps.I_see_an_error_page_that_the_selected_tariff_is_not_available()"
});
formatter.result({
  "duration": 38316,
  "status": "passed"
});
formatter.after({
  "duration": 20526,
  "status": "passed"
});
});
Feature: As a customer, I wish to verify paths through the Energy Comparison use cases
  on Compare The Market website. Any tests will include paths to enter - 
  Suppliers details
  Energy usage
  User details
  Finally a check will be made to ensure that the price comparison page is displayed

Scenario: Select dual fuel option at PE2 6YS, entering values - good path
  Given I am on energy home page
  When On supplier page I enter postcode "PE2 6YS" select dual fuel and I have bill
  And I spend "50" pounds per month electricity with bill from today
  And I spend "100" pounds per month gas with bill from today
  And I select all tariffs, payment types, latest products, terms and conditions with email "a@b.com"
  Then I see the results page


Scenario: Select energy suppliers without knowing usage - to have that additional page
  Given I am on energy home page
  When On supplier page I enter postcode "PE2 6YS" select dual fuel and I have bill
  And  I select I do not know spending on electricity and gas pages
  And I select a value for each selection
  And I select all tariffs, payment types, latest products, terms and conditions with email "a@b.com"
  Then I see the results page

Scenario: Select Electricity only, and with an invalid tariff selection
  Given I am on energy home page
  When On supplier page I enter postcode "PE2 6YS" select electricity only and supplyer "E"
  And  I select I do not know spending on electricity and gas pages
  And I select prepaid meter, economy 7 and "500" pounds Annually
  And I select fixed tariffs, payment types, latest products, terms and conditions with email "a@b.com"
  Then I see an error page that the selected tariff is not available

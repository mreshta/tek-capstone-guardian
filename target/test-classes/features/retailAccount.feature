#@Regression
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Alpha3@gmail.com' and password 'Alpha123$'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @userInfoUpdate
  Scenario: Verify User can update Profile Information
    And User update Name 'AlphaA' and Phone '90939215405'
    And User click on Update button
    Then user profile information should be updated

  @userAddPaymentMethod
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2828028238175428 | Alpha      |              10 |           2028 |          289 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @userUpdatesTheCreditDebitCard
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0000000344750410 | Alpha      |               7 |           2029 |          354 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @removeCard
  Scenario: Verify User can remove Debit or Credit card
    And User click on selected card
    And User click on remove option of card section
    Then payment details should be removed

  @userAddAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill address form with below information
      | country      | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryValue | fullnameValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @userEditAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And User fill new address form with below information
      | country | fullName   | phoneNumber | streetAddress | apt | city | state      | zipCode |
      | Croatia | Jonh Smith |  2030232030 |          2020 | 300 | LA   | California |   30309 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @removeAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed

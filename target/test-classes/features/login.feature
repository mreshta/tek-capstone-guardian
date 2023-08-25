#@Regression
Feature: login

Background:
Given User is on retail website
When User click on Sign in option

@login
Scenario: Verify user can sign in into Retail Application
    And User enter email 'Alpha3@gmail.com' and password 'Alpha123$'
    And User click on login button
    Then User should be logged in into Account

@createNewAccount
Scenario Outline: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User enter '<name>' and '<email>' and '<password>' and '<confPassword>'
    And User click on SignUp button
    Then User should be logged into account page
    
		Examples:
		|name|email|password|confPassword|
		|student|Alpha3@gmail.com|Alpha123$|Alpha123$|    
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#For new test case you need 3 things in POM, feature file, java step definition, java page class
@tag
Feature: Login Test //Always follow the structure of a feature file to create a feature file
  As a user I want to log in to the application with a valid credential

  @login
  Scenario: login as a user
    Given user has a valid credential
    And user has a valid email and passwod
    When user enter his email and password
    And click on login button
    Then user should successfully logged in// verify the test

  @login2
  Scenario Outline: login test multiple times with different data
    When user enters<email> as a user id
    And user enters <password> as a password
    Then user should successfully be logged in

    Examples: 
      | email | passwod |
      |       |         |

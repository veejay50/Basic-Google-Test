@google
Feature: Create login without username for google
  AS A User
  I WANT TO to signup without username on googlemail 
  SO THAT an error is displayed

  Scenario: A user try to signup without username to see an error message 
    Given I am on Google mail signup page and enter all details except username
    When I click on a button to navigate to next page
    Then an error is displayed

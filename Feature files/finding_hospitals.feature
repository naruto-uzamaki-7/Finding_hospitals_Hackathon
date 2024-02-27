Feature: Finding Hospitals

  Scenario: getting data from practo website
    Given the user open the website
    When select location
    And select specialist
    When user apply filters
    When print top five doctors
    When user click on surgeries
    When print all surgeries
    When user click on for corporates
    And user click on health and wellness
    When user fill invalid details
    Then check schedule button is enabled or not
    When user fill valid details
    Then check schedule button is enabled or not
    Then verify thank you message 

  
  Scenario: getting list of doctors after adding filters
    Given the user open the website
    When select location
    And select specialist
    When user apply filters
    When print top five doctors

  Scenario: getting list of surgeries
    Given the user open the website
    When user click on surgeries
    When print all surgeries

  Scenario: enroll for health and wellness
    Given the user open the website
    When user click on for corporates
    And user click on health and wellness
    When user fill invalid details
    Then check schedule button is enabled or not
    When user fill valid details
    Then check schedule button is enabled or not
    Then verify thank you message

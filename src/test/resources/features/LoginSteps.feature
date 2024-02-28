Feature: Login Feature
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User navigates to Login Page
    And User enters valid username and password
    Then Message displayed Login Successfully
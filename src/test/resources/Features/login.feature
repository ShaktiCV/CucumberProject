#Author: Shakti Test:login Page test
@SmockeScenario
Feature: Feature to test Login functionality

  @SmokeTest
  Scenario: Check Login is successful with valid credentials
    Given User is on Login Page
    When User enters login name and pwd
    And clicks on login button
    Then Navigated to the home page
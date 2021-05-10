#Author: Shakti Test:Google Page test
@GooglePage
Feature: Feature to test google page

  @GoogleSearchTest
  Scenario: Validate google search is working
    Given Browser is open
    And User is on google search page
    When User enters text in search box
    And hits enter
    Then User is Navigated to search results page

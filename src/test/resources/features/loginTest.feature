Feature: used to validate google search functionality

  Scenario: used to search any value on google search
    Given Browser should be in the google search page
    When user enter any search text on google search
    And hits the search button
    Then searched results should be opened

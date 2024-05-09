@mustRun
Feature: check background steps validation

  Background: logged in step
    Given user logged in the website

  Scenario: check the backround steps
    When user clicked on the employee tab
    Then add employee list will appear

  Scenario: check the backround steps
    When user clicked on the reports tab
    Then employee report will appear

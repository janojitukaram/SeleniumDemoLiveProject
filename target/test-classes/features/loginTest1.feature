Feature: Check login functionality on ninja website

  Scenario Outline: user logged in with valid credentials
    Given web browser should be in the login page
    When user enters <username> and <password> details on the box
    And clicks on the login button
    Then bowser navigated to home page

    Examples: 
      | username                  | password |
      | tukarampractice@gmail.com |     12345 |

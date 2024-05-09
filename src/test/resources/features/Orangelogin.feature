Feature: Orange HRM website login functionality validations

  Scenario Outline: login orange website with different credentials
    Given user should able to open the Orange website
    When user enter <username> and <password> details
    And clicks on login button
    Then user navigated to home screen

    Examples: 
      | username | password |
      | Admin    | admin123 |

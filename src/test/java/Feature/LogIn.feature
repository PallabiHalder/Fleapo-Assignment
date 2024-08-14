Feature: Login as a standard user using email and password

  Scenario Outline : LogIn with valid credentials

    Given Open the browser.
    And Enter the url.
    And Maximize the window.
    When Enter valid "<email>" and "<password>"
    And Click on Continue button
    Then navigate to homepage

    Examples:
      | email | password |
      | testqa@mailinator.com | 123456789 |



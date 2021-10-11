Feature: As a user, I should be able to search for an item on the Ebay application

  Background:
    Given user is at OverStock login page

  @Login
  Scenario Outline: User should be able to login using valid credentials
    When user hovers on account and clicks on sign in
    And user enters "<email>" in the email field
    And user enters "<password>" in the password field
    And user clicks the sign in button
    Then user should navigated to my account page

    Examples:
      |           email          |     password  |
      |    test123@email.com     |   pas7895     |
      |    test1147@email.com    |   password    |
      |    test1211@email.com    |   admin       |
      |    test1123@email.com    |   root        |
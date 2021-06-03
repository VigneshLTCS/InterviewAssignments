Feature: Log in Screen Test
  Scenario Outline: I want to log into the application
    Given I am on the log in screen
    When I enter "<username>"  as a username
    And I enter "<password>" as a password
    And I click on the login button
    Then I should be redirected to userprofile page

    Examples:
      | username | password |
      | user    | password|

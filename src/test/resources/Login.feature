


@Login
Feature: I can login
  We are wanting to be able to login and verify the user is logged in

  Background:
    Given I am on the HomePage
    When I can click sign out
    Then I can see the "Please Sign In" message

  Scenario Outline: positive login <username> / <password>
    When I enter "<username>" as the username
    And I enter "<password>" as the password
    When I click the sign in button
    Then I can see "<username>" signed in at the bottom as signed in
    Examples:
      | username | password |
      |user      | password |
      |user      | wordpass |
      |admin     | password |

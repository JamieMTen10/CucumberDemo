@LoanApp
Feature: Loan Application

  Background:
    Given I am on the HomePage
    When I can click sign out
    When I enter "user" as the username
    And I enter "password" as the password
    When I click the sign in button
    When I click the loan application button
    Then I can see the loan application message

    Scenario: Applying for loan
      Then I fill out the loan
      |Name      |Age|Address Line 1|Address Line 2|post Code|Email         |Amount|
      |Joe Bloggs|37 |st anne's rise|Leeds         |LS5 2JF  |joeb@gmail.com|2000  |
      Then I submit the loan

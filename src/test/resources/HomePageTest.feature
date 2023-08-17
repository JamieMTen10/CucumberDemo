@homePage
Feature: Can I get to the home page
  We are wanting to be able to navigate to the home page of the website
  Scenario:Navigate to HomePage
    Given I am on the HomePage
    Then I can see the Home Page Message

    Scenario: I can click sign out
      Given I am on the HomePage
      When I can click sign out
      Then I can see the log in page
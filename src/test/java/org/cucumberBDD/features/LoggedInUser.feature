Feature: Logged in User View
  Scenario: validate user is able to view after log in
    Given User navigate to the login page
    When User successfully enters the login details
    Then User should able to view the product category page
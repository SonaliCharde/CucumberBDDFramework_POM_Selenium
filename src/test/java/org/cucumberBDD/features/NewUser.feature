Feature: New User View
  Scenario: validate new user is able to view after registration
    Given User navigate to the login page
    When User clicks on new registration button
    Then User should be able to view the registration page
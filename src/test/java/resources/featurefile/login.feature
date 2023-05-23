Feature: Login Test
  As a user I should login in login page
@regression
  Scenario: User should Login successFully
    Given I am on login page
    When  I enter username "Admin" on login page
    And  I enter password "admin123" on login page
    And  I click on Login Button
    Then I should verify Dashboard Message

  Scenario:Logo should display on LoginPage
    When I launch the application
    Then I verify Logo is Displayed
@sanity
  Scenario:User should LogOut successFully
    When I login To The application
    And  I click on User Profile logo
    And  I mouse hover on Logout and click
    Then I verify the text Login Panel is displayed

Feature: User Test
  I want to verify users record
@smoke
  Scenario: Admin should Add user successfully
    When I Login to Application
    And I click On Admin Tab
    When I click On Admin Tab
    Then I  verify System Users Text
    And I click On Add button
    Then I verify "Add User" Text
    And I select User Role Admin
    And I enter Employee Name "Ananya Dash"
    And I enter username "dash123"
    And I select status "Disable"
    And I enter password "Dash@01" on admin page
    And I enter confirm password "Dash@01" on admin page
    And I click On save Button
    Then I should verify message successfully Saved

  Scenario: search the user created and verify it
    When I Login to Application
    And I click On Admin Tab
    Then I Verify System Users text
    And I enter username "dash123"
    And I select User Role "Admin"
    And I select status "Disable"
    And I click on Search Button
    Then I should verify the User should be in Result list.

  Scenario:verify that Admin should delete the User successFully
    When I Login to Application
    And  I click On Admin Tab
    Then I Verify System Users Text
    And I enter Username
    And I select User Role
    And I Select Satatus
    And I Click on Search Button
 Then  I verify the User should be in Result list.
    And I click on Check box
    And I click on Delete Button
    And I Popup will display
    And I click on Ok Button on Popup
    And I verify message Successfully Deleted

  Scenario: search The Delete User And Verify The Message No Record Found
    When I Login to Application
    And I click On Admin Tab
    Then I verify System Users Text
    And I Enter username "Username"
    And I Select User Role
    And I Select Satatus
    And I Click on Search Button
    Then I verify message No Records Found


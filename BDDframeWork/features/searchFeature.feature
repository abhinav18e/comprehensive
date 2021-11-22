Feature: search product
Scenario: search any product from searchbox
Given User is on default home page
When user search product "keychain" in searchbox
Then the products list should appear


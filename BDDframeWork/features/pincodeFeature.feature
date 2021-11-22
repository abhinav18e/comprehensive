Feature: checking pincode
Scenario: to check availability of product 
Given User is on any product details page
When user enter pincode "414002" and check
Then  product availability details should appear

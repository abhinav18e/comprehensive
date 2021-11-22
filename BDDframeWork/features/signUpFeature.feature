Feature: Application SignUp
Scenario: home page default SignUp
Given User is on create account page
When user provides "Abhinav" "nagpure" "abhinav@gmail.com" "password"
Then account should be created 


Feature: login to application
Scenario: application default login 
Given User is on login page
When user login using username "abhinav@gmail.com" and password "abhinav"
Then user should successfully login
And home page should appear

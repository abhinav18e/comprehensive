Feature: subscribe to newsLetter
Scenario: to subscirbe newsLetter by providing emailId
Given User is on home page1 
When user sends email id "abhinav@gmail.com " in the newsLetter section 
And clicks on submit
Then user is redirected to news page
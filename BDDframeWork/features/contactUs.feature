Feature: contact us feature
Scenario: submit details in contactUs oage
Given user on home page
When click on contactUs 
And user fills the contactUs form with name "abhinav" email "abhinav@gmail.com" msg "contact me"
And submit the contact form
Then success message should be displayed
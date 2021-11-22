Feature: Application login
Scenario: submit gift enquiry details succesfully
Given user is on equiry page
When user fills the enquiry form with "abhinav" "abhinav@gmail.com" "9898967680" "500 gifts budget 300rs"
And submit the form
Then the details should be successfully submited


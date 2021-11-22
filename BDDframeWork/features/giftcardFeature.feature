Feature: add giftcard to cart
Scenario: adding giftcard to cart from home page
Given User is on home page
When user clicks on giftcards 
And clicks on add to cart 
Then giftcard should successfully added to cart

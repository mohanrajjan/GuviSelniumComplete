Feature: Login
Scenario: Check login with valid credentials
#here @before hook will be run from stepdefinition file 

When  user enters "testuser1" and "Test@124"
And user clicks on Rediff.com link
Then user is navigated to "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus"

#@after hook would run to close the browser

Scenario: Check login with invalid credentials
#here @before hook will be run from stepdefinition file 

When  user enters "testuser1" and "Test@124"
And user clicks on Rediff.com link
Then user is navigated to "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus"

#@after hook would run to close the browser
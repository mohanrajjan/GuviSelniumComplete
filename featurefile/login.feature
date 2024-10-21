Feature: Login
Scenario: check with login credentials
Given user is on the login page
When user enters "testuser1" and "Test@124"
And user clicks Rediff.com links
Then user is navigated to "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus"

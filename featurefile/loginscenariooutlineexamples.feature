Feature: Login
Scenario Outline: Check login with valid credentials
Given user is on the login page 
When  user enters <username> and <password>
And user clicks on Rediff.com link
Then user is navigated to "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus"

Examples:
|username|password|
|Test1|psw1|
|Test2|psw2|
|Test3|psw6|
|Test4|psw4|
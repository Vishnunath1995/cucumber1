Feature: Verify the login functionality for opensource-demo.orangehrmlive.com

Scenario: Verify the Login Feature with valid creditials
Given user should be entering the valid login page 
When user enter the valid username and valid password
|Admin|admin123|
Then user clicked on login button 
And user landing on the valid page 

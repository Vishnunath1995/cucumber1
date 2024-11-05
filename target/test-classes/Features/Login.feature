
      Feature: Verify the face book login functionality
      
      
      Scenario Outline: Verifty the login with Valid feaure with invalid username and password
      
      Given user should be entering the valid login page 
      When the user check login function with invalid "<username>" and "<password>"
      Then user clicked on login button
      And user navigate to error login page 
      
      Examples: 
      |username|password|
      |admin1|1234|
      |admin2|12345|
      |admin3|78945|
      
     Scenario: Verify the login page with valid credintials
       
      Given the user should be entered into valid login page
      When user fill the valid username "Admin" password "admin123"
      Then user should click the login button
      And user navigate to the valid page 
      
       
   
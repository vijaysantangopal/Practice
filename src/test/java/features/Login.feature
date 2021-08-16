Feature: Application Login

Scenario: Home Page Default login
 
Given User is on Net Banking Landing page
When User login to application with username and password
Then Home Page is populated 
And Cards are displayed 
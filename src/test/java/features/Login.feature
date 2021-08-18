Feature: Application Login

Scenario: Home Page Default login
 
Given Initialize the browser with chrome 
And Navigate to Amazon Site
When User clicks on SignIn
And Enter Username and click on Continue
And Enter Password and click on SignIn Button
Then Navigate to Login screen 

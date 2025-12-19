Feature: Verifying omrbranch login
Scenario Outline: Verifying omr login
Given User is on the omr page
When User enter userName and password
And User clicks the login button
Then User should verify after success login message


Scenario Outline: Verifying facebook login 
Given User is on the omr page
When User enter userName and password
And User clicks the login button
Then User should verify after success login message
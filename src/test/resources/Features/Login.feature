Feature: Verifying omrbranch login
@Reg
Scenario Outline: Verifying valid credentials
Given User is on the omr page
When User enter "<userName>" and "<password>"
And User clicks the login button
Then User should verify after success login message
Examples:
|userName|password|
|Surya|surya@123|
|Sarath|Sarath@123|
|Balaji|Balaji@123|
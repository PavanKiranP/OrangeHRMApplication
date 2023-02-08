Feature: OrangeHrm Application Functionality Test
Background:
#Given User Should Open Chrome Browser in the system
#tag
@Smoke
Scenario: OrangeHRM Application LogIn Page Text
#Given User Should Open Chrome Browser in the system
When User enters OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn Page
#Then User should close the OrangeHrm Application with the Browser


#tag
@Smoke @Sanity
Scenario: OrangeHRM Application LogIn Functionaly Test with TestData
#Given User Should Open Chrome Browser in the system
When User enters OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn Page
Then User should enter userName and password and click on loginButton
Then User should be navigated to OrangeHRM Application Home Page
Then User should logout of the OrangeHRM Application
#Then User should close the OrangeHrm Application with the Browser

#tag
@LogInFunctionalitywithMultipleTestData
Scenario Outline: OrangeHRM Application LogIn Functionaly Test with multiple TestData
#Given User Should Open Chrome Browser in the system
When User enters OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn Page
Then User should enter "<UserName>" and "<Password>" and click on loginButton
Then User should be navigated to OrangeHRM Application Home Page
Then User should logout of the OrangeHRM Application
#Then User should close the OrangeHrm Application with the Browser
Examples:
|	UserName	|	Password	|
|Pavankiran	|Pavan@1919	|
|varalakshmi|vara				|
|naveen			|naveen			|
|Pavankiran	|Pavan@1919	|
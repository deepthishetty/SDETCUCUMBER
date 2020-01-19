Feature: Login to Application
 Background: Below are initial steps
 Given User Launch Chrome browser
 Then User enters URLS as "https://admin-demo.nopcommerce.com/login"
@sanity
Scenario: Successful Login with valid credentials

And User enters email as "admin@yourstore.com" and password as "admin"
And Click on login
Then Page Title should be "Dashboard / nopCommerce administration"
When user click on Log out link
Then Page Title should be "Your store. Login"
And close the browser

@regression
Scenario Outline: Successful Login data driver

And User enters email as "<email>" and password as "<password>"
And Click on login
Then Page Title should be "Dashboard / nopCommerce administration"
When user click on Log out link
Then Page Title should be "Your store. Login"
And close the browser
Examples:
|email|password|
|admin@yourstore.com|admin|
|admin1@yourstore.com|admin123|

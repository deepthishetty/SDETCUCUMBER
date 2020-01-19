Feature: Orange HRM Login
@sanity
Scenario: Logo present on ORange HRM page
Given I launch chrome browser
When I open Orange HRM home page
Then I verify logo presnt on the home page
And close browser
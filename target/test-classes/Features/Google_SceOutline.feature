Feature: To Automate Google Search

Scenario Outline: To verify search functionality with "<SearchText>" as Search Text

Given the user launches the google url
Then the user verifies the google logo
When the user enters "<SearchText>" in google search bar
And the user clicks on keyboard enter key
Then the user verifies the google search result

Examples:
|SearchText|
|Selenium|
|Java|
|Python|
|Cucumber|

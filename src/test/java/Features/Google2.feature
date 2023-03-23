Feature: To Automate Google Search

Scenario: To verify search functionality with Selenium as Search Text

Given the user launches the google url
Then the user verifies the google logo
When the user enters "Selenium" in google search bar
And the user clicks on keyboard enter key
Then the user verifies the google search result

Scenario: To verify search functionality

Given the user launches the google url with Java as Search Text
Then the user verifies the google logo
When the user enters "Java" in google search bar
And the user clicks on keyboard enter key
Then the user verifies the google search result

Scenario: To verify search functionality with Cucumber as Search Text

Given the user launches the google url
Then the user verifies the google logo
When the user enters "Cucumber" in google search bar
And the user clicks on keyboard enter key
Then the user verifies the google search result

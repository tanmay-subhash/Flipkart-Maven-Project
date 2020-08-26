Feature: Test Flipkart login functionality

Scenario: Unsuccessful login to flipkart
Given Flipkart Website is loaded
When User enters username and password
Then Login should not be successful and Verify error message

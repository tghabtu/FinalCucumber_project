@Feature*
Feature:  Background color change Functionality

Background:
Given 	  background color change in the provided url page

Scenario: Sky Blue Background color change

When  Set skyBlue Background button exists
When  I click on the button
Then  	The background color will change to sky blue

Scenario: Whiten Background color Change

When  Set sky white Background button exists
When  I click on the button
Then    the background color will change to white  
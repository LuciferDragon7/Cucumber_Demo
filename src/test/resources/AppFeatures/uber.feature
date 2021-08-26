
@All
Feature: Uber Booking Feature

@Smoke @Prod
Scenario: Booking cab with Sedan
Given User wants to select a car type "sedan" from uber application
When User select car "sedan" and pick up location "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Regression
Scenario: Booking cab with SUV
Given User wants to select a car type "suv" from uber application
When User select car "suv" and pick up location "Bangalore" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Prod
Scenario: Booking cab with Mini
Given User wants to select a car type "mini" from uber application
When User select car "mini" and pick up location "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD


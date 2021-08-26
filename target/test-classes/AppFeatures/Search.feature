
Feature: Amazon Search

@Smoke
Scenario: Search a product MacBook AIr
Given I have a search field on Amazon
When I search for a product with name "Apple MacBook Pro" and price 1000
Then Product with name "Apple MacBook Pro" should be displayed
Then Order with price 1000 andd username with "Drag" is displayed


@Regression
Scenario: Search a product Iphone12
Given I have a search field on Amazon
When I search for a product with name "Iphone12" and price 1200
Then Product with name "Iphone12" should be displayed
Then Order with price 1200 andd username with "Drag1" is displayed
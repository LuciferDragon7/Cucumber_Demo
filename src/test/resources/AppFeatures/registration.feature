Feature: User Registration

Scenario: User registration with different data
 Given User is on registration page
 When user enters the following details
   |Drag|Dra|drag@gmail.com|12345|London|
   |Sam|Sas|sam@gmail.com|11412|NY|
   |Tom|Dean|dean@gmail.com|21552|Boston|
 Then Registration should be successful  
 
 
 Scenario: User registration with different data with columns
 Given User is on registration page
 When user enters the following details with columns
   |firstname|lastname|email|phone|city|
   |Drag|Dra|drag@gmail.com|12345|London|
   |Sam|Sas|sam@gmail.com|11412|NY|
   |Tom|Dean|dean@gmail.com|21552|Boston|
 Then Registration should be successful  
Feature: To Test The Adactin Hotal Booking Application
Scenario: Check the login Functionality

Given  launch The Adactin Hotal Booking Application Url
When user Enter The Username In The Username Field
And user Enter The password In The Password Field
Then user Click The Loginbutton and To Check The Search Hotal Page

Scenario:  To Check The Search Hotel page

When  user Should Select The Location In The Location Field
And  user Should Select The DesiredHotel In THe Hotels Field
And  user Should Select The Roomtype In THe Roomtype Field
And  user Should Select The Number Of Rooms In THe Number Of Rooms Field
And  user Should Enter The Checkin Date In THe Checkin Date Field
And  user Should Enter The Checkout Date In THe CheckOut Date Field
And  user Should Select The Adults In THe Adults Count Per Room Field
And  user Should Select The childrens count In THe Childfrens Per Room Field
And  user Should Select The Hotel In THe Hotels Field
Then user Should Click The Search button 


Scenario: To Check The Select Hotel Page Functionality

When user Should Click The Hotel Page 
Then user Should Click The  Continue button

Scenario:  To Check The Booking Page

When  user Should Insert The First Name
And  user Should Insert The Last Name
And user Should Insert The Billing Address
And user Should Insert The Credit Card Number
And user Should Select The Credit Card Type
And user Should Select The Expiry Date Month
And user Should Select The Expiry Date Year
And user Should Insert The CVV Number
Then user Should Click The BookNow button 


Scenario: To Check The Logout Page

Then user Should Logout
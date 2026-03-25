# Feature: Login Functionality

#Scenario Outline: Performing Login Functionality

# Given Navigating to the webpage
# And Enter item name as "<items>"
 # When Click Search
# Then Show Results

# Examples:
# |	username	|	password	|
# |	mobile		|	bgcbg		|
# |	tv			|	jhgvkjhgv	|
# |	books		|	jhygfvjhv	| 

Feature: Banking Login

  Scenario: Valid login
    Given user is on login page
    When user enters username and password
    Then user should see dashboard


Feature: This feature file talks about the Home page related scenarios are rewed


#  Enter only Home page related scenarios. I shouldn't enter other page scenarios.

  Background: This gets executes before each and every scenario
    Given Refresh the page

  Scenario: Login to the application with valid username and valid password
    Given Launch the application
    When User clicks on SignIn
    And Enters valid username and password
    Then User has to be taken to the home page
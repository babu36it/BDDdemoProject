Feature: This feature file talks about the Home page related scenarios


#  Enter only Home page related scenarios. I shouldn't enter other page scenarios.

#  Background: This gets executes before each and every scenario
#    Given Refresh the page

  @functionalSuite
  Scenario: Login to the application with valid username and valid password
    Given Launch the application
    When User clicks on SignIn
    And Enter valid username
#    Then User has to be taken to the home page
#
#  @smokeSuite
#    Scenario Outline: Login to the application with valid username and valid password
#      Given Launch the application
#      When User clicks on Sign-In
#      And Enters valid <UserName> and <Password>
#      Then User has to be taken to the home page
#      Examples:
#      |UserName| Password|
#      |Kalyan  |kalyan@123|
#      |Suresh | Suresh@123|
#      |Harish | Harish@123|
#
#    @functionalSuite
#      Scenario:
#
#
#        Scenario:
#
#
#          Scenario:

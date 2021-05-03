Feature: feature to Login functionality for leaftaps application

  Background: 
    Given open the chrome browes
    And load the application url
    And Maximize the browser
    And apply wait

  Scenario Outline: TC_001 To test Login Functionality Positive flow
    And enter the username as <username>
    And enter the password as <password>
    When clcik login button
    Then display home page

    Examples: 
      | username         | password |
      | demosalesmanager | crmsfa   |

  Scenario: TC_001 To test Login Functionality Negative flow
    And enter the username as demosalesmanager
    And enter the password as crmsfa
    When clcik login button
    But Display error message

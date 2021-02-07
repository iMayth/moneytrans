Feature: mobile top up gambia
@wip
  Scenario: go to the services page of the website
    Given the user is on services page after log in
    When the user clicks on mobile top up
    Then the user should be able to click on check promotions
    When the user clicks on prices by country from sidebar
    Then the user should be able to search for gambia
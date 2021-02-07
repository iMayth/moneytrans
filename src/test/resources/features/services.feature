Feature: mobile top up nicaragua
@wip
  Scenario: go to the services page of the website
    Given the user is on services page after log in
    When the user clicks on mobile top up
    Then the user should be able to click on check promotions
    When the user searches for nicaragua
    Then the user should be able to click on read more
    And the user should be able to see full size of read more page on mobile
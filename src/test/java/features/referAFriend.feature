Feature: referAFriend

  @referAFriend
  Scenario: As a registered user I should able to refere a product to friend
    Given I am on homepage
    When I select a build your own computer
    And I select mail
    Then I should be able to refer to friend

Feature: Login feature

  @smoke @test
  Scenario: Login as a librarian
    Given I am on the login page
    When I login as a librarian
    Then dashboard should be displayed

  @test
  Scenario: Login as a student
    Given I am on the login page
    When I login as a student
    Then books should be displayed


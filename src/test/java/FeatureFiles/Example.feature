Feature: Example Feature Functionality

  @Smoke @Regression
  Scenario: Login successfully
    Given Navigate to website
    When Enter username and password from excel
    Then Verify login successfully

   @Regression
   Scenario: Select the functionalities
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |
@E2E_ProMart
Feature: Promart Add To Car
  A user will add products to the shopping cart

  @TestCase1 @ShoppingCart1
  Scenario: The user add products to the shopping cart

    When The user select a product of list of new
    And The user goes to shopping cart
    Then Verify that the user have a products in the shopping cart
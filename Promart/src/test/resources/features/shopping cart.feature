Feature: Promart Add To Car
  A user will add products to the shopping cart


  Scenario: The user add products to the shopping cart

    When The user select a  product of list of new
    And she goes to shopping cart
    Then  verify that the user have a products in the shopping cart
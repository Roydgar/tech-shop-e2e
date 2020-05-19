Feature: Product List

  Scenario: Verify the product list
    Given user opens the tech shop website
    When user opens "Products" tab on toolbar

    Then user sees "Samsung Galaxy" product
    And user sees "Iphone 11" product


Feature: Product List

  Scenario: Verify the product list
    Given user opens the tech shop website

    When user opens "Products" tab on toolbar
    Then user sees "Samsung Galaxy" product

    When user views "Samsung Galaxy" product info
    Then user sees "Samsung Galaxy" product info


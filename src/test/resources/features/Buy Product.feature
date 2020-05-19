Feature: Buy product

  Scenario: Verify adding to the cart
    Given user opens the tech shop website
    When user opens "Products" tab on toolbar

    Then user sees "Samsung Galaxy" product
    And user buys "Samsung Galaxy" product

    When user opens "Cart" tab on toolbar
    Then user sees "Samsung Galaxy" product in the cart

    When user proceeds checkout
    Then user sees "Process Order" headline

    When user enters "Vitia" name
    And user enters "Ivan@gmail.com" email
    And user confirms checkout

    Then user sees order by "Ivan@gmail.com" consumer email


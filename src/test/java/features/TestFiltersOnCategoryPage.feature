Feature: Amazon Category Page testing

  Scenario Outline: Using filters

    When select any subcategory in "Department"
    And select rating no less than 3 stars in "Avg. Customer Review"
    And check any box in "Featured Brands"
    And select range by <price> in "Price"

    Examples:
      | price |
      | 10 |

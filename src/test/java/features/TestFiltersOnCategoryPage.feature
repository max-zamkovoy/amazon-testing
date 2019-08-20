Feature: Amazon Category Page testing

  Scenario Outline: Using filters

    When select any subcategory in "Department"
    And select rating no less than 3 stars in "Avg. Customer Review"
    And check <brand> box in "Featured Brands"
    And select any range in "Price"
    And input range in "Price"
    Then breadcrumbs have been updated

    Examples:
      | brand |
      | Samsung |
      | HP |
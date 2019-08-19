Feature: Amazon Category Page testing

  Scenario: Using filters

    When select any subcategory in "Department"
    And select rating no less than 3 stars in "Avg. Customer Review"
    And check first box in "Featured Brands"
    And select any range in "Price"
    And input range in "Price"
    Then breadcrumbs have been updated
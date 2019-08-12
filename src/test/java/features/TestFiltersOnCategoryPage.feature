Feature: Amazon Category Page testing

  Scenario: Using filters

    When select any subcategory in "Department"
    And select rating no less than 3 stars in "Avg. Customer Review"
    And check any box in "Featured Brands"

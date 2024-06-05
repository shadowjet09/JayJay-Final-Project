Feature: Test Automation Web

  @web
  Scenario: Test login web normal
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage

  @web
  Scenario: Test login with locked out user
    Given open web login page
    And user input username "locked_out_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see err message "user has been locked out"

  @web
  Scenario: Test login with invalid username and password
    Given open web login page
    And user input username "standard_user"
    And user input password "passwordngasalajaini"
    And user click login button
    And user will see err message "Username and password do not match"

  @web
  Scenario: Test login web add to cart
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "3"

  @web
  Scenario: Test login web remove from cart
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "3"
    And user remove item from cart
    Then verify cart item is match "2"

  @web
  Scenario: Test web sort Z to A
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    Then user will see icon cart in homepage
    And user click sort item Z to A

  @web
  Scenario: Test checkout process
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    Then verify cart item is match "1"
    And user click cart icon
    Then user verify see checkout button
    And user click checkout button
    And user input first name "Kezia"
    And user input last name "Susanto"
    And user input postal code "39515"
    And user click continue button
    Then user verify see finish button
    And user click finish button
    Then user verify see thank you page
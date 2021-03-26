Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And new user clicks on create account
    And a new user registers 
    Then user signs out successfully
    
    
    Scenario: Signin a registered user
    
     Given user is  on homepage
    When user navigates to Login Page
    And user enters valid credentials
    Then user is logged in successfully
    

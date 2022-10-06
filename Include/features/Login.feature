#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login
Feature: Login Kemenag
  As a user kemenag provinsi, i want to login to EMIS System
  so that i can go to dashboard page

  @Valid
  Scenario Outline: Login with a valid credential Akun Kemenag Provinsi Kristen
    Given I want to navigate to EMIS System Homepage
    When I click login button
    And I click Kristen button
    And I enters <username> and <password>
    And I click captcha chekbox
    And I click on captcha image
    And I click Login button
    Then I shouldbe able to dashboard page

    Examples: 
      | username                          | password   |
      | kemenag_prov_dki_kristen@emis.com | R3l3Ase!23 |

  @InValid
  Scenario Outline: Login with a invalid credential Akun Kemenag Provinsi Kristen
    Given I want to navigate to EMIS System Homepage
    When I click login button
    And I click Kristen button
    And I enter invalid username <username> and password <password>
    And I click captcha chekbox
    And I click on captcha image
    And I click Login button
    Then Pop up alert be displayed

    Examples: 
      | username                          | password     |
      | kemenag_prov_dki_kristen@emis.com | R3l3Ase!2333 |
      
  @ValidKatolik
  Scenario Outline: Login with a valid credential Akun Kemenag Pusat Katolik
    Given I want to navigate to EMIS System Homepage
    When I click login button
    And I click Kristen button
    And I enter invalid username <username> and password <password>
    And I click captcha chekbox
    And I click on captcha image
    And I click Login button
    Then Pop up alert be displayed

    Examples: 
      | username                          | password     |
      | kemenag_provinsi_dki_katolik@emis.com | R3l3Ase!2333 |
      
      
  @InValidKatolik
  Scenario Outline: Login with a invalid credential Akun Kemenag Pusat Katolik
    Given I want to navigate to EMIS System Homepage
    When I click login button
    And I click Kristen button
    And I enter invalid username <username> and password <password>
    And I click captcha chekbox
    And I click on captcha image
    And I click Login button
    Then Pop up alert be displayed

    Examples: 
      | username                          | password     |
      | kemenag_provinsi_dki_katolik@emis.com | R3l3Ase!2333 | 

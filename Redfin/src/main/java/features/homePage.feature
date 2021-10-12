Feature: Aetna home page  Feature

#    test case2
 @regression
  Scenario: Aetna search test case
    Given i am at the home page of aetna
    When i click on search button
    Then i should be able to enter and search
 # test case 3: use test data(this test has 6 test cases)

  Scenario Outline: search list of items test case
    Given i am at the same home page of aetna
    When i click on search field
    Then i should be able to search "<items>"
    Examples:
    |items|
    |medicaid|
    |senior benefits|
    |health insurance|
    |retirement|
    |retirement plan|
    |payments       |
    |sign up        |
# test case 9:
  Scenario: Aetna footer test case
    Given user is at home page of aetna
    When user scrolls down to aetna apps
    Then user should be redirected to aetna apps page
#test case 10

  Scenario: Aetna footer2 test case
    Given user is at home page of Aetna
    When user scrolls down to Faqs
    Then user should be redirected to Faqs page
    #test case 11

  Scenario: Aetna footer3 test case
    Given user is at home Page of Aetna
    When user scrolls down to glossary
    Then user should be redirected to glossary page
    #test case 12

  Scenario: Aetna footer4 test case
    Given user is at Home Page of Aetna
    When user scrolls down to accessibility serrvice
    Then user should be redirected to accessibility service  page
    #test case 15

  Scenario: Aetna footer5 test case
    Given user is At Home Page of Aetna
    When user scrolls down to plan disclosure
    Then user should be redirected to plan disclosure  page
    #test case 16

  Scenario: Aetna footer6 test case
    Given user is AT Home Page of Aetna
    When user scrolls down to program provision
    Then user should be redirected to program provision  page
    #test case 17

  Scenario: Aetna footer7 test case
    Given user is AT Home Page Of Aetna
    When user scrolls down to state directory
    Then user should be redirected to state directory  page
    #test case 18

  Scenario: Aetna footer8 test case
    Given user is AT Home Page OF Aetna
    When user scrolls down to grieve Forms
    Then user should be redirected to grieve Forms  page
    #test case 19 HealthCareReform

  Scenario: Aetna footer9 test case
    Given user is AT Home Page OF AEtna
    When user scrolls down to Health Care Reform
    Then user should be redirected to Health Care Reform  page
    #test case 20 NewsAndAnalysis
#  @sanity
  Scenario: Aetna footer10 test case
    Given user is AT Home Page OF AETna
    When user scrolls down to News And Analysis
    Then user should be redirected to News And Analysis  page
#test case 21

  Scenario: Aetna footer11 test case
    Given user is AT Home Page OF AETNa
    When user scrolls down to investor Info
    Then user should be redirected to investor Info  page
#test case 22

  Scenario: Aetna footer12 test case
    Given user is AT Home Page OF AETNA
    When user scrolls down to site map
    Then user should be redirected to site map  page
    #test case 23

  Scenario: Aetna footer13 test case
    Given user Is AT Home Page OF AETNA
    When user scrolls down to terms of use
    Then user should be redirected to terms of use  page
    #test case 24

  Scenario: Aetna footer14 test case
    Given user IS AT Home Page OF AETNA
    When user scrolls down to legal notices
    Then user should be redirected to legal notices  page
    #test case 25

  Scenario: Aetna footer15 test case
    Given user IS AT Home PAge OF AETNA
    When user scrolls down to privacy center
    Then user should be redirected to privacy center  page


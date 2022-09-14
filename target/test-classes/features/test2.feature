Feature: test

Scenario: open google home page
  Given open google
  Then  google is open
  When I click on accept
  Then I enter the url as "Serenity/JS"

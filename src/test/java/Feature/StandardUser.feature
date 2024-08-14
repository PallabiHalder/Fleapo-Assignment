Feature: Create a post as a standard user

  Scenario: Standard user logs in and creates a new post with a custom time
    Given I am logged in as a standard user
    When I click on the "New Post" button
    And I navigate to "Free Post"
    And I write a post with caption "This post is done by [Your Name] through automation"
    And I select the custom date-time "1st September 2024 3:30 PM"
    And I post it to my profile
    Then I should see the post on my profile



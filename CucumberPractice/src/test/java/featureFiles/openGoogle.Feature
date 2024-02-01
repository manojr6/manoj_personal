Feature: 'When I go to the Google search page, and search for an item,
  I expect to see some reference to that item in the result summary.'

  Scenario Outline: Google search
    Given that I have gone to the Google page
    When I add "<value>" to the search box
    And click the Search Button
    Then "<value>" should be mentioned in the results

    Examples: 
      | value |
      | dogs  |


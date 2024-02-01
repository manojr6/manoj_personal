Feature: 'When I try to login, page should get logged in and title should display,
  I expect to see page logged in with URL.'

  Scenario Outline: Check LOGIN
    Given that I have gone to the OPENHRM page
    When I give username as "<username>"
    When I give password as "<password>"
    And click the Submit Button
    Then login should happen and "<expectedURL>" should get fecthed correctly in the page

    Examples: 
      | username | password   | expectedURL                                                             |
      | Admin12  | admin123   | https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index |
      | Admin    | admin123   | https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index |
      | Admin44  | admin123   | https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index |
      | Admin    | admin12367 | https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index |
      | Admin23  | admin123   | https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index |

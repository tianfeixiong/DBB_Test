@bingdingRelationship
Feature: test login_test

  Scenario:The merchant binds the supplier to the buyer relationship that does not exist between a single system, and the binding is successful
    Given logon "environments_1" on tube by inputting system
    When I click Customers and select Customers Mapping
    Then I should direct to the Customers Mapping page
    When I click Search company box on the Customers Mapping page
    And I input "b1" in the Search company box
    When I click Edit button on the page
#    Then I should direct to the create new counterparty page
    When I click delete on the Downstream Company page
#    Then I should direct to the create new counterparty page
    When I click Create New Counter button on the page
    Then I should see Counter Windows
#    When I click Counter Name BOX on the Counter Windows page
    When I click Email in the Counter Name box
#    When I input "s4@qq.com" in the Counter Name box
    When I click Downstream Company Button on the Counter Name box
    And I click Confirm Button on the Counter Name box
    Then I should direct to the create new counterparty page




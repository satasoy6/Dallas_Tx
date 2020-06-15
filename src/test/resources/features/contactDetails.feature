#Author Seyma Atasoy atasoyseyma@yahoo.com
#team= Dallas_Tx

Feature: Change Employee's contact details

  @story1
  Scenario: user should be able to change employee's contact details
    Given user is logged with valid admin credentials
    And navigate to employee list
    Then admin search employee "Bradley Cooper"
    Then click on contact details
    And click on edit and enter contact details
    And click on save

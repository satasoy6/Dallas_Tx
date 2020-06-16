#Author Seyma Atasoy atasoyseyma@yahoo.com
Feature: Add Employee Emergency Contact

  Background: 
    And user is logged with valid admin credentials
    And navigate to employee list

  @story2
  Scenario Outline: Add Employee Emergency Contact
    And user search Employee "<Id>"
    Then click on Emergency Contacts
    Then click on Add button
    When user add information "<Name>","<Relationship>","<HomeTelephone>","<Mobile>","<WorkTelephone>"
    Then click on save button

    Examples: 
      | Id    | Name  | Relationship | HomeTelephone | Mobile      | WorkTelephone |
      | 11142 | Aisha | wife         | 7483903837464 | 64839393903 |  372372382982 |

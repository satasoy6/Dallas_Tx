$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EmergencyContact.feature");
formatter.feature({
  "name": "Add Employee Emergency Contact",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add Employee Emergency Contact",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@story2"
    }
  ]
});
formatter.step({
  "name": "user search Employee \"\u003cId\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on Emergency Contacts",
  "keyword": "Then "
});
formatter.step({
  "name": "click on Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "user add information \"\u003cName\u003e\",\"\u003cRelationship\u003e\",\"\u003cHomeTelephone\u003e\",\"\u003cMobile\u003e\",\"\u003cWorkTelephone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on save button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Id",
        "Name",
        "Relationship",
        "HomeTelephone",
        "Mobile",
        "WorkTelephone"
      ]
    },
    {
      "cells": [
        "11142",
        "Aisha",
        "wife",
        "7483903837464",
        "64839393903",
        "372372382982"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.Project.steps.ContactDetailsSteps.user_is_logged_in_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "And "
});
formatter.match({
  "location": "com.Project.steps.ContactDetailsSteps.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee Emergency Contact",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@story2"
    }
  ]
});
formatter.step({
  "name": "user search Employee \"11142\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.Project.steps.AddemergencyContactSteps.user_search_Employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Emergency Contacts",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Project.steps.AddemergencyContactSteps.click_on_Emergency_Contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Project.steps.AddemergencyContactSteps.click_on_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add information \"Aisha\",\"wife\",\"7483903837464\",\"64839393903\",\"372372382982\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.Project.steps.AddemergencyContactSteps.user_add_information(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Project.steps.AddemergencyContactSteps.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Add Employee Emergency Contact");
formatter.after({
  "status": "passed"
});
});
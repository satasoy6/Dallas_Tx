$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/contactDetails.feature");
formatter.feature({
  "name": "Change Employee\u0027s contact details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to change employee\u0027s contact details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@story1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
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
formatter.step({
  "name": "admin search employee \"Bradley Cooper\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Project.steps.ContactDetailsSteps.search_by_employee_name_and_click_on_search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on contact details",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Project.steps.ContactDetailsSteps.click_on_contact_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on edit and enter contact details",
  "keyword": "And "
});
formatter.match({
  "location": "com.Project.steps.ContactDetailsSteps.click_on_edit_and_enter_contact_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save",
  "keyword": "And "
});
formatter.match({
  "location": "com.Project.steps.ContactDetailsSteps.click_on_save()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "user should be able to change employee\u0027s contact details");
formatter.after({
  "status": "passed"
});
});
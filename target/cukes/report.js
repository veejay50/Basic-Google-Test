$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/infoplus/grc/accelus/regint/bdd/google/google.feature");
formatter.feature({
  "line": 2,
  "name": "Create login without username for google",
  "description": "AS A User\nI WANT TO to signup without username on googlemail \nSO THAT an error is displayed",
  "id": "create-login-without-username-for-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@google"
    }
  ]
});
formatter.before({
  "duration": 428490702,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "A user try to signup without username to see an error message",
  "description": "",
  "id": "create-login-without-username-for-google;a-user-try-to-signup-without-username-to-see-an-error-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on Google mail signup page and enter all details except username",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on a button to navigate to next page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "an error is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStepDef.clicksTextEntryOnGoogle()"
});
formatter.result({
  "duration": 15537312471,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDef.I_click_on_a_button_to_navigate_to_next_page()"
});
formatter.result({
  "duration": 2686928687,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDef.an_error_is_displayed()"
});
formatter.result({
  "duration": 3036746927,
  "status": "passed"
});
formatter.after({
  "duration": 78350,
  "status": "passed"
});
});
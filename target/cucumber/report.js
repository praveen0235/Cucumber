$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/WorkSpace/cucumber/src/main/java/feature/config.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the login functionality",
  "description": "",
  "id": "testing-the-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing with valid credentials and testing it",
  "description": "",
  "id": "testing-the-login-functionality;testing-with-valid-credentials-and-testing-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "navigate to the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter the company username password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionFile.navigate_to_the_url()"
});
formatter.result({
  "duration": 59538129645,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionFile.enter_the_company_username_as_password_as()"
});
formatter.result({
  "duration": 30588576934,
  "status": "passed"
});
});
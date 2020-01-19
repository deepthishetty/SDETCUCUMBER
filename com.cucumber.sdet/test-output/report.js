$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Login.feature");
formatter.feature({
  "name": "Login to Application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are initial steps",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters URLS as \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_opens_URL_https_admin_demo_nopcommerce_com_admin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User enters email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Login.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Log out link",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login.closebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Feature/OrangeHRM.feature");
formatter.feature({
  "name": "Orange HRM Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Logo present on ORange HRM page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMlogin.i_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Orange HRM home page",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMlogin.i_open_Orange_HRM_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify logo presnt on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMlogin.i_verify_logo_presnt_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMlogin.close_browser()"
});
formatter.result({
  "status": "passed"
});
});
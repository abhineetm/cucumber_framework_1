Feature: Login Test Feature

@smoke 
Scenario Outline: Login with valid credential


When Enter UN "<UN>"
And Enter PWD "abh!neetM7890"
And Click on Submit
Then Redirect to Home page

Examples:
|UN|
| abhineetmishra01@gmail.com |



















@regression
Scenario Outline: Login with invalid credential

When Enter UN "<UN>"
And Enter PWD "wrong pwd"
And Click on Submit
Then Redirect to Home page

Examples:
|UN|
| wrong UN |

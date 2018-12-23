Feature: Login Test Feature

@smoke 
Scenario Outline: With valid credentials

When Enter UN "<UN>"
And Enter PWD "abh!neetM7890"
And Click on Submit
Then Redirect to Home page

Examples:
|UN|
| abhineetmishra01@gmail.com |

#@regression
Scenario Outline: With invalid credentials

When Enter UN "<UN>"
And Enter PWD "wrong pwd"
And Click on Submit
Then Redirect to Home page

Examples:
|UN|
| wrong UN |

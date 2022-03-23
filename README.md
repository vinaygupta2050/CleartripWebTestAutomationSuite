# Cleartrip App Test Automation Framework

## Getting Started

Below is the project structure
- src/test/java : This directory is the heart of framework and it has some major component of framework
-   object: In this package all the web elements of application page are stored.
-   pages : In this package all the application pages and their respective actions are written
-   utils : In this package contains different utility which we can use while we are writing our auomation test like wait function, Different file operation
-   resources : This consist of config.properties file where all the application url and test user are present and testng.xml file which we use to run our automation test
-   listeners : This consist of all the test listeners which needs to be executed on certain actions
-   tests     : This directory where we write our test.
-   screenshot : This directory is responsible for storing failed test case screenshot after run
### Prerequisites

Please download below applications and jar before we run our framework

```
-   JDK 1.8 or higher
-   maven
```


## Running the tests

To Run from IDE
-   Simply navigate to "testng.xml".
    Right click on the file and select option Run to the test

To Run from command-line
-   In the project directory use "mvn clean test" command to start execution

## After run of test
Below directory are usefull after running the test
- target/surefire-reports/index.html : Under this directory we can find plain testng reports
- screenshot: All the screenshot for failed test can be found here

### Break down into end to end tests

The scenarios which I have tried to cover and present in below files
- ClearTripSearchFlightHappyPathTest - Positive Cases
- ClearTripSearchFlightValidationTest - Negative Cases

```
-   Verify whether user is able to book a one way flight on the same date.
-   Verify whether user is able to book a one way flight on the future date.
-   Verify whether user is able to book a one way flight with maximum number of passenger i.e 9
-   Verify whether user is able to book a one way flight with maximum number of passenger i.e 9 which includes 7 adult and 2 children
-   Verify error message is displayed if user try to search flight with invalid location.
-   Verify error message is displayed if user try to search flight with same location.
-   Verify user should not be able to search flight on the basis of past date
```

### And coding style tests

I have used testNG and its annotation to write the automation test


## Authors

* **Vinaykumar Gupta**


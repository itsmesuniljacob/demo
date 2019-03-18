## DevOps CI Pipeline

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.example.workshop%3Ademo&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.example.workshop%3Ademo)
[![codecov](https://codecov.io/gh/xylene1980/demo/branch/master/graph/badge.svg)](https://codecov.io/gh/xylene1980/demo)

The objective of this repo is to demonstrate a role model pipeline for continuous integration. Continuous
integration is a practice where developers are required to integrate code into a shared repository
several times a day. While developers integrate code in shared repository, there should some quality
checks that has to be performed to the code, before bad regressions gets promoted to the next level.

Some of the toll gates used in this practice are mentioned as below:

* Unit testing of code at developer(s) machine
* Raise PR for you follow four eyes principle
* Do mandatory like ( unit testing, build ) using CI server

The CI server used in this demo is **Travis** . For build information, click [here][1]

**Sonarcloud** is used to inspect continuously the quality of source code and detect bugs, 
vulnerabilities, and code smells. The report could be found [here][3]

**CodeCov** tool is used to determine what lines of code were executed by their tests. Codecov is used 
investigate methods and statements in your code that are not tested to help guide you on where to 
write your next test and increase the coverage. The report for this repo can be found [here][2]
 

[1]: https://travis-ci.org/xylene1980/demo
[2]: https://codecov.io/gh/xylene1980/demo
[3]: https://sonarcloud.io/organizations/xylene1980-github/projects
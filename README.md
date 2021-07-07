# Java Testing

## Table of Contents
* [General info](#general-info) 
* [Technologies](#technologies) 
* [Setup](#setup)
* [Extra information](#Extra)

------------
## General info

This repository contains files and summary of things learned in Testing Java course. The testing java course taught how to create a test class and name and perform tests in that class. It also taught how to simulate classes so we can force certain behaviors or results and make more comprehensive tests. The files created within different packages contain code that should be tested to ensure the code works fine to solve different problems. The paymets package has code for payments processing. The util package contains DateUtil class, used to determine if a year is leap or not leap, and the StringUtil class, used to repeat a given string a certain number of times. The player package contains files used to throw a dice and decide if you win according to the winstatement. Finally the movies package contains files to select, filter and add movies to a simulated database. Each scenario has its own testing class within the Tests directory.

------------
## Technologies

>- IntelliJ Idea
>- OpenJDK
>- JUnit
>- Mockito
>- H2DataBases
>- Spring

------------
## Setup
This project was made on a Windows 10 OS.

### IntelliJ IDEA 
1. Go to https://www.jetbrains.com/idea/download/ and download the Community version

### OpenJDK
1. Go to https://adoptopenjdk.net/ and download the following version:
    - OpenJDK 8

### JUnit
1. Copy the next code and insert it into the pom.xml file in the dependencies part of the code.
  -   `<dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
      </dependency>`

### Mockito
1. Copy the next code and insert it into the pom.xml file in the dependencies part of the code.
  - `<dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>2.23.4</version>
            <scope>test</scope>
    </dependency>`


### H2databases
1. Copy the next code and insert it into the pom.xml file in the dependencies part of the code.
  - `<dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>1.4.192</version>
     </dependency>`

### Spring
1. Copy the next code and insert it into the pom.xml file in the dependencies part of the code.
  - `<dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>5.1.3.RELEASE</version>
     </dependency>`

------------
## Extra

>- what is a test in java
>- the functions and advantage of the test in java
>- automatic test (fastest, reliability)
>- Types of test (Unitary, integration, functional, end to end, stress)
>- JUnit as a library
>- how to title test
>- how to write and run test
>- test workflow
>- Mockito as a library for simulate clases
>- Connection simulation of databases using h2databases
>- TDD test driven development
>- TDD cicle
>- 3 rules of TDD
>- Layers of apps (interface, business and data as database)
>- test for differents scenarios (happy path, extremes, incorrect, unforeseen

------------
### commands that i learned
|  Command | Function  |
| ------------ | ------------ |
|  Matches | It is used to know if it has a certain type of structure.  |
|  Throw New | for exception |
|  AssertEquals | for compare the result to the expected |
|  AssertTrue/False | is used for giving a statment true or false depending on the condition |
|  AssertThat | checks if a statement is true or false |
|  Random | gives you a random number |
|  NextInt | gives you a number between 0 and the limit you establish |
|  CoreMatchers | gives you the IS command for comparing if is true or false |
|  iter | makes it loop through all the values in the list (loop that loops through the list) |

# Mockito Example

## What is it?
Mockito is a mocking framework, JAVA-based library that is used for effective unit testing of JAVA application. 
It is used to mock interfaces so that dummy functionality can be added to a mock interface that can be used in unit testing.

## What you should know:
This is meant for Java Develoers, who would like to improve the quality of their software through unit testing and TDD
Readers must have working knowledge of Java in order to make the best of this. 

## What is Mocking? 

Mocking is a way to test functionality. 
It does not require a database connection or properties file read or file server read to test a functionlity. 
Mock objects do the mocking of the real service. It returns dummy data corresponding to some dummy input passed to it. 

## Benefits:
- No hand writing: no need to mock objects on your own 
- Refactoring Safe: Renaming interface method names or reordering parameters will not break the test code as Mocks are created at Runtime
- Return value support: Supports return values
- Exception Support
- Order check support: Checks on order of method calls
- Annotation Support: Creating Mocks using annotations

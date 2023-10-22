# venTest - October 2023
Test Automation regression

Repository: 	venTest 
Author: 	Diego Sillero

This repository contains just one project:
	- venTest/TestAutomation 
	  

venTest/TestAutomation:
=======================
	- Technologies:
		Project developed in Java in which 2 testcases specified in Gherkin, automated with Cucumber and executed with Maven
	- Description:
		Example project for automatic UI testing. It covers some functionalities with already reported issues for:
			https://test-form.vendon.net/
		It only provides coverage for executions on Windows with Firefox browser (integrates just 1 web driver)
	- System requirements:
		- Java 17
		- Maven
 		- Firefox v116 or higher
		- Windows 
	- How to execute:
		1. Download repository to local directory.
		2. Open project with an IDE (e.g IntelliJ IDEA)
		3. Run the starter: FunctionalTestSuit

		Alternatively:
		1. Open a console and navigate to venTest/TestAutomation
		2. Run "mvn test"

# Serenity_Selenium_Java_Cucumber_BDD_Sikuli_JUnit

This is an Web Automation Testing framework using:

	Serenity
	Selenium
	Cucumber BDD
	log4js
	Sikuli
	Maven
	JUnit

## Installation

Prerequisite:

	Java
	Editor
	Maven

Extensions in VS Code:

	Cucumber Eclipse Plugin
	Eclipse XML Editors and Tools
	JSON Editor Plugin
	Markdown Text Editor

All set!!! Just download the Project folder...

## Framework Structure

	src/test/java
	
		objects --> contains object locators
		
		pages --> contains Business Components
		
		runner --> contains test runner file (@CucumberOptions parameters)
		
		steps --> contains Step files (links business component files with the step definition files)
		
		tests --> contains Step Definition files
		
		Utility --> Contains custom utilities developed in the framework and are used globally across the framework
		
		      CommonFunctions --> contains custom methods to perform Selenium checks/actions
		
		      LoggerHelper --> Helper class for generating logs
	
	src/test/resources
	
		features --> contains cucumber feature files
		
		sikuli_Images --> contains images for Sikuli actions
		
		testData --> this folder contains test data files (json files preferred)
		
		webdriver --> stores drivers for browsers
		
		log4j.properties --> properties file for log4j
		
		serenity.conf --> configuration file for Serenity framework
	
	logs --> execution logs is generated here by log4j
	
	target --> html report gets generated inside target -> site -> serenity
	
	pom.xml --> contains dependencies and other maven information
	
	serenity.properties --> properties for serenity

## Usage

	1. Download the Project folder
	
	2. Compile
	
	3. Use below Maven command to run test:
	
		To run:
		
			mvn clean verify
			
		To run in Chrome browser & QA environment:
		
			mvn clean verify -Dwebdriver.driver=chrome -Denvironment=qa
		
		To run in Chrome browser (Headless mode) & QA environment:
		
			mvn test -Dbrowser=chromeheadless -Denv=qa -Dcucumber.options="--tags <tag_name>"
			
			mvn clean verify -Dbrowser=chromeheadless -Denvironment=qa
		
		To run in Firefox browser & QA environment:
		
			mvn clean verify -Dwebdriver.driver=firefox -Denvironment=qa

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Contributors

Avik Guha

## License

Licensed under the [MIT License](LICENSE).
